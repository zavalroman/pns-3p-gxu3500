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

public class Panel1 extends CgpPanel
{
	public Panel1XprSrv exprServer;

	public CgpNumericDisplay disp_fc1_freq;
	public CgpNumericDisplay disp_fc2_freq;
	public CgpNumericDisplay disp_fc3_freq;
	public Lamp_0002 lamp_alarm;
	public CgpNumericDisplay disp_pressure;
	public CgpNumericDisplay NumericDisplay01;
	public Switch_0003 button_main;
	public CgpNumericDisplay TimeDisplay01;
	public CgpNumericDisplay DateDisplay01;
	public Switch_0014 Switch01;
	public Switch_0014 Switch02;
	public Switch_0014 Switch03;
	public CgpNumericDisplay disp_fc1_freq01;
	public CgpNumericDisplay disp_fc1_freq02;
	public CgpNumericDisplay disp_fc1_freq03;
	public Lamp_0018 NStateLamp01;
	public Lamp_0018 NStateLamp02;
	public Lamp_0018 NStateLamp03;
	CgpFont F43;
	CgpGraphicFile Pipes07;
	CgpGraphicFile Pipes05;
	CgpGraphicFile Pipes74;
	CgpGraphicFile Pumps01;
	CgpGraphicFile Pipes39;
	CgpGraphicFile Pipes40;
	CgpGraphicFile Pipes42;
	CgpGraphicFile Pipes41;
	CgpGraphicFile Pipes73;
	CgpGraphicFile Pipes01;
	CgpGraphicFile Pumps02;
	CgpGraphicFile Pumps03;
	CgpGraphicFile Pipes03;
	CgpGraphicFile Pipes02;
	CgpGraphicFile Pipes04;
	CgpGraphicFile Pipes06;
	CgpGraphicFile Pipes08;
	CgpGraphicFile Arrows24;
	CgpGraphicFile Arrows01;
	CgpGraphicFile MiscSymbols237;
	CgpGraphicFile MiscSymbols01;
	CgpGraphicFile MiscSymbols02;
	CgpGraphicFile nativeImage0;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel1XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Main";
	}
	public int getPanelID()
	{
		return 1;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F43 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		Pipes07 = new CgpGraphicFile
		(
			"Bitmap9.bmp",
			0,	// x1
			0,	// y1
			21,	// x2
			200,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes05 = new CgpGraphicFile
		(
			"Bitmap15.bmp",
			0,	// x1
			0,	// y1
			187,	// x2
			21,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes74 = new CgpGraphicFile
		(
			"Bitmap9.bmp",
			0,	// x1
			0,	// y1
			21,	// x2
			200,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);


		Pumps01 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			384,	// x1
			196,	// y1
			474,	// x2
			257,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		Pipes39 = new CgpGraphicFile
		(
			"Bitmap4.bmp",
			0,	// x1
			0,	// y1
			36,	// x2
			37,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes40 = new CgpGraphicFile
		(
			"Bitmap5.bmp",
			0,	// x1
			0,	// y1
			36,	// x2
			37,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes42 = new CgpGraphicFile
		(
			"Bitmap6.bmp",
			0,	// x1
			0,	// y1
			36,	// x2
			35,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes41 = new CgpGraphicFile
		(
			"Bitmap7.bmp",
			0,	// x1
			0,	// y1
			37,	// x2
			35,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);


		Pipes73 = new CgpGraphicFile
		(
			"Bitmap8.bmp",
			233,	// x1
			217,	// y1
			395,	// x2
			238,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes01 = new CgpGraphicFile
		(
			"Bitmap10.bmp",
			273,	// x1
			210,	// y1
			310,	// x2
			246,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pumps02 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			388,	// x1
			312,	// y1
			478,	// x2
			373,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pumps03 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			384,	// x1
			74,	// y1
			474,	// x2
			135,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes03 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			311,	// x1
			95,	// y1
			389,	// x2
			116,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes02 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			315,	// x1
			333,	// y1
			393,	// x2
			354,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		Pipes04 = new CgpGraphicFile
		(
			"Bitmap10.bmp",
			0,	// x1
			0,	// y1
			37,	// x2
			36,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);


		Pipes06 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			470,	// x1
			77,	// y1
			548,	// x2
			98,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes08 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			474,	// x1
			315,	// y1
			552,	// x2
			336,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		Arrows24 = new CgpGraphicFile
		(
			"Bitmap18.bmp",
			0,	// x1
			0,	// y1
			39,	// x2
			17,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Arrows01 = new CgpGraphicFile
		(
			"Bitmap18.bmp",
			0,	// x1
			0,	// y1
			39,	// x2
			17,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);


		disp_fc1_freq = new CgpNumericDisplay(473, 114, 532, 133, panelContext, this);
		disp_fc1_freq.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc1_freq.variable = TagDB.fc1_freq;
		disp_fc1_freq.zeroSuppress = true;
		disp_fc1_freq.zeroDisplay = true;
		disp_fc1_freq.displayDigits = 2;
		disp_fc1_freq.decimalPlaces = 2;
		disp_fc1_freq.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc1_freq.unitStrings = null;
		CgpFont	fonts31[][] = {
			{ textFont0 },
			};
		disp_fc1_freq.fonts = fonts31;
		disp_fc1_freq.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc1_freq.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc1_freq.enableInput = false;
		disp_fc1_freq.barcode = false;
		disp_fc1_freq.frameColor = 0x006e726e;
		disp_fc1_freq.foreColor = 0x00b2b2b2;
		disp_fc1_freq.textColor = 0x00ffffff;
		disp_fc1_freq.text3DColor = 0x00000000;
		disp_fc1_freq.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq.changeColor = false;
		disp_fc1_freq.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		disp_fc1_freq.drawObject = displayDraw0;
		disp_fc1_freq.alwaysDrawBackground = true;
		disp_fc1_freq.init();

		disp_fc2_freq = new CgpNumericDisplay(473, 234, 532, 253, panelContext, this);
		disp_fc2_freq.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc2_freq.variable = TagDB.fc2_freq;
		disp_fc2_freq.zeroSuppress = true;
		disp_fc2_freq.zeroDisplay = true;
		disp_fc2_freq.displayDigits = 2;
		disp_fc2_freq.decimalPlaces = 2;
		disp_fc2_freq.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc2_freq.unitStrings = null;
		disp_fc2_freq.fonts = fonts31;
		disp_fc2_freq.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc2_freq.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc2_freq.enableInput = false;
		disp_fc2_freq.barcode = false;
		disp_fc2_freq.frameColor = 0x006e726e;
		disp_fc2_freq.foreColor = 0x00b2b2b2;
		disp_fc2_freq.textColor = 0x00ffffff;
		disp_fc2_freq.text3DColor = 0x00000000;
		disp_fc2_freq.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc2_freq.changeColor = false;
		disp_fc2_freq.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc2_freq.drawObject = displayDraw0;
		disp_fc2_freq.alwaysDrawBackground = true;
		disp_fc2_freq.init();

		disp_fc3_freq = new CgpNumericDisplay(473, 354, 532, 373, panelContext, this);
		disp_fc3_freq.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc3_freq.variable = TagDB.fc3_freq;
		disp_fc3_freq.zeroSuppress = true;
		disp_fc3_freq.zeroDisplay = true;
		disp_fc3_freq.displayDigits = 2;
		disp_fc3_freq.decimalPlaces = 2;
		disp_fc3_freq.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc3_freq.unitStrings = null;
		disp_fc3_freq.fonts = fonts31;
		disp_fc3_freq.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc3_freq.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc3_freq.enableInput = false;
		disp_fc3_freq.barcode = false;
		disp_fc3_freq.frameColor = 0x006e726e;
		disp_fc3_freq.foreColor = 0x00b2b2b2;
		disp_fc3_freq.textColor = 0x00ffffff;
		disp_fc3_freq.text3DColor = 0x00000000;
		disp_fc3_freq.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc3_freq.changeColor = false;
		disp_fc3_freq.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc3_freq.drawObject = displayDraw0;
		disp_fc3_freq.alwaysDrawBackground = true;
		disp_fc3_freq.init();
		lamp_alarm = new Lamp_0002(20, 20, 59, 59, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		lamp_alarm.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		lamp_alarm.backClr = intArray1;
		int intArray2[] = {1, 1, };
		lamp_alarm.pattern = intArray2;
		lamp_alarm.controlTag01 = TagDB.ALARM;
		lamp_alarm.alwaysDrawBackground = false;

		lamp_alarm.init();

		disp_pressure = new CgpNumericDisplay(692, 134, 759, 173, panelContext, this);
		disp_pressure.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_pressure.variable = TagDB.currentPressure;
		disp_pressure.zeroSuppress = true;
		disp_pressure.zeroDisplay = true;
		disp_pressure.displayDigits = 3;
		disp_pressure.decimalPlaces = 1;
		disp_pressure.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_pressure.unitStrings = null;
		disp_pressure.fonts = fonts31;
		disp_pressure.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_pressure.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_pressure.enableInput = false;
		disp_pressure.barcode = false;
		disp_pressure.frameColor = 0x006e726e;
		disp_pressure.foreColor = 0x00b2b2b2;
		disp_pressure.textColor = 0x00ffffff;
		disp_pressure.text3DColor = 0x00000000;
		disp_pressure.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_pressure.changeColor = false;
		disp_pressure.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_pressure.drawObject = displayDraw0;
		disp_pressure.alwaysDrawBackground = false;
		disp_pressure.init();

		CgpText Text05 = new CgpText
		(
			"bar",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F43,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			756,	// x1
			144,	// y1
			795,	// x2
			163,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text05.set3DColor(0x00ff0000);

		NumericDisplay01 = new CgpNumericDisplay(693, 274, 752, 313, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.panelCurrentSetpoint;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 3;
		NumericDisplay01.decimalPlaces = 1;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		NumericDisplay01.fonts = fonts31;
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
		NumericDisplay01.drawObject = displayDraw0;
		NumericDisplay01.alwaysDrawBackground = false;
		NumericDisplay01.init();

		CgpText Text11 = new CgpText
		(
			"\u041d\u0410 3",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F43,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			433,	// x1
			294,	// y1
			472,	// x2
			313,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text11.set3DColor(0x00ff0000);
		button_main = new Switch_0003(640, 20, 779, 59, panelContext, this);
		button_main.foreClr = 0x007fff7f;
		button_main.backClr = 0x00000000;
		button_main.pattern = 1;

		CgpFont	fonts68[];
		String	labels68[];
		fonts68 = new CgpFont[1];
		labels68 = new String[1];

		labels68[0] = "\u0418\u043d\u0436\u0435\u043d\u0435\u0440\u043d\u043e\u0435 \u043c\u0435\u043d\u044e";
		fonts68[0] = F43;

		button_main.buzzer = true;

		button_main.switchFonts = fonts68;
		button_main.labels = labels68;

		int intArray3[] = {0x00447fff, };
		button_main.labelClr = intArray3;
		int intArray4[] = {0x00000000, };
		button_main.label3DClr = intArray4;
		button_main.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_main.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_main.panelChange0 = 6;
		button_main.alwaysDrawBackground = false;

		button_main.init();

		TimeDisplay01 = new CgpNumericDisplay(40, 280, 159, 299, panelContext, this);
		TimeDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_TIME;
		TimeDisplay01.dateTimeFormat = CgpDate.H24_MM_SS;
		TimeDisplay01.dateTimeListenVariable = TagDB._Seconds;
		TimeDisplay01.fonts = fonts31;
		TimeDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		TimeDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		TimeDisplay01.enableInput = false;
		TimeDisplay01.barcode = false;
		TimeDisplay01.frameColor = 0x006e726e;
		TimeDisplay01.foreColor = 0x00b2b2b2;
		TimeDisplay01.textColor = 0x00ffffff;
		TimeDisplay01.text3DColor = 0x00000000;
		TimeDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		TimeDisplay01.changeColor = false;
		TimeDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		TimeDisplay01.drawObject = displayDraw0;
		TimeDisplay01.alwaysDrawBackground = false;
		TimeDisplay01.init();

		DateDisplay01 = new CgpNumericDisplay(40, 320, 159, 339, panelContext, this);
		DateDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_DATE;
		DateDisplay01.dateTimeFormat = CgpDate.DD_MM_YYYY;
		DateDisplay01.dateTimeListenVariable = TagDB._Day;
		DateDisplay01.fonts = fonts31;
		DateDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		DateDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		DateDisplay01.enableInput = false;
		DateDisplay01.barcode = false;
		DateDisplay01.frameColor = 0x006e726e;
		DateDisplay01.foreColor = 0x00b2b2b2;
		DateDisplay01.textColor = 0x00ffffff;
		DateDisplay01.text3DColor = 0x00000000;
		DateDisplay01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DateDisplay01.changeColor = false;
		DateDisplay01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		DateDisplay01.drawObject = displayDraw0;
		DateDisplay01.alwaysDrawBackground = false;
		DateDisplay01.init();

		MiscSymbols237 = new CgpGraphicFile
		(
			"Bitmap67.bmp",
			422,	// x1
			71,	// y1
			461,	// x2
			110,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		MiscSymbols01 = new CgpGraphicFile
		(
			"Bitmap67.bmp",
			421,	// x1
			193,	// y1
			460,	// x2
			232,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		MiscSymbols02 = new CgpGraphicFile
		(
			"Bitmap67.bmp",
			424,	// x1
			310,	// y1
			463,	// x2
			349,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);
		Switch01 = new Switch_0014(380, 51, 479, 150, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap28.bmp", 0, 0, 99, 99, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Switch01.image01 = nativeImage0;
		Switch01.image02 = nativeImage0;
		Switch01.buzzer = true;
		Switch01.visibID = 1003;
		Switch01.bit0 = TagDB.fc1_inWork;
		Switch01.exprServer = exprServer;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0014(380, 174, 479, 273, panelContext, this);
		Switch02.image01 = nativeImage0;
		Switch02.image02 = nativeImage0;
		Switch02.buzzer = true;
		Switch02.visibID = 1004;
		Switch02.bit0 = TagDB.fc2_inWork;
		Switch02.exprServer = exprServer;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();
		Switch03 = new Switch_0014(384, 291, 483, 390, panelContext, this);
		Switch03.image01 = nativeImage0;
		Switch03.image02 = nativeImage0;
		Switch03.buzzer = true;
		Switch03.visibID = 1005;
		Switch03.bit0 = TagDB.fc3_inWork;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();

		disp_fc1_freq01 = new CgpNumericDisplay(473, 140, 532, 159, panelContext, this);
		disp_fc1_freq01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc1_freq01.variable = TagDB.fc1_current;
		disp_fc1_freq01.zeroSuppress = true;
		disp_fc1_freq01.zeroDisplay = true;
		disp_fc1_freq01.displayDigits = 2;
		disp_fc1_freq01.decimalPlaces = 3;
		disp_fc1_freq01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc1_freq01.unitStrings = null;
		disp_fc1_freq01.fonts = fonts31;
		disp_fc1_freq01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc1_freq01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc1_freq01.enableInput = false;
		disp_fc1_freq01.barcode = false;
		disp_fc1_freq01.frameColor = 0x006e726e;
		disp_fc1_freq01.foreColor = 0x00b2b2b2;
		disp_fc1_freq01.textColor = 0x00ffffff;
		disp_fc1_freq01.text3DColor = 0x00000000;
		disp_fc1_freq01.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq01.changeColor = false;
		disp_fc1_freq01.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq01.drawObject = displayDraw0;
		disp_fc1_freq01.alwaysDrawBackground = true;
		disp_fc1_freq01.exprServer = exprServer;
		disp_fc1_freq01.init();

		disp_fc1_freq02 = new CgpNumericDisplay(473, 260, 532, 279, panelContext, this);
		disp_fc1_freq02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc1_freq02.variable = TagDB.fc2_current;
		disp_fc1_freq02.zeroSuppress = true;
		disp_fc1_freq02.zeroDisplay = true;
		disp_fc1_freq02.displayDigits = 2;
		disp_fc1_freq02.decimalPlaces = 3;
		disp_fc1_freq02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc1_freq02.unitStrings = null;
		disp_fc1_freq02.fonts = fonts31;
		disp_fc1_freq02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc1_freq02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc1_freq02.enableInput = false;
		disp_fc1_freq02.barcode = false;
		disp_fc1_freq02.frameColor = 0x006e726e;
		disp_fc1_freq02.foreColor = 0x00b2b2b2;
		disp_fc1_freq02.textColor = 0x00ffffff;
		disp_fc1_freq02.text3DColor = 0x00000000;
		disp_fc1_freq02.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq02.changeColor = false;
		disp_fc1_freq02.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq02.drawObject = displayDraw0;
		disp_fc1_freq02.alwaysDrawBackground = true;
		disp_fc1_freq02.exprServer = exprServer;
		disp_fc1_freq02.init();

		disp_fc1_freq03 = new CgpNumericDisplay(473, 380, 532, 399, panelContext, this);
		disp_fc1_freq03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_fc1_freq03.variable = TagDB.fc3_current;
		disp_fc1_freq03.zeroSuppress = true;
		disp_fc1_freq03.zeroDisplay = true;
		disp_fc1_freq03.displayDigits = 2;
		disp_fc1_freq03.decimalPlaces = 3;
		disp_fc1_freq03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_fc1_freq03.unitStrings = null;
		disp_fc1_freq03.fonts = fonts31;
		disp_fc1_freq03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		disp_fc1_freq03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		disp_fc1_freq03.enableInput = false;
		disp_fc1_freq03.barcode = false;
		disp_fc1_freq03.frameColor = 0x006e726e;
		disp_fc1_freq03.foreColor = 0x00b2b2b2;
		disp_fc1_freq03.textColor = 0x00ffffff;
		disp_fc1_freq03.text3DColor = 0x00000000;
		disp_fc1_freq03.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq03.changeColor = false;
		disp_fc1_freq03.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		disp_fc1_freq03.drawObject = displayDraw0;
		disp_fc1_freq03.alwaysDrawBackground = true;
		disp_fc1_freq03.exprServer = exprServer;
		disp_fc1_freq03.init();
		NStateLamp01 = new Lamp_0018(359, 66, 383, 90, panelContext, this);
		int intArray5[] = {0x00b2b2b2, 0x0022ea00, 0x002222ff, 0x00c3bfc3, };
		NStateLamp01.foreClr = intArray5;
		int intArray6[] = {0x00000000, 0x00000000, 0x00000000, 0x00000000, };
		NStateLamp01.backClr = intArray6;
		int intArray7[] = {1, 1, 1, 1, };
		NStateLamp01.pattern = intArray7;
		NStateLamp01.controlTag01 = TagDB.fc1_status;
		NStateLamp01.controlTag02 = TagDB.fc1_alarm;
		NStateLamp01.exprServer = exprServer;
		NStateLamp01.alwaysDrawBackground = false;

		NStateLamp01.init();
		NStateLamp02 = new Lamp_0018(360, 189, 384, 213, panelContext, this);
		NStateLamp02.foreClr = intArray5;
		NStateLamp02.backClr = intArray6;
		NStateLamp02.pattern = intArray7;
		NStateLamp02.controlTag01 = TagDB.fc2_status;
		NStateLamp02.controlTag02 = TagDB.fc2_alarm;
		NStateLamp02.exprServer = exprServer;
		NStateLamp02.alwaysDrawBackground = false;

		NStateLamp02.init();
		NStateLamp03 = new Lamp_0018(361, 304, 385, 328, panelContext, this);
		NStateLamp03.foreClr = intArray5;
		NStateLamp03.backClr = intArray6;
		NStateLamp03.pattern = intArray7;
		NStateLamp03.controlTag01 = TagDB.fc3_status;
		NStateLamp03.controlTag02 = TagDB.fc3_alarm;
		NStateLamp03.exprServer = exprServer;
		NStateLamp03.alwaysDrawBackground = false;

		NStateLamp03.init();
		((CgpWindow)owner).drawBack();

		CgpTouchAnimation TouchPumps01 = new CgpBitTouchAnimation
		(
			Pumps01,	// object name
			TagDB.fc2_inWork,	// outTag
			0,	// Element Number
			CgpTouchAnimation.TOUCH_BEEP,
			CgpBitTouchAnimation.BIT_TOGGLE
		).setContinousSense(false);

		CgpTouchAnimation TouchPumps02 = new CgpBitTouchAnimation
		(
			Pumps02,	// object name
			TagDB.fc3_inWork,	// outTag
			0,	// Element Number
			CgpTouchAnimation.TOUCH_BEEP,
			CgpBitTouchAnimation.BIT_TOGGLE
		).setContinousSense(false);

		CgpTouchAnimation TouchPumps03 = new CgpBitTouchAnimation
		(
			Pumps03,	// object name
			TagDB.fc1_inWork,	// outTag
			0,	// Element Number
			CgpTouchAnimation.TOUCH_BEEP,
			CgpBitTouchAnimation.BIT_TOGGLE
		).setContinousSense(false);

		CgpVisibilityAnimation MiscSymbols237Visible = new CgpVisibilityAnimation
		(
			MiscSymbols237,	// object name
			exprServer,
			1000	// index
		);

		CgpVisibilityAnimation MiscSymbols01Visible = new CgpVisibilityAnimation
		(
			MiscSymbols01,	// object name
			exprServer,
			1001	// index
		);

		CgpVisibilityAnimation MiscSymbols02Visible = new CgpVisibilityAnimation
		(
			MiscSymbols02,	// object name
			exprServer,
			1002	// index
		);
		TagDB.fc1_freq.addEventListener(disp_fc1_freq, 0, panelContext);
		TagDB.fc2_freq.addEventListener(disp_fc2_freq, 0, panelContext);
		TagDB.fc3_freq.addEventListener(disp_fc3_freq, 0, panelContext);
		TagDB.ALARM.addEventListener(lamp_alarm, 0, panelContext);
		TagDB.currentPressure.addEventListener(disp_pressure, 0, panelContext);
		TagDB.panelCurrentSetpoint.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._Seconds.addEventListener(TimeDisplay01, 0, panelContext);
		TagDB._Day.addEventListener(DateDisplay01, 0, panelContext);
		TagDB.main_pmp.addEventListener(MiscSymbols237Visible, 0, panelContext);
		TagDB.main_pmp.addEventListener(MiscSymbols01Visible, 0, panelContext);
		TagDB.main_pmp.addEventListener(MiscSymbols02Visible, 0, panelContext);
		TagDB.fc1_inWork.addEventListener(Switch01, 0, panelContext);
		TagDB.fc2_inWork.addEventListener(Switch02, 0, panelContext);
		TagDB.fc3_inWork.addEventListener(Switch03, 0, panelContext);
		TagDB.fc1_current.addEventListener(disp_fc1_freq01, 0, panelContext);
		TagDB.fc2_current.addEventListener(disp_fc1_freq02, 0, panelContext);
		TagDB.fc3_current.addEventListener(disp_fc1_freq03, 0, panelContext);
		TagDB.fc1_alarm.addEventListener(NStateLamp01, 0, panelContext);
		TagDB.fc1_status.addEventListener(NStateLamp01, 0, panelContext);
		TagDB.fc2_status.addEventListener(NStateLamp02, 0, panelContext);
		TagDB.fc2_alarm.addEventListener(NStateLamp02, 0, panelContext);
		TagDB.fc3_alarm.addEventListener(NStateLamp03, 0, panelContext);
		TagDB.fc3_status.addEventListener(NStateLamp03, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[32];
		zOrderList[0] = Pumps01;
		zOrderList[1] = Pipes73;
		zOrderList[2] = Pipes01;
		zOrderList[3] = Pumps02;
		zOrderList[4] = Pumps03;
		zOrderList[5] = Pipes03;
		zOrderList[6] = Pipes02;
		zOrderList[7] = Pipes06;
		zOrderList[8] = Pipes08;
		zOrderList[9] = disp_fc1_freq;
		zOrderList[10] = disp_fc2_freq;
		zOrderList[11] = disp_fc3_freq;
		zOrderList[12] = lamp_alarm;
		zOrderList[13] = disp_pressure;
		zOrderList[14] = Text05;
		zOrderList[15] = NumericDisplay01;
		zOrderList[16] = Text11;
		zOrderList[17] = button_main;
		zOrderList[18] = TimeDisplay01;
		zOrderList[19] = DateDisplay01;
		zOrderList[20] = MiscSymbols237;
		zOrderList[21] = MiscSymbols01;
		zOrderList[22] = MiscSymbols02;
		zOrderList[23] = Switch01;
		zOrderList[24] = Switch02;
		zOrderList[25] = Switch03;
		zOrderList[26] = disp_fc1_freq01;
		zOrderList[27] = disp_fc1_freq02;
		zOrderList[28] = disp_fc1_freq03;
		zOrderList[29] = NStateLamp01;
		zOrderList[30] = NStateLamp02;
		zOrderList[31] = NStateLamp03;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			Switch03,
			Switch02,
			Switch01,
			button_main,
			TouchPumps03,
			TouchPumps02,
			TouchPumps01,
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
		tagListVector.add(TagDB.fc1_freq);
		tagListVector.add(TagDB.fc2_freq);
		tagListVector.add(TagDB.fc3_freq);
		tagListVector.add(TagDB.fc1_status);
		tagListVector.add(TagDB.fc2_status);
		tagListVector.add(TagDB.fc3_status);
		tagListVector.add(TagDB.fc1_current);
		tagListVector.add(TagDB.fc2_current);
		tagListVector.add(TagDB.fc3_current);
		tagListVector.add(TagDB.main_pmp);
		tagListVector.add(TagDB.ALARM);
		tagListVector.add(TagDB.fc1_inWork);
		tagListVector.add(TagDB.fc2_inWork);
		tagListVector.add(TagDB.fc3_inWork);
		tagListVector.add(TagDB.currentPressure);
		tagListVector.add(TagDB.fc1_alarm);
		tagListVector.add(TagDB.fc2_alarm);
		tagListVector.add(TagDB.fc3_alarm);
		tagListVector.add(TagDB.panelCurrentSetpoint);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		Pipes07.clean();
		Pipes05.clean();
		Pipes74.clean();
		Pumps01.clean();
		Pipes39.clean();
		Pipes40.clean();
		Pipes42.clean();
		Pipes41.clean();
		Pipes73.clean();
		Pipes01.clean();
		Pumps02.clean();
		Pumps03.clean();
		Pipes03.clean();
		Pipes02.clean();
		Pipes04.clean();
		Pipes06.clean();
		Pipes08.clean();
		Arrows24.clean();
		Arrows01.clean();
		MiscSymbols237.clean();
		MiscSymbols01.clean();
		MiscSymbols02.clean();
		nativeImage0.clean();

		NStateLamp03.shutdown();

		NStateLamp02.shutdown();

		NStateLamp01.shutdown();

		disp_fc1_freq03.shutdown();

		disp_fc1_freq02.shutdown();

		disp_fc1_freq01.shutdown();

		Switch03.shutdown();

		Switch02.shutdown();

		Switch01.shutdown();

		DateDisplay01.shutdown();

		TimeDisplay01.shutdown();

		button_main.shutdown();

		NumericDisplay01.shutdown();

		disp_pressure.shutdown();

		lamp_alarm.shutdown();

		disp_fc3_freq.shutdown();

		disp_fc2_freq.shutdown();

		disp_fc1_freq.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		// Pipes07
		_g.drawImage(Pipes07, 560 + _dx, 108 + _dy);
		// Pipes05
		_g.drawImage(Pipes05, 465 + _dx, 199 + _dy);
		// Pipes74
		_g.drawImage(Pipes74, 281 + _dx, 126 + _dy);
		// Pipes39
		_g.drawImage(Pipes39, 282 + _dx, 96 + _dy);
		// Pipes40
		_g.drawImage(Pipes40, 544 + _dx, 78 + _dy);
		// Pipes42
		_g.drawImage(Pipes42, 544 + _dx, 300 + _dy);
		// Pipes41
		_g.drawImage(Pipes41, 282 + _dx, 318 + _dy);
		// Pipes04
		_g.drawImage(Pipes04, 552 + _dx, 192 + _dy);
		// Arrows24
		_g.drawImage(Arrows24, 657 + _dx, 201 + _dy);
		// Arrows01
		_g.drawImage(Arrows01, 192 + _dx, 219 + _dy);
		// Text01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0422\u0430\u043f \u043f\u043e \u041d\u0410 \u0432\u044b\u0432\u0435\u0434\u0435\u0442 \u0435\u0433\u043e \u0438\u0437 \u0440\u0430\u0431\u043e\u0442\u044b!",	// text
			308 + _dx,	// x
			8 + _dy,	// y
			260,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
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
			"\u0413\u0446",	// text
			535 + _dx,	// x
			114 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
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
			"\u0413\u0446",	// text
			535 + _dx,	// x
			234 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
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
			"\u0413\u0446",	// text
			535 + _dx,	// x
			354 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		disp_pressure.drawBackground(_g);

		// Text07
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0412\u044b\u0445\u043e\u0434\u043d\u043e\u0435 \u0434\u0430\u0432\u043b\u0435\u043d\u0438\u0435",	// text
			596 + _dx,	// x
			134 + _dy,	// y
			96,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		NumericDisplay01.drawBackground(_g);

		// Text06
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0422\u0435\u043a\u0443\u0449\u0430\u044f \u0443\u0441\u0442\u0430\u0432\u043a\u0430",	// text
			613 + _dx,	// x
			274 + _dy,	// y
			60,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		// Text08
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"bar",	// text
			753 + _dx,	// x
			284 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
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
			"\u041d\u0410 1",	// text
			433 + _dx,	// x
			54 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		// Text10
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u041d\u0410 2",	// text
			433 + _dx,	// x
			174 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		TimeDisplay01.drawBackground(_g);

		DateDisplay01.drawBackground(_g);

		// Text12
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0410",	// text
			535 + _dx,	// x
			140 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		// Text13
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0410",	// text
			535 + _dx,	// x
			260 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		// Text14
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0410",	// text
			535 + _dx,	// x
			380 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F43	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
