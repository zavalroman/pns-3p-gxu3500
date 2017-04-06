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
			291,	// x1
			182,	// y1
			381,	// x2
			243,	// y2
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
			140,	// x1
			203,	// y1
			302,	// x2
			224,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes01 = new CgpGraphicFile
		(
			"Bitmap10.bmp",
			180,	// x1
			196,	// y1
			217,	// x2
			232,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pumps02 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			295,	// x1
			298,	// y1
			385,	// x2
			359,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pumps03 = new CgpGraphicFile
		(
			"Bitmap3.bmp",
			291,	// x1
			60,	// y1
			381,	// x2
			121,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes03 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			218,	// x1
			81,	// y1
			296,	// x2
			102,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes02 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			222,	// x1
			319,	// y1
			300,	// x2
			340,	// y2
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
			377,	// x1
			63,	// y1
			455,	// x2
			84,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Pipes08 = new CgpGraphicFile
		(
			"Bitmap13.bmp",
			381,	// x1
			301,	// y1
			459,	// x2
			322,	// y2
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


		disp_fc1_freq = new CgpNumericDisplay(380, 100, 439, 119, panelContext, this);
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

		disp_fc2_freq = new CgpNumericDisplay(380, 220, 439, 239, panelContext, this);
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

		disp_fc3_freq = new CgpNumericDisplay(380, 340, 439, 359, panelContext, this);
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
		lamp_alarm = new Lamp_0002(640, 40, 699, 99, panelContext, this);
		int intArray0[] = {0x0000ff00, 0x000000ff, };
		lamp_alarm.foreClr = intArray0;
		int intArray1[] = {0x00000000, 0x00000000, };
		lamp_alarm.backClr = intArray1;
		int intArray2[] = {1, 1, };
		lamp_alarm.pattern = intArray2;
		lamp_alarm.controlTag01 = TagDB.ALARM;
		lamp_alarm.alwaysDrawBackground = false;

		lamp_alarm.init();
		Switch01 = new Switch_0014(280, 40, 379, 139, panelContext, this);
		nativeImage0 = new CgpGraphicFile( "Bitmap28.bmp", 0, 0, 99, 99, 0, CgpColor.makeTransparentColor(0x00ff00ff),this);
		Switch01.image01 = nativeImage0;
		Switch01.image02 = nativeImage0;
		Switch01.buzzer = true;
		Switch01.visibID = 1000;
		Switch01.bit0 = TagDB.fc1_inWork;
		Switch01.exprServer = exprServer;
		Switch01.alwaysDrawBackground = false;

		Switch01.init();
		Switch02 = new Switch_0014(280, 160, 379, 259, panelContext, this);
		Switch02.image01 = nativeImage0;
		Switch02.image02 = nativeImage0;
		Switch02.buzzer = true;
		Switch02.visibID = 1001;
		Switch02.bit0 = TagDB.fc2_inWork;
		Switch02.exprServer = exprServer;
		Switch02.alwaysDrawBackground = false;

		Switch02.init();
		Switch03 = new Switch_0014(280, 280, 379, 379, panelContext, this);
		Switch03.image01 = nativeImage0;
		Switch03.image02 = nativeImage0;
		Switch03.buzzer = true;
		Switch03.visibID = 1002;
		Switch03.bit0 = TagDB.fc3_inWork;
		Switch03.exprServer = exprServer;
		Switch03.alwaysDrawBackground = false;

		Switch03.init();

		F43 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		CgpText Text01 = new CgpText
		(
			"\u0422\u0430\u043f \u043f\u043e \u041d\u0410 \u0432\u044b\u0432\u0435\u0434\u0435\u0442 \u0435\u0433\u043e \u0438\u0437 \u0440\u0430\u0431\u043e\u0442\u044b!",
			CgpText.DISPLAY_ANGLE_0,	// displayAngle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// displayDirection
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// displayAlignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// displayPosition
			0,	// lineSpacing
			F43,
			0x00ffffff,	// TextColor
			CgpColor.makeTransparentColor(0x08000000),	// BackColor
			220,	// x1
			20,	// y1
			479,	// x2
			59,	// y2
			CgpColor.makeTransparentColor(0x08ffffff),	// BorderColor
			(byte)1,	// LineWidth
			CgpLinePattern.LINE_SOLID,
			0,
			this
		);
		Text01.set3DColor(0x00ff0000);
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

		CgpGraphics zOrderList[] = new CgpGraphics[17];
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
		zOrderList[16] = Text01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
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
		tagListVector.add(TagDB.ALARM);
		tagListVector.add(TagDB.fc1_inWork);
		tagListVector.add(TagDB.fc2_inWork);
		tagListVector.add(TagDB.fc3_inWork);

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
		_g.drawImage(Pipes07, 467 + _dx, 94 + _dy);
		// Pipes05
		_g.drawImage(Pipes05, 372 + _dx, 185 + _dy);
		// Pipes74
		_g.drawImage(Pipes74, 188 + _dx, 112 + _dy);
		// Pipes39
		_g.drawImage(Pipes39, 189 + _dx, 82 + _dy);
		// Pipes40
		_g.drawImage(Pipes40, 451 + _dx, 64 + _dy);
		// Pipes42
		_g.drawImage(Pipes42, 451 + _dx, 286 + _dy);
		// Pipes41
		_g.drawImage(Pipes41, 189 + _dx, 304 + _dy);
		// Pipes04
		_g.drawImage(Pipes04, 459 + _dx, 178 + _dy);
		// Arrows24
		_g.drawImage(Arrows24, 564 + _dx, 187 + _dy);
		// Arrows01
		_g.drawImage(Arrows01, 99 + _dx, 205 + _dy);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
