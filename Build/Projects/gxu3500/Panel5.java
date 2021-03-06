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
	public Panel5XprSrv exprServer;

	public Switch_0020 AlarmSummary01_Switch_0020;
	public Switch_0021 AlarmSummary01_Switch_0021;
	public Switch_0022 AlarmSummary01_Switch_0022;
	public Switch_0023 AlarmSummary01_Switch_0023;
	public Switch_0024 AlarmSummary01_Switch_0024;
	public Switch_0025 AlarmSummary01_Switch_0025;
	public Switch_0019 Switch03;
	public Switch_0019 Switch04;
	public Switch_0019 Switch05;
	CgpFont F7_0;
	CgpFont F10;
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
		exprServer = new Panel5XprSrv();
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
			440,
			90,
			80,
			399,
		};

		int LBAlarmSummary01Lengths[] = {
			9999,
			9999,
			9999,
			9999,
		};
		LBAlarmSummary01Font = new CgpFont[1];
		LBAlarmSummary01Font[0] = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		int AlarmSummary01_columns[] = {
			CgpAlarmFormatter.COLUMN_MESSAGE,
			CgpAlarmFormatter.COLUMN_DATE,
			CgpAlarmFormatter.COLUMN_TIME,
			CgpAlarmFormatter.COLUMN_STATE,
		};

		CgpAlarmFormatter AlarmSummary01_formatter = new CgpAlarmFormatter(CgpDate.YY_MM_DD, CgpDate.H24_MM_SS,"",
			AlarmSummary01_columns, null);
		AlarmSummary01 = new CgpAlarmSummary(
			20,
			80,
			779,
			399,
			false,
			IgpAlarmGroupConstants.LOG_DISP_MODE,
			TagDB.AlarmGroup1,
			AlarmSummary01_formatter,
			LBAlarmSummary01Font,
			panelContext
		);
		CgpListBox AlarmSummary01_listbox = new CgpListBox (
			20,
			80,
			779,
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
			20,
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

		AlarmSummary01_Switch_0020 = new Switch_0020(20, 40, 59, 79, panelContext, this);
		AlarmSummary01_Switch_0020.foreClr = 0x007f7f7f;
		nativeImage0 = new CgpGraphicFile( "Bitmap27.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0020.image01 = nativeImage0;
		AlarmSummary01_Switch_0020.image02 = nativeImage0;
		AlarmSummary01_Switch_0020.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0020.buzzer = true;
		AlarmSummary01_Switch_0020.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0021 = new Switch_0021(60, 40, 99, 79, panelContext, this);
		AlarmSummary01_Switch_0021.foreClr = 0x007f7f7f;
		nativeImage1 = new CgpGraphicFile( "Bitmap26.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0021.image01 = nativeImage1;
		AlarmSummary01_Switch_0021.image02 = nativeImage1;
		AlarmSummary01_Switch_0021.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0021.buzzer = true;
		AlarmSummary01_Switch_0021.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0022 = new Switch_0022(100, 40, 139, 79, panelContext, this);
		AlarmSummary01_Switch_0022.foreClr = 0x007f7f7f;
		nativeImage2 = new CgpGraphicFile( "Bitmap25.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0022.image01 = nativeImage2;
		AlarmSummary01_Switch_0022.image02 = nativeImage2;
		AlarmSummary01_Switch_0022.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0022.buzzer = true;
		AlarmSummary01_Switch_0022.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0023 = new Switch_0023(140, 40, 179, 79, panelContext, this);
		AlarmSummary01_Switch_0023.foreClr = 0x007f7f7f;
		nativeImage3 = new CgpGraphicFile( "Bitmap24.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0023.image01 = nativeImage3;
		AlarmSummary01_Switch_0023.image02 = nativeImage3;
		AlarmSummary01_Switch_0023.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0023.buzzer = true;
		AlarmSummary01_Switch_0023.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0024 = new Switch_0024(180, 40, 219, 79, panelContext, this);
		AlarmSummary01_Switch_0024.foreClr = 0x007f7f7f;
		nativeImage4 = new CgpGraphicFile( "Bitmap21.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0024.image01 = nativeImage4;
		AlarmSummary01_Switch_0024.image02 = nativeImage4;
		AlarmSummary01_Switch_0024.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0024.buzzer = true;
		AlarmSummary01_Switch_0024.alwaysDrawBackground = false;

		AlarmSummary01_Switch_0025 = new Switch_0025(220, 40, 259, 79, panelContext, this);
		AlarmSummary01_Switch_0025.foreClr = 0x007f7f7f;
		nativeImage5 = new CgpGraphicFile( "Bitmap20.bmp", 0, 0, 37, 37, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		AlarmSummary01_Switch_0025.image01 = nativeImage5;
		AlarmSummary01_Switch_0025.image02 = nativeImage5;
		AlarmSummary01_Switch_0025.alarm0 = AlarmSummary01;
		AlarmSummary01_Switch_0025.buzzer = true;
		AlarmSummary01_Switch_0025.alwaysDrawBackground = false;

		Switch03 = new Switch_0019(506, 19, 545, 58, panelContext, this);
		Switch03.frameClr = 0x006e726e;
		Switch03.foreClr = 0x0000ff00;
		Switch03.backClr = 0x00000000;
		Switch03.pattern = 1;

		CgpFont	fonts7[];
		String	labels7[];
		fonts7 = new CgpFont[1];
		labels7 = new String[1];

		labels7[0] = "\u041f\u04271";

		F7_0 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);
		fonts7[0] = F7_0;

		Switch03.buzzer = true;

		Switch03.switchFonts = fonts7;
		Switch03.labels = labels7;

		int intArray0[] = {0x00000000, };
		Switch03.labelClr = intArray0;
		Switch03.label3DClr = intArray0;
		Switch03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch03.word0 = TagDB.fc1_run;
		Switch03.wordID0 = 1000;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();
		Switch04 = new Switch_0019(606, 19, 645, 58, panelContext, this);
		Switch04.frameClr = 0x006e726e;
		Switch04.foreClr = 0x0000ff00;
		Switch04.backClr = 0x00000000;
		Switch04.pattern = 1;

		CgpFont	fonts8[];
		String	labels8[];
		fonts8 = new CgpFont[1];
		labels8 = new String[1];

		labels8[0] = "\u041f\u04272";
		fonts8[0] = F7_0;

		Switch04.buzzer = true;

		Switch04.switchFonts = fonts8;
		Switch04.labels = labels8;

		Switch04.labelClr = intArray0;
		Switch04.label3DClr = intArray0;
		Switch04.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch04.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch04.word0 = TagDB.fc2_run;
		Switch04.wordID0 = 1001;
		Switch04.exprServer = exprServer;
		Switch04.alwaysDrawBackground = false;

		Switch04.init();
		Switch05 = new Switch_0019(706, 19, 745, 58, panelContext, this);
		Switch05.frameClr = 0x006e726e;
		Switch05.foreClr = 0x0000ff00;
		Switch05.backClr = 0x00000000;
		Switch05.pattern = 1;

		CgpFont	fonts9[];
		String	labels9[];
		fonts9 = new CgpFont[1];
		labels9 = new String[1];

		labels9[0] = "\u041f\u04273";
		fonts9[0] = F7_0;

		Switch05.buzzer = true;

		Switch05.switchFonts = fonts9;
		Switch05.labels = labels9;

		Switch05.labelClr = intArray0;
		Switch05.label3DClr = intArray0;
		Switch05.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch05.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch05.word0 = TagDB.fc3_run;
		Switch05.wordID0 = 1002;
		Switch05.exprServer = exprServer;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();

		F10 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)16, (byte)0);

		CgpText Text02 = new CgpText
		(
			"\u0421\u0431\u0440\u043e\u0441 \u0430\u0432\u0430\u0440\u0438\u0438",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F10,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			348,	// x1
			28,	// y1
			471,	// x2
			47,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text02.set3DColor(0x00ff0000);
		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(AlarmSummary01, contextObject);

		CgpGraphics zOrderList[] = new CgpGraphics[11];
		zOrderList[0] = AlarmSummary01_Switch_0020;
		zOrderList[1] = AlarmSummary01_Switch_0021;
		zOrderList[2] = AlarmSummary01_Switch_0022;
		zOrderList[3] = AlarmSummary01_Switch_0023;
		zOrderList[4] = AlarmSummary01_Switch_0024;
		zOrderList[5] = AlarmSummary01_Switch_0025;
		zOrderList[6] = AlarmSummary01;
		zOrderList[7] = Switch03;
		zOrderList[8] = Switch04;
		zOrderList[9] = Switch05;
		zOrderList[10] = Text02;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Switch05,
			Switch04,
			Switch03,
			AlarmSummary01,
			AlarmSummary01_Switch_0025,
			AlarmSummary01_Switch_0024,
			AlarmSummary01_Switch_0023,
			AlarmSummary01_Switch_0022,
			AlarmSummary01_Switch_0021,
			AlarmSummary01_Switch_0020,
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

		Switch05.shutdown();

		Switch04.shutdown();

		Switch03.shutdown();

		AlarmSummary01_Switch_0025.shutdown();

		AlarmSummary01_Switch_0024.shutdown();

		AlarmSummary01_Switch_0023.shutdown();

		AlarmSummary01_Switch_0022.shutdown();

		AlarmSummary01_Switch_0021.shutdown();

		AlarmSummary01_Switch_0020.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Rectangle01
		_g.fillRectWithBorder
		(
			0x00ffffff,	// border color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			340 + _dx,	// x
			9 + _dy,	// y
			429,	// width
			63,	// height
			0x00ff0000,	// fg color
			0x00000000,	// bg color
			1,	// fill pattern
			CgpRectangle.SQUARE_CORNERS,	// corner type
			31,	// arc width
			31	// arc height
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
