package Projects.gxu3500;

import gpclasses.userScripts.*;
import gpclasses.userScripts.CgpUserScript;
import gpclasses.baseclasses.*;
import gpclasses.system.*;
import gpclasses.util.misc.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.diag.*;
import gpclasses.util.io.*;
import java.util.Hashtable;

public class ActionScript33 extends CgpUserScript
{
	public void run()
	{
end:{
int status =TagDB.fc3_status.getIntValue(0);

if((status &4096)!=0){
TagDB.fc3_alarm.write(true,0);
}else {
TagDB.fc3_alarm.write(false,0);
}
}
	}
}
