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

public class ActionScript23 extends CgpUserScript
{
	public void run()
	{
end:{
int main =TagDB.main_pmp.getIntValue(0);

int fc2_available =TagDB.fc2_inWork.getIntValue(0);
int fc1_available =TagDB.fc1_inWork.getIntValue(0);

if(fc2_available !=1&&main ==2){
main =3;
}
if(fc1_available !=1&&main ==1){
main =3;
}

TagDB.main_pmp.write(main,0);
}
	}
}
