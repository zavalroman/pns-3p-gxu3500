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

public class ActionScript5 extends CgpUserScript
{
	public void run()
	{
end:{
int tmp_press;
int tmp_setpoint;
int timeCounterExceed;
int timeCounterLack;
int freqBound =TagDB.boundFreq.getIntValue(0);
int delta =TagDB.boundDelta.getIntValue(0);

tmp_press =TagDB.currentPressure.getIntValue(0);
tmp_setpoint =TagDB.panelCurrentSetpoint.getIntValue(0);
timeCounterExceed =TagDB.presExceedTimeCounter.getIntValue(0);
timeCounterLack =TagDB.presLackTimeCounter.getIntValue(0);

int fc1freq =TagDB.fc1_freq.getIntValue(0);
int fc2freq =TagDB.fc2_freq.getIntValue(0);
int fc3freq =TagDB.fc3_freq.getIntValue(0);
int mainFcFreq =0;
int main =TagDB.main_pmp.getIntValue(0);
int mainStarted =TagDB.MainStart.getIntValue(0);
int firstResStarted =TagDB.FirstResStart.getIntValue(0);
int secondResStarted =TagDB.SecondResStart.getIntValue(0);

if(main ==1){
mainFcFreq =fc1freq;
}
if(main ==2){
mainFcFreq =fc2freq;
}
if(main ==3){
mainFcFreq =fc3freq;
}

int offFreq;
boolean letsStop =false;

offFreq =TagDB.resOffFreq.getIntValue(0);

if(mainFcFreq <offFreq){
letsStop =true;
}else {
letsStop =false;
}

if(firstResStarted ==1||secondResStarted ==1){
if(letsStop){
timeCounterExceed++;
}else {
timeCounterExceed =0;
}
}else {
if(tmp_setpoint <tmp_press){
timeCounterExceed++;
}else {
timeCounterExceed =0;
}
}
if(mainStarted ==1){
if(freqBound <mainFcFreq &&delta <tmp_setpoint-tmp_press){
timeCounterLack++;
}else {
timeCounterLack =0;
}
}else {
if(delta <tmp_setpoint-tmp_press){
timeCounterLack++;
}else {
timeCounterLack =0;
}
}

TagDB.presExceedTimeCounter.write(timeCounterExceed,0);
TagDB.presLackTimeCounter.write(timeCounterLack,0);
}
	}
}
