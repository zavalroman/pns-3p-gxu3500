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

public class Panel2 extends CgpPanel
{
	public Panel2XprSrv exprServer;

	public CgpNumericDisplay field_20ma;
	public CgpNumericDisplay field_4ma;
	public CgpNumericDisplay field_daySetpoint;
	public CgpNumericDisplay field_nightSetpoint;
	public CgpNumericDisplay disp_pressure;
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay04;
	public CgpNumericDisplay NumericDisplay05;
	public CgpNumericDisplay NumericDisplay06;
	public CgpNumericDisplay NumericDisplay07;
	public Lamp_0002 Lamp01;
	public Lamp_0002 Lamp02;
	public Lamp_0002 Lamp03;
	public Switch_0015 Switch01;
	public Switch_0016 Switch02;
	public CgpNumericDisplay NumericDisplay08;
	public Switch_0013 Switch03;
	public Lamp_0002 Lamp04;
	public Switch_0013 Switch04;
	public Switch_0013 Switch05;
	public Lamp_0002 Lamp05;
	public Lamp_0002 Lamp06;
	public Switch_0015 Switch06;
	public Switch_0016 Switch07;
	public CgpNumericDisplay NumericDisplay10;
	public Switch_0015 Switch08;
	public Switch_0016 Switch09;
	public CgpNumericDisplay NumericDisplay11;
	CgpFont F3;
	CgpFont F5;
	CgpFont F11;
	public CgpSmartKeypadDec  decKeypad;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
		exprServer = new Panel2XprSrv();

		setBacklightColor(0);
	}
	public String getPanelName()
	{
		return "Pressure";
	}
	public int getPanelID()
	{
		return 2;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F3 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		F5 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)16, (byte)0);

		F11 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)18, (byte)0);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();

		field_20ma = new CgpNumericDisplay(660, 240, 719, 279, panelContext, this);
		field_20ma.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		field_20ma.variable = TagDB.pres20ma;
		field_20ma.zeroSuppress = true;
		field_20ma.zeroDisplay = true;
		field_20ma.displayDigits = 2;
		field_20ma.decimalPlaces = 2;
		field_20ma.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		field_20ma.unitStrings = null;
		CgpFont	fonts1[][] = {
			{ textFont0 },
			};
		field_20ma.fonts = fonts1;
		field_20ma.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		field_20ma.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		field_20ma.enableInput = true;
		field_20ma.displayPopupKeypad = true;
		field_20ma.keypad = decKeypad;
		field_20ma.beepOnTouch = false;
		field_20ma.barcode = false;
		field_20ma.frameColor = 0x006e726e;
		field_20ma.foreColor = 0x00b2b2b2;
		field_20ma.textColor = 0x00ffffff;
		field_20ma.text3DColor = 0x00000000;
		field_20ma.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_20ma.changeColor = false;
		field_20ma.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		CgpNumericDisplayDraw displayDraw0 = new D_DD00001(1,1,1,1);
		field_20ma.drawObject = displayDraw0;
		field_20ma.alwaysDrawBackground = false;
		field_20ma.init();

		field_4ma = new CgpNumericDisplay(660, 300, 719, 339, panelContext, this);
		field_4ma.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		field_4ma.variable = TagDB.pres4ma;
		field_4ma.zeroSuppress = true;
		field_4ma.zeroDisplay = true;
		field_4ma.displayDigits = 2;
		field_4ma.decimalPlaces = 2;
		field_4ma.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		field_4ma.unitStrings = null;
		field_4ma.fonts = fonts1;
		field_4ma.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		field_4ma.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		field_4ma.enableInput = true;
		field_4ma.displayPopupKeypad = true;
		field_4ma.keypad = decKeypad;
		field_4ma.beepOnTouch = false;
		field_4ma.barcode = false;
		field_4ma.frameColor = 0x006e726e;
		field_4ma.foreColor = 0x00b2b2b2;
		field_4ma.textColor = 0x00ffffff;
		field_4ma.text3DColor = 0x00000000;
		field_4ma.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_4ma.changeColor = false;
		field_4ma.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_4ma.drawObject = displayDraw0;
		field_4ma.alwaysDrawBackground = false;
		field_4ma.init();

		field_daySetpoint = new CgpNumericDisplay(140, 240, 199, 279, panelContext, this);
		field_daySetpoint.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		field_daySetpoint.variable = TagDB.daySetpoint;
		field_daySetpoint.zeroSuppress = true;
		field_daySetpoint.zeroDisplay = true;
		field_daySetpoint.displayDigits = 2;
		field_daySetpoint.decimalPlaces = 1;
		field_daySetpoint.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		field_daySetpoint.unitStrings = null;
		field_daySetpoint.fonts = fonts1;
		field_daySetpoint.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		field_daySetpoint.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		field_daySetpoint.enableInput = true;
		field_daySetpoint.displayPopupKeypad = true;
		field_daySetpoint.keypad = decKeypad;
		field_daySetpoint.beepOnTouch = false;
		field_daySetpoint.barcode = false;
		field_daySetpoint.frameColor = 0x006e726e;
		field_daySetpoint.foreColor = 0x00b2b2b2;
		field_daySetpoint.textColor = 0x00ffffff;
		field_daySetpoint.text3DColor = 0x00000000;
		field_daySetpoint.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_daySetpoint.changeColor = false;
		field_daySetpoint.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_daySetpoint.drawObject = displayDraw0;
		field_daySetpoint.alwaysDrawBackground = false;
		field_daySetpoint.init();

		field_nightSetpoint = new CgpNumericDisplay(140, 300, 199, 339, panelContext, this);
		field_nightSetpoint.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		field_nightSetpoint.variable = TagDB.nightSetpoint;
		field_nightSetpoint.zeroSuppress = true;
		field_nightSetpoint.zeroDisplay = true;
		field_nightSetpoint.displayDigits = 2;
		field_nightSetpoint.decimalPlaces = 1;
		field_nightSetpoint.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		field_nightSetpoint.unitStrings = null;
		field_nightSetpoint.fonts = fonts1;
		field_nightSetpoint.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		field_nightSetpoint.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		field_nightSetpoint.enableInput = true;
		field_nightSetpoint.displayPopupKeypad = true;
		field_nightSetpoint.keypad = decKeypad;
		field_nightSetpoint.beepOnTouch = false;
		field_nightSetpoint.barcode = false;
		field_nightSetpoint.frameColor = 0x006e726e;
		field_nightSetpoint.foreColor = 0x00b2b2b2;
		field_nightSetpoint.textColor = 0x00ffffff;
		field_nightSetpoint.text3DColor = 0x00000000;
		field_nightSetpoint.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_nightSetpoint.changeColor = false;
		field_nightSetpoint.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		field_nightSetpoint.drawObject = displayDraw0;
		field_nightSetpoint.alwaysDrawBackground = false;
		field_nightSetpoint.init();

		disp_pressure = new CgpNumericDisplay(660, 140, 739, 179, panelContext, this);
		disp_pressure.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_pressure.variable = TagDB.currentPressure;
		disp_pressure.zeroSuppress = true;
		disp_pressure.zeroDisplay = true;
		disp_pressure.displayDigits = 6;
		disp_pressure.decimalPlaces = 1;
		disp_pressure.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		disp_pressure.unitStrings = null;
		disp_pressure.fonts = fonts1;
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

		NumericDisplay01 = new CgpNumericDisplay(20, 20, 99, 39, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.presExceedTimeCounter;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 6;
		NumericDisplay01.decimalPlaces = 0;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		NumericDisplay01.fonts = fonts1;
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

		NumericDisplay02 = new CgpNumericDisplay(20, 80, 99, 99, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.presLackTimeCounter;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 6;
		NumericDisplay02.decimalPlaces = 0;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts1;
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

		NumericDisplay03 = new CgpNumericDisplay(140, 20, 259, 39, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.currentSetpoint;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 2;
		NumericDisplay03.decimalPlaces = 1;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		NumericDisplay03.fonts = fonts1;
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

		NumericDisplay04 = new CgpNumericDisplay(520, 40, 559, 59, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB._Hour;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 2;
		NumericDisplay04.decimalPlaces = 0;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts1;
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
		NumericDisplay04.init();

		NumericDisplay05 = new CgpNumericDisplay(580, 40, 619, 59, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB._Minutes;
		NumericDisplay05.zeroSuppress = true;
		NumericDisplay05.zeroDisplay = true;
		NumericDisplay05.displayDigits = 2;
		NumericDisplay05.decimalPlaces = 0;
		NumericDisplay05.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay05.unitStrings = null;
		NumericDisplay05.fonts = fonts1;
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
		NumericDisplay05.init();

		NumericDisplay06 = new CgpNumericDisplay(640, 40, 679, 59, panelContext, this);
		NumericDisplay06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay06.variable = TagDB._Seconds;
		NumericDisplay06.zeroSuppress = true;
		NumericDisplay06.zeroDisplay = true;
		NumericDisplay06.displayDigits = 2;
		NumericDisplay06.decimalPlaces = 0;
		NumericDisplay06.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay06.unitStrings = null;
		NumericDisplay06.fonts = fonts1;
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
		NumericDisplay06.init();

		NumericDisplay07 = new CgpNumericDisplay(140, 80, 259, 99, panelContext, this);
		NumericDisplay07.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay07.variable = TagDB.main_pmp;
		NumericDisplay07.zeroSuppress = true;
		NumericDisplay07.zeroDisplay = true;
		NumericDisplay07.displayDigits = 6;
		NumericDisplay07.decimalPlaces = 0;
		NumericDisplay07.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay07.unitStrings = null;
		NumericDisplay07.fonts = fonts1;
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
		Lamp01 = new Lamp_0002(280, 80, 319, 119, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		Lamp01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Lamp01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		Lamp01.pattern = intArray2;
		Lamp01.controlTag01 = TagDB.MainStart;
		Lamp01.alwaysDrawBackground = false;

		Lamp01.init();
		Lamp02 = new Lamp_0002(354, 80, 393, 119, panelContext, this);
		Lamp02.foreClr = intArray0;
		Lamp02.backClr = intArray1;
		Lamp02.pattern = intArray2;
		Lamp02.controlTag01 = TagDB.FirstResStart;
		Lamp02.alwaysDrawBackground = false;

		Lamp02.init();
		Lamp03 = new Lamp_0002(440, 80, 479, 119, panelContext, this);
		Lamp03.foreClr = intArray0;
		Lamp03.backClr = intArray1;
		Lamp03.pattern = intArray2;
		Lamp03.controlTag01 = TagDB.SecondResStart;
		Lamp03.alwaysDrawBackground = false;

		Lamp03.init();
		Switch01 = new Switch_0015(237, 292, 276, 331, panelContext, this);
		Switch01.frameClr = 0x006e726e;
		Switch01.foreClr = 0x0000ff00;
		Switch01.backClr = 0x00000000;
		Switch01.pattern = 1;
		Switch01.buzzer = true;
		Switch01.bit0 = TagDB.fc1_must_start;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0016(297, 292, 336, 331, panelContext, this);
		Switch02.frameClr = 0x006e726e;
		Switch02.foreClr = 0x0000ff00;
		Switch02.backClr = 0x00000000;
		Switch02.pattern = 1;
		Switch02.buzzer = true;
		Switch02.bit0 = TagDB.fc1_must_start;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();

		NumericDisplay08 = new CgpNumericDisplay(257, 332, 316, 351, panelContext, this);
		NumericDisplay08.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay08.variable = TagDB.fc1_run;
		NumericDisplay08.zeroSuppress = true;
		NumericDisplay08.zeroDisplay = true;
		NumericDisplay08.displayDigits = 6;
		NumericDisplay08.decimalPlaces = 0;
		NumericDisplay08.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay08.unitStrings = null;
		NumericDisplay08.fonts = fonts1;
		NumericDisplay08.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay08.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay08.enableInput = false;
		NumericDisplay08.barcode = false;
		NumericDisplay08.frameColor = 0x006e726e;
		NumericDisplay08.foreColor = 0x00b2b2b2;
		NumericDisplay08.textColor = 0x00ffffff;
		NumericDisplay08.text3DColor = 0x00000000;
		NumericDisplay08.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay08.changeColor = false;
		NumericDisplay08.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay08.drawObject = displayDraw0;
		NumericDisplay08.alwaysDrawBackground = false;
		NumericDisplay08.init();
		Switch03 = new Switch_0013(280, 240, 319, 279, panelContext, this);
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
		Lamp04 = new Lamp_0002(280, 180, 319, 219, panelContext, this);
		Lamp04.foreClr = intArray0;
		Lamp04.backClr = intArray1;
		Lamp04.pattern = intArray2;
		Lamp04.controlTag01 = TagDB.fc1_status;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();
		Switch04 = new Switch_0013(360, 240, 399, 279, panelContext, this);
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
		Switch05 = new Switch_0013(440, 240, 479, 279, panelContext, this);
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
		Lamp05 = new Lamp_0002(360, 180, 399, 219, panelContext, this);
		Lamp05.foreClr = intArray0;
		Lamp05.backClr = intArray1;
		Lamp05.pattern = intArray2;
		Lamp05.controlTag01 = TagDB.fc2_status;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();
		Lamp06 = new Lamp_0002(440, 180, 479, 219, panelContext, this);
		Lamp06.foreClr = intArray0;
		Lamp06.backClr = intArray1;
		Lamp06.pattern = intArray2;
		Lamp06.controlTag01 = TagDB.fc3_status;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();
		Switch06 = new Switch_0015(330, 345, 369, 384, panelContext, this);
		Switch06.frameClr = 0x006e726e;
		Switch06.foreClr = 0x0000ff00;
		Switch06.backClr = 0x00000000;
		Switch06.pattern = 1;
		Switch06.buzzer = true;
		Switch06.bit0 = TagDB.fc2_must_start;
		Switch06.exprServer = exprServer;
		Switch06.alwaysDrawBackground = false;

		Switch06.init();
		Switch07 = new Switch_0016(390, 345, 429, 384, panelContext, this);
		Switch07.frameClr = 0x006e726e;
		Switch07.foreClr = 0x0000ff00;
		Switch07.backClr = 0x00000000;
		Switch07.pattern = 1;
		Switch07.buzzer = true;
		Switch07.bit0 = TagDB.fc2_must_start;
		Switch07.exprServer = exprServer;
		Switch07.alwaysDrawBackground = false;

		Switch07.init();

		NumericDisplay10 = new CgpNumericDisplay(350, 385, 409, 404, panelContext, this);
		NumericDisplay10.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay10.variable = TagDB.fc2_run;
		NumericDisplay10.zeroSuppress = true;
		NumericDisplay10.zeroDisplay = true;
		NumericDisplay10.displayDigits = 6;
		NumericDisplay10.decimalPlaces = 0;
		NumericDisplay10.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay10.unitStrings = null;
		NumericDisplay10.fonts = fonts1;
		NumericDisplay10.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay10.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay10.enableInput = false;
		NumericDisplay10.barcode = false;
		NumericDisplay10.frameColor = 0x006e726e;
		NumericDisplay10.foreColor = 0x00b2b2b2;
		NumericDisplay10.textColor = 0x00ffffff;
		NumericDisplay10.text3DColor = 0x00000000;
		NumericDisplay10.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay10.changeColor = false;
		NumericDisplay10.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay10.drawObject = displayDraw0;
		NumericDisplay10.alwaysDrawBackground = false;
		NumericDisplay10.exprServer = exprServer;
		NumericDisplay10.init();
		Switch08 = new Switch_0015(415, 291, 454, 330, panelContext, this);
		Switch08.frameClr = 0x006e726e;
		Switch08.foreClr = 0x0000ff00;
		Switch08.backClr = 0x00000000;
		Switch08.pattern = 1;
		Switch08.buzzer = true;
		Switch08.bit0 = TagDB.fc3_must_start;
		Switch08.exprServer = exprServer;
		Switch08.alwaysDrawBackground = false;

		Switch08.init();
		Switch09 = new Switch_0016(475, 291, 514, 330, panelContext, this);
		Switch09.frameClr = 0x006e726e;
		Switch09.foreClr = 0x0000ff00;
		Switch09.backClr = 0x00000000;
		Switch09.pattern = 1;
		Switch09.buzzer = true;
		Switch09.bit0 = TagDB.fc3_must_start;
		Switch09.exprServer = exprServer;
		Switch09.alwaysDrawBackground = false;

		Switch09.init();

		NumericDisplay11 = new CgpNumericDisplay(435, 331, 494, 350, panelContext, this);
		NumericDisplay11.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay11.variable = TagDB.fc3_run;
		NumericDisplay11.zeroSuppress = true;
		NumericDisplay11.zeroDisplay = true;
		NumericDisplay11.displayDigits = 6;
		NumericDisplay11.decimalPlaces = 0;
		NumericDisplay11.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay11.unitStrings = null;
		NumericDisplay11.fonts = fonts1;
		NumericDisplay11.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay11.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay11.enableInput = false;
		NumericDisplay11.barcode = false;
		NumericDisplay11.frameColor = 0x006e726e;
		NumericDisplay11.foreColor = 0x00b2b2b2;
		NumericDisplay11.textColor = 0x00ffffff;
		NumericDisplay11.text3DColor = 0x00000000;
		NumericDisplay11.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay11.changeColor = false;
		NumericDisplay11.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay11.drawObject = displayDraw0;
		NumericDisplay11.alwaysDrawBackground = false;
		NumericDisplay11.exprServer = exprServer;
		NumericDisplay11.init();
		((CgpWindow)owner).drawBack();
		TagDB.pres20ma.addEventListener(field_20ma, 0, panelContext);
		TagDB.pres4ma.addEventListener(field_4ma, 0, panelContext);
		TagDB.daySetpoint.addEventListener(field_daySetpoint, 0, panelContext);
		TagDB.nightSetpoint.addEventListener(field_nightSetpoint, 0, panelContext);
		TagDB.currentPressure.addEventListener(disp_pressure, 0, panelContext);
		TagDB.presExceedTimeCounter.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.presLackTimeCounter.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.currentSetpoint.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB._Hour.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB._Minutes.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB._Seconds.addEventListener(NumericDisplay06, 0, panelContext);
		TagDB.main_pmp.addEventListener(NumericDisplay07, 0, panelContext);
		TagDB.MainStart.addEventListener(Lamp01, 0, panelContext);
		TagDB.FirstResStart.addEventListener(Lamp02, 0, panelContext);
		TagDB.SecondResStart.addEventListener(Lamp03, 0, panelContext);
		TagDB.fc1_run.addEventListener(NumericDisplay08, 0, panelContext);
		TagDB.fc1_status.addEventListener(Lamp04, 0, panelContext);
		TagDB.fc2_status.addEventListener(Lamp05, 0, panelContext);
		TagDB.fc3_status.addEventListener(Lamp06, 0, panelContext);
		TagDB.fc2_run.addEventListener(NumericDisplay10, 0, panelContext);
		TagDB.fc3_run.addEventListener(NumericDisplay11, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[31];
		zOrderList[0] = field_20ma;
		zOrderList[1] = field_4ma;
		zOrderList[2] = field_daySetpoint;
		zOrderList[3] = field_nightSetpoint;
		zOrderList[4] = disp_pressure;
		zOrderList[5] = NumericDisplay01;
		zOrderList[6] = NumericDisplay02;
		zOrderList[7] = NumericDisplay03;
		zOrderList[8] = NumericDisplay04;
		zOrderList[9] = NumericDisplay05;
		zOrderList[10] = NumericDisplay06;
		zOrderList[11] = NumericDisplay07;
		zOrderList[12] = Lamp01;
		zOrderList[13] = Lamp02;
		zOrderList[14] = Lamp03;
		zOrderList[15] = Switch01;
		zOrderList[16] = Switch02;
		zOrderList[17] = NumericDisplay08;
		zOrderList[18] = Switch03;
		zOrderList[19] = Lamp04;
		zOrderList[20] = Switch04;
		zOrderList[21] = Switch05;
		zOrderList[22] = Lamp05;
		zOrderList[23] = Lamp06;
		zOrderList[24] = Switch06;
		zOrderList[25] = Switch07;
		zOrderList[26] = NumericDisplay10;
		zOrderList[27] = Switch08;
		zOrderList[28] = Switch09;
		zOrderList[29] = NumericDisplay11;
		zOrderList[30] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			Switch09,
			Switch08,
			Switch07,
			Switch06,
			Switch05,
			Switch04,
			Switch03,
			Switch02,
			Switch01,
			field_nightSetpoint,
			field_daySetpoint,
			field_4ma,
			field_20ma,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB.fc1_run);
		tagListVector.add(TagDB.fc2_run);
		tagListVector.add(TagDB.fc3_run);
		tagListVector.add(TagDB.fc1_status);
		tagListVector.add(TagDB.fc2_status);
		tagListVector.add(TagDB.fc3_status);
		tagListVector.add(TagDB._Hour);
		tagListVector.add(TagDB._Minutes);
		tagListVector.add(TagDB._Seconds);
		tagListVector.add(TagDB.daySetpoint);
		tagListVector.add(TagDB.nightSetpoint);
		tagListVector.add(TagDB.main_pmp);
		tagListVector.add(TagDB.pres4ma);
		tagListVector.add(TagDB.pres20ma);
		tagListVector.add(TagDB.currentSetpoint);
		tagListVector.add(TagDB.presExceedTimeCounter);
		tagListVector.add(TagDB.presLackTimeCounter);
		tagListVector.add(TagDB.MainStart);
		tagListVector.add(TagDB.FirstResStart);
		tagListVector.add(TagDB.SecondResStart);
		tagListVector.add(TagDB.fc1_must_start);
		tagListVector.add(TagDB.fc2_must_start);
		tagListVector.add(TagDB.fc3_must_start);
		tagListVector.add(TagDB.currentPressure);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();

		NumericDisplay11.shutdown();

		Switch09.shutdown();

		Switch08.shutdown();

		NumericDisplay10.shutdown();

		Switch07.shutdown();

		Switch06.shutdown();

		Lamp06.shutdown();

		Lamp05.shutdown();

		Switch05.shutdown();

		Switch04.shutdown();

		Lamp04.shutdown();

		Switch03.shutdown();

		NumericDisplay08.shutdown();

		Switch02.shutdown();

		Switch01.shutdown();

		Lamp03.shutdown();

		Lamp02.shutdown();

		Lamp01.shutdown();

		NumericDisplay07.shutdown();

		NumericDisplay06.shutdown();

		NumericDisplay05.shutdown();

		NumericDisplay04.shutdown();

		NumericDisplay03.shutdown();

		NumericDisplay02.shutdown();

		NumericDisplay01.shutdown();

		disp_pressure.shutdown();

		field_nightSetpoint.shutdown();

		field_daySetpoint.shutdown();

		field_4ma.shutdown();

		field_20ma.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		field_20ma.drawBackground(_g);

		field_4ma.drawBackground(_g);

		// Text01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"20 mA",	// text
			580 + _dx,	// x
			260 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			"4 mA",	// text
			580 + _dx,	// x
			320 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			"\u041a\u0430\u043b\u0438\u0431\u0440\u043e\u0432\u043a\u0430",	// text
			560 + _dx,	// x
			200 + _dy,	// y
			180,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F5	// font type
		);
		field_daySetpoint.drawBackground(_g);

		field_nightSetpoint.drawBackground(_g);

		// Text04
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0414\u043d\u0435\u0432\u043d\u0430\u044f \u0443\u0441\u0442\u0430\u0432\u043a\u0430",	// text
			20 + _dx,	// x
			240 + _dy,	// y
			120,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F5	// font type
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
			"\u041d\u043e\u0447\u043d\u0430\u044f \u0443\u0441\u0442\u0430\u0432\u043a\u0430",	// text
			20 + _dx,	// x
			300 + _dy,	// y
			120,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F5	// font type
		);
		// Text06
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0414\u0430\u0432\u043b\u0435\u043d\u0438\u0435",	// text
			280 + _dx,	// x
			20 + _dy,	// y
			200,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F11	// font type
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
			"\u0422\u0435\u043a\u0443\u0449\u0435\u0435 \u0434\u0430\u0432\u043b\u0435\u043d\u0438\u0435",	// text
			500 + _dx,	// x
			140 + _dy,	// y
			140,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F5	// font type
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
			0 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			60 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			0 + _dy,	// y
			140,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay04.drawBackground(_g);

		NumericDisplay05.drawBackground(_g);

		NumericDisplay06.drawBackground(_g);

		// Text11
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Current time",	// text
			520 + _dx,	// x
			20 + _dy,	// y
			160,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
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
			560 + _dx,	// x
			40 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			620 + _dx,	// x
			40 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			60 + _dy,	// y
			120,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			271 + _dx,	// x
			60 + _dy,	// y
			60,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			340 + _dx,	// x
			60 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			420 + _dx,	// x
			60 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay08.drawBackground(_g);

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
			280 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			360 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			440 + _dx,	// x
			160 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay10.drawBackground(_g);

		NumericDisplay11.drawBackground(_g);

		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
