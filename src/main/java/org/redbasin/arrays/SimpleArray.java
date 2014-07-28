package org.redbasin.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author redbasin
 */
public class SimpleArray {

    public static void main(String[] args) {
        int[][] x = new int[4][4];
        int i = 0;
        while (i < 4) {
            //System.out.println(x[i]);
            int j = 0;
            while (j < 4) {
                 x[i][j] = i + j;
                 j = j + 1;
            }
            i = i + 1;
        }

        i = 0;
        while (i < 4) {
            //System.out.println(x[i]);
            int j = 0;
            while (j < 4) {
                 System.out.print(x[i][j]);
                 j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }

}
