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

public class ActionScript2 extends CgpUserScript
{
	public void run()
	{
			if(TagDB.currentSetpoint.getTagType() == CgpTag.TAG_TYPE_FLOAT)
				TagDB.currentSetpoint.queuedWrite(CgpExpressionServer.expressionServer.executeFloatExpression(2002), 0);
			else
				TagDB.currentSetpoint.queuedWrite(CgpExpressionServer.expressionServer.executeIntExpression(2002), 0);

	}
}
