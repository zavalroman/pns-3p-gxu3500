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

public class ActionScript7 extends CgpUserScript
{
	public void run()
	{
end:{
int timeExceed;
int main,firstRes,secondRes;

timeExceed =TagDB.presExceedTimeCounter.getIntValue(0);
main =TagDB.MainStart.getIntValue(0);
firstRes =TagDB.FirstResStart.getIntValue(0);
secondRes =TagDB.SecondResStart.getIntValue(0);


if(timeExceed >10){
if(secondRes ==0){
if(firstRes ==0){
if(main !=0&&timeExceed >300){
main =0;
timeExceed =0;
}
}else {
firstRes =0;
timeExceed =0;
}
}else {
secondRes =0;
timeExceed =0;
}
}

TagDB.MainStart.write(main,0);
TagDB.FirstResStart.write(firstRes,0);
TagDB.SecondResStart.write(secondRes,0);
TagDB.presExceedTimeCounter.write(timeExceed,0);
}
	}
}
