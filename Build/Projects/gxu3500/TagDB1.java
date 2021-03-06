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

		TagDB.fc3_status = new CgpDiscreteTag("fc3_status", 1, TagDB.startNumber + 37, true, false, true);

		TagDB.fc1_current = new CgpIntTag("fc1_current", 1, TagDB.startNumber + 45, true, 0, true);
		TagDB.fc1_current.setMinMaxValues(0, 65535, true);

		TagDB.fc2_current = new CgpIntTag("fc2_current", 1, TagDB.startNumber + 46, true, 0, true);
		TagDB.fc2_current.setMinMaxValues(0, 65535, true);

		TagDB.fc3_current = new CgpIntTag("fc3_current", 1, TagDB.startNumber + 47, true, 0, true);
		TagDB.fc3_current.setMinMaxValues(0, 65535, true);

		TagDB.fc1_alarmCode = new CgpIntTag("fc1_alarmCode", 1, TagDB.startNumber + 51, true, 0, true);
		TagDB.fc1_alarmCode.setMinMaxValues(0, 65535, true);

		TagDB.fc3_alarmCode = new CgpIntTag("fc3_alarmCode", 1, TagDB.startNumber + 52, true, 0, true);
		TagDB.fc3_alarmCode.setMinMaxValues(0, 65535, true);

		TagDB.fc1_tripCode = new CgpIntTag("fc1_tripCode", 1, TagDB.startNumber + 74, true, 0, true);
		TagDB.fc1_tripCode.setMinMaxValues(0, 65535, true);

		TagDB.fc2_tripCode = new CgpIntTag("fc2_tripCode", 1, TagDB.startNumber + 75, true, 0, true);
		TagDB.fc2_tripCode.setMinMaxValues(0, 65535, true);

		TagDB.fc3_tripCode = new CgpIntTag("fc3_tripCode", 1, TagDB.startNumber + 76, true, 0, true);
		TagDB.fc3_tripCode.setMinMaxValues(0, 65535, true);

		TagDB.fc1_statusWord = new CgpIntTag("fc1_statusWord", 1, TagDB.startNumber + 83, true, 0, true);
		TagDB.fc1_statusWord.setMinMaxValues(0, 65535, true);

		TagDB.fc2_statusWord = new CgpIntTag("fc2_statusWord", 1, TagDB.startNumber + 84, true, 0, true);
		TagDB.fc2_statusWord.setMinMaxValues(0, 65535, true);

		TagDB.fc3_statusWord = new CgpIntTag("fc3_statusWord", 1, TagDB.startNumber + 85, true, 0, true);
		TagDB.fc3_statusWord.setMinMaxValues(0, 65535, true);

		TagDB.fc2_alarmCode = new CgpIntTag("fc2_alarmCode", 1, TagDB.startNumber + 86, true, 0, true);
		TagDB.fc2_alarmCode.setMinMaxValues(0, 65535, true);


		new RefTagDB();

		return null;
	}
}
