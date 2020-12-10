package org.example;

import org.junit.Assert;
import org.junit.Test;

public class Day02Tests {

    Day02 sut = new Day02();

    String testStringA = "12-20 t: ttttttltttvttttttttt";

    @Test
    public void parse_first_number_from_test_string_A() {
        //Arrange
        int expectedFirstNumberA = 12;

        //Act
        int firstNumber = sut.parseFirstNumber(testStringA);
        System.out.println(expectedFirstNumberA + " | " + firstNumber);

        //Assert
        Assert.assertEquals(expectedFirstNumberA,firstNumber);

    }

    @Test
    public void parse_second_number_from_test_string_A() {
        //Arrange
        int expectedSecondNumberA = 20;

        //Act
        int secondNumber = sut.parseSecondNumber(testStringA);
        System.out.println(expectedSecondNumberA + " | " + secondNumber);

        //Assert
        Assert.assertEquals(expectedSecondNumberA,secondNumber);

    }

    @Test
    public void parse_password_key_from_test_string_A() {
        //Arrange
        char expectedPasswordKeyA = 't';

        //Act
        char passwordKey = sut.parsePasswordKey(testStringA);
        System.out.println(expectedPasswordKeyA + " | " + passwordKey);

        //Assert
        Assert.assertEquals(expectedPasswordKeyA,passwordKey);

    }

    @Test
    public void parse_expected_password_from_test_string_A() {
        //Arrange
        String expectedPasswordA = "ttttttltttvttttttttt";

        //Act
        String password = sut.parsePassword(testStringA);
        System.out.println(expectedPasswordA + " | " + password);

        //Assert
        Assert.assertEquals(expectedPasswordA,password);

    }

    @Test
    public void count_times_key_repeats() {
        //Arrange
        int expectedNumTimeKeyRepeatsA = 18;
        char key = 't';

        //Act
        int numTimesKeyRepeats = sut.numTimesKeyRepeats(testStringA, key);
        System.out.println(expectedNumTimeKeyRepeatsA + " | " + numTimesKeyRepeats);

        //Assert
        Assert.assertEquals(expectedNumTimeKeyRepeatsA, numTimesKeyRepeats);

    }
//
//    @Test
//    public void password_is_valid() {
//        //Arrange
//
//        //Act
//        boolean result = sut.isPasswordValid();
//
//        //Assert
//        Assert.assertTrue(result);
//    }

}
