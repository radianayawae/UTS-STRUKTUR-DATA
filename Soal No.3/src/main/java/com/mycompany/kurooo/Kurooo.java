/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kurooo;

import java.util.ArrayList;
import java.util.List;

public class Kurooo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(new mahasiswa(2255201, "M. Reppy As", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255202, "Moch Fikry", "TIFRM22A", 181122));
        mahasiswaList.add(new mahasiswa(2255203, "Mochamad Rahdian", "TIFK22B", 181122));
        mahasiswaList.add(new mahasiswa(2255204, "Ardi Naufan", "TIFK22A", 181122));
        mahasiswaList.add(new mahasiswa(2255205, "Rizky Muhammad", "TIFRM22A", 181122));

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
        mahasiswaList.remove(0);

        mahasiswaList.forEach(mahasiswa -> System.out.println(mahasiswa.toString()));
        System.out.println("Panjang Data Mahasiswa -> " + mahasiswaList.size());
    }

}
