package Projects.gxu3500;

import gpclasses.util.misc.*;
public class _IndexIntResource0 extends CgpResIntIndex
{
	public _IndexIntResource0()
	{
		valueArray = new int[3];
		valueArray[0] = 1;
		valueArray[1] = 2;
		valueArray[2] = 3;
	}

	public int getIndexFromValue(int value)
	{
		int index=-1;
		if(value == 1)
			index = 0;
		else if(value == 2)
			index = 1;
		else if(value == 3)
			index = 2;
		return index;
	}
}
