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

public class ActionScript25 extends CgpUserScript
{
	public void run()
	{
end:{
int fc1ai =TagDB.fc1_AI.getIntValue(0);
int fc2ai =TagDB.fc2_AI.getIntValue(0);
int fc3ai =TagDB.fc3_AI.getIntValue(0);
int main =TagDB.main_pmp.getIntValue(0);

if(main ==1){
TagDB.AI.write(fc1ai,0);
}
if(main ==2){
TagDB.AI.write(fc2ai,0);
}
if(main ==3){
TagDB.AI.write(fc3ai,0);
}
}
	}
}
