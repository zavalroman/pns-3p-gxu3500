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
	public CgpNumericDisplay NumericDisplay08;
	public CgpNumericDisplay NumericDisplay09;
	public CgpNumericDisplay NumericDisplay10;
	public CgpNumericDisplay NumericDisplay11;
	public CgpNumericDisplay NumericDisplay12;
	public CgpNumericDisplay NumericDisplay13;
	public CgpNumericDisplay NumericDisplay14;
	public CgpNumericDisplay NumericDisplay15;
	public CgpNumericDisplay NumericDisplay16;
	public CgpNumericDisplay NumericDisplay17;
	public CgpNumericDisplay NumericDisplay18;
	public CgpNumericDisplay NumericDisplay19;
	public CgpNumericDisplay NumericDisplay20;
	public CgpNumericDisplay NumericDisplay21;
	public CgpNumericDisplay NumericDisplay22;
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

		F4 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);


		NumericDisplay01 = new CgpNumericDisplay(20, 120, 99, 139, panelContext, this);
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

		NumericDisplay02 = new CgpNumericDisplay(20, 162, 99, 181, panelContext, this);
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

		NumericDisplay03 = new CgpNumericDisplay(320, 120, 399, 139, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.AI;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 6;
		NumericDisplay03.decimalPlaces = 0;
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

		NumericDisplay07 = new CgpNumericDisplay(120, 260, 199, 279, panelContext, this);
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
		Lamp01 = new Lamp_0002(560, 40, 599, 79, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		Lamp01.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		Lamp01.backClr = intArray1;
		int intArray2[] = {1, 1, };
		Lamp01.pattern = intArray2;
		Lamp01.controlTag01 = TagDB.MainStart;
		Lamp01.alwaysDrawBackground = false;

		Lamp01.init();
		Lamp02 = new Lamp_0002(634, 40, 673, 79, panelContext, this);
		Lamp02.foreClr = intArray0;
		Lamp02.backClr = intArray1;
		Lamp02.pattern = intArray2;
		Lamp02.controlTag01 = TagDB.FirstResStart;
		Lamp02.alwaysDrawBackground = false;

		Lamp02.init();
		Lamp03 = new Lamp_0002(720, 40, 759, 79, panelContext, this);
		Lamp03.foreClr = intArray0;
		Lamp03.backClr = intArray1;
		Lamp03.pattern = intArray2;
		Lamp03.controlTag01 = TagDB.SecondResStart;
		Lamp03.alwaysDrawBackground = false;

		Lamp03.init();
		Switch01 = new Switch_0015(519, 262, 558, 301, panelContext, this);
		Switch01.frameClr = 0x006e726e;
		Switch01.foreClr = 0x0000ff00;
		Switch01.backClr = 0x00000000;
		Switch01.pattern = 1;
		Switch01.buzzer = true;
		Switch01.bit0 = TagDB.fc1_must_start;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0016(579, 262, 618, 301, panelContext, this);
		Switch02.frameClr = 0x006e726e;
		Switch02.foreClr = 0x0000ff00;
		Switch02.backClr = 0x00000000;
		Switch02.pattern = 1;
		Switch02.buzzer = true;
		Switch02.bit0 = TagDB.fc1_must_start;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();
		Switch03 = new Switch_0017(562, 210, 601, 249, panelContext, this);
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
		Lamp04 = new Lamp_0002(563, 150, 602, 189, panelContext, this);
		Lamp04.foreClr = intArray0;
		Lamp04.backClr = intArray1;
		Lamp04.pattern = intArray2;
		Lamp04.controlTag01 = TagDB.fc1_status;
		Lamp04.exprServer = exprServer;
		Lamp04.alwaysDrawBackground = false;

		Lamp04.init();
		Switch04 = new Switch_0017(642, 210, 681, 249, panelContext, this);
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
		Switch05 = new Switch_0017(722, 210, 761, 249, panelContext, this);
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
		Lamp05 = new Lamp_0002(643, 150, 682, 189, panelContext, this);
		Lamp05.foreClr = intArray0;
		Lamp05.backClr = intArray1;
		Lamp05.pattern = intArray2;
		Lamp05.controlTag01 = TagDB.fc2_status;
		Lamp05.exprServer = exprServer;
		Lamp05.alwaysDrawBackground = false;

		Lamp05.init();
		Lamp06 = new Lamp_0002(723, 150, 762, 189, panelContext, this);
		Lamp06.foreClr = intArray0;
		Lamp06.backClr = intArray1;
		Lamp06.pattern = intArray2;
		Lamp06.controlTag01 = TagDB.fc3_status;
		Lamp06.exprServer = exprServer;
		Lamp06.alwaysDrawBackground = false;

		Lamp06.init();
		Switch06 = new Switch_0015(612, 315, 651, 354, panelContext, this);
		Switch06.frameClr = 0x006e726e;
		Switch06.foreClr = 0x0000ff00;
		Switch06.backClr = 0x00000000;
		Switch06.pattern = 1;
		Switch06.buzzer = true;
		Switch06.bit0 = TagDB.fc2_must_start;
		Switch06.exprServer = exprServer;
		Switch06.alwaysDrawBackground = false;

		Switch06.init();
		Switch07 = new Switch_0016(672, 315, 711, 354, panelContext, this);
		Switch07.frameClr = 0x006e726e;
		Switch07.foreClr = 0x0000ff00;
		Switch07.backClr = 0x00000000;
		Switch07.pattern = 1;
		Switch07.buzzer = true;
		Switch07.bit0 = TagDB.fc2_must_start;
		Switch07.exprServer = exprServer;
		Switch07.alwaysDrawBackground = false;

		Switch07.init();
		Switch08 = new Switch_0015(697, 261, 736, 300, panelContext, this);
		Switch08.frameClr = 0x006e726e;
		Switch08.foreClr = 0x0000ff00;
		Switch08.backClr = 0x00000000;
		Switch08.pattern = 1;
		Switch08.buzzer = true;
		Switch08.bit0 = TagDB.fc3_must_start;
		Switch08.exprServer = exprServer;
		Switch08.alwaysDrawBackground = false;

		Switch08.init();
		Switch09 = new Switch_0016(757, 261, 796, 300, panelContext, this);
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

		NumericDisplay04 = new CgpNumericDisplay(550, 94, 612, 113, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.fc1_statusWord;
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

		NumericDisplay05 = new CgpNumericDisplay(633, 94, 689, 113, panelContext, this);
		NumericDisplay05.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay05.variable = TagDB.fc2_statusWord;
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

		NumericDisplay06 = new CgpNumericDisplay(720, 94, 776, 113, panelContext, this);
		NumericDisplay06.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay06.variable = TagDB.fc3_statusWord;
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

		NumericDisplay08 = new CgpNumericDisplay(419, 332, 478, 351, panelContext, this);
		NumericDisplay08.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay08.variable = TagDB.fc1_alarmCode;
		NumericDisplay08.zeroSuppress = true;
		NumericDisplay08.zeroDisplay = true;
		NumericDisplay08.displayDigits = 6;
		NumericDisplay08.decimalPlaces = 0;
		NumericDisplay08.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay08.unitStrings = null;
		NumericDisplay08.fonts = fonts2;
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
		NumericDisplay08.exprServer = exprServer;
		NumericDisplay08.init();

		NumericDisplay09 = new CgpNumericDisplay(481, 332, 540, 351, panelContext, this);
		NumericDisplay09.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay09.variable = TagDB.fc2_alarmCode;
		NumericDisplay09.zeroSuppress = true;
		NumericDisplay09.zeroDisplay = true;
		NumericDisplay09.displayDigits = 6;
		NumericDisplay09.decimalPlaces = 0;
		NumericDisplay09.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay09.unitStrings = null;
		NumericDisplay09.fonts = fonts2;
		NumericDisplay09.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay09.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay09.enableInput = false;
		NumericDisplay09.barcode = false;
		NumericDisplay09.frameColor = 0x006e726e;
		NumericDisplay09.foreColor = 0x00b2b2b2;
		NumericDisplay09.textColor = 0x00ffffff;
		NumericDisplay09.text3DColor = 0x00000000;
		NumericDisplay09.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay09.changeColor = false;
		NumericDisplay09.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay09.drawObject = displayDraw0;
		NumericDisplay09.alwaysDrawBackground = false;
		NumericDisplay09.exprServer = exprServer;
		NumericDisplay09.init();

		NumericDisplay10 = new CgpNumericDisplay(543, 332, 602, 351, panelContext, this);
		NumericDisplay10.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay10.variable = TagDB.fc3_alarmCode;
		NumericDisplay10.zeroSuppress = true;
		NumericDisplay10.zeroDisplay = true;
		NumericDisplay10.displayDigits = 6;
		NumericDisplay10.decimalPlaces = 0;
		NumericDisplay10.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay10.unitStrings = null;
		NumericDisplay10.fonts = fonts2;
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

		NumericDisplay11 = new CgpNumericDisplay(419, 392, 478, 411, panelContext, this);
		NumericDisplay11.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay11.variable = TagDB.fc1_tripCode;
		NumericDisplay11.zeroSuppress = true;
		NumericDisplay11.zeroDisplay = true;
		NumericDisplay11.displayDigits = 6;
		NumericDisplay11.decimalPlaces = 0;
		NumericDisplay11.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay11.unitStrings = null;
		NumericDisplay11.fonts = fonts2;
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

		NumericDisplay12 = new CgpNumericDisplay(481, 392, 540, 411, panelContext, this);
		NumericDisplay12.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay12.variable = TagDB.fc2_tripCode;
		NumericDisplay12.zeroSuppress = true;
		NumericDisplay12.zeroDisplay = true;
		NumericDisplay12.displayDigits = 6;
		NumericDisplay12.decimalPlaces = 0;
		NumericDisplay12.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay12.unitStrings = null;
		NumericDisplay12.fonts = fonts2;
		NumericDisplay12.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay12.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay12.enableInput = false;
		NumericDisplay12.barcode = false;
		NumericDisplay12.frameColor = 0x006e726e;
		NumericDisplay12.foreColor = 0x00b2b2b2;
		NumericDisplay12.textColor = 0x00ffffff;
		NumericDisplay12.text3DColor = 0x00000000;
		NumericDisplay12.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay12.changeColor = false;
		NumericDisplay12.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay12.drawObject = displayDraw0;
		NumericDisplay12.alwaysDrawBackground = false;
		NumericDisplay12.exprServer = exprServer;
		NumericDisplay12.init();

		NumericDisplay13 = new CgpNumericDisplay(543, 392, 602, 411, panelContext, this);
		NumericDisplay13.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay13.variable = TagDB.fc3_tripCode;
		NumericDisplay13.zeroSuppress = true;
		NumericDisplay13.zeroDisplay = true;
		NumericDisplay13.displayDigits = 6;
		NumericDisplay13.decimalPlaces = 0;
		NumericDisplay13.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay13.unitStrings = null;
		NumericDisplay13.fonts = fonts2;
		NumericDisplay13.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay13.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay13.enableInput = false;
		NumericDisplay13.barcode = false;
		NumericDisplay13.frameColor = 0x006e726e;
		NumericDisplay13.foreColor = 0x00b2b2b2;
		NumericDisplay13.textColor = 0x00ffffff;
		NumericDisplay13.text3DColor = 0x00000000;
		NumericDisplay13.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay13.changeColor = false;
		NumericDisplay13.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay13.drawObject = displayDraw0;
		NumericDisplay13.alwaysDrawBackground = false;
		NumericDisplay13.exprServer = exprServer;
		NumericDisplay13.init();

		NumericDisplay14 = new CgpNumericDisplay(120, 76, 199, 95, panelContext, this);
		NumericDisplay14.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay14.variable = TagDB.boundFreq;
		NumericDisplay14.zeroSuppress = true;
		NumericDisplay14.zeroDisplay = true;
		NumericDisplay14.displayDigits = 6;
		NumericDisplay14.decimalPlaces = 0;
		NumericDisplay14.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay14.unitStrings = null;
		NumericDisplay14.fonts = fonts2;
		NumericDisplay14.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay14.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay14.enableInput = false;
		NumericDisplay14.barcode = false;
		NumericDisplay14.frameColor = 0x006e726e;
		NumericDisplay14.foreColor = 0x00b2b2b2;
		NumericDisplay14.textColor = 0x00ffffff;
		NumericDisplay14.text3DColor = 0x00000000;
		NumericDisplay14.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay14.changeColor = false;
		NumericDisplay14.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay14.drawObject = displayDraw0;
		NumericDisplay14.alwaysDrawBackground = false;
		NumericDisplay14.exprServer = exprServer;
		NumericDisplay14.init();

		NumericDisplay15 = new CgpNumericDisplay(120, 120, 199, 139, panelContext, this);
		NumericDisplay15.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay15.variable = TagDB.fc1_freq;
		NumericDisplay15.zeroSuppress = true;
		NumericDisplay15.zeroDisplay = true;
		NumericDisplay15.displayDigits = 6;
		NumericDisplay15.decimalPlaces = 0;
		NumericDisplay15.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay15.unitStrings = null;
		NumericDisplay15.fonts = fonts2;
		NumericDisplay15.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay15.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay15.enableInput = false;
		NumericDisplay15.barcode = false;
		NumericDisplay15.frameColor = 0x006e726e;
		NumericDisplay15.foreColor = 0x00b2b2b2;
		NumericDisplay15.textColor = 0x00ffffff;
		NumericDisplay15.text3DColor = 0x00000000;
		NumericDisplay15.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay15.changeColor = false;
		NumericDisplay15.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay15.drawObject = displayDraw0;
		NumericDisplay15.alwaysDrawBackground = false;
		NumericDisplay15.exprServer = exprServer;
		NumericDisplay15.init();

		CgpText Text11 = new CgpText
		(
			"Fc1 freq",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F4,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			121,	// x1
			105,	// y1
			200,	// x2
			124,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text11.set3DColor(0x00ff0000);

		NumericDisplay16 = new CgpNumericDisplay(120, 162, 199, 181, panelContext, this);
		NumericDisplay16.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay16.variable = TagDB.fc2_freq;
		NumericDisplay16.zeroSuppress = true;
		NumericDisplay16.zeroDisplay = true;
		NumericDisplay16.displayDigits = 6;
		NumericDisplay16.decimalPlaces = 0;
		NumericDisplay16.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay16.unitStrings = null;
		NumericDisplay16.fonts = fonts2;
		NumericDisplay16.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay16.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay16.enableInput = false;
		NumericDisplay16.barcode = false;
		NumericDisplay16.frameColor = 0x006e726e;
		NumericDisplay16.foreColor = 0x00b2b2b2;
		NumericDisplay16.textColor = 0x00ffffff;
		NumericDisplay16.text3DColor = 0x00000000;
		NumericDisplay16.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay16.changeColor = false;
		NumericDisplay16.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay16.drawObject = displayDraw0;
		NumericDisplay16.alwaysDrawBackground = false;
		NumericDisplay16.exprServer = exprServer;
		NumericDisplay16.init();

		NumericDisplay17 = new CgpNumericDisplay(120, 204, 199, 223, panelContext, this);
		NumericDisplay17.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay17.variable = TagDB.fc3_freq;
		NumericDisplay17.zeroSuppress = true;
		NumericDisplay17.zeroDisplay = true;
		NumericDisplay17.displayDigits = 6;
		NumericDisplay17.decimalPlaces = 0;
		NumericDisplay17.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay17.unitStrings = null;
		NumericDisplay17.fonts = fonts2;
		NumericDisplay17.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay17.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay17.enableInput = false;
		NumericDisplay17.barcode = false;
		NumericDisplay17.frameColor = 0x006e726e;
		NumericDisplay17.foreColor = 0x00b2b2b2;
		NumericDisplay17.textColor = 0x00ffffff;
		NumericDisplay17.text3DColor = 0x00000000;
		NumericDisplay17.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay17.changeColor = false;
		NumericDisplay17.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay17.drawObject = displayDraw0;
		NumericDisplay17.alwaysDrawBackground = false;
		NumericDisplay17.exprServer = exprServer;
		NumericDisplay17.init();

		NumericDisplay18 = new CgpNumericDisplay(220, 75, 299, 94, panelContext, this);
		NumericDisplay18.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay18.variable = TagDB.boundDelta;
		NumericDisplay18.zeroSuppress = true;
		NumericDisplay18.zeroDisplay = true;
		NumericDisplay18.displayDigits = 6;
		NumericDisplay18.decimalPlaces = 0;
		NumericDisplay18.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay18.unitStrings = null;
		NumericDisplay18.fonts = fonts2;
		NumericDisplay18.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay18.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay18.enableInput = false;
		NumericDisplay18.barcode = false;
		NumericDisplay18.frameColor = 0x006e726e;
		NumericDisplay18.foreColor = 0x00b2b2b2;
		NumericDisplay18.textColor = 0x00ffffff;
		NumericDisplay18.text3DColor = 0x00000000;
		NumericDisplay18.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay18.changeColor = false;
		NumericDisplay18.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay18.drawObject = displayDraw0;
		NumericDisplay18.alwaysDrawBackground = false;
		NumericDisplay18.exprServer = exprServer;
		NumericDisplay18.init();

		NumericDisplay19 = new CgpNumericDisplay(220, 119, 299, 138, panelContext, this);
		NumericDisplay19.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay19.variable = TagDB.currentPressure;
		NumericDisplay19.zeroSuppress = true;
		NumericDisplay19.zeroDisplay = true;
		NumericDisplay19.displayDigits = 6;
		NumericDisplay19.decimalPlaces = 0;
		NumericDisplay19.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay19.unitStrings = null;
		NumericDisplay19.fonts = fonts2;
		NumericDisplay19.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay19.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay19.enableInput = false;
		NumericDisplay19.barcode = false;
		NumericDisplay19.frameColor = 0x006e726e;
		NumericDisplay19.foreColor = 0x00b2b2b2;
		NumericDisplay19.textColor = 0x00ffffff;
		NumericDisplay19.text3DColor = 0x00000000;
		NumericDisplay19.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay19.changeColor = false;
		NumericDisplay19.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay19.drawObject = displayDraw0;
		NumericDisplay19.alwaysDrawBackground = false;
		NumericDisplay19.exprServer = exprServer;
		NumericDisplay19.init();

		NumericDisplay20 = new CgpNumericDisplay(220, 161, 299, 180, panelContext, this);
		NumericDisplay20.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay20.variable = TagDB.panelCurrentSetpoint;
		NumericDisplay20.zeroSuppress = true;
		NumericDisplay20.zeroDisplay = true;
		NumericDisplay20.displayDigits = 6;
		NumericDisplay20.decimalPlaces = 0;
		NumericDisplay20.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay20.unitStrings = null;
		NumericDisplay20.fonts = fonts2;
		NumericDisplay20.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay20.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay20.enableInput = false;
		NumericDisplay20.barcode = false;
		NumericDisplay20.frameColor = 0x006e726e;
		NumericDisplay20.foreColor = 0x00b2b2b2;
		NumericDisplay20.textColor = 0x00ffffff;
		NumericDisplay20.text3DColor = 0x00000000;
		NumericDisplay20.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay20.changeColor = false;
		NumericDisplay20.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay20.drawObject = displayDraw0;
		NumericDisplay20.alwaysDrawBackground = false;
		NumericDisplay20.exprServer = exprServer;
		NumericDisplay20.init();

		NumericDisplay21 = new CgpNumericDisplay(20, 76, 99, 95, panelContext, this);
		NumericDisplay21.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay21.variable = TagDB.boundTime;
		NumericDisplay21.zeroSuppress = true;
		NumericDisplay21.zeroDisplay = true;
		NumericDisplay21.displayDigits = 6;
		NumericDisplay21.decimalPlaces = 0;
		NumericDisplay21.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay21.unitStrings = null;
		NumericDisplay21.fonts = fonts2;
		NumericDisplay21.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay21.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay21.enableInput = false;
		NumericDisplay21.barcode = false;
		NumericDisplay21.frameColor = 0x006e726e;
		NumericDisplay21.foreColor = 0x00b2b2b2;
		NumericDisplay21.textColor = 0x00ffffff;
		NumericDisplay21.text3DColor = 0x00000000;
		NumericDisplay21.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay21.changeColor = false;
		NumericDisplay21.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay21.drawObject = displayDraw0;
		NumericDisplay21.alwaysDrawBackground = false;
		NumericDisplay21.exprServer = exprServer;
		NumericDisplay21.init();

		NumericDisplay22 = new CgpNumericDisplay(240, 360, 319, 379, panelContext, this);
		NumericDisplay22.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay22.variable = TagDB._Hour;
		NumericDisplay22.zeroSuppress = true;
		NumericDisplay22.zeroDisplay = true;
		NumericDisplay22.displayDigits = 6;
		NumericDisplay22.decimalPlaces = 0;
		NumericDisplay22.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay22.unitStrings = null;
		NumericDisplay22.fonts = fonts2;
		NumericDisplay22.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay22.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay22.enableInput = false;
		NumericDisplay22.barcode = false;
		NumericDisplay22.frameColor = 0x006e726e;
		NumericDisplay22.foreColor = 0x00b2b2b2;
		NumericDisplay22.textColor = 0x00ffffff;
		NumericDisplay22.text3DColor = 0x00000000;
		NumericDisplay22.textBlinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay22.changeColor = false;
		NumericDisplay22.blinkSpeed = CgpNumericDisplay.BLINK_TYPE_NONE;
		NumericDisplay22.drawObject = displayDraw0;
		NumericDisplay22.alwaysDrawBackground = false;
		NumericDisplay22.exprServer = exprServer;
		NumericDisplay22.init();
		((CgpWindow)owner).drawBack();
		TagDB.presExceedTimeCounter.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.presLackTimeCounter.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.AI.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.main_pmp.addEventListener(NumericDisplay07, 0, panelContext);
		TagDB.MainStart.addEventListener(Lamp01, 0, panelContext);
		TagDB.FirstResStart.addEventListener(Lamp02, 0, panelContext);
		TagDB.SecondResStart.addEventListener(Lamp03, 0, panelContext);
		TagDB.fc1_status.addEventListener(Lamp04, 0, panelContext);
		TagDB.fc2_status.addEventListener(Lamp05, 0, panelContext);
		TagDB.fc3_status.addEventListener(Lamp06, 0, panelContext);
		TagDB.fc1_statusWord.addEventListener(NumericDisplay04, 0, panelContext);
		TagDB.fc2_statusWord.addEventListener(NumericDisplay05, 0, panelContext);
		TagDB.fc3_statusWord.addEventListener(NumericDisplay06, 0, panelContext);
		TagDB.fc1_alarmCode.addEventListener(NumericDisplay08, 0, panelContext);
		TagDB.fc2_alarmCode.addEventListener(NumericDisplay09, 0, panelContext);
		TagDB.fc3_alarmCode.addEventListener(NumericDisplay10, 0, panelContext);
		TagDB.fc1_tripCode.addEventListener(NumericDisplay11, 0, panelContext);
		TagDB.fc2_tripCode.addEventListener(NumericDisplay12, 0, panelContext);
		TagDB.fc3_tripCode.addEventListener(NumericDisplay13, 0, panelContext);
		TagDB.boundFreq.addEventListener(NumericDisplay14, 0, panelContext);
		TagDB.fc1_freq.addEventListener(NumericDisplay15, 0, panelContext);
		TagDB.fc2_freq.addEventListener(NumericDisplay16, 0, panelContext);
		TagDB.fc3_freq.addEventListener(NumericDisplay17, 0, panelContext);
		TagDB.boundDelta.addEventListener(NumericDisplay18, 0, panelContext);
		TagDB.currentPressure.addEventListener(NumericDisplay19, 0, panelContext);
		TagDB.panelCurrentSetpoint.addEventListener(NumericDisplay20, 0, panelContext);
		TagDB.boundTime.addEventListener(NumericDisplay21, 0, panelContext);
		TagDB._Hour.addEventListener(NumericDisplay22, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[39];
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
		zOrderList[23] = NumericDisplay08;
		zOrderList[24] = NumericDisplay09;
		zOrderList[25] = NumericDisplay10;
		zOrderList[26] = NumericDisplay11;
		zOrderList[27] = NumericDisplay12;
		zOrderList[28] = NumericDisplay13;
		zOrderList[29] = NumericDisplay14;
		zOrderList[30] = NumericDisplay15;
		zOrderList[31] = Text11;
		zOrderList[32] = NumericDisplay16;
		zOrderList[33] = NumericDisplay17;
		zOrderList[34] = NumericDisplay18;
		zOrderList[35] = NumericDisplay19;
		zOrderList[36] = NumericDisplay20;
		zOrderList[37] = NumericDisplay21;
		zOrderList[38] = NumericDisplay22;
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
		tagListVector.add(TagDB.fc1_freq);
		tagListVector.add(TagDB.fc2_freq);
		tagListVector.add(TagDB.fc3_freq);
		tagListVector.add(TagDB.fc1_status);
		tagListVector.add(TagDB.fc2_status);
		tagListVector.add(TagDB.fc3_status);
		tagListVector.add(TagDB.fc1_alarmCode);
		tagListVector.add(TagDB.fc3_alarmCode);
		tagListVector.add(TagDB.fc1_tripCode);
		tagListVector.add(TagDB.fc2_tripCode);
		tagListVector.add(TagDB.fc3_tripCode);
		tagListVector.add(TagDB.fc1_statusWord);
		tagListVector.add(TagDB.fc2_statusWord);
		tagListVector.add(TagDB.fc3_statusWord);
		tagListVector.add(TagDB.fc2_alarmCode);
		tagListVector.add(TagDB._Hour);
		tagListVector.add(TagDB.main_pmp);
		tagListVector.add(TagDB.presExceedTimeCounter);
		tagListVector.add(TagDB.presLackTimeCounter);
		tagListVector.add(TagDB.MainStart);
		tagListVector.add(TagDB.FirstResStart);
		tagListVector.add(TagDB.SecondResStart);
		tagListVector.add(TagDB.fc1_must_start);
		tagListVector.add(TagDB.fc2_must_start);
		tagListVector.add(TagDB.fc3_must_start);
		tagListVector.add(TagDB.currentPressure);
		tagListVector.add(TagDB.boundFreq);
		tagListVector.add(TagDB.boundDelta);
		tagListVector.add(TagDB.boundTime);
		tagListVector.add(TagDB.AI);
		tagListVector.add(TagDB.panelCurrentSetpoint);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		NumericDisplay22.shutdown();

		NumericDisplay21.shutdown();

		NumericDisplay20.shutdown();

		NumericDisplay19.shutdown();

		NumericDisplay18.shutdown();

		NumericDisplay17.shutdown();

		NumericDisplay16.shutdown();

		NumericDisplay15.shutdown();

		NumericDisplay14.shutdown();

		NumericDisplay13.shutdown();

		NumericDisplay12.shutdown();

		NumericDisplay11.shutdown();

		NumericDisplay10.shutdown();

		NumericDisplay09.shutdown();

		NumericDisplay08.shutdown();

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
			"Exceed",	// text
			20 + _dx,	// x
			100 + _dy,	// y
			80,	// width
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
			"Lack",	// text
			20 + _dx,	// x
			142 + _dy,	// y
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
			"AI",	// text
			331 + _dx,	// x
			100 + _dy,	// y
			60,	// width
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
			120 + _dx,	// x
			240 + _dy,	// y
			80,	// width
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
			551 + _dx,	// x
			20 + _dy,	// y
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
			620 + _dx,	// x
			20 + _dy,	// y
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
			700 + _dx,	// x
			20 + _dy,	// y
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
			563 + _dx,	// x
			130 + _dy,	// y
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
			643 + _dx,	// x
			130 + _dy,	// y
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
			723 + _dx,	// x
			130 + _dy,	// y
			40,	// width
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

		// Text06
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Alarm code",	// text
			421 + _dx,	// x
			312 + _dy,	// y
			180,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay08.drawBackground(_g);

		NumericDisplay09.drawBackground(_g);

		NumericDisplay10.drawBackground(_g);

		// Text07
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Trip code",	// text
			433 + _dx,	// x
			372 + _dy,	// y
			160,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay11.drawBackground(_g);

		NumericDisplay12.drawBackground(_g);

		NumericDisplay13.drawBackground(_g);

		NumericDisplay14.drawBackground(_g);

		// Text01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Bound freq",	// text
			120 + _dx,	// x
			56 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay15.drawBackground(_g);

		NumericDisplay16.drawBackground(_g);

		// Text12
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Fc2 freq",	// text
			120 + _dx,	// x
			142 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay17.drawBackground(_g);

		// Text13
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Fc3 freq",	// text
			120 + _dx,	// x
			184 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay18.drawBackground(_g);

		// Text02
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Bound delta",	// text
			220 + _dx,	// x
			41 + _dy,	// y
			80,	// width
			30,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay19.drawBackground(_g);

		// Text03
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Pressure",	// text
			220 + _dx,	// x
			99 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay20.drawBackground(_g);

		// Text04
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Setpoint",	// text
			220 + _dx,	// x
			141 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay21.drawBackground(_g);

		// Text05
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Bound time",	// text
			20 + _dx,	// x
			56 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		NumericDisplay22.drawBackground(_g);

		// Text18
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"Hour",	// text
			240 + _dx,	// x
			340 + _dy,	// y
			80,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
