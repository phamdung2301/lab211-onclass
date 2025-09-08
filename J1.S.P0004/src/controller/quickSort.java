/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class quickSort {

    private int arr[];

    public quickSort(int[] arr) {
        this.arr = arr;
    }

    public quickSort() {
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void createArray(int n) {
        arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // partition trả về chỉ số của pivot sau khi sắp xếp
            int pi = partition(arr, low, high);

            // Đệ quy sắp xếp 2 phần mảng còn lại
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Hàm chia mảng
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // chọn phần tử cuối làm pivot
        int i = low - 1; // chỉ số phần tử nhỏ hơn pivot

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // đổi chỗ arr[i] và arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Đưa pivot về đúng vị trí
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public void printArr() {
        System.out.println(Arrays.toString(this.arr));
    }
}
