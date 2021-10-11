import java.awt.*;

public class MyRectangle extends Shape{


    public MyRectangle(int upperX, int upperY, int height, int width, Color shapeColor){
         this.setUpperX(upperX);
         this.setUpperY(upperY);
         this.setHeight(height);
         this.setWidth(width);
         this.setShapeColor(shapeColor);
    }

   
    public void drawShape(Graphics form) {
        form.setColor(shapeColor);
        form.fillRect(this.getUpperX(), this.getUpperY(), this.getHeight(), this.getWidth());
    }

  
    public int getArea() {
        return getHeight() * getWidth();
    }

  
 
}