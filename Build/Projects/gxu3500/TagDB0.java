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

		TagDB.currentSetpoint = new CgpIntTag("currentSetpoint", 1, TagDB.startNumber + 17, false, 0, false, -1);
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

		TagDB.fc1_inWork = new CgpDiscreteTag("fc1_inWork", 1, TagDB.startNumber + 28, false, false, false, 20);

		TagDB.fc2_inWork = new CgpDiscreteTag("fc2_inWork", 1, TagDB.startNumber + 29, false, false, false, 21);

		TagDB.fc3_inWork = new CgpDiscreteTag("fc3_inWork", 1, TagDB.startNumber + 30, false, false, false, 22);

		TagDB.currentPressure = new CgpIntTag("currentPressure", 1, TagDB.startNumber + 33, false, 0, false, -1);
		TagDB.currentPressure.setMinMaxValues(-32768, 32767, true);

		TagDB.boundFreq = new CgpIntTag("boundFreq", 1, TagDB.startNumber + 38, false, 480, false, 23);
		TagDB.boundFreq.setMinMaxValues(0, 65535, true);

		TagDB.boundDelta = new CgpIntTag("boundDelta", 1, TagDB.startNumber + 39, false, 3, false, 27);
		TagDB.boundDelta.setMinMaxValues(0, 65535, true);

		TagDB.boundTime = new CgpIntTag("boundTime", 1, TagDB.startNumber + 40, false, 30, false, 31);
		TagDB.boundTime.setMinMaxValues(0, 65535, true);

		TagDB.resOffFreq = new CgpIntTag("resOffFreq", 1, TagDB.startNumber + 41, false, 350, false, 35);
		TagDB.resOffFreq.setMinMaxValues(0, 65535, true);

		TagDB.AI = new CgpIntTag("AI", 1, TagDB.startNumber + 42, false, 0, false, -1);
		TagDB.AI.setMinMaxValues(0, 65535, true);


		return TagDB1.classFactory2(tagFieldIdentifier);
	}

}
