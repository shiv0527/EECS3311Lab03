import java.awt.*;

public class MyCircle extends Shape {

    public MyCircle(int upperX, int upperY, int width, Color shapeColor) {
    	 this.setUpperX(upperX);
         this.setUpperY(upperY);
         this.setWidth(width);
         this.setShapeColor(shapeColor);
    }
 
   
    public void drawShape(Graphics form) {
        form.setColor(shapeColor);
        form.fillOval(this.upperX, this.upperY, this.width, this.width);
    }

  
    public int getArea() {
        return (int) Math.PI * width/2 * width/2;
    }

}