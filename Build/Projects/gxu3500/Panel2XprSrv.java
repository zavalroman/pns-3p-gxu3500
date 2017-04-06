package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.system.*;
import java.lang.System;
import gpclasses.plugins.script.*;
import java.util.Date;
import gpclasses.plugins.diag.*;
import gpclasses.util.misc.*;
import gpclasses.userScripts.*;
import gpclasses.util.io.*;

public class Panel2XprSrv extends CgpExpressionServer
{
	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
			case 1005:
			case 1007:
				{
					return (15 );
				}
			case 1001:
			case 1006:
			case 1008:
				{
					return (6);
				}
			case 1002:
			case 1003:
			case 1004:
				{
					return (128);
				}
		}
		return 0;
	}

}
