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

public class ActionScript24 extends CgpUserScript
{
	public void run()
	{
			if(TagDB.fc1_setpoint.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				TagDB.fc1_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeFloatExpression(2003), 0);
			else
				TagDB.fc1_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeIntExpression(2003), 0);

			if(TagDB.fc2_setpoint.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				TagDB.fc2_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeFloatExpression(2004), 0);
			else
				TagDB.fc2_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeIntExpression(2004), 0);

			if(TagDB.fc3_setpoint.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				TagDB.fc3_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeFloatExpression(2005), 0);
			else
				TagDB.fc3_setpoint.queuedWrite(CgpExpressionServer.expressionServer.executeIntExpression(2005), 0);

end:{
int hh,daySp,nightSp;

hh =TagDB._Hour.getIntValue(0);
daySp =TagDB.panelDaySetpoint.getIntValue(0);

if(hh >=6){
TagDB.panelCurrentSetpoint.write(daySp,0);
}


nightSp =TagDB.panelNightSetpoint.getIntValue(0);

if(hh >=0&&hh <6){
TagDB.panelCurrentSetpoint.write(nightSp,0);
}
}
	}
}
