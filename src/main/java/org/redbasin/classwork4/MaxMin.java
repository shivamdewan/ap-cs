package org.redbasin.classwork4;

/**
 * 1. Generate an array of 20 random numbers between 1
 *    and 100.
 * 2. Identify the max and min of these numbers.
 *
 * @author redbasin
 */
public class MaxMin {

  public static void main(String[] args) {
    int min = 100, max = 0;
    int[] numbers = new int[20];
    for (int i = 0; i < 20; i++) {
      numbers[i] = (int) (Math.random() * 100);
      System.out.print(numbers[i] + " ");
    }
    for (int i = 0; i < 20; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
      if (numbers[i] < min) {
        min = numbers[i];
      }
    }
    System.out.println();
    System.out.println("min = " + min + ", max = " + max);
  }
}
