package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.trends.*;
import gpclasses.macroobjects.*;

public class TagDB1
{
	public static Object classFactory2(int tagFieldIdentifier)
	{
		TagDB.fc1_freq = new CgpIntTag("fc1_freq", 1, TagDB.startNumber + 0, true, 0, true);
		TagDB.fc1_freq.setMinMaxValues(0, 65535, true);

		TagDB.fc2_freq = new CgpIntTag("fc2_freq", 1, TagDB.startNumber + 1, true, 0, true);
		TagDB.fc2_freq.setMinMaxValues(0, 65535, true);

		TagDB.fc3_freq = new CgpIntTag("fc3_freq", 1, TagDB.startNumber + 2, true, 0, true);
		TagDB.fc3_freq.setMinMaxValues(0, 65535, true);

		TagDB.fc1_setpoint = new CgpIntTag("fc1_setpoint", 1, TagDB.startNumber + 5, true, 0, true);
		TagDB.fc1_setpoint.setMinMaxValues(0, 65535, true);

		TagDB.fc2_setpoint = new CgpIntTag("fc2_setpoint", 1, TagDB.startNumber + 6, true, 0, true);
		TagDB.fc2_setpoint.setMinMaxValues(0, 65535, true);

		TagDB.fc3_setpoint = new CgpIntTag("fc3_setpoint", 1, TagDB.startNumber + 7, true, 0, true);
		TagDB.fc3_setpoint.setMinMaxValues(0, 65535, true);

		TagDB.fc1_run = new CgpIntTag("fc1_run", 1, TagDB.startNumber + 8, true, 0, true);
		TagDB.fc1_run.setMinMaxValues(0, 65535, true);

		TagDB.fc2_run = new CgpIntTag("fc2_run", 1, TagDB.startNumber + 9, true, 0, true);
		TagDB.fc2_run.setMinMaxValues(0, 65535, true);

		TagDB.fc3_run = new CgpIntTag("fc3_run", 1, TagDB.startNumber + 10, true, 0, true);
		TagDB.fc3_run.setMinMaxValues(0, 65535, true);

		TagDB.fc1_AI = new CgpIntTag("fc1_AI", 1, TagDB.startNumber + 13, true, 0, true);
		TagDB.fc1_AI.setMinMaxValues(0, 65535, true);

		TagDB.fc1_status = new CgpDiscreteTag("fc1_status", 1, TagDB.startNumber + 23, true, false, true);

		TagDB.fc2_status = new CgpDiscreteTag("fc2_status", 1, TagDB.startNumber + 27, true, false, true);

		TagDB.fc2_AI = new CgpIntTag("fc2_AI", 1, TagDB.startNumber + 31, true, 0, true);
		TagDB.fc2_AI.setMinMaxValues(0, 65535, true);

		TagDB.fc3_AI = new CgpIntTag("fc3_AI", 1, TagDB.startNumber + 32, true, 0, true);
		TagDB.fc3_AI.setMinMaxValues(0, 65535, true);

		TagDB.fc1_alarm = new CgpDiscreteTag("fc1_alarm", 1, TagDB.startNumber + 34, true, false, true);
		String[] _Msg_1_58 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u044f \u041f\u0427 1", 
				};
		TagDB.fc1_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_58, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc1_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc2_alarm = new CgpDiscreteTag("fc2_alarm", 1, TagDB.startNumber + 35, true, false, true);
		String[] _Msg_1_59 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u044f \u041f\u0427 2", 
				};
		TagDB.fc2_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_59, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc2_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_alarm = new CgpDiscreteTag("fc3_alarm", 1, TagDB.startNumber + 36, true, false, true);
		String[] _Msg_1_60 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u044f \u041f\u0427 3", 
				};
		TagDB.fc3_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_60, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_status = new CgpDiscreteTag("fc3_status", 1, TagDB.startNumber + 37, true, false, true);


		new RefTagDB();

		return null;
	}
}
