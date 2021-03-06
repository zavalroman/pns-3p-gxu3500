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

public class ActionScript31 extends CgpUserScript
{
	public void run()
	{
end:{
int analog =TagDB.AI.getIntValue(0);
int breakActive =TagDB.sensorBreak.getIntValue(0);
int shortActive =TagDB.sensorShort.getIntValue(0);

if(breakActive ==1){
if(analog >163){// 163 -- 3.8mA
TagDB.sensorBreak.write(false,0);
}
}else {
if(analog <163){
TagDB.sensorBreak.write(true,0);
}
}
if(shortActive ==1){
if(analog <930){// 930 -- 21mA
TagDB.sensorShort.write(false,0);
}
}else {
if(analog >930){
TagDB.sensorShort.write(true,0);
}
}

int fc1_trip =TagDB.fc1_tripCodeAru.getIntValue(0);
int fc2_trip =TagDB.fc2_tripCodeAru.getIntValue(0);
int fc3_trip =TagDB.fc3_tripCodeAru.getIntValue(0);
int fc1_al =TagDB.fc1_alarmCodeAru.getIntValue(0);
int fc2_al =TagDB.fc2_alarmCodeAru.getIntValue(0);
int fc3_al =TagDB.fc3_alarmCodeAru.getIntValue(0);

if(fc1_al ==1||fc1_trip ==1){
TagDB.fc1_alarm.write(true,0);
}else {
TagDB.fc1_alarm.write(false,0);
}
if(fc2_al ==1||fc2_trip ==1){
TagDB.fc2_alarm.write(true,0);
}else {
TagDB.fc2_alarm.write(false,0);
}
if(fc3_al ==1||fc3_trip ==1){
TagDB.fc3_alarm.write(true,0);
}else {
TagDB.fc3_alarm.write(false,0);
}
}
	}
}
