package jproj3;

import java.util.Scanner;

public class Tugas2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Preparations
        Scanner read = new Scanner(System.in);
        String mjr;
        System.out.print("[A] RPL" + "\n" + "[B] UPW" + "\n" + "[C] Tata Busana" + "\n" + "[D] Tata Boga" + "\n" + 
                "[E] Perhotelan" + "\n" + "Pilih jurusan yang anda ingin mendaftar: ");
        mjr = read.next();
        System.out.println("\n");
        
        // Switch-Case Method
        switch (mjr)
        {
            case "A":
                System.out.println("Jurusan yang anda pilih: RPL");
                break;
                
            case "B":
                System.out.println("Jurusan yang anda pilih: UPW");
                break;
                
            case "C":
                System.out.println("Jurusan yang anda pilih: Tata Busana");
                break;
                
            case "D":
                System.out.println("Jurusan yang anda pilih: Tata Boga");
                break;
                
            case "E":
                System.out.println("Jurusan yang anda pilih: Perhotelan");
                break;
                
            default:
                System.out.println("Jurusan tidak ditemukan" + "\n" + "Pilihan yang tersedia: 'A', 'B', 'C', 'D', 'E'");
                break;
        }
    }
    
}
