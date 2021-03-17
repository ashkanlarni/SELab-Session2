package tests;

import com.company.Shape;
import com.company.Square;
import org.junit.Test;
import org.junit.Assert;

public class SquareJUnit {
    @Test
    public void computeArea() {
        Shape square = new Square(5);
        double area = square.computeArea();
        Assert.assertEquals(25.0, area, 0.0);
    }

    @Test
    public void changeParameter() {
        Square square = new Square(2);
        square.setSide(4);
        Assert.assertEquals(4.0, square.getSide(), 0.0);
    }
}

