/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kuroo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ardin
 */
public class Kuroo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = new int[10];
        Scanner valueArray = new Scanner(System.in);

        System.out.println("Masukan Isi Dari Array");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukan Index ke-" + (i + 1) + " : ");
            angka[i] = valueArray.nextInt();
        }
        bubbleSort(angka);
        System.out.println("Isi Arraay : " + Arrays.toString(angka));
    }

     static void bubbleSort(int array[]) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}