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

public class ActionScript9 extends CgpUserScript
{
	public void run()
	{
end:{
int hh,daySp;

hh =TagDB._Hour.getIntValue(0);
daySp =TagDB.daySetpoint.getIntValue(0);

if(hh >6){
TagDB.currentSetpoint.write(daySp,0);
}
}
	}
}
