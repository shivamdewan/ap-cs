/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.redbasin.inheritance.basic;

/**
 * This is the super base class.
 *
 * @author redbasin
 */
public class Animal {

    int numberOfLimbs;

    protected int getLimbs() {
        return numberOfLimbs;
    }

    protected void setLimbs(int limbs) {
        numberOfLimbs = limbs;
    }
}
