package com.minibootcamp.pasti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LineTest {
    private final double DELTA = 1e-9;

    @Test
    public void getLength_ReturnZero_WhenTwoExactSamePointsAreGiven() {
        Line line = new Line(0, 0, 0, 0);

        assertEquals(0.0, line.getLength(), DELTA);
    }

    @Test
    public void getLength_ReturnAbsoluteOfY_WhenPointsFormVerticalLine() {
        Line line = new Line(5, 6, 5, 7);

        assertEquals(1.0, line.getLength(), DELTA);
    }
}
