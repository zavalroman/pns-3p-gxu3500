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

public class Panel4 extends CgpPanel
{
	public CgpNumericDisplay NumericDisplay01;
	public CgpNumericDisplay NumericDisplay02;
	public CgpNumericDisplay NumericDisplay03;
	public CgpNumericDisplay NumericDisplay04;
	CgpFont F1;
	CgpFont F2;
	CgpFont F3;
	CgpGraphicFile Nature56;
	CgpGraphicFile Nature59;
	CgpGraphicFile Nature55;
	CgpGraphicFile Nature24;
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
		return "Reserve";
	}
	public int getPanelID()
	{
		return 4;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		F1 = new CgpFont("PF Gothic", CgpFont.PLAIN, (byte)16, (byte)16);

		F2 = new CgpFont("PF Utah (WF) S", CgpFont.BOLD, (byte)14, (byte)0);

		F3 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);

		CgpFont textFont0 = new CgpFont("TCP8x13", CgpFont.PLAIN, (byte)13, (byte)8);

		decKeypad = new CgpSmartKeypadDec(panelContext, this);
		decKeypad.init();

		NumericDisplay01 = new CgpNumericDisplay(180, 240, 239, 259, panelContext, this);
		NumericDisplay01.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay01.variable = TagDB.boundFreq;
		NumericDisplay01.zeroSuppress = true;
		NumericDisplay01.zeroDisplay = true;
		NumericDisplay01.displayDigits = 2;
		NumericDisplay01.decimalPlaces = 2;
		NumericDisplay01.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay01.unitStrings = null;
		CgpFont	fonts6[][] = {
			{ textFont0 },
			};
		NumericDisplay01.fonts = fonts6;
		NumericDisplay01.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay01.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay01.enableInput = true;
		NumericDisplay01.displayPopupKeypad = true;
		NumericDisplay01.keypad = decKeypad;
		NumericDisplay01.beepOnTouch = false;
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

		NumericDisplay02 = new CgpNumericDisplay(180, 300, 239, 319, panelContext, this);
		NumericDisplay02.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay02.variable = TagDB.boundDelta;
		NumericDisplay02.zeroSuppress = true;
		NumericDisplay02.zeroDisplay = true;
		NumericDisplay02.displayDigits = 2;
		NumericDisplay02.decimalPlaces = 1;
		NumericDisplay02.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay02.unitStrings = null;
		NumericDisplay02.fonts = fonts6;
		NumericDisplay02.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay02.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay02.enableInput = true;
		NumericDisplay02.displayPopupKeypad = true;
		NumericDisplay02.keypad = decKeypad;
		NumericDisplay02.beepOnTouch = false;
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

		NumericDisplay03 = new CgpNumericDisplay(180, 340, 239, 359, panelContext, this);
		NumericDisplay03.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay03.variable = TagDB.boundTime;
		NumericDisplay03.zeroSuppress = true;
		NumericDisplay03.zeroDisplay = true;
		NumericDisplay03.displayDigits = 5;
		NumericDisplay03.decimalPlaces = 0;
		NumericDisplay03.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay03.unitStrings = null;
		NumericDisplay03.fonts = fonts6;
		NumericDisplay03.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay03.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay03.enableInput = true;
		NumericDisplay03.displayPopupKeypad = true;
		NumericDisplay03.keypad = decKeypad;
		NumericDisplay03.beepOnTouch = false;
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

		NumericDisplay04 = new CgpNumericDisplay(580, 340, 659, 359, panelContext, this);
		NumericDisplay04.dataType = CgpNumericDisplay.DATA_TYPE_INT;
		NumericDisplay04.variable = TagDB.resOffFreq;
		NumericDisplay04.zeroSuppress = true;
		NumericDisplay04.zeroDisplay = true;
		NumericDisplay04.displayDigits = 2;
		NumericDisplay04.decimalPlaces = 2;
		NumericDisplay04.displayFormat = CgpNumericDisplay.DISPLAY_FMT_DECIMAL;
		NumericDisplay04.unitStrings = null;
		NumericDisplay04.fonts = fonts6;
		NumericDisplay04.horizontalAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		NumericDisplay04.verticalAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		NumericDisplay04.enableInput = true;
		NumericDisplay04.displayPopupKeypad = true;
		NumericDisplay04.keypad = decKeypad;
		NumericDisplay04.beepOnTouch = false;
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
		Nature56 = new CgpGraphicFile
		(
			"Bitmap62.bmp",
			0,	// x1
			0,	// y1
			220,	// x2
			79,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Nature59 = new CgpGraphicFile
		(
			"Bitmap63.bmp",
			0,	// x1
			0,	// y1
			61,	// x2
			48,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Nature55 = new CgpGraphicFile
		(
			"Bitmap64.bmp",
			0,	// x1
			0,	// y1
			59,	// x2
			59,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		Nature24 = new CgpGraphicFile
		(
			"Bitmap65.bmp",
			0,	// x1
			0,	// y1
			42,	// x2
			48,	// y2
			0,
			CgpColor.makeTransparentColor(0x007f08ff),	// Transparent color
			this
		);

		((CgpWindow)owner).drawBack();
		TagDB.boundFreq.addEventListener(NumericDisplay01, 0, panelContext);
		TagDB.boundDelta.addEventListener(NumericDisplay02, 0, panelContext);
		TagDB.boundTime.addEventListener(NumericDisplay03, 0, panelContext);
		TagDB.resOffFreq.addEventListener(NumericDisplay04, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[5];
		zOrderList[0] = NumericDisplay01;
		zOrderList[1] = NumericDisplay02;
		zOrderList[2] = NumericDisplay03;
		zOrderList[3] = NumericDisplay04;
		zOrderList[4] = decKeypad;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			decKeypad,
			NumericDisplay04,
			NumericDisplay03,
			NumericDisplay02,
			NumericDisplay01,
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
		tagListVector.add(TagDB.boundFreq);
		tagListVector.add(TagDB.boundDelta);
		tagListVector.add(TagDB.boundTime);
		tagListVector.add(TagDB.resOffFreq);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();
		decKeypad.shutdown();
		Nature56.clean();
		Nature59.clean();
		Nature55.clean();
		Nature24.clean();

		NumericDisplay04.shutdown();

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
			"\u0420\u0430\u0431\u043e\u0442\u0430 \u0440\u0435\u0437\u0435\u0440\u0432\u043d\u044b\u0445 \u041d\u0410",	// text
			200 + _dx,	// x
			20 + _dy,	// y
			360,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F1	// font type
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
			"\u0423\u0441\u043b\u043e\u0432\u0438\u044f \u0432\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u0434\u043e\u043f \u041d\u0410",	// text
			60 + _dx,	// x
			180 + _dy,	// y
			220,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F2	// font type
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
			"\u0427\u0430\u0441\u0442\u043e\u0442\u0430 \u043e\u0441\u043d >",	// text
			60 + _dx,	// x
			240 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			"\u0394 \u0434\u0430\u0432\u043b\u0435\u043d\u0438\u044f \u0438 \u0443\u0441\u0442\u0430\u0432\u043a\u0438 >",	// text
			60 + _dx,	// x
			280 + _dy,	// y
			100,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			"\u0412\u0440\u0435\u043c\u044f \u0443\u0441\u043b\u043e\u0432\u0438\u044f",	// text
			60 + _dx,	// x
			340 + _dy,	// y
			100,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
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
			"\u0413\u0446",	// text
			260 + _dx,	// x
			240 + _dy,	// y
			20,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay02.drawBackground(_g);

		// Text07
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"bar",	// text
			251 + _dx,	// x
			300 + _dy,	// y
			40,	// width
			20,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay03.drawBackground(_g);

		// Text08
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u0441\u0435\u043a",	// text
			253 + _dx,	// x
			340 + _dy,	// y
			40,	// width
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
			"\u0423\u0441\u043b\u043e\u0432\u0438\u044f \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u0434\u043e\u043f \u041d\u0410",	// text
			500 + _dx,	// x
			213 + _dy,	// y
			220,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F2	// font type
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
			"\u0427\u0430\u0441\u0442\u043e\u0442\u0430 \u043e\u0441\u043d\u043e\u0432\u043d\u043e\u0433\u043e \u041f\u0427 \u0434\u043b\u044f \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f \u0434\u043e\u043f \u041d\u0410",	// text
			520 + _dx,	// x
			273 + _dy,	// y
			180,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F3	// font type
		);
		NumericDisplay04.drawBackground(_g);

		// Nature56
		_g.drawImage(Nature56, 519 + _dx, 100 + _dy);
		// Nature59
		_g.drawImage(Nature59, 491 + _dx, 127 + _dy);
		// Nature55
		_g.drawImage(Nature55, 700 + _dx, 40 + _dy);
		// Nature24
		_g.drawImage(Nature24, 597 + _dx, 51 + _dy);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
