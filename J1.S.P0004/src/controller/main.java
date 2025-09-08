/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import validation.validation;

/**
 *
 * @author ADMIN
 */
public class main {
    public static void main(String[] args){
        quickSort qs = new quickSort();
        int n = Integer.parseInt(validation.checkInlutDecimal());
        qs.createArray(n);
        qs.printArr();
        qs.quickSort(qs.getArr(), 0, n-1);
        qs.printArr();
    }
}
