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

public class Panel1XprSrv extends CgpExpressionServer
{
	public int executeIntExpression(int i)
	{
		switch (i)
		{
			case 1000:
				{
					quality = TagDB.main_pmp.getTagDataQuality();
					if ((TagDB.main_pmp.getIntValue(0))==1)
						return 1;
					else
						return 0;
				}
			case 1001:
				{
					quality = TagDB.main_pmp.getTagDataQuality();
					if ((TagDB.main_pmp.getIntValue(0))==2)
						return 1;
					else
						return 0;
				}
			case 1002:
				{
					quality = TagDB.main_pmp.getTagDataQuality();
					if ((TagDB.main_pmp.getIntValue(0))==3)
						return 1;
					else
						return 0;
				}
			case 1003:
				{
					quality = TagDB.fc1_inWork.getTagDataQuality();
					if (!(TagDB.fc1_inWork.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1004:
				{
					quality = TagDB.fc2_inWork.getTagDataQuality();
					if (!(TagDB.fc2_inWork.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
			case 1005:
				{
					quality = TagDB.fc3_inWork.getTagDataQuality();
					if (!(TagDB.fc3_inWork.getIntValue(0) != 0))
						return 1;
					else
						return 0;
				}
		}
		return 0;
	}

}
