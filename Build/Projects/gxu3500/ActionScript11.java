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

public class ActionScript11 extends CgpUserScript
{
	public void run()
	{
end:{
int start,mainPump;

start =TagDB.MainStart.getIntValue(0);
mainPump =TagDB.main_pmp.getIntValue(0);

if(mainPump ==1){
TagDB.fc1_must_start.write(start,0);
}
if(mainPump ==2){
TagDB.fc2_must_start.write(start,0);
}
if(mainPump ==3){
TagDB.fc3_must_start.write(start,0);
}
}
	}
}
