package Projects.gxu3500;

import gpclasses.baseclasses.*;
import gpclasses.animations.*;
import gpclasses.graphics.*;

public class Linear01
{

public static void drawBackground(CgpCanvas c, int x1, int y1, int x2, int y2)
{
}

public static void draw(CgpCanvas c, int x1, int y1, int x2, int y2, boolean bHorz, int foreClr, int backClr, int pattern)
{
	if (bHorz) 
	{
		int width = x2 - x1 + 1;
		int height = y2 - y1 + 1;
		int halfHeight = (height + 1) / 2;
		// Triangle
		c.fillTriangleWithBorder(
			(x1 + 0),
			(y1 + halfHeight + 0),
			(x1 + (width * 15 + 50) / 100),
			(y1 + 0),
			(x1 + (width * 15 + 50) / 100),
			(y2 - 0),
			foreClr,	// ForeColor
			foreClr,	// BackColor
			(byte)pattern,	// Pattern
			1,	// line width
			foreClr,	// LineColor
			CgpLinePattern.LINE_SOLID
		);

		// Rectangle
		c.fillRectWithBorder(
			foreClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + (width * 15 + 50) / 100),
			(y1 + (height * 25 + 50) / 100),
			(x2 - 0)-(x1 + (width * 15 + 50) / 100)+1,
			(y2 - (height * 25 + 50) / 100)-(y1 + (height * 25 + 50) / 100)+1,
			backClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
	else 
	{
		int width = x2 - x1 + 1;
		int halfWidth = (width + 1) / 2;
		int height = y2 - y1 + 1;
		// Triangle
		c.fillTriangleWithBorder(
			(x1 + halfWidth + 0),
			(y1 + 0),
			(x1 + 0),
			(y1 + (height * 15 + 50) / 100),
			(x2 - 0),
			(y1 + (height * 15 + 50) / 100),
			foreClr,	// ForeColor
			foreClr,	// BackColor
			(byte)pattern,	// Pattern
			1,	// line width
			foreClr,	// LineColor
			CgpLinePattern.LINE_SOLID
		);

		// Rectangle
		c.fillRectWithBorder(
			foreClr,	// LineColor
			1,	// line width
			CgpLinePattern.LINE_SOLID,
			(x1 + (width * 25 + 50) / 100),
			(y1 + (height * 15 + 50) / 100),
			(x2 - (width * 25 + 50) / 100)-(x1 + (width * 25 + 50) / 100)+1,
			(y2 - (height * 0 + 50) / 100)-(y1 + (height * 15 + 50) / 100)+1,
			backClr,	// ForeColor
			backClr,	// BackColor
			pattern,	// Pattern
			CgpRectangle.SQUARE_CORNERS,	// Corner Type
			0,	// Width of round corner
			0	// Height of round corner
		);

	}
	}
}
