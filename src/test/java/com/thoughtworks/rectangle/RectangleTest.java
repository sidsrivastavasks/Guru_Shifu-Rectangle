package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;


public class RectangleTest{
    @Test
    void shouldReturnAreaWhenLengthAndBreadthIsGiven(){
        double length = 2.0;
        double breadth = 4.0;
        double actual = 8.0;

        Rectangle rectangleInst = new Rectangle(length, breadth);
        double expected = rectangleInst.area();

        assertThat(expected, is(closeTo(actual, 0.01)));
    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthIsGiven(){
        double length = 2.0;
        double breadth = 4.0;
        double actual = 12.0;

        Rectangle rectangleInst = new Rectangle(length, breadth);
        double expected = rectangleInst.perimeter();

        assertThat(expected, is(closeTo(actual, 0.01)));
    }
}