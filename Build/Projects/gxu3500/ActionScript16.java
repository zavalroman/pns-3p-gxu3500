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

public class ActionScript16 extends CgpUserScript
{
	public void run()
	{
end:{

int start;

start =TagDB.fc3_must_start.getIntValue(0);

if(start ==1){
TagDB.fc3_run.write(1024,0);
}else {
TagDB.fc3_run.write(0,0);
}
}
	}
}
