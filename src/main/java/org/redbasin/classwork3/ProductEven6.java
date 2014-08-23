/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.classwork3;

/**
 * Compute the product of even numbers between 1 and 15.
 * 
 * It should print
 * 2500
 * 
 * @author mjoshi
 */
public class ProductEven6 {
    
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int product = 1;
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0)
                product *= i;
        }
        System.out.println(product);
    }
    
}