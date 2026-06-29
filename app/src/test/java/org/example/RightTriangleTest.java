package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RightTriangleTest {
    @Test
    public void testRightTriangleArea() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(6.0, triangle.getArea(), 0.001);
    }
    @Test
    public void testRightTrianglePerimeter() {
        RightTriangle triangle = new RightTriangle(3, 4);
        assertEquals(12.0, triangle.getPerimeter(), 0.001);
    }
}