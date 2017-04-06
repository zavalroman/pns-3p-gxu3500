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

public class Panel3 extends CgpPanel
{
	public LinearSelector_0004 Selector02;
	public Switch_0005 swi_allowRotation;
	public Lamp_0006 Lamp01;
	CgpResIntIndex _IndexIntResource0 = new _IndexIntResource0();
	CgpFont F4_0;
	CgpFont F5_0;
	CgpFont F6_0;
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
		return "Rotation";
	}
	public int getPanelID()
	{
		return 3;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);


		Selector02 = new LinearSelector_0004(500, 60, 719, 139, panelContext, this);
		Selector02.variableTag = TagDB.main_pmp;
		Selector02.normalForeColor = 0x00b2b2b2;
		Selector02.invalidForeColor = 0x000000ff;
		Selector02.indicatorForeColor = 0x00007fff;
		Selector02.indicatorBackColor = 0x00d4aaaa;
		Selector02.indicatorWidth = 27;
		Selector02.indicatorHeight = 39;
		Selector02.firstPosition = 501;
		Selector02.indicatorY = 100;
		Selector02.indicatorX = 501;
		Selector02.divisionWidth = 95.000000f;
		Selector02.indexRes = _IndexIntResource0;
		Selector02.buzzer = true;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[3];
		labels4 = new String[3];

		labels4[0] = "\u041d\u0410 1";

		F4_0 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)14, (byte)0);
		fonts4[0] = F4_0;

		labels4[1] = "\u041d\u0410 2";
		fonts4[1] = F4_0;

		labels4[2] = "\u041d\u0410 3";
		fonts4[2] = F4_0;

		int intArray0[] = {0, 1, 2, };
		Selector02.nLabelsIndex = intArray0;
		int intArray1[] = {501, 594, 686, };
		Selector02.nLabelsPosX = intArray1;
		int intArray2[] = {61, 61, 61, };
		Selector02.nLabelsPosY = intArray2;
		int intArray3[] = {31, 33, 33, };
		Selector02.nLabelsPosWidth = intArray3;
		int intArray4[] = {21, 21, 21, };
		Selector02.nLabelsPosHeight = intArray4;
		Selector02.numLabels = 3;

		Selector02.partFonts = fonts4;
		Selector02.labels = labels4;

		Selector02.alwaysDrawBackground = false;
		Selector02.keypadOffset = 81;

		Selector02.init();
		swi_allowRotation = new Switch_0005(556, 322, 675, 381, panelContext, this);
		swi_allowRotation.foreClr = 0x00bbfa08;
		swi_allowRotation.backClr = 0x00000000;
		swi_allowRotation.pattern = 1;

		CgpFont	fonts5[];
		String	labels5[];
		fonts5 = new CgpFont[1];
		labels5 = new String[1];

		labels5[0] = "\u0420\u043e\u0442\u0430\u0446\u0438\u044f";

		F5_0 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)18, (byte)0);
		fonts5[0] = F5_0;

		swi_allowRotation.buzzer = true;

		swi_allowRotation.switchFonts = fonts5;
		swi_allowRotation.labels = labels5;

		int intArray5[] = {0x00ffffff, };
		swi_allowRotation.labelClr = intArray5;
		int intArray6[] = {0x00000000, };
		swi_allowRotation.label3DClr = intArray6;
		swi_allowRotation.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		swi_allowRotation.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		swi_allowRotation.bit0 = TagDB.allowRotation;
		swi_allowRotation.alwaysDrawBackground = false;

		swi_allowRotation.init();
		Lamp01 = new Lamp_0006(549, 173, 668, 292, panelContext, this);
		int intArray7[] = {0x0044bb5d, 0x0011ff00, };
		Lamp01.foreClr = intArray7;
		int intArray8[] = {0x00000000, 0x00000000, };
		Lamp01.backClr = intArray8;
		int intArray9[] = {1, 1, };
		Lamp01.pattern = intArray9;
		Lamp01.controlTag01 = TagDB.allowRotation;

		CgpFont	fonts6[];
		String	labels6[];
		fonts6 = new CgpFont[2];
		labels6 = new String[2];

		labels6[0] = "Off";

		F6_0 = new CgpFont("TCP13x23F", CgpFont.PLAIN, (byte)23, (byte)13);
		fonts6[0] = F6_0;

		labels6[1] = "On";
		fonts6[1] = F6_0;

		int intArray10[] = {0x00008311, 0x003bbb22, };
		Lamp01.labelClr = intArray10;
		Lamp01.label3DClr = intArray8;

		Lamp01.lampFonts = fonts6;
		Lamp01.labels = labels6;

		Lamp01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		Lamp01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		Lamp01.alwaysDrawBackground = false;

		Lamp01.init();
		((CgpWindow)owner).drawBack();
		TagDB._UserApplicationLanguage.addEventListener(Selector02, 0, panelContext);
		TagDB.main_pmp.addEventListener(Selector02, 0, panelContext);
		TagDB.allowRotation.addEventListener(Lamp01, 0, panelContext);
		TagDB._UserApplicationLanguage.addEventListener(Lamp01, 0, panelContext);

		CgpGraphics zOrderList[] = new CgpGraphics[3];
		zOrderList[0] = Selector02;
		zOrderList[1] = swi_allowRotation;
		zOrderList[2] = Lamp01;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			swi_allowRotation,
			Selector02,
		};

		registerTouchList(touchList);

		registerTagList();
		postOnOpen();
	}

	public void registerTagList()
	{
		Vector tagListVector = new Vector();
		tagListVector.add(TagDB._UserApplicationLanguage);
		tagListVector.add(TagDB.main_pmp);
		tagListVector.add(TagDB.allowRotation);

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		Lamp01.shutdown();

		swi_allowRotation.shutdown();

		Selector02.shutdown();
	}

	public boolean drawBackground(int gp)
	{
		CgpCanvas _g = new CgpCanvas(gp);

		Selector02.drawBackground(_g);

		// Text01
		_g.drawStringWithBorder
		(
			CgpColor.makeTransparentColor(0x08ffffff),	// border color
			0x00ffffff,	// text color
			CgpColor.makeTransparentColor(0x08000000),	// bg color
			0x00ff0000,	// 3D color
			1,	// line width
			CgpLinePattern.LINE_SOLID,	// line pattern
			"\u041f\u0435\u0440\u0435\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435 \u043e\u0441\u043d\u043e\u0432\u043e\u043d\u043e\u0433\u043e \u043d\u0430\u0441\u043e\u0441\u0430",	// text
			500 + _dx,	// x
			20 + _dy,	// y
			220,	// width
			40,	// height
			CgpText.DISPLAY_ANGLE_0,	// display angle
			CgpText.DISPLAY_DIRECTION_HORIZONTAL,	// display direction
			CgpText.DISPLAY_ALIGNMENT_CENTER,	// display alignment
			CgpText.DISPLAY_POSITION_MIDDLE,	// display position
			0,	// line spacing
			F4_0	// font type
		);
		return true;
	}
	public CgpMasterPanel getMasterPanel()
	{
		return masterPanel;
	}

}
