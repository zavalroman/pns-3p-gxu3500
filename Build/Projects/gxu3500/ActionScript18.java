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

public class ActionScript18 extends CgpUserScript
{
	public void run()
	{
end:{
int main,fc2_available,fc3_available;

main =TagDB.main_pmp.getIntValue(0);

fc2_available =TagDB.fc2_inWork.getIntValue(0);
fc3_available =TagDB.fc3_inWork.getIntValue(0);

if(main ==1){
if(fc2_available ==1){
main =2;
}else {
if(fc3_available ==1){
main =3;
}
}
}
TagDB.fc1_must_start.write(false,0);
TagDB.main_pmp.write(main,0);
}
	}
}
