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

public class ActionScript8 extends CgpUserScript
{
	public void run()
	{
end:{
int day,night;
int hh;

day =TagDB.daySetpoint.getIntValue(0);
night =TagDB.nightSetpoint.getIntValue(0);

hh =TagDB._Hour.getIntValue(0);

if(hh >0&&hh <6){
TagDB.currentSetpoint.write(night,0);
}else {
TagDB.currentSetpoint.write(day,0);
}
}
	}
}
