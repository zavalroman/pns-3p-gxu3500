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

public class ActionScript20 extends CgpUserScript
{
	public void run()
	{
end:{
int main,fc1_available,fc2_available;

main =TagDB.main_pmp.getIntValue(0);

fc2_available =TagDB.fc2_inWork.getIntValue(0);
fc1_available =TagDB.fc1_inWork.getIntValue(0);

if(main ==3){
if(fc1_available ==1){
main =1;
}else {
if(fc2_available ==1){
main =2;
}
}
}
TagDB.fc3_must_start.write(false,0);
TagDB.main_pmp.write(main,0);
}
	}
}
