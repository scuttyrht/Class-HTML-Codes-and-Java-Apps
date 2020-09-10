import java.util.Scanner;

public class App {

    double r, t;

    public App(double r, double t) {
        this.r = r;
        this.r = t;
    }

    public double RumusLuasAlasTabung() {
        double hasil_LA = r * r * (22/7);
        return hasil_LA;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Nama\t: ");
        read.nextLine();
        System.out.print("Kelas\t: ");
        read.nextLine();
        System.out.print("Masukkan jumlah perulangan: ");
        int retries = read.nextInt();
        System.out.println();

        for (int i = 0; i < retries; i++) {
            Double rad, hgt;
            System.out.println("Perulangan ke " + (i + 1) + ":");
            System.out.print("Jari-Jari\t:");
            rad = read.nextDouble();
            System.out.print("Tinggi\t\t:");
            hgt = read.nextDouble();

            if (rad <= -1.0) {
                rad = Math.abs(rad);
            } else if (rad == 0 || hgt == -0) {
                rad = 1.0;
            }

            if (hgt <= -1.0) {
                hgt = Math.abs(hgt);
            } else if (hgt == 0 || hgt == -0) {
                hgt = 1.0;
            }

            App VT = new App(rad, hgt);

            System.out.println("\n" + "------Program Hitung Volum Tabung------");
            System.out.println("Jari-Jari\t = " + rad + "cm");
            System.out.println("Luas Alas\t = (22 / 7) x " + rad + " x " + rad + " = " + VT.RumusLuasAlasTabung() + "cm²");
            System.out.println("Tinggi\t\t = " + hgt + "cm");
            System.out.println("Volum\t\t = " + VT.RumusLuasAlasTabung() + " x " + hgt + " = " + (VT.RumusLuasAlasTabung() * hgt) + "cm³");
            System.out.println("\n");
        }

        read.close();
    }

}