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

public class Panel1000001 extends CgpMasterPanel 
{
	public Switch_0003 button_main;
	public Switch_0003 button_pressure;
	public Switch_0003 button_pressure01;
	public Switch_0003 button_pressure02;
	public Switch_0003 button_pressure03;
	CgpFont F1_0;
	CgpMasterPanelLayer[] masterPanels = new CgpMasterPanelLayer[]
	{
		new CgpMasterPanelLayer(-1, this)
	};

	final int graphicalPanelLayerNum = 1;
	public int publishedTo()
		{
			return CgpSystem.HMI;
		}

	public void createStaticObjects()
	{
	}
	public String getPanelName()
	{
		return "Template";
	}
	public int getPanelID()
	{
		return 1000001;
	}

	public void onOpen()
	{
		super.onOpen();

		Integer contextObject = new Integer(panelContext);

		button_main = new Switch_0003(40, 420, 159, 459, panelContext, this);
		button_main.foreClr = 0x0000ff00;
		button_main.backClr = 0x00000000;
		button_main.pattern = 1;

		CgpFont	fonts1[];
		String	labels1[];
		fonts1 = new CgpFont[1];
		labels1 = new String[1];

		labels1[0] = "\u0421\u0445\u0435\u043c\u0430";

		F1_0 = new CgpFont("PF Utah (WF) S", CgpFont.PLAIN, (byte)18, (byte)0);
		fonts1[0] = F1_0;

		button_main.buzzer = true;

		button_main.switchFonts = fonts1;
		button_main.labels = labels1;

		int intArray0[] = {0x00ffffff, };
		button_main.labelClr = intArray0;
		int intArray1[] = {0x00000000, };
		button_main.label3DClr = intArray1;
		button_main.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_main.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_main.panelChange0 = 1;
		button_main.alwaysDrawBackground = false;

		button_main.init();
		button_pressure = new Switch_0003(180, 420, 319, 459, panelContext, this);
		button_pressure.foreClr = 0x0000ff00;
		button_pressure.backClr = 0x00000000;
		button_pressure.pattern = 1;

		CgpFont	fonts2[];
		String	labels2[];
		fonts2 = new CgpFont[1];
		labels2 = new String[1];

		labels2[0] = "\u0414\u0430\u0432\u043b\u0435\u043d\u0438\u0435";
		fonts2[0] = F1_0;

		button_pressure.buzzer = true;

		button_pressure.switchFonts = fonts2;
		button_pressure.labels = labels2;

		button_pressure.labelClr = intArray0;
		button_pressure.label3DClr = intArray1;
		button_pressure.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_pressure.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_pressure.panelChange0 = 2;
		button_pressure.alwaysDrawBackground = false;

		button_pressure.init();
		button_pressure01 = new Switch_0003(340, 420, 459, 459, panelContext, this);
		button_pressure01.foreClr = 0x0000ff00;
		button_pressure01.backClr = 0x00000000;
		button_pressure01.pattern = 1;

		CgpFont	fonts3[];
		String	labels3[];
		fonts3 = new CgpFont[1];
		labels3 = new String[1];

		labels3[0] = "\u0420\u043e\u0442\u0430\u0446\u0438\u044f";
		fonts3[0] = F1_0;

		button_pressure01.buzzer = true;

		button_pressure01.switchFonts = fonts3;
		button_pressure01.labels = labels3;

		button_pressure01.labelClr = intArray0;
		button_pressure01.label3DClr = intArray1;
		button_pressure01.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_pressure01.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_pressure01.panelChange0 = 3;
		button_pressure01.alwaysDrawBackground = false;

		button_pressure01.init();
		button_pressure02 = new Switch_0003(480, 420, 599, 459, panelContext, this);
		button_pressure02.foreClr = 0x0000ff00;
		button_pressure02.backClr = 0x00000000;
		button_pressure02.pattern = 1;

		CgpFont	fonts4[];
		String	labels4[];
		fonts4 = new CgpFont[1];
		labels4 = new String[1];

		labels4[0] = "\u0420\u0435\u0437\u0435\u0440\u0432 \u041d\u0410";
		fonts4[0] = F1_0;

		button_pressure02.buzzer = true;

		button_pressure02.switchFonts = fonts4;
		button_pressure02.labels = labels4;

		button_pressure02.labelClr = intArray0;
		button_pressure02.label3DClr = intArray1;
		button_pressure02.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_pressure02.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_pressure02.panelChange0 = 4;
		button_pressure02.alwaysDrawBackground = false;

		button_pressure02.init();
		button_pressure03 = new Switch_0003(620, 420, 739, 459, panelContext, this);
		button_pressure03.foreClr = 0x0000ff00;
		button_pressure03.backClr = 0x00000000;
		button_pressure03.pattern = 1;

		CgpFont	fonts5[];
		String	labels5[];
		fonts5 = new CgpFont[1];
		labels5 = new String[1];

		labels5[0] = "\u0410\u0432\u0430\u0440\u0438\u0438";
		fonts5[0] = F1_0;

		button_pressure03.buzzer = true;

		button_pressure03.switchFonts = fonts5;
		button_pressure03.labels = labels5;

		button_pressure03.labelClr = intArray0;
		button_pressure03.label3DClr = intArray1;
		button_pressure03.horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;
		button_pressure03.vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
		button_pressure03.panelChange0 = 5;
		button_pressure03.alwaysDrawBackground = false;

		button_pressure03.init();
		((CgpWindow)owner).drawBack();

		CgpGraphics zOrderList[] = new CgpGraphics[5];
		zOrderList[0] = button_main;
		zOrderList[1] = button_pressure;
		zOrderList[2] = button_pressure01;
		zOrderList[3] = button_pressure02;
		zOrderList[4] = button_pressure03;
		theZstack = zOrderList;

		IgpTouch touchList[] =
		{
			button_pressure03,
			button_pressure02,
			button_pressure01,
			button_pressure,
			button_main,
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

		super.registerTagList(tagListVector);
	}

	public void onClose()
	{
		super.onClose();

		button_pressure03.shutdown();

		button_pressure02.shutdown();

		button_pressure01.shutdown();

		button_pressure.shutdown();

		button_main.shutdown();
	}
	public CgpMasterPanelLayer[] getMasterPanelList()
	{
		return masterPanels;
	}

	public int getGraphicalPanelLayerNum()
	{
		return graphicalPanelLayerNum;
	}

	public CgpExpressionServer getExpressionServer()
	{
		return null;
	}

}
