package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RectangleTest {
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(50.0, rectangle.getArea(), 0.001);
    }
    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(10, 5);
        assertEquals(30.0, rectangle.getPerimeter(), 0.001);
    }
}
