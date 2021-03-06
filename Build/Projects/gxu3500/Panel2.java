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
	public CgpNumericDisplay field_20ma;
	public CgpNumericDisplay field_4ma;
	public CgpNumericDisplay field_daySetpoint;
	public CgpNumericDisplay field_nightSetpoint;
	public CgpNumericDisplay disp_pressure;
	CgpFont F3;
	CgpFont F5;
	CgpFont F9;
	CgpFont F11;
	CgpGraphicFile Nature60;
	public CgpSmartKeypadDec  decKeypad;
	private Panel1000001 masterPanel = new Panel1000001();
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{

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

		F9 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		F11 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)18, (byte)0);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();

		field_20ma = new CgpNumericDisplay(640, 240, 699, 279, panelContext, this);
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

		field_4ma = new CgpNumericDisplay(640, 300, 699, 339, panelContext, this);
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
		field_daySetpoint.variable = TagDB.panelDaySetpoint;
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
		field_nightSetpoint.variable = TagDB.panelNightSetpoint;
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

		disp_pressure = new CgpNumericDisplay(380, 140, 459, 179, panelContext, this);
		disp_pressure.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		disp_pressure.variable = TagDB.currentPressure;
		disp_pressure.zeroSuppress = true;
		disp_pressure.zeroDisplay = true;
		disp_pressure.displayDigits = 2;
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
		Nature60 = new CgpGraphicFile
		(
			"Bitmap58.bmp",
			0,	// x1
			0,	// y1
			170,	// x2
			128,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		((CgpWindow)owner).drawBack();
		TagDB.pres20ma.addEventListener(field_20ma, 0, panelContext);
		TagDB.pres4ma.addEventListener(field_4ma, 0, panelContext);
		TagDB.panelDaySetpoint.addEventListener(field_daySetpoint, 0, panelContext);
		TagDB.panelNightSetpoint.addEventListener(field_nightSetpoint, 0, panelContext);
		TagDB.currentPressure.addEventListener(disp_pressure, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[6];
		zOrderList[0] = field_20ma;
		zOrderList[1] = field_4ma;
		zOrderList[2] = field_daySetpoint;
		zOrderList[3] = field_nightSetpoint;
		zOrderList[4] = disp_pressure;
		zOrderList[5] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
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
		tagListVector.add(TagDB._Day);
		tagListVector.add(TagDB._Seconds);
		tagListVector.add(TagDB.pres4ma);
		tagListVector.add(TagDB.pres20ma);
		tagListVector.add(TagDB.currentPressure);
		tagListVector.add(TagDB.panelDaySetpoint);
		tagListVector.add(TagDB.panelNightSetpoint);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		Nature60.clean();

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
			560 + _dx,	// x
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
			560 + _dx,	// x
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
			31 + _dx,	// x
			240 + _dy,	// y
			100,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F9	// font type
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
			40 + _dx,	// x
			300 + _dy,	// y
			80,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F9	// font type
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
			40 + _dy,	// y
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
			280 + _dx,	// x
			140 + _dy,	// y
			100,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F5	// font type
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
			203 + _dx,	// x
			250 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F9	// font type
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
			"bar",	// text
			204 + _dx,	// x
			310 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F9	// font type
		);
		// Nature60
		_g.drawImage(Nature60, 309 + _dx, 220 + _dy);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
