package org.example;

public class Day02 {

    private static char passwordKey = ' ';
    private static String password = "";
    private static int firstNumber = 0;
    private static int secondNumber = 0;
    private static int numTimesRepeats = 0;

    public int numValidPasswords(String[] array) {
        int validPasswords = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            firstNumber = parseFirstNumber(str);
            secondNumber = parseSecondNumber(str);
            passwordKey = parsePasswordKey(str);
            password = parsePassword(str);
            numTimesRepeats = numTimesKeyRepeats(str, passwordKey);
            boolean passwordValid = isPasswordValid(firstNumber,secondNumber,numTimesRepeats);
            firstNumber = 0;
            secondNumber = 0;
            numTimesRepeats = 0;
            passwordKey = ' ';
            password = "";
            if(passwordValid) {
                validPasswords++;
                passwordValid = false;
            }
        }
        return validPasswords;
    }

    public int parseFirstNumber(String str) {
        int posOfChar = str.indexOf('-');
        String substr = str.substring(0,posOfChar);
        firstNumber = Integer.parseInt(substr);
        return firstNumber;
    }

    public int parseSecondNumber(String str) {
        int posOfChar1 = str.indexOf('-');
        int posOfChar2 = str.indexOf(' ');
        String substr = str.substring(posOfChar1 + 1, posOfChar2);
        secondNumber = Integer.parseInt(substr);
        return secondNumber;
    }

    public char parsePasswordKey(String str) {
        int posOfChar = str.indexOf(':');
        passwordKey = str.charAt(posOfChar - 1);
        return passwordKey;
    }

    public String parsePassword(String str) {
        int posOfChar = str.indexOf(':');
        password = str.substring(posOfChar + 2);
        return password;
    }

    public int numTimesKeyRepeats(String str, char key) {
        String password = "";
        int posOfChar = str.indexOf(':');
        password = str.substring(posOfChar + 2);
        for (int i = 0; i < password.length(); i++) {
            char x = password.charAt(i);
            if(x == key) {
                numTimesRepeats++;
            }
        }
        return numTimesRepeats;
    }

    public boolean isPasswordValid(int numOne, int numTwo, int timesRepeats) {
        boolean validPassword = false;
        if(timesRepeats >= numOne && numTimesRepeats <= numTwo) {
            validPassword = true;
        }
        return validPassword;
    }

    public int part2NumValidPasswords(String[] array) {
        int numValidPasswords = 0;
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            firstNumber = parseFirstNumber(str);
            secondNumber = parseSecondNumber(str);
            passwordKey = parsePasswordKey(str);
            password = parsePassword(str);
            boolean firstMatch = charAtPos1(password, firstNumber, passwordKey);
            boolean secondMatch = charAtPos2(password, secondNumber, passwordKey);
            if(firstMatch ^ secondMatch) {
                numValidPasswords++;
            }
        }
        return numValidPasswords;
    }

    public boolean charAtPos1(String thePassword, int numOne, char key) {
        boolean sameCharAtPos1 = false;
        char charAtPos1 = thePassword.charAt(numOne - 1);
        if(charAtPos1 == key) {
            sameCharAtPos1 = true;
        }
        return sameCharAtPos1;
    }

    public boolean charAtPos2(String thePassword, int numTwo, char key) {
        boolean sameCharAtPos2 = false;
        char charAtPos2 = thePassword.charAt(numTwo - 1);

        if(charAtPos2 == key) {
            sameCharAtPos2 = true;
        }
        return sameCharAtPos2;
    }

}
