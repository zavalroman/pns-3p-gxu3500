package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

import gpclasses.userScripts.*;

public class LinearSelector_0004 extends CgpSmartObject implements IgpKeyWrite
{
	public CgpTag	variableTag = null;
	public int	variableExpr = -1;
	private CgpCanvas	c;
	public int	normalForeColor = 0x009fbfbf;
	public int	invalidForeColor = 0x001f1fff;
	private int	foreColor;
	public int	indicatorForeColor = 0x001f9fff;
	public int	indicatorBackColor = 0x00df9f9f;
	public int	normalTextColor = 0x00ffffff;
	public int	invalidTextColor = 0x00ffffff;
	public int	normalText3DColor = 0x00000000;
	public int	invalidText3DColor = 0x00000000;
	public int	indicatorX;
	public int	indicatorY;
	public int	indicatorWidth;
	public int	indicatorHeight;
	public int	firstPosition;
	public int	statesNum = 3;
	private int	curState = 0;
	private int	quality = CgpTag.TAG_QUALITY_UNKNOWN;
	private boolean	inNormalState = true;
	public float	divisionWidth = 1350;
	public CgpWriteKeypad	spinkeypad;
	public int	keypadOffset = 1;
	private boolean	bSpinkeypadShowed = false;
	private int tmpValue = -1;
	private boolean	bInvalidState = false;
	private boolean	bInvalidValue = false;
	public boolean	buzzer = false;
	public int	textClr = 0x00ffffff;
	public int	text3dClr = 0x00000000;

	// Label related declaration
	public CgpFont[] partFonts;
	public String[] labels;

	public int	direction = CgpText.DISPLAY_DIRECTION_HORIZONTAL;
	public int	vertAlign = CgpText.DISPLAY_POSITION_MIDDLE;
	public int	horzAlign = CgpText.DISPLAY_ALIGNMENT_CENTER;

	public int	nLabelsIndex[];
	public int	numLabels;
	public int	nLabelsPosX[] ;
	public int	nLabelsPosY[] ;
	public int	nLabelsPosWidth[] ;
	public int	nLabelsPosHeight[] ;


	private String[]	curLabels;
	private CgpFont[]	curFont;
	public CgpResIntIndex indexRes;

	public CgpExpressionServer exprServer;

	public LinearSelector_0004(int _x1, int _y1, int _x2, int _y2, int _contextID, IgpContainer _container)
	{
		super(_x1, _y1, _x2, _y2, 0, _contextID, _container);
	}

	public void onInit()
	{
		if (CgpSmartKeypad.smallKeypad)
			spinkeypad = new CgpWriteKeypad(this, (int)(x1 + (float)(x2 - x1 + 1 - 200) / 2), y2 + 1, CgpWriteKeypad.DELAYED, container);
		else
			spinkeypad = new CgpWriteKeypad(this, (int)(x1 + (float)(x2 - x1 + 1 - 400) / 2), y2 + 1, CgpWriteKeypad.DELAYED, container);

		curFont = partFonts;
		curLabels = labels;
		foreColor = normalForeColor;
	}


	public void move(int sDelta, boolean bHoriz)
	{
		super.move(sDelta,bHoriz);

		onInit();
	}


	public void drawBackground(CgpCanvas c)
	{
		DD00001.draw(c,x1,y1,x2,y2, foreColor, false, 0);

		// User Defined Label Draw
		for (int nLabelNum = 0; nLabelNum < numLabels; nLabelNum++)
		{
			int nLabelIndex = nLabelsIndex[nLabelNum];
			c.drawStringWithBorder(CgpColor.makeTransparentColor(0), textClr, CgpColor.makeTransparentColor(0), text3dClr, 1, 1, curLabels[nLabelIndex], nLabelsPosX[nLabelNum], nLabelsPosY[nLabelNum], nLabelsPosWidth[nLabelNum], nLabelsPosHeight[nLabelNum], CgpText.DISPLAY_ANGLE_0, direction, horzAlign, vertAlign, 0, curFont[nLabelIndex]);
		}
	}

	public void draw(int nHandleDC)
	{
		if (c == null)
			c = new CgpCanvas(nHandleDC);

		if (((quality & (CgpTag.TAG_QUALITY_UNKNOWN | CgpTag.TAG_QUALITY_OFFSCAN)) == 0) &&
			inNormalState)
		{
			Linear01.draw
			(
				c,
				indicatorX,
				indicatorY,
				indicatorX + indicatorWidth,
				indicatorY + indicatorHeight,
				false,
				indicatorForeColor,
				indicatorBackColor,
				1
			);
		}

	}
	
	public boolean onVariableChange(CgpDataChangeEvent DataChangeEvent)
	{
		if (DataChangeEvent.tag == TagDB._UserLevel)
		{
			checkSecurity();
		}
		if (DataChangeEvent != null && variableTag == DataChangeEvent.tag)
		{
			curState = indexRes.getIndexFromValue(variableTag.getIntValue(0));
			quality = variableTag.getTagDataQuality();
		}
		else if (variableExpr != -1)
		{
			curState = indexRes.getIndexFromValue(exprServer.executeIntExpression(variableExpr));
			quality = exprServer.quality;
		}

		indicatorX = Math.round(firstPosition + divisionWidth * curState);
		if ((curState < 0 || curState >= statesNum) && inNormalState)
		{
			inNormalState = false;
			foreColor = invalidForeColor;
			textClr = invalidTextColor;
			text3dClr = invalidText3DColor;
			CgpWindow theWindow = CgpWindow.findWindowGivenContext(contextID);
			theWindow.redrawBackground = true;
		}
		else if ((curState >= 0 && curState < statesNum) && !inNormalState)
		{
			inNormalState = true;
			foreColor = normalForeColor;
			textClr = normalTextColor;
			text3dClr = normalText3DColor;
			CgpWindow theWindow = CgpWindow.findWindowGivenContext(contextID);
			theWindow.redrawBackground = true;
		}
		if (curState < 0 || curState >= statesNum)
		{
			bInvalidState = true;
			inNormalState = false;
		}
		else
		{
			inNormalState = true;
			bInvalidState = false;
		}

		return true;
	}

	public boolean onPointerPress(CgpPointerEvent PointerEvent)
	{
		if (isSecure())
		{
			return false;
		}
		pointerPressAction();
		return true;
	}

	public void paintSubDisplay(CgpCanvas c)
	{
		spinkeypad.paintSubDisplay(c);
	}

	public boolean onSubDisplayPointerPress(CgpPointerEvent PointerEvent)
	{
		spinkeypad.onSubDisplayPointerPress(PointerEvent);
		return true;
	}

	public boolean onSubDisplayPointerRelease()
	{
		spinkeypad.onSubDisplayPointerRelease();
		return true;
	}

	public boolean pointerPressAction()
	{
		if(this.fieldID > 0)
			CgpKeypadDisplay.keypadDisplay.fieldIDTriggered = this.fieldID;
		tmpValue = variableTag.getIntValue(0);
		if(buzzer)
			CgpSystem.beep(false);
		spinkeypad.openPopupKeypad(this);
		return true;
	}

	public void keyInput(int key)
	{
		boolean bFireAction = false;
		//Defaulting nMaxVar and nMinVar to Boolean's max and min
		int nMaxVar = 1;
		int nMinVar = 0;
		if(variableTag instanceof CgpIntTag)
		{
			nMaxVar = (int)((CgpIntTag)variableTag).getMax();
			nMinVar = (int)((CgpIntTag)variableTag).getMin();
		}
		else if(variableTag instanceof CgpIntReferenceTag)
		{
			nMaxVar = (int)((CgpIntReferenceTag)variableTag).getMax();
			nMinVar = (int)((CgpIntReferenceTag)variableTag).getMin();
		}
		int nMaxTemp = 0;
		int nMinTemp = 0;
		if ((statesNum - 1) >= nMinVar && (statesNum - 1) <= nMaxVar)
			nMaxTemp = statesNum - 1;
		else if (nMaxVar < (statesNum - 1) && nMaxVar >= 0)
			nMaxTemp = nMaxVar;
		if (nMinVar > 0 && nMinVar < (statesNum - 1))
			nMinTemp = nMinVar;
		boolean bResetInValidFlag = false;

		if (key == CgpWriteKeypad.INCREASE)
		{
			if (quality != CgpTag.TAG_QUALITY_GOOD)
				return;

			int nTempState = curState;
			if (bInvalidState)
			{
				curState = 0;
				if (curState >= nMinVar && curState <= nMaxVar)
					bResetInValidFlag = true;
			}
			else if (nTempState >= 0 && nTempState < statesNum - 1)
			{
				int val = indexRes.getValueFromIndex(curState);
				curState = indexRes.getNextIndexFromValue(val,false);
			}
			if (curState >= nMinVar && curState <= nMaxVar)
			{
				bInvalidValue = false;
			}
			else
				bInvalidValue = true;
		}
		else if (key == CgpWriteKeypad.DECREASE)
		{
			if (quality != CgpTag.TAG_QUALITY_GOOD)
				return;

			int nTempState = curState;
			if (bInvalidState)
			{
				curState = 0;
				if (curState >= nMinVar && curState <= nMaxVar)
					bResetInValidFlag = true;
			}
			else if (nTempState > 0 && nTempState <= statesNum - 1)
			{
				int val = indexRes.getValueFromIndex(curState);
				curState = indexRes.getPrevIndexFromValue(val,false);
			}
			if (curState >= nMinVar && curState <= nMaxVar)
			{
				bInvalidValue = false;
			}
			else
				bInvalidValue = true;
		}
		else if (key == CgpWriteKeypad.ESC)
		{
			bSpinkeypadShowed = false;
			bInvalidValue = false;
			if (variableTag != null)
			{
				curState = indexRes.getIndexFromValue(variableTag.getIntValue(0));
			}
			if ((curState < 0 || curState >= statesNum) && inNormalState)
			{
				inNormalState = false;
				foreColor = invalidForeColor;
				textClr = invalidTextColor;
				text3dClr = invalidText3DColor;
				CgpWindow theWindow = CgpWindow.findWindowGivenContext(contextID);
				theWindow.redrawBackground = true;
			}
			else if ((curState >= 0 && curState < statesNum) && !inNormalState)
			{
				inNormalState = true;
				foreColor = normalForeColor;
				textClr = normalTextColor;
				text3dClr = normalText3DColor;
				CgpWindow theWindow = CgpWindow.findWindowGivenContext(contextID);
				theWindow.redrawBackground = true;
			}
		}
		else if (key == CgpWriteKeypad.CLOSE)
		{
			if (((variableTag.getAccessRights() & CgpTag.TAG_ACCESS_WRITE) == 0) || (bInvalidValue))
			{
				spinkeypad.openPopupKeypad(this);
				return;
			}
			else
			{
				if (this.fieldID > 0)
					CgpTouchFieldManager.setLastFieldUpdated(this.fieldID);
				bSpinkeypadShowed = false;

			if (((variableTag.getAccessRights() & CgpTag.TAG_ACCESS_WRITE) != 0) &&
			    (quality == CgpTag.TAG_QUALITY_GOOD))
			{
				int value = indexRes.getValueFromIndex(curState);
				if(value != variableTag.getIntValue(0))
				{
					bFireAction = true;
					variableTag.queuedWrite(value, 0);
				}
			}
			if (bResetInValidFlag)
				bInvalidState = false; 
			}
		}

		indicatorX = Math.round(firstPosition + divisionWidth * curState);
		if ((curState >= 0 && curState < statesNum) && !inNormalState)
		{
			inNormalState = true;
			foreColor = normalForeColor;
			textClr = normalTextColor;
			text3dClr = normalText3DColor;
			CgpWindow theWindow = CgpWindow.findWindowGivenContext(contextID);
			theWindow.redrawBackground = true;
		}
		setDirty(true);
	}

	public void shutdown()
	{
		super.shutdown();
		spinkeypad.shutdown();
	}
}

