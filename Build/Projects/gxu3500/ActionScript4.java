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

public class ActionScript4 extends CgpUserScript
{
	public void run()
	{
			TagDB.fc1_must_start.bitClear();

			TagDB.fc2_must_start.bitClear();

			TagDB.fc3_must_start.bitClear();

end:{int mainNum,main,first,second;
int fc1_available =TagDB.fc1_inWork.getIntValue(0);
int fc2_available =TagDB.fc2_inWork.getIntValue(0);
int fc3_available =TagDB.fc3_inWork.getIntValue(0);

mainNum =TagDB.main_pmp.getIntValue(0);
main =TagDB.MainStart.getIntValue(0);

if(main ==1){
if(mainNum ==1&&fc1_available ==1){
TagDB.fc1_must_start.write(true,0);
}
if(mainNum ==2&&fc2_available ==1){
TagDB.fc2_must_start.write(true,0);
}
if(mainNum ==3&&fc3_available ==1){
TagDB.fc3_must_start.write(true,0);
}
}

}
	}
}
