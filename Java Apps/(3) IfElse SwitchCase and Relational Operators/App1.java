/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproj3;

/**
 *
 * @author wasis
 */

import java.util.Scanner;

public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Preparation
        Scanner read = new Scanner(System.in);
        int op;
        System.out.print("[1] Pertambahan" + "\n" + "[2] Pengurangan" + "\n" + "[3] Perkalian" + "\n" + "[4] Pembagian"
                + "\n" + "Pilih operasi perhitungan: ");        
        op = read.nextInt();
        System.out.println("\n");
        
        // Operations
        if (op < 2 && op > 0)
        {
            int val1, val2, res;
            System.out.println("===PERTAMBAHAN===");
            System.out.print("Input value 1: ");
            val1 = read.nextInt();
            System.out.print("Input value 2: ");
            val2 = read.nextInt();
            res = val1 + val2;
            System.out.println("Hasil:\n" + val1 + " + " + val2 + " = " + res);
        }
        
        else if (op < 3 && op > 0)
        {
            int val1, val2, res;
            System.out.println("===PENGURANGAN===");
            System.out.print("Input value 1: ");
            val1 = read.nextInt();
            System.out.print("Input value 2: ");
            val2 = read.nextInt();
            res = val1 - val2;
            System.out.println("Hasil:\n" + val1 + " - " + val2 + " = " + res);
        }
        
        else if (op < 4 && op > 0)
        {
            int val1, val2, res;
            System.out.println("===PERKALIAN===");
            System.out.print("Input value 1: ");
            val1 = read.nextInt();
            System.out.print("Input value 2: ");
            val2 = read.nextInt();
            res = val1 * val2;
            System.out.println("Hasil:\n" + val1 + " x " + val2 + " = " + res);
        }
        
        else if (op < 5 && op > 0)
        {
            int val1, val2, res;
            System.out.println("===PEMBAGIAN===");
            System.out.print("Input value 1: ");
            val1 = read.nextInt();
            System.out.print("Input value 2: ");
            val2 = read.nextInt();
            res = val1 / val2;
            System.out.println("Hasil:\n" + val1 + " ÷ " + val2 + " = " + res);
        }
        
        else
        {
            System.out.println("Tidak ada pilihan untuk " + op + ".\nPilihlan yang tersedia: '1', '2', '3', dan '4'");
        }
        
    }
    
}
