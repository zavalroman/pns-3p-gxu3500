package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB0
{
	public static Object classFactory1(int tagFieldIdentifier)
	{
		TagDB.daySetpoint = new CgpIntTag("daySetpoint", 1, TagDB.startNumber + 3, false, 40, false, 0);
		TagDB.daySetpoint.setMinMaxValues(0, 65535, true);

		TagDB.nightSetpoint = new CgpIntTag("nightSetpoint", 1, TagDB.startNumber + 4, false, 30, false, 4);
		TagDB.nightSetpoint.setMinMaxValues(0, 65535, true);

		TagDB.main_pmp = new CgpIntTag("main_pmp", 1, TagDB.startNumber + 11, false, 1, false, 8);
		TagDB.main_pmp.setMinMaxValues(-32768, 32767, true);

		TagDB.allowRotation = new CgpDiscreteTag("allowRotation", 1, TagDB.startNumber + 12, false, false, false, -1);

		TagDB.pres4ma = new CgpIntTag("pres4ma", 1, TagDB.startNumber + 14, false, 0, false, 12);
		TagDB.pres4ma.setMinMaxValues(0, 65535, true);

		TagDB.pres20ma = new CgpIntTag("pres20ma", 1, TagDB.startNumber + 15, false, 100, false, 16);
		TagDB.pres20ma.setMinMaxValues(0, 65535, true);

		TagDB.ALARM = new CgpDiscreteTag("ALARM", 1, TagDB.startNumber + 16, false, false, false, -1);
		TagDB.ALARM.alarm = new CgpDiscreteAlarm(1, null, -1, TagDB._SpecialAlarmGroup, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.ALARM.addEventListener(TagDB._SpecialAlarmGroup, TagDB.persistentContextObject);

		TagDB.currentSetpoint = new CgpIntTag("currentSetpoint", 1, TagDB.startNumber + 17, false, 0, false, 20);
		TagDB.currentSetpoint.setMinMaxValues(0, 65535, true);

		TagDB.presExceedTimeCounter = new CgpIntTag("presExceedTimeCounter", 1, TagDB.startNumber + 18, false, 0, false, -1);
		TagDB.presExceedTimeCounter.setMinMaxValues(0, 65535, true);

		TagDB.presLackTimeCounter = new CgpIntTag("presLackTimeCounter", 1, TagDB.startNumber + 19, false, 0, false, -1);
		TagDB.presLackTimeCounter.setMinMaxValues(0, 65535, true);

		TagDB.MainStart = new CgpDiscreteTag("MainStart", 1, TagDB.startNumber + 20, false, false, false, -1);

		TagDB.FirstResStart = new CgpDiscreteTag("FirstResStart", 1, TagDB.startNumber + 21, false, false, false, -1);

		TagDB.SecondResStart = new CgpDiscreteTag("SecondResStart", 1, TagDB.startNumber + 22, false, false, false, -1);

		TagDB.fc1_must_start = new CgpDiscreteTag("fc1_must_start", 1, TagDB.startNumber + 24, false, false, false, -1);

		TagDB.fc2_must_start = new CgpDiscreteTag("fc2_must_start", 1, TagDB.startNumber + 25, false, false, false, -1);

		TagDB.fc3_must_start = new CgpDiscreteTag("fc3_must_start", 1, TagDB.startNumber + 26, false, false, false, -1);

		TagDB.fc1_inWork = new CgpDiscreteTag("fc1_inWork", 1, TagDB.startNumber + 28, false, false, false, 24);

		TagDB.fc2_inWork = new CgpDiscreteTag("fc2_inWork", 1, TagDB.startNumber + 29, false, false, false, 25);

		TagDB.fc3_inWork = new CgpDiscreteTag("fc3_inWork", 1, TagDB.startNumber + 30, false, false, false, 26);

		TagDB.currentPressure = new CgpIntTag("currentPressure", 1, TagDB.startNumber + 33, false, 0, false, -1);
		TagDB.currentPressure.setMinMaxValues(-32768, 32767, true);

		TagDB.fc1_alarm = new CgpDiscreteTag("fc1_alarm", 1, TagDB.startNumber + 34, false, false, false, -1);
		String[] _Msg_1_58 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u0439\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u043d\u043e\u0432 \u041f\u0427 1", 
				};
		TagDB.fc1_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_58, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_alarm = new CgpDiscreteTag("fc2_alarm", 1, TagDB.startNumber + 35, false, false, false, -1);
		String[] _Msg_1_59 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u0439\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u043d\u043e\u0432 \u041f\u0427 2", 
				};
		TagDB.fc2_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_59, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_alarm = new CgpDiscreteTag("fc3_alarm", 1, TagDB.startNumber + 36, false, false, false, -1);
		String[] _Msg_1_60 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u0439\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u043d\u043e\u0432 \u041f\u0427 3", 
				};
		TagDB.fc3_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_60, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.boundFreq = new CgpIntTag("boundFreq", 1, TagDB.startNumber + 38, false, 480, false, 27);
		TagDB.boundFreq.setMinMaxValues(0, 65535, true);

		TagDB.boundDelta = new CgpIntTag("boundDelta", 1, TagDB.startNumber + 39, false, 3, false, 31);
		TagDB.boundDelta.setMinMaxValues(0, 65535, true);

		TagDB.boundTime = new CgpIntTag("boundTime", 1, TagDB.startNumber + 40, false, 30, false, 35);
		TagDB.boundTime.setMinMaxValues(0, 65535, true);

		TagDB.resOffFreq = new CgpIntTag("resOffFreq", 1, TagDB.startNumber + 41, false, 350, false, 39);
		TagDB.resOffFreq.setMinMaxValues(0, 65535, true);

		TagDB.AI = new CgpIntTag("AI", 1, TagDB.startNumber + 42, false, 0, false, -1);
		TagDB.AI.setMinMaxValues(0, 65535, true);

		TagDB.panelDaySetpoint = new CgpIntTag("panelDaySetpoint", 1, TagDB.startNumber + 43, false, 0, false, 43);
		TagDB.panelDaySetpoint.setMinMaxValues(0, 65535, true);

		TagDB.panelNightSetpoint = new CgpIntTag("panelNightSetpoint", 1, TagDB.startNumber + 44, false, 0, false, 47);
		TagDB.panelNightSetpoint.setMinMaxValues(0, 65535, true);

		TagDB.panelCurrentSetpoint = new CgpIntTag("panelCurrentSetpoint", 1, TagDB.startNumber + 48, false, 0, false, 51);
		TagDB.panelCurrentSetpoint.setMinMaxValues(0, 65535, true);

		TagDB.sensorBreak = new CgpDiscreteTag("sensorBreak", 1, TagDB.startNumber + 49, false, false, true, -1);
		String[] _Msg_1_94 =
		{
		"\u041e\u0431\u0440\u044b\u0432 \u0434\u0430\u0442\u0447\u0438\u043a\u0430 \u0434\u0430\u0432\u043b\u0435\u043d\u0438\u044f", 
				};
		TagDB.sensorBreak.alarm = new CgpDiscreteAlarm(1, _Msg_1_94, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.sensorBreak.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.sensorShort = new CgpDiscreteTag("sensorShort", 1, TagDB.startNumber + 50, false, false, false, -1);
		String[] _Msg_1_95 =
		{
		"\u041a\u043e\u0440\u043e\u0442\u043a\u043e\u0435 \u0437\u0430\u043c\u044b\u043a\u0430\u043d\u0438\u0435 \u0434\u0430\u0442\u0447\u0438\u043a\u0430 \u0434\u0430\u0432\u043b\u0435\u043d\u0438\u044f", 
				};
		TagDB.sensorShort.alarm = new CgpDiscreteAlarm(1, _Msg_1_95, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.sensorShort.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_overCurrent = new CgpDiscreteTag("fc1_overCurrent", 1, TagDB.startNumber + 53, false, false, false, -1);
		String[] _Msg_1_99 =
		{
		"\u041f\u04271: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u0442\u043e\u043a\u0430", 
				};
		TagDB.fc1_overCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_99, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_overCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_driveOverload = new CgpDiscreteTag("fc1_driveOverload", 1, TagDB.startNumber + 54, false, false, false, -1);
		String[] _Msg_1_100 =
		{
		"\u041f\u04271: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0447\u0430\u0441\u0442\u043e\u0442\u043d\u0438\u043a\u0430", 
				};
		TagDB.fc1_driveOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_100, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_driveOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_motorOverload = new CgpDiscreteTag("fc1_motorOverload", 1, TagDB.startNumber + 55, false, false, false, -1);
		String[] _Msg_1_101 =
		{
		"\u041f\u04271: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0434\u0432\u0438\u0433\u0430\u0442\u0435\u043b\u044f", 
				};
		TagDB.fc1_motorOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_101, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_motorOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_overHeat = new CgpDiscreteTag("fc1_overHeat", 1, TagDB.startNumber + 56, false, false, false, -1);
		String[] _Msg_1_102 =
		{
		"\u041f\u04271: \u043f\u0435\u0440\u0435\u0433\u0440\u0435\u0432", 
				};
		TagDB.fc1_overHeat.alarm = new CgpDiscreteAlarm(1, _Msg_1_102, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_overHeat.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_overVoltage = new CgpDiscreteTag("fc1_overVoltage", 1, TagDB.startNumber + 57, false, false, false, -1);
		String[] _Msg_1_103 =
		{
		"\u041f\u04271: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u044f", 
				};
		TagDB.fc1_overVoltage.alarm = new CgpDiscreteAlarm(1, _Msg_1_103, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_overVoltage.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_cirUnderVolt = new CgpDiscreteTag("fc1_cirUnderVolt", 1, TagDB.startNumber + 58, false, false, false, -1);
		String[] _Msg_1_104 =
		{
		"\u041f\u04271: \u043d\u0438\u0437\u043a\u043e\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u0435 \u0433\u043b\u0430\u0432\u043d\u043e\u0439 \u043f\u043b\u0430\u0442\u044b", 
				};
		TagDB.fc1_cirUnderVolt.alarm = new CgpDiscreteAlarm(1, _Msg_1_104, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_cirUnderVolt.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_underCurrent = new CgpDiscreteTag("fc1_underCurrent", 1, TagDB.startNumber + 59, false, false, false, -1);
		String[] _Msg_1_105 =
		{
		"\u041f\u04271: \u043d\u0438\u0437\u043a\u0438\u0439 \u0442\u043e\u043a", 
				};
		TagDB.fc1_underCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_105, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_underCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_cirUnderVolt = new CgpDiscreteTag("fc2_cirUnderVolt", 1, TagDB.startNumber + 60, false, false, false, -1);
		String[] _Msg_1_106 =
		{
		"\u041f\u04272: \u043d\u0438\u0437\u043a\u043e\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u0435 \u0433\u043b\u0430\u0432\u043d\u043e\u0439 \u043f\u043b\u0430\u0442\u044b", 
				};
		TagDB.fc2_cirUnderVolt.alarm = new CgpDiscreteAlarm(1, _Msg_1_106, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_cirUnderVolt.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_cirUnderVolt = new CgpDiscreteTag("fc3_cirUnderVolt", 1, TagDB.startNumber + 61, false, false, false, -1);
		String[] _Msg_1_107 =
		{
		"\u041f\u04273: \u043d\u0438\u0437\u043a\u043e\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u0435 \u0433\u043b\u0430\u0432\u043d\u043e\u0439 \u043f\u043b\u0430\u0442\u044b", 
				};
		TagDB.fc3_cirUnderVolt.alarm = new CgpDiscreteAlarm(1, _Msg_1_107, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_cirUnderVolt.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_driveOverload = new CgpDiscreteTag("fc2_driveOverload", 1, TagDB.startNumber + 62, false, false, false, -1);
		String[] _Msg_1_108 =
		{
		"\u041f\u04272: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0447\u0430\u0441\u0442\u043e\u0442\u043d\u0438\u043a\u0430", 
				};
		TagDB.fc2_driveOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_108, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_driveOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_driveOverload = new CgpDiscreteTag("fc3_driveOverload", 1, TagDB.startNumber + 63, false, false, false, -1);
		String[] _Msg_1_109 =
		{
		"\u041f\u04273: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0447\u0430\u0441\u0442\u043e\u0442\u043d\u0438\u043a\u0430", 
				};
		TagDB.fc3_driveOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_109, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_driveOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_motorOverload = new CgpDiscreteTag("fc2_motorOverload", 1, TagDB.startNumber + 64, false, false, false, -1);
		String[] _Msg_1_110 =
		{
		"\u041f\u04272: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0434\u0432\u0438\u0433\u0430\u0442\u0435\u043b\u044f", 
				};
		TagDB.fc2_motorOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_110, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_motorOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_motorOverload = new CgpDiscreteTag("fc3_motorOverload", 1, TagDB.startNumber + 65, false, false, false, -1);
		String[] _Msg_1_111 =
		{
		"\u041f\u04273: \u043f\u0435\u0440\u0435\u0433\u0440\u0443\u0437\u043a\u0430 \u0434\u0432\u0438\u0433\u0430\u0442\u0435\u043b\u044f", 
				};
		TagDB.fc3_motorOverload.alarm = new CgpDiscreteAlarm(1, _Msg_1_111, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_motorOverload.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_overCurrent = new CgpDiscreteTag("fc2_overCurrent", 1, TagDB.startNumber + 66, false, false, false, -1);
		String[] _Msg_1_112 =
		{
		"\u041f\u04272: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u0442\u043e\u043a\u0430", 
				};
		TagDB.fc2_overCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_112, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_overCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_overCurrent = new CgpDiscreteTag("fc3_overCurrent", 1, TagDB.startNumber + 67, false, false, false, -1);
		String[] _Msg_1_113 =
		{
		"\u041f\u04273: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u0442\u043e\u043a\u0430", 
				};
		TagDB.fc3_overCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_113, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_overCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_overHeat = new CgpDiscreteTag("fc2_overHeat", 1, TagDB.startNumber + 68, false, false, false, -1);
		String[] _Msg_1_114 =
		{
		"\u041f\u04272: \u043f\u0435\u0440\u0435\u0433\u0440\u0435\u0432", 
				};
		TagDB.fc2_overHeat.alarm = new CgpDiscreteAlarm(1, _Msg_1_114, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_overHeat.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_overHeat = new CgpDiscreteTag("fc3_overHeat", 1, TagDB.startNumber + 69, false, false, false, -1);
		String[] _Msg_1_115 =
		{
		"\u041f\u04273: \u043f\u0435\u0440\u0435\u0433\u0440\u0435\u0432", 
				};
		TagDB.fc3_overHeat.alarm = new CgpDiscreteAlarm(1, _Msg_1_115, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_overHeat.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_overVoltage = new CgpDiscreteTag("fc2_overVoltage", 1, TagDB.startNumber + 70, false, false, false, -1);
		String[] _Msg_1_116 =
		{
		"\u041f\u04272: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u044f", 
				};
		TagDB.fc2_overVoltage.alarm = new CgpDiscreteAlarm(1, _Msg_1_116, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_overVoltage.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_overVoltage = new CgpDiscreteTag("fc3_overVoltage", 1, TagDB.startNumber + 71, false, false, false, -1);
		String[] _Msg_1_117 =
		{
		"\u041f\u04273: \u043f\u0440\u0435\u0432\u044b\u0448\u0435\u043d\u0438\u0435 \u043d\u0430\u043f\u0440\u044f\u0436\u0435\u043d\u0438\u044f", 
				};
		TagDB.fc3_overVoltage.alarm = new CgpDiscreteAlarm(1, _Msg_1_117, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_overVoltage.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_underCurrent = new CgpDiscreteTag("fc2_underCurrent", 1, TagDB.startNumber + 72, false, false, false, -1);
		String[] _Msg_1_118 =
		{
		"\u041f\u04272: \u043d\u0438\u0437\u043a\u0438\u0439 \u0442\u043e\u043a", 
				};
		TagDB.fc2_underCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_118, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_underCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_underCurrent = new CgpDiscreteTag("fc3_underCurrent", 1, TagDB.startNumber + 73, false, false, false, -1);
		String[] _Msg_1_119 =
		{
		"\u041f\u04273: \u043d\u0438\u0437\u043a\u0438\u0439 \u0442\u043e\u043a", 
				};
		TagDB.fc3_underCurrent.alarm = new CgpDiscreteAlarm(1, _Msg_1_119, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_underCurrent.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_inputPhaseFail = new CgpDiscreteTag("fc1_inputPhaseFail", 1, TagDB.startNumber + 77, false, false, false, -1);
		String[] _Msg_1_123 =
		{
		"\u041f\u04271: \u043e\u0431\u0440\u044b\u0432 \u0432\u0445\u043e\u0434\u043d\u043e\u0439 \u0444\u0430\u0437\u044b", 
				};
		TagDB.fc1_inputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_123, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_inputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_inputPhaseFail = new CgpDiscreteTag("fc2_inputPhaseFail", 1, TagDB.startNumber + 78, false, false, false, -1);
		String[] _Msg_1_124 =
		{
		"\u041f\u04272: \u043e\u0431\u0440\u044b\u0432 \u0432\u0445\u043e\u0434\u043d\u043e\u0439 \u0444\u0430\u0437\u044b", 
				};
		TagDB.fc2_inputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_124, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_inputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_inputPhaseFail = new CgpDiscreteTag("fc3_inputPhaseFail", 1, TagDB.startNumber + 79, false, false, false, -1);
		String[] _Msg_1_125 =
		{
		"\u041f\u04273: \u043e\u0431\u0440\u044b\u0432 \u0432\u0445\u043e\u0434\u043d\u043e\u0439 \u0444\u0430\u0437\u044b", 
				};
		TagDB.fc3_inputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_125, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_inputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_outputPhaseFail = new CgpDiscreteTag("fc1_outputPhaseFail", 1, TagDB.startNumber + 80, false, false, false, -1);
		String[] _Msg_1_126 =
		{
		"\u041f\u04271: \u043e\u0431\u0440\u044b\u0432 \u0444\u0430\u0437\u044b \u043d\u0430 \u0432\u044b\u0445\u043e\u0434\u0435", 
				};
		TagDB.fc1_outputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_126, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_outputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_outputPhaseFail = new CgpDiscreteTag("fc2_outputPhaseFail", 1, TagDB.startNumber + 81, false, false, false, -1);
		String[] _Msg_1_127 =
		{
		"\u041f\u04272: \u043e\u0431\u0440\u044b\u0432 \u0444\u0430\u0437\u044b \u043d\u0430 \u0432\u044b\u0445\u043e\u0434\u0435", 
				};
		TagDB.fc2_outputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_127, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_outputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_outputPhaseFail = new CgpDiscreteTag("fc3_outputPhaseFail", 1, TagDB.startNumber + 82, false, false, false, -1);
		String[] _Msg_1_128 =
		{
		"\u041f\u04273: \u043e\u0431\u0440\u044b\u0432 \u0444\u0430\u0437\u044b \u043d\u0430 \u0432\u044b\u0445\u043e\u0434\u0435", 
				};
		TagDB.fc3_outputPhaseFail.alarm = new CgpDiscreteAlarm(1, _Msg_1_128, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_outputPhaseFail.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc1_alarmCodeAru = new CgpDiscreteTag("fc1_alarmCodeAru", 1, TagDB.startNumber + 87, false, false, false, -1);

		TagDB.fc2_alarmCodeAru = new CgpDiscreteTag("fc2_alarmCodeAru", 1, TagDB.startNumber + 88, false, false, false, -1);

		TagDB.fc3_alarmCodeAru = new CgpDiscreteTag("fc3_alarmCodeAru", 1, TagDB.startNumber + 89, false, false, false, -1);

		TagDB.fc1_tripCodeAru = new CgpDiscreteTag("fc1_tripCodeAru", 1, TagDB.startNumber + 90, false, false, false, -1);

		TagDB.fc2_tripCodeAru = new CgpDiscreteTag("fc2_tripCodeAru", 1, TagDB.startNumber + 91, false, false, false, -1);

		TagDB.fc3_tripCodeAru = new CgpDiscreteTag("fc3_tripCodeAru", 1, TagDB.startNumber + 92, false, false, false, -1);


		return TagDB1.classFactory2(tagFieldIdentifier);
	}

}
