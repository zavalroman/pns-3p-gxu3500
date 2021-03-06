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

public class ActionScript6 extends CgpUserScript
{
	public void run()
	{
end:{
int timeLack,timeBound,delta,freqBound,mainPmp,setpoint,pres;
int main,firstRes,secondRes;
int fc1_available =TagDB.fc1_inWork.getIntValue(0);
int fc2_available =TagDB.fc2_inWork.getIntValue(0);
int fc3_available =TagDB.fc3_inWork.getIntValue(0);
boolean resOff =false;

timeLack =TagDB.presLackTimeCounter.getIntValue(0);
main =TagDB.MainStart.getIntValue(0);
firstRes =TagDB.FirstResStart.getIntValue(0);
secondRes =TagDB.SecondResStart.getIntValue(0);

mainPmp =TagDB.main_pmp.getIntValue(0);
delta =TagDB.boundDelta.getIntValue(0);
timeBound =TagDB.boundTime.getIntValue(0);
freqBound =TagDB.boundFreq.getIntValue(0);
setpoint =TagDB.currentSetpoint.getIntValue(0);
pres =TagDB.currentPressure.getIntValue(0);


if(mainPmp ==1){
if(fc3_available ==0){
resOff =true;
}
}
if(mainPmp ==2){
if(fc1_available ==0){
resOff =true;
}
}
if(mainPmp ==3){
if(fc2_available ==0){
resOff =true;
}
}

if(main ==1&&timeBound <timeLack){
if(firstRes ==1||resOff){
if(secondRes !=1){
secondRes =1;
timeLack =0;
}
}else {
firstRes =1;
timeLack =0;
}
}else {
if(setpoint-pres >2&&main ==0){
main =1;
timeLack =0;
}
}


TagDB.MainStart.write(main,0);
TagDB.FirstResStart.write(firstRes,0);
TagDB.SecondResStart.write(secondRes,0);
TagDB.presLackTimeCounter.write(timeLack,0);
}
	}
}
