
import java.awt.*;

public class MySquare extends Shape {

   

    public MySquare(int upperX, int upperY, int width, Color shapeColor) {
    	 this.setUpperX(upperX);
         this.setUpperY(upperY);
         this.setWidth(width);
         this.setShapeColor(shapeColor);
    }


  
    public void drawShape(Graphics form) {
        form.setColor(getShapeColor());
        form.fillRect(this.getUpperX(), this.getUpperY(), this.getWidth(), this.getWidth());
    }

   
    public int getArea() {
        return getWidth() * getWidth();
    }


}