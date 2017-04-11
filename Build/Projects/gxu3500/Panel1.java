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
	public Switch_0014 Switch01;
	public Switch_0014 Switch02;
	public Switch_0014 Switch03;
	public Lamp_0002 Lamp04;
	public Lamp_0002 Lamp05;
	public Lamp_0002 Lamp06;
	public CgpNumericDisplay disp_pressure;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay04;
	public CgpNumericDisplay NumericDisplay05;
	public CgpNumericDisplay NumericDisplay06;
	public Switch_0003 button_main;
	CgpFont F43;
	CgpFont F65;
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

		F65 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

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
		disp_fc1_freq.decimalPlaces = 1;
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
		disp_fc2_freq.decimalPlaces = 1;
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
		disp_fc3_freq.decimalPlaces = 1;
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
		lamp_alarm = new Lamp_0002(80, 80, 139, 139, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		lamp_alarm.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		lamp_alarm.backClr = intArray1;
		int intArray2[] = {1, 1, };
		lamp_alarm.pattern = intArray2;
		lamp_alarm.controlTag01 = TagDB.ALARM;
		lamp_alarm.alwaysDrawBackground = false;

		lamp_alarm.init();
		Switch01 = new Switch_0014(373, 54, 472, 153, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap28.bmp", 0, 0, 99, 99, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Switch01.image01 = nativeImage0;
		Switch01.image02 = nativeImage0;
		Switch01.buzzer = true;
		Switch01.visibID = 1000;
		Switch01.bit0 = TagDB.fc1_inWork;
		Switch01.exprServer = exprServer;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0014(373, 174, 472, 273, panelContext, this);
		Switch02.image01 = nativeImage0;
		Switch02.image02 = nativeImage0;
		Switch02.buzzer = true;
		Switch02.visibID = 1001;
		Switch02.bit0 = TagDB.fc2_inWork;
		Switch02.exprServer = exprServer;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();
		Switch03 = new Switch_0014(377, 290, 476, 389, panelContext, this);
		Switch03.image01 = nativeImage0;
		Switch03.image02 = nativeImage0;
		Switch03.buzzer = true;
		Switch03.visibID = 1002;
		Switch03.bit0 = TagDB.fc3_inWork;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();
		Lamp04 = new Lamp_0002(368, 71, 392, 95, panelContext, this);
		int intArray3[] = {0x00c3bfc3, 0x0000ff08, };
		Lamp04.foreClr = intArray3;
		Lamp04.backClr = intArray1;
		Lamp04.pattern = intArray2;
		Lamp04.controlTag01 = TagDB.fc1_status;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();
		Lamp05 = new Lamp_0002(368, 193, 392, 217, panelContext, this);
		Lamp05.foreClr = intArray3;
		Lamp05.backClr = intArray1;
		Lamp05.pattern = intArray2;
		Lamp05.controlTag01 = TagDB.fc2_status;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();
		Lamp06 = new Lamp_0002(368, 309, 392, 333, panelContext, this);
		Lamp06.foreClr = intArray3;
		Lamp06.backClr = intArray1;
		Lamp06.pattern = intArray2;
		Lamp06.controlTag01 = TagDB.fc3_status;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();

		disp_pressure = new CgpNumericDisplay(692, 134, 751, 173, panelContext, this);
		disp_pressure.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_pressure.variable = TagDB.currentPressure;
		disp_pressure.zeroSuppress = true;
		disp_pressure.zeroDisplay = true;
		disp_pressure.displayDigits = 2;
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
		disp_pressure.exprServer = exprServer;
		disp_pressure.init();

		NumericDisplay01 = new CgpNumericDisplay(693, 274, 752, 313, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.currentSetpoint;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 2;
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
		NumericDisplay01.exprServer = exprServer;
		NumericDisplay01.init();

		CgpText Text09 = new CgpText
		(
			"\u041d\u0410 1",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F43,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			433,	// x1
			54,	// y1
			472,	// x2
			73,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text09.set3DColor(0x00ff0000);

		CgpText Text10 = new CgpText
		(
			"\u041d\u0410 2",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F43,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			433,	// x1
			174,	// y1
			472,	// x2
			193,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text10.set3DColor(0x00ff0000);

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

		NumericDisplay04 = new CgpNumericDisplay(40, 320, 79, 339, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB._Hour;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 2;
		NumericDisplay04.decimalPlaces = 0;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts31;
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

		NumericDisplay05 = new CgpNumericDisplay(100, 320, 139, 339, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB._Minutes;
		NumericDisplay05.zeroSuppress = true;
		NumericDisplay05.zeroDisplay = true;
		NumericDisplay05.displayDigits = 2;
		NumericDisplay05.decimalPlaces = 0;
		NumericDisplay05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay05.unitStrings = null;
		NumericDisplay05.fonts = fonts31;
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

		NumericDisplay06 = new CgpNumericDisplay(160, 320, 199, 339, panelContext, this);
		NumericDisplay06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay06.variable = TagDB._Seconds;
		NumericDisplay06.zeroSuppress = true;
		NumericDisplay06.zeroDisplay = true;
		NumericDisplay06.displayDigits = 2;
		NumericDisplay06.decimalPlaces = 0;
		NumericDisplay06.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay06.unitStrings = null;
		NumericDisplay06.fonts = fonts31;
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
		button_main = new Switch_0003(660, 20, 779, 59, panelContext, this);
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

		int intArray4[] = {0x00447fff, };
		button_main.labelClr = intArray4;
		int intArray5[] = {0x00000000, };
		button_main.label3DClr = intArray5;
		button_main.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_main.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_main.panelChange0 = 6;
		button_main.exprServer = exprServer;
		button_main.alwaysDrawBackground = false;

		button_main.init();
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
		TagDB.fc1_freq.addEventListener(disp_fc1_freq, 0, panelContext);
		TagDB.fc2_freq.addEventListener(disp_fc2_freq, 0, panelContext);
		TagDB.fc3_freq.addEventListener(disp_fc3_freq, 0, panelContext);
		TagDB.ALARM.addEventListener(lamp_alarm, 0, panelContext);
		TagDB.fc1_inWork.addEventListener(Switch01, 0, panelContext);
		TagDB.fc2_inWork.addEventListener(Switch02, 0, panelContext);
		TagDB.fc3_inWork.addEventListener(Switch03, 0, panelContext);
		TagDB.fc1_status.addEventListener(Lamp04, 0, panelContext);
		TagDB.fc2_status.addEventListener(Lamp05, 0, panelContext);
		TagDB.fc3_status.addEventListener(Lamp06, 0, panelContext);
		TagDB.currentPressure.addEventListener(disp_pressure, 0, panelContext);
		TagDB.currentSetpoint.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB._Hour.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._Minutes.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay06, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[28];
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
		zOrderList[13] = Switch01;
		zOrderList[14] = Switch02;
		zOrderList[15] = Switch03;
		zOrderList[16] = Lamp04;
		zOrderList[17] = Lamp05;
		zOrderList[18] = Lamp06;
		zOrderList[19] = disp_pressure;
		zOrderList[20] = NumericDisplay01;
		zOrderList[21] = Text09;
		zOrderList[22] = Text10;
		zOrderList[23] = Text11;
		zOrderList[24] = NumericDisplay04;
		zOrderList[25] = NumericDisplay05;
		zOrderList[26] = NumericDisplay06;
		zOrderList[27] = button_main;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			button_main,
			Switch03,
			Switch02,
			Switch01,
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
		tagListVector.add(TagDB.fc1_freq);
		tagListVector.add(TagDB.fc2_freq);
		tagListVector.add(TagDB.fc3_freq);
		tagListVector.add(TagDB.fc1_status);
		tagListVector.add(TagDB.fc2_status);
		tagListVector.add(TagDB.fc3_status);
		tagListVector.add(TagDB._Hour);
		tagListVector.add(TagDB._Minutes);
		tagListVector.add(TagDB._Seconds);
		tagListVector.add(TagDB.ALARM);
		tagListVector.add(TagDB.currentSetpoint);
		tagListVector.add(TagDB.fc1_inWork);
		tagListVector.add(TagDB.fc2_inWork);
		tagListVector.add(TagDB.fc3_inWork);
		tagListVector.add(TagDB.currentPressure);

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
		nativeImage0.clean();

		button_main.shutdown();

		NumericDisplay06.shutdown();

		NumericDisplay05.shutdown();

		NumericDisplay04.shutdown();

		NumericDisplay01.shutdown();

		disp_pressure.shutdown();

		Lamp06.shutdown();

		Lamp05.shutdown();

		Lamp04.shutdown();

		Switch03.shutdown();

		Switch02.shutdown();

		Switch01.shutdown();

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
		// Text05
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"bar",	// text
			756 + _dx,	// x
			144 + _dy,	// y
			40,	// width
			20,	// height
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
		NumericDisplay04.drawBackground(_g);

		NumericDisplay05.drawBackground(_g);

		NumericDisplay06.drawBackground(_g);

		// Text12
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			":",	// text
			80 + _dx,	// x
			320 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F65	// font type
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
			":",	// text
			140 + _dx,	// x
			320 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F65	// font type
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
			"\u0412\u0440\u0435\u043c\u044f \u043f\u0430\u043d\u0435\u043b\u0438",	// text
			40 + _dx,	// x
			300 + _dy,	// y
			160,	// width
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
