
import java.awt.*;
import java.util.Random;

public class ShapeFactory {
	private static Random random = new Random();
	private static int X;
	private static int Y;
	private static int randomHeight ;
	private static int randomWidth ;
	public static Shape LoadShapes() {
		 randomHeight = random.nextInt(40) + 40;
		 randomWidth = random.nextInt(40) + 40;
		
		Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
		
	
		if (X > 410 || Y > 410) {
			X = 0;
			Y = 0;
		}
		int obj = random.nextInt(3);
		if (obj == 0) {
			X += 80;
			Y += 80;
			return new MyRectangle(X, Y, randomWidth, randomHeight, color);
		} else if (obj == 1) {
			X += 75;
			Y += 75;
			obj = random.nextInt(3);
			return new MySquare(X, Y, randomWidth, color);
		} else if (obj == 2) {
			X += 70;
			Y += 70;
			obj = random.nextInt(3);
			return new MyCircle(X, Y, randomWidth, color);
		}

		return null;
		
	}
}
