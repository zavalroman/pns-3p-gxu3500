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

public class ActionScript28 extends CgpUserScript
{
	public void run()
	{
end:{
int panel =TagDB.panelNightSetpoint.getIntValue(0);
int p4ma =TagDB.pres4ma.getIntValue(0);
int p20ma =TagDB.pres20ma.getIntValue(0);

//pan4mA/10+(AI_pres-4)*((pan20mA/10)-(pan4mA/10))/16
int pres;

pres =(int)(((float)panel)*500.0/((float)(p20ma-p4ma)/100));
//pres = (int)((float)pres/10);
//pres = raw;
TagDB.nightSetpoint.write(pres,0);
}
	}
}
