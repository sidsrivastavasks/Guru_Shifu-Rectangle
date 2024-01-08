package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class RectangleTest{
    @Test
    void testRectangleArea(){
        int length = 2;
        int breadth = 4;
        int actual = 8;

        Rectangle rectangleInst = new Rectangle(length, breadth);
        int expected = rectangleInst.area();

        assertThat(expected, equalTo(actual));
    }
}