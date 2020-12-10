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

}
