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

public class ActionScript3 extends CgpUserScript
{
	public void run()
	{
end:{int tmp;
int allow;

allow =TagDB.allowRotation.getIntValue(0);

if(allow ==1){
tmp =TagDB.main_pmp.getIntValue(0);

if(tmp <3){
tmp++;
}else {
tmp =1;
}

TagDB.main_pmp.write(tmp,0);
}

}
	}
}
