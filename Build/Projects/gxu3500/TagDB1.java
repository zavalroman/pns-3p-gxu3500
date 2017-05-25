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

		TagDB.fc1_status = new CgpIntTag("fc1_status", 1, TagDB.startNumber + 23, true, 0, true);
		TagDB.fc1_status.setMinMaxValues(0, 65535, true);

		TagDB.fc2_status = new CgpIntTag("fc2_status", 1, TagDB.startNumber + 27, true, 0, true);
		TagDB.fc2_status.setMinMaxValues(0, 65535, true);

		TagDB.fc2_AI = new CgpIntTag("fc2_AI", 1, TagDB.startNumber + 31, true, 0, true);
		TagDB.fc2_AI.setMinMaxValues(0, 65535, true);

		TagDB.fc3_AI = new CgpIntTag("fc3_AI", 1, TagDB.startNumber + 32, true, 0, true);
		TagDB.fc3_AI.setMinMaxValues(0, 65535, true);

		TagDB.fc3_alarm = new CgpDiscreteTag("fc3_alarm", 1, TagDB.startNumber + 36, true, false, true);
		String[] _Msg_1_60 =
		{
		"\u0410\u0432\u0430\u0440\u0438\u0439\u043d\u044b\u0439 \u043e\u0441\u0442\u0430\u043d\u043e\u0432 \u041f\u0427 3", 
				};
		TagDB.fc3_alarm.alarm = new CgpDiscreteAlarm(1, _Msg_1_60, -1, TagDB.AlarmGroup1, CgpDiscreteAlarm.TRIGGER_TYPE_ACTIVE_HIGH);
		TagDB.fc3_alarm.addEventListener(TagDB.AlarmGroup1, TagDB.persistentContextObject);

		TagDB.fc3_status = new CgpDiscreteTag("fc3_status", 1, TagDB.startNumber + 37, true, false, true);

		TagDB.fc1_current = new CgpIntTag("fc1_current", 1, TagDB.startNumber + 45, true, 0, true);
		TagDB.fc1_current.setMinMaxValues(-32768, 32767, true);

		TagDB.fc2_current = new CgpIntTag("fc2_current", 1, TagDB.startNumber + 46, true, 0, true);
		TagDB.fc2_current.setMinMaxValues(-32768, 32767, true);

		TagDB.fc3_current = new CgpIntTag("fc3_current", 1, TagDB.startNumber + 47, true, 0, true);
		TagDB.fc3_current.setMinMaxValues(0, 65535, true);


		new RefTagDB();

		return null;
	}
}
