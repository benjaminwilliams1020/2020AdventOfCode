package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Day03Tests {

    Day03 sut = new Day03();

    private static final String TEST_STRING = "ABCDE";
    private static final int MOVE_RIGHT = 4;

    @Test
    public void move_horizontal_string_right_return_E() {
        //Arrange
        int startingPosition = 0;
        char expectedCharAtPosition = 'E';

        //Act
        char result = sut.moveHorizontalRight(TEST_STRING, startingPosition, MOVE_RIGHT);

        //Assert
        Assert.assertEquals(expectedCharAtPosition, result);

    }

    @Test
    public void move_horizontal_string_right_return_A() {
        //Arrange
        int startingPosition = 1;
        char expectedCharAtPosition = 'A';

        //Act
        char result = sut.moveHorizontalRight(TEST_STRING, startingPosition, MOVE_RIGHT);

        //Assert
        Assert.assertEquals(expectedCharAtPosition, result);
    }

    @Test
    public void move_horizontal_string_right_return_B() {
        //Arrange
        int startingPosition = 2;
        char expectedCharAtPosition = 'B';

        //Act
        char result = sut.moveHorizontalRight(TEST_STRING, startingPosition, MOVE_RIGHT);

        //Assert
        Assert.assertEquals(expectedCharAtPosition, result);

    }

}
