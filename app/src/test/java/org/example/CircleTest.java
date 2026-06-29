package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        assertEquals(78.5398, circle.getArea(), 0.001);
    }
    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(5);
        assertEquals(31.4159, circle.getPerimeter(), 0.001);
    }
}