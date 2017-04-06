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

public class ActionScript17 extends CgpUserScript
{
	public void run()
	{
end:{
int AI =0;
int main =TagDB.main_pmp.getIntValue(0);
int p4ma =TagDB.pres4ma.getIntValue(0);
int p20ma =TagDB.pres20ma.getIntValue(0);

if(main ==1){
AI =TagDB.fc1_AI.getIntValue(0);
}
if(main ==2){
AI =TagDB.fc2_AI.getIntValue(0);
}
if(main ==3){
AI =TagDB.fc3_AI.getIntValue(0);
}

//pan4mA/10+(AI_pres-4)*((pan20mA/10)-(pan4mA/10))/16
int pres;

pres =AI;
pres =p4ma+(int)((((float)AI-3.99)*(float)(p20ma-p4ma))/15.99);
pres =(int)((float)pres/100);

TagDB.currentPressure.write(pres,0);
}
	}
}
