package tests;

import com.company.Rectangle;
import org.junit.Test;
import org.junit.Assert;

public class RectangleJUnit {
    @Test
    public void computeArea(){
        Rectangle rectangle = new Rectangle(4, 5);
        double area = rectangle.computeArea();
        Assert.assertEquals(20.0, area, 0.0 );
    }
    @Test
    public void changeWidth() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setWidth(6);
        Assert.assertEquals(6, rectangle.getWidth(), 0.0 );
    }
    @Test
    public void changeHeight() {
        Rectangle rectangle = new Rectangle(3, 4);
        rectangle.setHeight(5);
        Assert.assertEquals(5, rectangle.getHeight(), 0.0 );
    }
}