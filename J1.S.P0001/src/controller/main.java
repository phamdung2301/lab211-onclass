/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import validation.validation;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String[] args) {
        int n = Integer.parseInt(validation.checkInlutDecimal());
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(n);
        }
        System.out.println(Arrays.toString(arr));
        
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println(Arrays.toString(arr));

    }
}
