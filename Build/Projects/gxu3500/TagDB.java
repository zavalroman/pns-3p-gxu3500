package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.macroobjects.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.dialogTable.*;
import gpclasses.plugins.remoteTargetAlarms.*;

import gpclasses.plugins.illuminatedSwitch.*;

import java.util.Hashtable;

import Projects.ConfigurationMenu.ConfigTagDB;

public class TagDB extends ConfigTagDB
{
	public static int startNumber = CgpTagDB.NUM_SYSTEM_TAGS;
	public static Integer persistentContextObject = new Integer(CgpTagEventManager.getContextID(0));
	private static byte errorHandle = (byte)0;

	public static CgpIntTag daySetpoint;
	public static CgpIntTag nightSetpoint;
	public static CgpIntTag main_pmp;
	public static CgpDiscreteTag allowRotation;
	public static CgpIntTag pres4ma;
	public static CgpIntTag pres20ma;
	public static CgpDiscreteTag ALARM;
	public static CgpIntTag currentSetpoint;
	public static CgpIntTag presExceedTimeCounter;
	public static CgpIntTag presLackTimeCounter;
	public static CgpDiscreteTag MainStart;
	public static CgpDiscreteTag FirstResStart;
	public static CgpDiscreteTag SecondResStart;
	public static CgpDiscreteTag fc1_must_start;
	public static CgpDiscreteTag fc2_must_start;
	public static CgpDiscreteTag fc3_must_start;
	public static CgpDiscreteTag fc1_inWork;
	public static CgpDiscreteTag fc2_inWork;
	public static CgpDiscreteTag fc3_inWork;
	public static CgpIntTag currentPressure;
	public static CgpIntTag boundFreq;
	public static CgpIntTag boundDelta;
	public static CgpIntTag boundTime;
	public static CgpIntTag resOffFreq;
	public static CgpIntTag AI;
	public static CgpIntTag fc1_freq;
	public static CgpIntTag fc2_freq;
	public static CgpIntTag fc3_freq;
	public static CgpIntTag fc1_setpoint;
	public static CgpIntTag fc2_setpoint;
	public static CgpIntTag fc3_setpoint;
	public static CgpIntTag fc1_run;
	public static CgpIntTag fc2_run;
	public static CgpIntTag fc3_run;
	public static CgpIntTag fc1_AI;
	public static CgpDiscreteTag fc1_status;
	public static CgpDiscreteTag fc2_status;
	public static CgpIntTag fc2_AI;
	public static CgpIntTag fc3_AI;
	public static CgpDiscreteTag fc1_alarm;
	public static CgpDiscreteTag fc2_alarm;
	public static CgpDiscreteTag fc3_alarm;
	public static CgpDiscreteTag fc3_status;

	// Dialog table members decalration

	public static CgpBaseAlarmGroup AlarmGroup1;
	public static CgpBaseAlarmGroup EventGroup1;
	public static CgpAlarmGroup _SpecialAlarmGroup;


	static void StaticInit()
	{
		errorHandle = CgpSystem.configureErrorHandling("UserInputMgr.txt");

		CgpHdaHistorian.setTopOfDay(0);

		CgpAlarmBuffer.setTrackUsersACK(false);

		String[] AlarmGroup1TypeMsgs_0 = { "LOLO", };
		String[] AlarmGroup1TypeMsgs_1 = { "LO", };
		String[] AlarmGroup1TypeMsgs_2 = { "NRML", };
		String[] AlarmGroup1TypeMsgs_3 = { "HI", };
		String[] AlarmGroup1TypeMsgs_4 = { "HIHI", };
		String[] AlarmGroup1TypeMsgs_5 = { "MIN%", };
		String[] AlarmGroup1TypeMsgs_6 = { "MAJ%", };
		String[] AlarmGroup1TypeMsgs_7 = { "MIND", };
		String[] AlarmGroup1TypeMsgs_8 = { "MAJD", };
		String[] AlarmGroup1StateMsgs_0 = { "ACTIVE", };
		String[] AlarmGroup1StateMsgs_1 = { "ACK", };
		String[] AlarmGroup1StateMsgs_2 = { "RTN", };
		String[] AlarmGroup1StateMsgs_3 = { "", };
		String[] AlarmGroup1Labels	= { "AlarmGroup1", };

		AlarmGroup1 = CgpAlarmGroup.createAlarmGroup(1, 3, 100, 100, false, IgpAlarmGroupConstants.OPTIONAL_ACK_MODE);
		AlarmGroup1.setGroupName("AlarmGroup1");
		AlarmGroup1.setTypeMessage(
				AlarmGroup1TypeMsgs_0,
				AlarmGroup1TypeMsgs_1,
				AlarmGroup1TypeMsgs_2,
				AlarmGroup1TypeMsgs_3,
				AlarmGroup1TypeMsgs_4,
				AlarmGroup1TypeMsgs_5,
				AlarmGroup1TypeMsgs_6,
				AlarmGroup1TypeMsgs_7,
				AlarmGroup1TypeMsgs_8);
		AlarmGroup1.setStateMessage(
				AlarmGroup1StateMsgs_0,
				AlarmGroup1StateMsgs_1,
				AlarmGroup1StateMsgs_2,
				AlarmGroup1StateMsgs_3);
		AlarmGroup1.setGroupLabels( AlarmGroup1Labels );

		AlarmGroup1.setSharing(IgpAlarmEventDsConstants.SHARING_NONE);
		String[] EventGroup1Labels	= { "EventGroup1", };

		EventGroup1 = CgpCustomEventGroup.create(2, 100, 1, true, 100, false);
		EventGroup1.setGroupName("EventGroup1");
		EventGroup1.setGroupLabels( EventGroup1Labels );

		EventGroup1.setSharing(IgpAlarmEventDsConstants.SHARING_NONE);
		String[] specialStateMsgs_0 = { "", };
		String[] specialStateMsgs_1 = { "", };
		String[] specialStateMsgs_2 = { "", };
		String[] specialStateMsgs_3 = { "", };
		String[] specialTypeMsgs_0 = { "", };
		String[] specialTypeMsgs_1 = { "", };
		String[] specialTypeMsgs_2 = { "", };
		String[] specialTypeMsgs_3 = { "", };
		String[] specialTypeMsgs_4 = { "", };
		String[] specialTypeMsgs_5 = { "", };
		String[] specialTypeMsgs_6 = { "", };
		String[] specialTypeMsgs_7 = { "", };
		String[] specialTypeMsgs_8 = { "", };

		_SpecialAlarmGroup = new CgpAlarmGroup(3, 100, 100, 100, false, IgpAlarmGroupConstants.OPTIONAL_ACK_MODE);
		_SpecialAlarmGroup.setGroupName("_SpecialAlarmGroup");
		_SpecialAlarmGroup.setTypeMessage(
				specialTypeMsgs_0,
				specialTypeMsgs_1,
				specialTypeMsgs_2,
				specialTypeMsgs_3,
				specialTypeMsgs_4,
				specialTypeMsgs_5,
				specialTypeMsgs_6,
				specialTypeMsgs_7,
				specialTypeMsgs_8);
		_SpecialAlarmGroup.setStateMessage(
				specialStateMsgs_0,
				specialStateMsgs_1,
				specialStateMsgs_2,
				specialStateMsgs_3);



		CgpExpressionServer.expressionServer = new XprSrv();
	}

	public TagDB()
	{
		super(43);
		//buildClassFactory();
		//super.buildClassFactory();
	}

	public void instantiate(int tagId)
	{
		classFactory(tagId);
	}

	public void buildClassFactory()
	{
		CgpSystem.buildClassFactory(getClass(), null, startNumber);
	}


	public static Object classFactory(int tagFieldIdentifier)
	{
		return TagDB0.classFactory1(tagFieldIdentifier);
	}

}
