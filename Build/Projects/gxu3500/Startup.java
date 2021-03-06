package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.macroobjects.*;
import gpclasses.graphics.*;
import gpclasses.animations.*;
import gpclasses.plugins.script.*;
import gpclasses.util.io.*;
import gpclasses.tags.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.userScripts.*;
import gpclasses.plugins.remoteTargetAlarms.*;
import gpclasses.plugins.illuminatedSwitch.*;



public class Startup extends CgpStartup
{
	public static CgpScript DateTime;
	public static Object DateTimeTimerContext;

	// Dialog table member declaration

	public static void main (String args[])
	{
		startupObject = new Startup();
		CgpStartup.main(args);

		CgpSystem.setAppBuildDateAndTimeString("27/09/2017", "10:36:10");
	}

	public String[] getPublishedPanels()
	{
		return null;
	}

	public int getDisplayWidth()
	{
		return 800;
	}

	public int getDisplayHeight()
	{
		return 480;
	}

	public CgpWindow[] getPopupWindows()
	{
		CgpWindow[] windowList =
		{
			// empty
		};
		return windowList;
	}

	protected void preInitProject()
	{
		TagDB.StaticInit();
		new Projects.gxu3500.TagDB();
		CgpSystem.projectName = "Projects/gxu3500";
		CgpTag.setRetentiveStorage(new gpclasses.tags.CgpRetentiveStorage(55));
	}

	protected void postInitProject()
	{
		CgpSmartKeypad.setKeypadProperty( true,
						0x00ffffff,
						0x00ffffff,
						0x009f5f1f,
						0x005f3f1f,
						0x00744e14,
						CgpSmartKeypad.LAYOUT_STANDARD
						);

		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		gpclasses.system.CgpSystem.TM.setMinPeriodicInterval(100);
		Projects.gxu3500.TagDB._ExternalCmdTag.addEventListener(CgpScript.loadScript("Projects/gxu3500/ExternalCmdScript"), 0, iPersistentContext);
		Projects.gxu3500.TagDB._CurPanelID.addEventListener(CgpScript.loadScript("gpclasses/system/CgpChangePanelScript"), 0, iPersistentContext);
		DateTime = new CgpDateTimeUpdateScript();
		DateTimeTimerContext = gpclasses.system.CgpSystem.TM.createContext(CgpThread.MAX_PRIORITY-1);
		gpclasses.system.CgpSystem.TM.addTimerScript(DateTime, 1000, DateTimeTimerContext);
		gpclasses.system.CgpSystem.baseWindow.setPanelHistory(32);
		gpclasses.system.CgpSystem.TEM.setAnyHDATags(false);

		CgpSystem.globalPanel = new MasterPanel();
		gpclasses.system.CgpSystem.setShowSystemErrorWindow(true);

		char seps[] = {' '};
		CgpLanguageMgr.languageMgr.setSeperators(seps);

		CgpFont fonts[] = {
			new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8),
		};
		CgpLanguageMgr.languageMgr.setApplicationLanguageFonts(fonts);




		if (CgpSystem.isPlatform(CgpSystem.HMI)) CgpHdaHistorian.setAutoFlushTime(0);

		// Protocol info
		CgpCommManager.setStringProperty("fc1", "Con_Protocol", "Modbus (RTU)");
		CgpCommManager.setStringProperty("fc2", "Con_Protocol", "Modbus (RTU)");
		CgpCommManager.setStringProperty("fc3", "Con_Protocol", "Modbus (RTU)");

		// Dialog Table Functions

		gpclasses.system.CgpSystem.globalCursor = new CgpCursor("MouseArrow.bmp", "MouseHand.bmp", 20, 25, CgpColor.makeTransparentColor(0x00333333));

		gpclasses.system.CgpSystem.globalCursor.setTimeout(30);
	}

	protected void appScriptRegistration(int context)
	{
		CgpAction Action1 = new CgpAction(new ActionScript1(), "Set night setpoint");
		CgpDailyTrigger ScheduledAction1 = new CgpDailyTrigger(0, 1440, Action1);
		ScheduledAction1.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action2 = new CgpAction(new ActionScript2(), "Set day setpoint");
		CgpDailyTrigger ScheduledAction2 = new CgpDailyTrigger(360, 1440, Action2);
		ScheduledAction2.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action3 = new CgpAction(new ActionScript3(), "Rotation: change main pmp");
		CgpDailyTrigger ScheduledAction3 = new CgpDailyTrigger(180, 1440, Action3);
		ScheduledAction3.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action4 = new CgpAction(new ActionScript4(), "Rotation: turn pmp");
		CgpDataChangeTrigger ConditionalAction4 = new CgpDataChangeTrigger(TagDB.main_pmp, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action4);
		ConditionalAction4.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action5 = new CgpAction(new ActionScript5(), "Check pressure");
		CgpPeriodicTrigger PeriodicAction5 = new CgpPeriodicTrigger(1000, CgpTimerManager.SCHEDULE_FORCE_SLEEP, Action5, CgpSystem.TEM.getContextID(0));
		PeriodicAction5.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action6 = new CgpAction(new ActionScript6(), "TurnOn reserve");
		CgpDataChangeTrigger ConditionalAction6 = new CgpDataChangeTrigger(TagDB.presLackTimeCounter, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action6);
		ConditionalAction6.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action7 = new CgpAction(new ActionScript7(), "TurnOff reserve");
		CgpDataChangeTrigger ConditionalAction7 = new CgpDataChangeTrigger(TagDB.presExceedTimeCounter, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action7);
		ConditionalAction7.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action8 = new CgpAction(new ActionScript8(), "");
		CgpStartupTrigger EventAction8 = new CgpStartupTrigger(Action8);
		EventAction8.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action9 = new CgpAction(new ActionScript9(), "Set day sp on change");
		CgpDataChangeTrigger ConditionalAction9 = new CgpDataChangeTrigger(TagDB.daySetpoint, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action9);
		ConditionalAction9.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action10 = new CgpAction(new ActionScript10(), "Set night sp on change");
		CgpDataChangeTrigger ConditionalAction10 = new CgpDataChangeTrigger(TagDB.nightSetpoint, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action10);
		ConditionalAction10.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action11 = new CgpAction(new ActionScript11(), "Select MAIN fc to start");
		CgpDataChangeTrigger ConditionalAction11 = new CgpDataChangeTrigger(TagDB.MainStart, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action11);
		ConditionalAction11.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action12 = new CgpAction(new ActionScript12(), "Select FIRST RES fc to start");
		CgpDataChangeTrigger ConditionalAction12 = new CgpDataChangeTrigger(TagDB.FirstResStart, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action12);
		ConditionalAction12.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action13 = new CgpAction(new ActionScript13(), "Select SECOND RES fc to start");
		CgpDataChangeTrigger ConditionalAction13 = new CgpDataChangeTrigger(TagDB.SecondResStart, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action13);
		ConditionalAction13.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action14 = new CgpAction(new ActionScript14(), "Turn fc1");
		CgpDataChangeTrigger ConditionalAction14 = new CgpDataChangeTrigger(TagDB.fc1_must_start, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action14);
		ConditionalAction14.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action15 = new CgpAction(new ActionScript15(), "Turn fc2");
		CgpDataChangeTrigger ConditionalAction15 = new CgpDataChangeTrigger(TagDB.fc2_must_start, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action15);
		ConditionalAction15.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action16 = new CgpAction(new ActionScript16(), "Turn fc3");
		CgpDataChangeTrigger ConditionalAction16 = new CgpDataChangeTrigger(TagDB.fc3_must_start, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action16);
		ConditionalAction16.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action17 = new CgpAction(new ActionScript17(), "AI calibration");
		CgpDataChangeTrigger ConditionalAction17 = new CgpDataChangeTrigger(TagDB.AI, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action17);
		ConditionalAction17.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action18 = new CgpAction(new ActionScript18(), "When FC1 fault or switched off");
		CgpDataChangeTrigger ConditionalAction18 = new CgpDataChangeTrigger(TagDB.fc1_inWork, CgpDataChangeTrigger.WHEN_FALSE, context, Action18);
		ConditionalAction18.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action19 = new CgpAction(new ActionScript19(), "When FC2 fault or switched off");
		CgpDataChangeTrigger ConditionalAction19 = new CgpDataChangeTrigger(TagDB.fc2_inWork, CgpDataChangeTrigger.WHEN_FALSE, context, Action19);
		ConditionalAction19.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action20 = new CgpAction(new ActionScript20(), "When FC3 fault or switched off");
		CgpDataChangeTrigger ConditionalAction20 = new CgpDataChangeTrigger(TagDB.fc3_inWork, CgpDataChangeTrigger.WHEN_FALSE, context, Action20);
		ConditionalAction20.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action21 = new CgpAction(new ActionScript21(), "");
		CgpDataChangeTrigger ConditionalAction21 = new CgpDataChangeTrigger(TagDB.fc1_inWork, CgpDataChangeTrigger.WHEN_TRUE, context, Action21);
		ConditionalAction21.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action22 = new CgpAction(new ActionScript22(), "");
		CgpDataChangeTrigger ConditionalAction22 = new CgpDataChangeTrigger(TagDB.fc2_inWork, CgpDataChangeTrigger.WHEN_TRUE, context, Action22);
		ConditionalAction22.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action23 = new CgpAction(new ActionScript23(), "");
		CgpDataChangeTrigger ConditionalAction23 = new CgpDataChangeTrigger(TagDB.fc3_inWork, CgpDataChangeTrigger.WHEN_TRUE, context, Action23);
		ConditionalAction23.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action24 = new CgpAction(new ActionScript24(), "Write current setpoint into FCs");
		CgpDataChangeTrigger ConditionalAction24 = new CgpDataChangeTrigger(TagDB.currentSetpoint, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action24);
		ConditionalAction24.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action25 = new CgpAction(new ActionScript25(), "FC analog input to AI");
		CgpPeriodicTrigger PeriodicAction25 = new CgpPeriodicTrigger(1000, CgpTimerManager.SCHEDULE_MONITOR, Action25, CgpSystem.TEM.getContextID(0));
		PeriodicAction25.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action26 = new CgpAction(new ActionScript26(), "Watchcat");
		CgpPeriodicTrigger PeriodicAction26 = new CgpPeriodicTrigger(10000, CgpTimerManager.SCHEDULE_FORCE_SLEEP, Action26, CgpSystem.TEM.getContextID(0));
		PeriodicAction26.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action27 = new CgpAction(new ActionScript27(), "Calibrate panel day setpoint");
		CgpDataChangeTrigger ConditionalAction27 = new CgpDataChangeTrigger(TagDB.panelDaySetpoint, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action27);
		ConditionalAction27.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action28 = new CgpAction(new ActionScript28(), "Calibrate panel night setpoint");
		CgpDataChangeTrigger ConditionalAction28 = new CgpDataChangeTrigger(TagDB.panelNightSetpoint, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action28);
		ConditionalAction28.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action29 = new CgpAction(new ActionScript29(), "Correct setpoint after sensor calibrated");
		CgpDataChangeTrigger ConditionalAction29 = new CgpDataChangeTrigger(TagDB.pres20ma, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action29);
		ConditionalAction29.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action30 = new CgpAction(new ActionScript30(), "Correct setpoint after sensor calibrated");
		CgpDataChangeTrigger ConditionalAction30 = new CgpDataChangeTrigger(TagDB.pres4ma, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action30);
		ConditionalAction30.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action31 = new CgpAction(new ActionScript31(), "Check alarmes");
		CgpPeriodicTrigger PeriodicAction31 = new CgpPeriodicTrigger(3000, CgpTimerManager.SCHEDULE_NORMAL, Action31, CgpSystem.TEM.getContextID(0));
		PeriodicAction31.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action32 = new CgpAction(new ActionScript32(), "Alarm enable");
		CgpAlarmGroupTrigger AlarmGroupAction32 = new CgpAlarmGroupTrigger(TagDB.AlarmGroup1, CgpAlarmGroupTrigger.OVER_ZERO, Action32);
		AlarmGroupAction32.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action33 = new CgpAction(new ActionScript33(), "Alarm disable");
		CgpAlarmGroupTrigger AlarmGroupAction33 = new CgpAlarmGroupTrigger(TagDB.AlarmGroup1, CgpAlarmGroupTrigger.RETURN_ZERO, Action33);
		AlarmGroupAction33.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action34 = new CgpAction(new ActionScript34(), "FC1 alarm encoding");
		CgpDataChangeTrigger ConditionalAction34 = new CgpDataChangeTrigger(TagDB.fc1_alarmCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action34);
		ConditionalAction34.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action35 = new CgpAction(new ActionScript35(), "FC2 alarm encoding");
		CgpDataChangeTrigger ConditionalAction35 = new CgpDataChangeTrigger(TagDB.fc2_alarmCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action35);
		ConditionalAction35.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action36 = new CgpAction(new ActionScript36(), "FC3 alarm encoding");
		CgpDataChangeTrigger ConditionalAction36 = new CgpDataChangeTrigger(TagDB.fc3_alarmCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action36);
		ConditionalAction36.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action37 = new CgpAction(new ActionScript37(), "Trip code encoding");
		CgpDataChangeTrigger ConditionalAction37 = new CgpDataChangeTrigger(TagDB.fc1_tripCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action37);
		ConditionalAction37.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action38 = new CgpAction(new ActionScript38(), "Trip code encoding");
		CgpDataChangeTrigger ConditionalAction38 = new CgpDataChangeTrigger(TagDB.fc2_tripCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action38);
		ConditionalAction38.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action39 = new CgpAction(new ActionScript39(), "Trip code encoding");
		CgpDataChangeTrigger ConditionalAction39 = new CgpDataChangeTrigger(TagDB.fc3_tripCode, CgpDataChangeTrigger.WHEN_DATA_CHANGES, context, Action39);
		ConditionalAction39.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action40 = new CgpAction(new ActionScript40(), "Stop FCs when sensor break");
		CgpDataChangeTrigger ConditionalAction40 = new CgpDataChangeTrigger(TagDB.sensorBreak, CgpDataChangeTrigger.WHEN_TRUE, context, Action40);
		ConditionalAction40.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action41 = new CgpAction(new ActionScript41(), "Stop FCs when sensor short");
		CgpDataChangeTrigger ConditionalAction41 = new CgpDataChangeTrigger(TagDB.sensorShort, CgpDataChangeTrigger.WHEN_TRUE, context, Action41);
		ConditionalAction41.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action42 = new CgpAction(new ActionScript42(), "Reset inWork when alarm");
		CgpDataChangeTrigger ConditionalAction42 = new CgpDataChangeTrigger(TagDB.fc1_alarm, CgpDataChangeTrigger.WHEN_TRUE, context, Action42);
		ConditionalAction42.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action43 = new CgpAction(new ActionScript43(), "Reset inWork");
		CgpDataChangeTrigger ConditionalAction43 = new CgpDataChangeTrigger(TagDB.fc2_alarm, CgpDataChangeTrigger.WHEN_TRUE, context, Action43);
		ConditionalAction43.onlyPublishTo(CgpSystem.HMI);

		CgpAction Action44 = new CgpAction(new ActionScript44(), "Reset inWork");
		CgpDataChangeTrigger ConditionalAction44 = new CgpDataChangeTrigger(TagDB.fc3_alarm, CgpDataChangeTrigger.WHEN_TRUE, context, Action44);
		ConditionalAction44.onlyPublishTo(CgpSystem.HMI);

	}

	protected void openScripts()
	{
	}

	protected void shutdownProject()
	{
		TagDB.AlarmGroup1.clean();
		TagDB.EventGroup1.clean();
		TagDB._SpecialAlarmGroup.clean();
	}

	public String getRevisionNumber()
	{
		return "197";
	}

	public void setupProjectPersistents()
	{
		int iPersistentContext = CgpSystem.TEM.getContextID(0);
		CgpTag tagListUsedInWebGate[] =
		{
			TagDB.ALARM,
			TagDB.fc1_alarm,
			TagDB.fc2_alarm,
			TagDB.fc3_alarm,
			TagDB.sensorBreak,
			TagDB.sensorShort,
			TagDB.fc1_overCurrent,
			TagDB.fc1_driveOverload,
			TagDB.fc1_motorOverload,
			TagDB.fc1_overHeat,
			TagDB.fc1_overVoltage,
			TagDB.fc1_cirUnderVolt,
			TagDB.fc1_underCurrent,
			TagDB.fc2_cirUnderVolt,
			TagDB.fc3_cirUnderVolt,
			TagDB.fc2_driveOverload,
			TagDB.fc3_driveOverload,
			TagDB.fc2_motorOverload,
			TagDB.fc3_motorOverload,
			TagDB.fc2_overCurrent,
			TagDB.fc3_overCurrent,
			TagDB.fc2_overHeat,
			TagDB.fc3_overHeat,
			TagDB.fc2_overVoltage,
			TagDB.fc3_overVoltage,
			TagDB.fc2_underCurrent,
			TagDB.fc3_underCurrent,
			TagDB.fc1_inputPhaseFail,
			TagDB.fc2_inputPhaseFail,
			TagDB.fc3_inputPhaseFail,
			TagDB.fc1_outputPhaseFail,
			TagDB.fc2_outputPhaseFail,
			TagDB.fc3_outputPhaseFail,
		};
		CgpTag tagListIgnoredByWebgate[] =
		{
			TagDB._Hour,
			TagDB.daySetpoint,
			TagDB.nightSetpoint,
			TagDB.main_pmp,
			TagDB.allowRotation,
			TagDB.pres4ma,
			TagDB.pres20ma,
			TagDB.currentSetpoint,
			TagDB.presExceedTimeCounter,
			TagDB.presLackTimeCounter,
			TagDB.MainStart,
			TagDB.FirstResStart,
			TagDB.SecondResStart,
			TagDB.fc1_must_start,
			TagDB.fc2_must_start,
			TagDB.fc3_must_start,
			TagDB.fc1_inWork,
			TagDB.fc2_inWork,
			TagDB.fc3_inWork,
			TagDB.currentPressure,
			TagDB.boundFreq,
			TagDB.boundDelta,
			TagDB.boundTime,
			TagDB.resOffFreq,
			TagDB.AI,
			TagDB.panelDaySetpoint,
			TagDB.panelNightSetpoint,
			TagDB.panelCurrentSetpoint,
			TagDB.fc1_alarmCodeAru,
			TagDB.fc2_alarmCodeAru,
			TagDB.fc3_alarmCodeAru,
			TagDB.fc1_tripCodeAru,
			TagDB.fc2_tripCodeAru,
			TagDB.fc3_tripCodeAru,
			TagDB.fc1_freq,
			TagDB.fc2_freq,
			TagDB.fc3_freq,
			TagDB.fc1_setpoint,
			TagDB.fc2_setpoint,
			TagDB.fc3_setpoint,
			TagDB.fc1_AI,
			TagDB.fc2_AI,
			TagDB.fc3_AI,
			TagDB.fc1_alarmCode,
			TagDB.fc3_alarmCode,
			TagDB.fc1_tripCode,
			TagDB.fc2_tripCode,
			TagDB.fc3_tripCode,
			TagDB.fc2_alarmCode,
		};
		appScriptRegistration(iPersistentContext);

		CgpSystem.TEM.registerTagList(iPersistentContext, tagListUsedInWebGate, tagListIgnoredByWebgate);
	}
}
