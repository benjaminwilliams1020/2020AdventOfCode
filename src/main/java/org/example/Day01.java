package org.example;

public class Day01 {
    
    public int value01 = 0;
    public int value02 = 0;

    public int num01 = 0;
    public int num02 = 0;
    public int num03 = 0;
    
    public void find2020(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int firstValue = array[i];
            for (int j = 0; j < array.length; j++) {
                int secondValue = array[j];
                if(firstValue + secondValue == 2020) {
                    value01 = firstValue;
                    value02 = secondValue;
                }
            }
        }
    }

    public void threeGets2020(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int firstNum = array[i];
            for (int j = 0; j < array.length; j++) {
                int secondNum = array[j];
                for (int k = 0; k < array.length; k++) {
                    int thirdNum = array[k];
                    if(firstNum + secondNum + thirdNum == 2020) {
                        num01 = firstNum;
                        num02 = secondNum;
                        num03 = thirdNum;
                    }
                }
            }
        }
    }
    
}
