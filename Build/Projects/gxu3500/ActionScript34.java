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

public class ActionScript34 extends CgpUserScript
{
	public void run()
	{
end:{

int code =TagDB.fc1_alarmCode.getIntValue(0);

if(code !=0){
TagDB.fc1_alarmCodeAru.write(true,0);
}else {
TagDB.fc1_alarmCodeAru.write(false,0);
}

if((code &1)!=0){
TagDB.fc1_overCurrent.write(true,0);
}else {
TagDB.fc1_overCurrent.write(false,0);
}
if((code &2)!=0){
TagDB.fc1_driveOverload.write(true,0);
}else {
TagDB.fc1_driveOverload.write(false,0);
}
if((code &4)!=0){
TagDB.fc1_motorOverload.write(true,0);
}else {
TagDB.fc1_motorOverload.write(false,0);
}
if((code &8)!=0){
TagDB.fc1_overHeat.write(true,0);
}else {
TagDB.fc1_overHeat.write(false,0);
}
if((code &16)!=0){
TagDB.fc1_overVoltage.write(true,0);
}else {
TagDB.fc1_overVoltage.write(false,0);
}
if((code &32)!=0){
TagDB.fc1_overHeat.write(true,0);
}else {
TagDB.fc1_overHeat.write(false,0);
}
if((code &64)!=0){
TagDB.fc1_cirUnderVolt.write(true,0);
}else {
TagDB.fc1_cirUnderVolt.write(false,0);
}
if((code &256)!=0){
TagDB.fc1_underCurrent.write(true,0);
}else {
TagDB.fc1_underCurrent.write(false,0);
}
}
	}
}
