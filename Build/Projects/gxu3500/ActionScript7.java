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

public class ActionScript7 extends CgpUserScript
{
	public void run()
	{
end:{
int timeExceed,fc1run,fc2run,fc3run,offFreq;
int fc1freq,fc2freq,fc3freq;
int main,firstRes,secondRes;
boolean letsStop =false;
boolean fc1low =false;
boolean fc2low =false;
boolean fc3low =false;

fc1freq =TagDB.fc1_freq.getIntValue(0);
fc2freq =TagDB.fc2_freq.getIntValue(0);
fc3freq =TagDB.fc3_freq.getIntValue(0);
fc1run =TagDB.fc1_must_start.getIntValue(0);
fc2run =TagDB.fc2_must_start.getIntValue(0);
fc3run =TagDB.fc3_must_start.getIntValue(0);
offFreq =TagDB.resOffFreq.getIntValue(0);

timeExceed =TagDB.presExceedTimeCounter.getIntValue(0);
main =TagDB.MainStart.getIntValue(0);
firstRes =TagDB.FirstResStart.getIntValue(0);
secondRes =TagDB.SecondResStart.getIntValue(0);


if(fc1run ==1){
if(fc1freq <offFreq){
fc1low =true;
}
}
if(fc2run ==1){
if(fc2freq <offFreq){
fc2low =true;
}
}
if(fc3run ==1){
if(fc3freq <offFreq){
fc3low =true;
}
}
if(fc1low ||fc2low ||fc3low ){
letsStop =true;
}
if(timeExceed >10&&letsStop){
if(secondRes ==0){
if(firstRes ==0){
if(main !=0&&timeExceed >300){
main =0;
timeExceed =0;
}
}else {
firstRes =0;
timeExceed =0;
}
}else {
secondRes =0;
timeExceed =0;
}
}

TagDB.MainStart.write(main,0);
TagDB.FirstResStart.write(firstRes,0);
TagDB.SecondResStart.write(secondRes,0);
TagDB.presExceedTimeCounter.write(timeExceed,0);
}
	}
}
