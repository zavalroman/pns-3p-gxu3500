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

public class Panel6 extends CgpPanel
{
	public Panel6XprSrv exprServer;

	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay07;
	public Lamp_0002 Lamp01;
	public Lamp_0002 Lamp02;
	public Lamp_0002 Lamp03;
	public Switch_0015 Switch01;
	public Switch_0016 Switch02;
	public Switch_0017 Switch03;
	public Lamp_0002 Lamp04;
	public Switch_0017 Switch04;
	public Switch_0017 Switch05;
	public Lamp_0002 Lamp05;
	public Lamp_0002 Lamp06;
	public Switch_0015 Switch06;
	public Switch_0016 Switch07;
	public Switch_0015 Switch08;
	public Switch_0016 Switch09;
	public Switch_0018 Switch10;
	public CgpNumericDisplay NumericDisplay04;
	public CgpNumericDisplay NumericDisplay05;
	public CgpNumericDisplay NumericDisplay06;
	CgpFont F1;
	CgpFont F4;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel6XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Admin";
	}
	public int getPanelID()
	{
		return 6;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		F4 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);


		NumericDisplay01 = new CgpNumericDisplay(20, 100, 99, 119, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.presExceedTimeCounter;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 6;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts2[][] = {
			{ textFont0 },
			};
		NumericDisplay01.fonts = fonts2;
		NumericDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay01.enableInput = false;
		NumericDisplay01.barcode = false;
		NumericDisplay01.frameColor = 0x006e726e;
		NumericDisplay01.foreColor = 0x00b2b2b2;
		NumericDisplay01.textColor = 0x00ffffff;
		NumericDisplay01.text3DColor = 0x00000000;
		NumericDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay01.changeColor = false;
		NumericDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		NumericDisplay01.drawObject = displayDraw0;
		NumericDisplay01.alwaysDrawBackground = false;
		NumericDisplay01.init();

		NumericDisplay02 = new CgpNumericDisplay(20, 160, 99, 179, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.presLackTimeCounter;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 6;
		NumericDisplay02.decimalPlaces = 0;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts2;
		NumericDisplay02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay02.enableInput = false;
		NumericDisplay02.barcode = false;
		NumericDisplay02.frameColor = 0x006e726e;
		NumericDisplay02.foreColor = 0x00b2b2b2;
		NumericDisplay02.textColor = 0x00ffffff;
		NumericDisplay02.text3DColor = 0x00000000;
		NumericDisplay02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay02.changeColor = false;
		NumericDisplay02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay02.drawObject = displayDraw0;
		NumericDisplay02.alwaysDrawBackground = false;
		NumericDisplay02.init();

		NumericDisplay03 = new CgpNumericDisplay(140, 100, 259, 119, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.currentSetpoint;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 2;
		NumericDisplay03.decimalPlaces = 1;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		NumericDisplay03.fonts = fonts2;
		NumericDisplay03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay03.enableInput = false;
		NumericDisplay03.barcode = false;
		NumericDisplay03.frameColor = 0x006e726e;
		NumericDisplay03.foreColor = 0x00b2b2b2;
		NumericDisplay03.textColor = 0x00ffffff;
		NumericDisplay03.text3DColor = 0x00000000;
		NumericDisplay03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.changeColor = false;
		NumericDisplay03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay03.drawObject = displayDraw0;
		NumericDisplay03.alwaysDrawBackground = false;
		NumericDisplay03.init();

		NumericDisplay07 = new CgpNumericDisplay(140, 160, 259, 179, panelContext, this);
		NumericDisplay07.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay07.variable = TagDB.main_pmp;
		NumericDisplay07.zeroSuppress = true;
		NumericDisplay07.zeroDisplay = true;
		NumericDisplay07.displayDigits = 6;
		NumericDisplay07.decimalPlaces = 0;
		NumericDisplay07.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay07.unitStrings = null;
		NumericDisplay07.fonts = fonts2;
		NumericDisplay07.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay07.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay07.enableInput = false;
		NumericDisplay07.barcode = false;
		NumericDisplay07.frameColor = 0x006e726e;
		NumericDisplay07.foreColor = 0x00b2b2b2;
		NumericDisplay07.textColor = 0x00ffffff;
		NumericDisplay07.text3DColor = 0x00000000;
		NumericDisplay07.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay07.changeColor = false;
		NumericDisplay07.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay07.drawObject = displayDraw0;
		NumericDisplay07.alwaysDrawBackground = false;
		NumericDisplay07.init();
		Lamp01 = new Lamp_0002(508, 80, 547, 119, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		Lamp01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Lamp01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		Lamp01.pattern = intArray2;
		Lamp01.controlTag01 = TagDB.MainStart;
		Lamp01.alwaysDrawBackground = false;

		Lamp01.init();
		Lamp02 = new Lamp_0002(582, 80, 621, 119, panelContext, this);
		Lamp02.foreClr = intArray0;
		Lamp02.backClr = intArray1;
		Lamp02.pattern = intArray2;
		Lamp02.controlTag01 = TagDB.FirstResStart;
		Lamp02.alwaysDrawBackground = false;

		Lamp02.init();
		Lamp03 = new Lamp_0002(668, 80, 707, 119, panelContext, this);
		Lamp03.foreClr = intArray0;
		Lamp03.backClr = intArray1;
		Lamp03.pattern = intArray2;
		Lamp03.controlTag01 = TagDB.SecondResStart;
		Lamp03.alwaysDrawBackground = false;

		Lamp03.init();
		Switch01 = new Switch_0015(465, 292, 504, 331, panelContext, this);
		Switch01.frameClr = 0x006e726e;
		Switch01.foreClr = 0x0000ff00;
		Switch01.backClr = 0x00000000;
		Switch01.pattern = 1;
		Switch01.buzzer = true;
		Switch01.bit0 = TagDB.fc1_must_start;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0016(525, 292, 564, 331, panelContext, this);
		Switch02.frameClr = 0x006e726e;
		Switch02.foreClr = 0x0000ff00;
		Switch02.backClr = 0x00000000;
		Switch02.pattern = 1;
		Switch02.buzzer = true;
		Switch02.bit0 = TagDB.fc1_must_start;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();
		Switch03 = new Switch_0017(508, 240, 547, 279, panelContext, this);
		Switch03.frameClr = 0x006e726e;
		Switch03.foreClr = 0x0000ff00;
		Switch03.backClr = 0x00000000;
		Switch03.pattern = 1;
		Switch03.buzzer = true;
		Switch03.word0 = TagDB.fc1_run;
		Switch03.wordID0 = 1000;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();
		Lamp04 = new Lamp_0002(508, 180, 547, 219, panelContext, this);
		Lamp04.foreClr = intArray0;
		Lamp04.backClr = intArray1;
		Lamp04.pattern = intArray2;
		Lamp04.controlTag01 = TagDB.fc1_status;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();
		Switch04 = new Switch_0017(588, 240, 627, 279, panelContext, this);
		Switch04.frameClr = 0x006e726e;
		Switch04.foreClr = 0x0000ff00;
		Switch04.backClr = 0x00000000;
		Switch04.pattern = 1;
		Switch04.buzzer = true;
		Switch04.word0 = TagDB.fc2_run;
		Switch04.wordID0 = 1001;
		Switch04.exprServer = exprServer;
		Switch04.alwaysDrawBackground = false;

		Switch04.init();
		Switch05 = new Switch_0017(668, 240, 707, 279, panelContext, this);
		Switch05.frameClr = 0x006e726e;
		Switch05.foreClr = 0x0000ff00;
		Switch05.backClr = 0x00000000;
		Switch05.pattern = 1;
		Switch05.buzzer = true;
		Switch05.word0 = TagDB.fc3_run;
		Switch05.wordID0 = 1002;
		Switch05.exprServer = exprServer;
		Switch05.alwaysDrawBackground = false;

		Switch05.init();
		Lamp05 = new Lamp_0002(588, 180, 627, 219, panelContext, this);
		Lamp05.foreClr = intArray0;
		Lamp05.backClr = intArray1;
		Lamp05.pattern = intArray2;
		Lamp05.controlTag01 = TagDB.fc2_status;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();
		Lamp06 = new Lamp_0002(668, 180, 707, 219, panelContext, this);
		Lamp06.foreClr = intArray0;
		Lamp06.backClr = intArray1;
		Lamp06.pattern = intArray2;
		Lamp06.controlTag01 = TagDB.fc3_status;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();
		Switch06 = new Switch_0015(558, 345, 597, 384, panelContext, this);
		Switch06.frameClr = 0x006e726e;
		Switch06.foreClr = 0x0000ff00;
		Switch06.backClr = 0x00000000;
		Switch06.pattern = 1;
		Switch06.buzzer = true;
		Switch06.bit0 = TagDB.fc2_must_start;
		Switch06.exprServer = exprServer;
		Switch06.alwaysDrawBackground = false;

		Switch06.init();
		Switch07 = new Switch_0016(618, 345, 657, 384, panelContext, this);
		Switch07.frameClr = 0x006e726e;
		Switch07.foreClr = 0x0000ff00;
		Switch07.backClr = 0x00000000;
		Switch07.pattern = 1;
		Switch07.buzzer = true;
		Switch07.bit0 = TagDB.fc2_must_start;
		Switch07.exprServer = exprServer;
		Switch07.alwaysDrawBackground = false;

		Switch07.init();
		Switch08 = new Switch_0015(643, 291, 682, 330, panelContext, this);
		Switch08.frameClr = 0x006e726e;
		Switch08.foreClr = 0x0000ff00;
		Switch08.backClr = 0x00000000;
		Switch08.pattern = 1;
		Switch08.buzzer = true;
		Switch08.bit0 = TagDB.fc3_must_start;
		Switch08.exprServer = exprServer;
		Switch08.alwaysDrawBackground = false;

		Switch08.init();
		Switch09 = new Switch_0016(703, 291, 742, 330, panelContext, this);
		Switch09.frameClr = 0x006e726e;
		Switch09.foreClr = 0x0000ff00;
		Switch09.backClr = 0x00000000;
		Switch09.pattern = 1;
		Switch09.buzzer = true;
		Switch09.bit0 = TagDB.fc3_must_start;
		Switch09.exprServer = exprServer;
		Switch09.alwaysDrawBackground = false;

		Switch09.init();
		Switch10 = new Switch_0018(40, 360, 159, 399, panelContext, this);
		Switch10.frameClr = 0x006e726e;
		Switch10.foreClr = 0x0000ff00;
		Switch10.backClr = 0x00000000;
		Switch10.pattern = 1;

		CgpFont	fonts38[];
		String	labels38[];
		fonts38 = new CgpFont[1];
		labels38 = new String[1];

		labels38[0] = "System menu";
		fonts38[0] = F4;

		Switch10.buzzer = true;

		Switch10.switchFonts = fonts38;
		Switch10.labels = labels38;

		int intArray3[] = {0x00ffffff, };
		Switch10.labelClr = intArray3;
		int intArray4[] = {0x00000000, };
		Switch10.label3DClr = intArray4;
		Switch10.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Switch10.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Switch10.exprServer = exprServer;
		Switch10.alwaysDrawBackground = false;

		Switch10.init();

		NumericDisplay04 = new CgpNumericDisplay(460, 140, 539, 159, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.fc1_status;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 6;
		NumericDisplay04.decimalPlaces = 0;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts2;
		NumericDisplay04.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay04.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay04.enableInput = false;
		NumericDisplay04.barcode = false;
		NumericDisplay04.frameColor = 0x006e726e;
		NumericDisplay04.foreColor = 0x00b2b2b2;
		NumericDisplay04.textColor = 0x00ffffff;
		NumericDisplay04.text3DColor = 0x00000000;
		NumericDisplay04.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.changeColor = false;
		NumericDisplay04.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay04.drawObject = displayDraw0;
		NumericDisplay04.alwaysDrawBackground = false;
		NumericDisplay04.exprServer = exprServer;
		NumericDisplay04.init();

		NumericDisplay05 = new CgpNumericDisplay(569, 140, 648, 159, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB.fc2_status;
		NumericDisplay05.zeroSuppress = true;
		NumericDisplay05.zeroDisplay = true;
		NumericDisplay05.displayDigits = 6;
		NumericDisplay05.decimalPlaces = 0;
		NumericDisplay05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay05.unitStrings = null;
		NumericDisplay05.fonts = fonts2;
		NumericDisplay05.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay05.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay05.enableInput = false;
		NumericDisplay05.barcode = false;
		NumericDisplay05.frameColor = 0x006e726e;
		NumericDisplay05.foreColor = 0x00b2b2b2;
		NumericDisplay05.textColor = 0x00ffffff;
		NumericDisplay05.text3DColor = 0x00000000;
		NumericDisplay05.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.changeColor = false;
		NumericDisplay05.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay05.drawObject = displayDraw0;
		NumericDisplay05.alwaysDrawBackground = false;
		NumericDisplay05.exprServer = exprServer;
		NumericDisplay05.init();

		NumericDisplay06 = new CgpNumericDisplay(673, 140, 752, 159, panelContext, this);
		NumericDisplay06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay06.variable = TagDB.fc3_status;
		NumericDisplay06.zeroSuppress = true;
		NumericDisplay06.zeroDisplay = true;
		NumericDisplay06.displayDigits = 6;
		NumericDisplay06.decimalPlaces = 0;
		NumericDisplay06.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay06.unitStrings = null;
		NumericDisplay06.fonts = fonts2;
		NumericDisplay06.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay06.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay06.enableInput = false;
		NumericDisplay06.barcode = false;
		NumericDisplay06.frameColor = 0x006e726e;
		NumericDisplay06.foreColor = 0x00b2b2b2;
		NumericDisplay06.textColor = 0x00ffffff;
		NumericDisplay06.text3DColor = 0x00000000;
		NumericDisplay06.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay06.changeColor = false;
		NumericDisplay06.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay06.drawObject = displayDraw0;
		NumericDisplay06.alwaysDrawBackground = false;
		NumericDisplay06.exprServer = exprServer;
		NumericDisplay06.init();
		((CgpWindow)owner).drawBack();
		TagDB.presExceedTimeCounter.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.presLackTimeCounter.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.currentSetpoint.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.main_pmp.addEventListener(NumericDisplay07, 0, panelContext);
		TagDB.MainStart.addEventListener(Lamp01, 0, panelContext);
		TagDB.FirstResStart.addEventListener(Lamp02, 0, panelContext);
		TagDB.SecondResStart.addEventListener(Lamp03, 0, panelContext);
		TagDB.fc1_status.addEventListener(Lamp04, 0, panelContext);
		TagDB.fc2_status.addEventListener(Lamp05, 0, panelContext);
		TagDB.fc3_status.addEventListener(Lamp06, 0, panelContext);
		TagDB.fc1_status.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB.fc2_status.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB.fc3_status.addEventListener(NumericDisplay06, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[23];
		zOrderList[0] = NumericDisplay01;
		zOrderList[1] = NumericDisplay02;
		zOrderList[2] = NumericDisplay03;
		zOrderList[3] = NumericDisplay07;
		zOrderList[4] = Lamp01;
		zOrderList[5] = Lamp02;
		zOrderList[6] = Lamp03;
		zOrderList[7] = Switch01;
		zOrderList[8] = Switch02;
		zOrderList[9] = Switch03;
		zOrderList[10] = Lamp04;
		zOrderList[11] = Switch04;
		zOrderList[12] = Switch05;
		zOrderList[13] = Lamp05;
		zOrderList[14] = Lamp06;
		zOrderList[15] = Switch06;
		zOrderList[16] = Switch07;
		zOrderList[17] = Switch08;
		zOrderList[18] = Switch09;
		zOrderList[19] = Switch10;
		zOrderList[20] = NumericDisplay04;
		zOrderList[21] = NumericDisplay05;
		zOrderList[22] = NumericDisplay06;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Switch10,
			Switch09,
			Switch08,
			Switch07,
			Switch06,
			Switch05,
			Switch04,
			Switch03,
			Switch02,
			Switch01,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB._Seconds);
		tagListVector.add(TagDB.fc1_status);
		tagListVector.add(TagDB.fc2_status);
		tagListVector.add(TagDB.fc3_status);
		tagListVector.add(TagDB.main_pmp);
		tagListVector.add(TagDB.currentSetpoint);
		tagListVector.add(TagDB.presExceedTimeCounter);
		tagListVector.add(TagDB.presLackTimeCounter);
		tagListVector.add(TagDB.MainStart);
		tagListVector.add(TagDB.FirstResStart);
		tagListVector.add(TagDB.SecondResStart);
		tagListVector.add(TagDB.fc1_must_start);
		tagListVector.add(TagDB.fc2_must_start);
		tagListVector.add(TagDB.fc3_must_start);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		NumericDisplay06.shutdown();

		NumericDisplay05.shutdown();

		NumericDisplay04.shutdown();

		Switch10.shutdown();

		Switch09.shutdown();

		Switch08.shutdown();

		Switch07.shutdown();

		Switch06.shutdown();

		Lamp06.shutdown();

		Lamp05.shutdown();

		Switch05.shutdown();

		Switch04.shutdown();

		Lamp04.shutdown();

		Switch03.shutdown();

		Switch02.shutdown();

		Switch01.shutdown();

		Lamp03.shutdown();

		Lamp02.shutdown();

		Lamp01.shutdown();

		NumericDisplay07.shutdown();

		NumericDisplay03.shutdown();

		NumericDisplay02.shutdown();

		NumericDisplay01.shutdown();
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
			"\u0418\u043d\u0436\u0435\u043d\u0435\u0440\u043d\u043e\u0435 \u043c\u0435\u043d\u044e",	// text
			240 + _dx,	// x
			20 + _dy,	// y
			260,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1	// font type
		);
		NumericDisplay01.drawBackground(_g);

		NumericDisplay02.drawBackground(_g);

		// Text08
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Exceed timer",	// text
			20 + _dx,	// x
			80 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text09
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Lack timer",	// text
			20 + _dx,	// x
			140 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay03.drawBackground(_g);

		// Text10
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Current setpoint",	// text
			140 + _dx,	// x
			80 + _dy,	// y
			140,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay07.drawBackground(_g);

		// Text14
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Main pump",	// text
			140 + _dx,	// x
			140 + _dy,	// y
			120,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text15
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Main",	// text
			499 + _dx,	// x
			60 + _dy,	// y
			60,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text16
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"First Res",	// text
			568 + _dx,	// x
			60 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text17
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Second Res",	// text
			648 + _dx,	// x
			60 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text19
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"fc1",	// text
			508 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text20
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"fc2",	// text
			588 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text21
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"fc3",	// text
			668 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"FC error reset",	// text
			320 + _dx,	// x
			249 + _dy,	// y
			140,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text03
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Start/Stop",	// text
			347 + _dx,	// x
			309 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text04
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Status",	// text
			340 + _dx,	// x
			189 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		// Text05
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Control word",	// text
			336 + _dx,	// x
			340 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay04.drawBackground(_g);

		NumericDisplay05.drawBackground(_g);

		NumericDisplay06.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
