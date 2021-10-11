import java.awt.*;

public class Shape implements Comparable<Shape>{
	
		public int upperX = 0;
	    public int upperY = 0;
	    public int width = 0;
	    public int height = 0;
	    public Color shapeColor;
	    public void drawShape(Graphics form)
	    {
	    	
	    };
	    public int getArea(
	    		){
	    	return 0;
	    	};
	    
	    
	    public int compareTo(Shape s) {
			double difference = this.getArea() - s.getArea();
			if (difference < 0) 
			{
				return -1;
			} 
			else if (difference > 0) 
			{
				return 1;
			} 
			else 
			{
				return 0;
			}
	    }

    public int getUpperX() {
        return upperX;
    }

    public void setUpperX(int upperX) {
        this.upperX = upperX;
    }

    public int getUpperY() {
        return upperY;
    }

    public void setUpperY(int upperY) {
        this.upperY = upperY;
    }
    

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    
    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }
}