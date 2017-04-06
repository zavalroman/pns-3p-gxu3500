package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.baseclasses.CgpReferenceTag;
import gpclasses.system.CgpRefTagFactory;
import gpclasses.util.misc.*;
import gpclasses.util.io.*;
import gpclasses.plugins.diag.*;
import gpclasses.plugins.script.*;
import gpclasses.plugins.illuminatedSwitch.*;
import gpclasses.userScripts.*;
import gpclasses.alarms.*;
import java.text.Format;
import java.util.Vector;

public class Panel5 extends CgpPanel
{
	public Switch_0007 AlarmSummary01_Switch_0007;
	public Switch_0008 AlarmSummary01_Switch_0008;
	public Switch_0009 AlarmSummary01_Switch_0009;
	public Switch_0010 AlarmSummary01_Switch_0010;
	public Switch_0011 AlarmSummary01_Switch_0011;
	public Switch_0012 AlarmSummary01_Switch_0012;
	CgpFont F1;
	CgpFont LBAlarmSummary01Font[];
	CgpGraphicFile nativeImage0;
	CgpGraphicFile nativeImage1;
	CgpGraphicFile nativeImage2;
	CgpGraphicFile nativeImage3;
	CgpGraphicFile nativeImage4;
	CgpGraphicFile nativeImage5;
	private Panel1000001 masterPanel = new Panel1000001();
	public static CgpAlarmSummary AlarmSummary01;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		String AlarmSummary01Strings[];
		CgpFont AlarmSummary01Fonts[];

		CgpStringDB dbAlarmSummary01_0;
		AlarmSummary01Strings = new String[4];
		AlarmSummary01Strings[0] = "Message";
		AlarmSummary01Strings[1] = "Date";
		AlarmSummary01Strings[2] = "Time";
		AlarmSummary01Strings[3] = "State";
		AlarmSummary01Fonts = new CgpFont[4];
		AlarmSummary01Fonts[0] = new CgpFont("TCP8x13", CgpFont.BOLD, (byte)13, (byte)8);
		AlarmSummary01Fonts[1] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[2] = AlarmSummary01Fonts[0];
		AlarmSummary01Fonts[3] = AlarmSummary01Fonts[0];
		dbAlarmSummary01_0 = new CgpStringDB(AlarmSummary01Strings, AlarmSummary01Fonts);

		CgpStringDB AlarmSummary01DBList[] =
		{
			dbAlarmSummary01_0,
		};

		int LBAlarmSummary01Widths[] = {
			150,
			100,
			100,
			309,
		};

		int LBAlarmSummary01Lengths[] = {
			9999,
			9999,
			9999,
			9999,
		};
		LBAlarmSummary01Font = new CgpFont[1];
		LBAlarmSummary01Font[0] = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		int AlarmSummary01_columns[] = {
			CgpAlarmFormatter.COLUMN_MESSAGE,
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_STATE,
		};

		CgpAlarmFormatter AlarmSummary01_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			AlarmSummary01_columns, null);
		AlarmSummary01 = new CgpAlarmSummary(
			60,
			100,
			759,
			399,
			false,
			IgpAlarmGroupConstants.ACTIVE_DISP_MODE,
			TagDB.AlarmGroup1,
			AlarmSummary01_formatter,
			LBAlarmSummary01Font,
			panelContext
		);
		CgpListBox AlarmSummary01_listbox = new CgpListBox (
			60,
			100,
			759,
			399,
			LBAlarmSummary01Font[0],
			0x00000000,
			1,
			LBAlarmSummary01Widths,
			LBAlarmSummary01Lengths,
			true,
			false,
			true,
			20,
			0,
			false,
			false,
			false,
			AlarmSummary01,
			0,
			panelContext
		);
		CgpAlarmColorMgr AlarmSummary01_Colors	= new CgpAlarmColorMgr();
		int[] AlarmSummary01_DefaultTextColors	= { 0x00000000, 0x00000000, 0x00000000, 0x00000000 };
		int[] AlarmSummary01_DefaultBackColors	= { 0x000000ff, 0x0000ffff, 0x0000ff00, 0x0000ff00 };
		int[] AlarmSummary01_DefaultTextBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };
		int[] AlarmSummary01_DefaultBackBlink	 = { CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE, CgpBlinkAnimation.SPEED_NONE };

		AlarmSummary01_Colors.defaultTextColors	= AlarmSummary01_DefaultTextColors;
		AlarmSummary01_Colors.defaultBackColors	= AlarmSummary01_DefaultBackColors;
		AlarmSummary01_Colors.defaultTextBlink = AlarmSummary01_DefaultTextBlink;
		AlarmSummary01_Colors.defaultBackBlink = AlarmSummary01_DefaultBackBlink;
		AlarmSummary01.setColorSet(AlarmSummary01_Colors);

		AlarmSummary01_listbox.setTitle(AlarmSummary01DBList, 0x00ffffff, 0x00000000);
		AlarmSummary01_listbox.setFrame(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		AlarmSummary01_listbox.setRule(0x00ffffff, 0x00000000, (byte)1, CgpLinePattern.LINE_SOLID);
		AlarmSummary01.setListBox(AlarmSummary01_listbox);
		AlarmSummary01.setAutoCursorOn(true);


		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Alarms";
	}
	public int getPanelID()
	{
		return 5;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("PF Gothic", CgpFont.PLAIN, (byte)16, (byte)16);

		AlarmSummary01_Switch_0007 = new Switch_0007(60, 60, 99, 99, panelContext, this);
		AlarmSummary01_Switch_0007.foreClr = 0x007f7f7f;
		nativeImage0 = new CgpGraphicFile( "Bitmap27.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0007.image01 = nativeImage0;
		AlarmSummary01_Switch_0007.image02 = nativeImage0;
		AlarmSummary01_Switch_0007.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0007.buzzer = true;
		AlarmSummary01_Switch_0007.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0008 = new Switch_0008(100, 60, 139, 99, panelContext, this);
		AlarmSummary01_Switch_0008.foreClr = 0x007f7f7f;
		nativeImage1 = new CgpGraphicFile( "Bitmap26.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0008.image01 = nativeImage1;
		AlarmSummary01_Switch_0008.image02 = nativeImage1;
		AlarmSummary01_Switch_0008.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0008.buzzer = true;
		AlarmSummary01_Switch_0008.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0009 = new Switch_0009(140, 60, 179, 99, panelContext, this);
		AlarmSummary01_Switch_0009.foreClr = 0x007f7f7f;
		nativeImage2 = new CgpGraphicFile( "Bitmap25.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0009.image01 = nativeImage2;
		AlarmSummary01_Switch_0009.image02 = nativeImage2;
		AlarmSummary01_Switch_0009.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0009.buzzer = true;
		AlarmSummary01_Switch_0009.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0010 = new Switch_0010(180, 60, 219, 99, panelContext, this);
		AlarmSummary01_Switch_0010.foreClr = 0x007f7f7f;
		nativeImage3 = new CgpGraphicFile( "Bitmap24.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0010.image01 = nativeImage3;
		AlarmSummary01_Switch_0010.image02 = nativeImage3;
		AlarmSummary01_Switch_0010.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0010.buzzer = true;
		AlarmSummary01_Switch_0010.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0011 = new Switch_0011(220, 60, 259, 99, panelContext, this);
		AlarmSummary01_Switch_0011.foreClr = 0x007f7f7f;
		nativeImage4 = new CgpGraphicFile( "Bitmap21.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0011.image01 = nativeImage4;
		AlarmSummary01_Switch_0011.image02 = nativeImage4;
		AlarmSummary01_Switch_0011.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0011.buzzer = true;
		AlarmSummary01_Switch_0011.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0012 = new Switch_0012(260, 60, 299, 99, panelContext, this);
		AlarmSummary01_Switch_0012.foreClr = 0x007f7f7f;
		nativeImage5 = new CgpGraphicFile( "Bitmap20.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0012.image01 = nativeImage5;
		AlarmSummary01_Switch_0012.image02 = nativeImage5;
		AlarmSummary01_Switch_0012.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0012.buzzer = true;
		AlarmSummary01_Switch_0012.alwaysDrawBackground = false;

		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(AlarmSummary01, contextObject);

		CgpGraphics zOrderList[] = new CgpGraphics[7];
		zOrderList[0] = AlarmSummary01_Switch_0007;
		zOrderList[1] = AlarmSummary01_Switch_0008;
		zOrderList[2] = AlarmSummary01_Switch_0009;
		zOrderList[3] = AlarmSummary01_Switch_0010;
		zOrderList[4] = AlarmSummary01_Switch_0011;
		zOrderList[5] = AlarmSummary01_Switch_0012;
		zOrderList[6] = AlarmSummary01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			AlarmSummary01,
			AlarmSummary01_Switch_0012,
			AlarmSummary01_Switch_0011,
			AlarmSummary01_Switch_0010,
			AlarmSummary01_Switch_0009,
			AlarmSummary01_Switch_0008,
			AlarmSummary01_Switch_0007,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		nativeImage0.clean();
		nativeImage1.clean();
		nativeImage2.clean();
		nativeImage3.clean();
		nativeImage4.clean();
		nativeImage5.clean();
		AlarmSummary01.clean();

		AlarmSummary01_Switch_0012.shutdown();

		AlarmSummary01_Switch_0011.shutdown();

		AlarmSummary01_Switch_0010.shutdown();

		AlarmSummary01_Switch_0009.shutdown();

		AlarmSummary01_Switch_0008.shutdown();

		AlarmSummary01_Switch_0007.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Text01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0410\u0432\u0430\u0440\u0438\u0438",	// text
			260 + _dx,	// x
			20 + _dy,	// y
			220,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
