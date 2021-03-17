import org.junit.Test;
import org.junit.Assert;

public class RectangleJUnit {
    @Test
    public void computeArea() {
        Rectangle rectangle = new Rectangle(4, 5);
        double area = rectangle.computeArea();
        Assert.assertEquals(20.0, area, 0.0);
    }
}