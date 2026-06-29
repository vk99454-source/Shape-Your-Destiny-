package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SquareTest {
    @Test
    public void testSquareArea() {
        Square square = new Square(5);
        assertEquals(25.0, square.getArea(), 0.001);
    }
    @Test
    public void testSquarePerimeter() {
        Square square = new Square(5);
        assertEquals(20.0, square.getPerimeter(), 0.001);
    }
    @Test
    public void testSquareNumberOfSides() {
        Square square = new Square(5);

        assertEquals(4, square.numberOfSides());
    }
}