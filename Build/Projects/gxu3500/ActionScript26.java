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

public class ActionScript26 extends CgpUserScript
{
	public void run()
	{
end:{
int main =TagDB.main_pmp.getIntValue(0);
int mainMustStart =TagDB.MainStart.getIntValue(0);
int firstResMustStart =TagDB.FirstResStart.getIntValue(0);
int secondResMustStart =TagDB.SecondResStart.getIntValue(0);
int fc1run =TagDB.fc1_must_start.getIntValue(0);
int fc2run =TagDB.fc2_must_start.getIntValue(0);
int fc3run =TagDB.fc3_must_start.getIntValue(0);
int fc1_available =TagDB.fc1_inWork.getIntValue(0);
int fc2_available =TagDB.fc2_inWork.getIntValue(0);
int fc3_available =TagDB.fc3_inWork.getIntValue(0);
//проверка включения
if(main ==1){
if(mainMustStart ==1&&fc1run ==0&&fc1_available ==1){
TagDB.fc1_must_start.write(true,0);
}
if(firstResMustStart ==1&&fc3run ==0&&fc3_available ==1){
TagDB.fc3_must_start.write(true,0);
}
if(secondResMustStart ==1&&fc2run ==0&&fc2_available ==1){
TagDB.fc2_must_start.write(true,0);
}
}
if(main ==2){
if(mainMustStart ==1&&fc2run ==0&&fc2_available ==1){
TagDB.fc2_must_start.write(true,0);
}
if(firstResMustStart ==1&&fc1run ==0&&fc1_available ==1){
TagDB.fc1_must_start.write(true,0);
}
if(secondResMustStart ==1&&fc3run ==0&&fc3_available ==1){
TagDB.fc3_must_start.write(true,0);
}
}
if(main ==3){
if(mainMustStart ==1&&fc3run ==0&&fc3_available ==1){
TagDB.fc3_must_start.write(true,0);
}
if(firstResMustStart ==1&&fc2run ==0&&fc2_available ==1){
TagDB.fc2_must_start.write(true,0);
}
if(secondResMustStart ==1&&fc1run ==0&&fc1_available ==1){
TagDB.fc1_must_start.write(true,0);
}
}
//проверка выключения?

//проверка уставки
int fc1sp =TagDB.fc1_setpoint.getIntValue(0);
int fc2sp =TagDB.fc2_setpoint.getIntValue(0);
int fc3sp =TagDB.fc3_setpoint.getIntValue(0);
int sp =TagDB.currentSetpoint.getIntValue(0);
int panSp =TagDB.panelCurrentSetpoint.getIntValue(0);
int p4ma =TagDB.pres4ma.getIntValue(0);
int p20ma =TagDB.pres20ma.getIntValue(0);
int pres =(int)(((float)panSp)*500.0/((float)(p20ma-p4ma)/100));

if(sp !=pres){
TagDB.currentSetpoint.write(pres,0);
sp =pres;
}
if(fc1sp !=sp){
TagDB.fc1_setpoint.write(sp,0);
}
if(fc2sp !=sp){
TagDB.fc2_setpoint.write(sp,0);
}
if(fc3sp !=sp){
TagDB.fc3_setpoint.write(sp,0);
}
}
	}
}
