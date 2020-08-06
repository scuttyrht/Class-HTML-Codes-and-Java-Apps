/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jproj2;

/**
 *
 * @author wasis
 */
import java.util.Scanner;
public class Latihan2 {
    
    public static void main(String[] args)
    {
        // Var Declarings
        Scanner read = new Scanner(System.in);
        int[] Number;
        Number = new int[3];
        int Average;
        
        // Inputs
        System.out.print("Number 1: ");
        Number[0] = read.nextInt();
        System.out.print("Number 2: ");
        Number[1] = read.nextInt();
        System.out.print("Number 3: ");
        Number[2] = read.nextInt();
        
        // "Average" Calculation --> Output
        System.out.println(" ");
        Average = (Number[0] + Number[1] + Number[2]) / 3;
        System.out.println("Rata-rata = " + Average);
    }
    
}
