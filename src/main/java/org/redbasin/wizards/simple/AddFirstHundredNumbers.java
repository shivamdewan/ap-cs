/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.wizards.simple;

/**
 *
 * @author redbasin
 */
public class AddFirstHundredNumbers {

    public static final int START_NUMBER = 1;
    public static final int STOP_NUMBER = 100;

    public static int addNumbers() {
        int counter = START_NUMBER;
        int sum = 0;

        while (counter <= STOP_NUMBER) {
           sum = sum + counter;
           counter = counter + 1;
        }
        return sum;
    }

    public static void main(String[] args) {

        int mySum = addNumbers();

        System.out.println("Correct Sum = " + mySum);
    }

}