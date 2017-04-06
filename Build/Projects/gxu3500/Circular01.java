package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;
import gpclasses.macroobjects.*;
import gpclasses.system.*;
import gpclasses.tags.*;
import gpclasses.util.misc.*;

public class Circular01
{
	int hx1Point0;
	int hy1Point0;
	int circleRadius0;
	int circleDiameter0;
	int xArray1[] = new int[4];
	int yArray1[] = new int[4];
	int angleArray1[] = new int[4];
	int radiusArray1[] = new int[4];
	int hx1Point2;
	int hy1Point2;
	int circleRadius2;
	int circleDiameter2;

	public Circular01(int radius)
	{
		hx1Point0 = 0;
		hy1Point0 = 0;
		circleRadius0 = (radius + 0);
		circleDiameter0 = circleRadius0 * 2 + 1;

		xArray1[0] = (radius + 0);
		yArray1[0] = (int)((radius * -10) / 100.0f - 0.5f);
		xArray1[1] = (radius + 0);
		yArray1[1] = (int)((radius * 10) / 100.0f + 0.5f);
		xArray1[2] = (int)((radius * -100) / 100.0f - 0.5f);
		yArray1[2] = (int)((radius * 10) / 100.0f + 0.5f);
		xArray1[3] = (int)((radius * -100) / 100.0f - 0.5f);
		yArray1[3] = (int)((radius * -10) / 100.0f - 0.5f);

		CgpCanvas.preCalculatePolygonParams(4, xArray1, yArray1, radiusArray1, angleArray1);

		hx1Point2 = (int)((radius * 88) / 100.0f + 0.5f);
		hy1Point2 = (0);
		circleRadius2 = (int)((radius * 8) / 100.0f + 0.5f);
		circleDiameter2 = circleRadius2 * 2 + 1;

	}

	public void draw(CgpCanvas c, int centerX, int centerY, int degrees, int foreClr, int backClr)
	{
		float sin = (float)Math.sin(degrees * 3.1415 / 1800.0);
		float cos = (float)Math.cos(degrees * 3.1415 / 1800.0);
		int tempX, tempY;
		tempX = Math.round(hx1Point0 * cos + hy1Point0 * sin + centerX - circleRadius0);
		tempY = Math.round(hy1Point0 * cos - hx1Point0 * sin + centerY - circleRadius0);
		c.fillOvalWithBorder(tempX, tempY, circleDiameter0, circleDiameter0, backClr, backClr, 1, 1, CgpLinePattern.LINE_SOLID, foreClr);

		c.fillRotatingPolygon(4, xArray1, yArray1, radiusArray1, angleArray1, centerX, centerY, degrees, foreClr, foreClr, true, true);

		tempX = Math.round(hx1Point2 * cos + hy1Point2 * sin + centerX - circleRadius2);
		tempY = Math.round(hy1Point2 * cos - hx1Point2 * sin + centerY - circleRadius2);
		c.fillOvalWithBorder(tempX, tempY, circleDiameter2, circleDiameter2, backClr, backClr, 1, 1, CgpLinePattern.LINE_SOLID, foreClr);

	}
}