package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IsocelesRightTriangleTest {
    @Test
    public void testIsocelesRightTriangleArea() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5);
        assertEquals(12.5, triangle.getArea(), 0.001);
    }
    @Test
    public void testIsocelesRightTrianglePerimeter() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5);
        assertEquals(17.071, triangle.getPerimeter(), 0.001);
    }
    @Test
    public void testIsocelesRightTriangleNumberOfSides() {
        IsocelesRightTriangle triangle = new IsocelesRightTriangle(5);

        assertEquals(3, triangle.numberOfSides());
    }
}