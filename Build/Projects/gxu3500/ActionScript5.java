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

tmp_press =TagDB.currentPressure.getIntValue(0);
tmp_setpoint =TagDB.currentSetpoint.getIntValue(0);
timeCounterExceed =TagDB.presExceedTimeCounter.getIntValue(0);
timeCounterLack =TagDB.presLackTimeCounter.getIntValue(0);

if(tmp_press >tmp_setpoint+3){
timeCounterExceed++;
}else {
timeCounterExceed =0;
}
if(tmp_press <tmp_setpoint-3){
timeCounterLack++;
}else {
timeCounterLack =0;
}

TagDB.presExceedTimeCounter.write(timeCounterExceed,0);
TagDB.presLackTimeCounter.write(timeCounterLack,0);
}
	}
}
