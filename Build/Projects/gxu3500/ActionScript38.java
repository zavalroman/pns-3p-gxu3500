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

public class ActionScript38 extends CgpUserScript
{
	public void run()
	{
end:{
int code =TagDB.fc2_tripCode.getIntValue(0);

if(code !=0){
TagDB.fc2_tripCodeAru.write(true,0);
}else {
TagDB.fc2_tripCodeAru.write(false,0);
}

if(code ==8){
TagDB.fc2_inputPhaseFail.write(true,0);
}else {
TagDB.fc2_inputPhaseFail.write(false,0);
}
if(code ==9){
TagDB.fc2_outputPhaseFail.write(true,0);
}else {
TagDB.fc2_outputPhaseFail.write(false,0);
}
}
	}
}
