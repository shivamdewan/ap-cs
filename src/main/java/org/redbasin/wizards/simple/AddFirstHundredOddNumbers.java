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
public class AddFirstHundredOddNumbers {

    public static final int START_NUMBER = 1;
    public static final int NUM_ADDITIONS = 100;

    public static int addOddNumbers() {
        int number = START_NUMBER;
        int sum = 0;
        int additions = 0;

        while (additions <= NUM_ADDITIONS) {
           sum = sum + number;
           additions++;
           number = number + 2;
        }
        System.out.println("additions = " + (additions-1));
        return sum;
    }

    public static void main(String[] args) {

        int mySum = addOddNumbers();

        System.out.println("Correct Sum = " + mySum);
    }

}