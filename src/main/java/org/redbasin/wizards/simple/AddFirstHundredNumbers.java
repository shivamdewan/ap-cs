package org.redbasin.wizards.simple;
public class AddFirstHundredNumbers {
    public static final int START_NUMBER = 1;
    public static final int STOP_NUMBER = 99;
    public static int addNumbers() {
        int counter = START_NUMBER;
        int sum = 0;
        while (counter <= STOP_NUMBER) {
           sum = sum + counter;
           counter = counter + 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        int mySum = addNumbers();
        System.out.println("Correct Sum = " + mySum);
    }
}