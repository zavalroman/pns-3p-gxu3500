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

public class ActionScript22 extends CgpUserScript
{
	public void run()
	{
end:{
int main =TagDB.main_pmp.getIntValue(0);

int fc1_available =TagDB.fc1_inWork.getIntValue(0);
int fc3_available =TagDB.fc3_inWork.getIntValue(0);

if(fc1_available !=1&&main ==1){
main =2;
}
if(fc3_available !=1&&main ==3){
main =2;
}

TagDB.main_pmp.write(main,0);
}
	}
}
