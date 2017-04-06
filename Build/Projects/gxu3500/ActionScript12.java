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

public class ActionScript12 extends CgpUserScript
{
	public void run()
	{
end:{
int start,mainPump;
int fc1_available,fc2_available,fc3_available;

fc1_available =TagDB.fc1_inWork.getIntValue(0);
fc2_available =TagDB.fc2_inWork.getIntValue(0);
fc3_available =TagDB.fc3_inWork.getIntValue(0);

start =TagDB.FirstResStart.getIntValue(0);
mainPump =TagDB.main_pmp.getIntValue(0);

if(mainPump ==1){
if(fc3_available ==1){
TagDB.fc3_must_start.write(start,0);
}else {
TagDB.SecondResStart.write(true,0);
}
}
if(mainPump ==2){
if(fc1_available ==1){
TagDB.fc1_must_start.write(start,0);
}else {
TagDB.SecondResStart.write(true,0);
}
}
if(mainPump ==3){
if(fc2_available ==1){
TagDB.fc2_must_start.write(start,0);
}else {
TagDB.SecondResStart.write(true,0);
}
}
}
	}
}
