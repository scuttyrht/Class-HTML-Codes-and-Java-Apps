import java.util.Scanner;

public class VolumTabung {

    double r, t;

    public VolumTabung(final double r, final double t) {
        this.r = r;
        this.t = t;
    }

    public double RumusVolumTabung() {
        final double hasil = r * r * (22 / 7) * t;
        return hasil;
    }

    public static void main(final String[] args) throws Exception {
        final Scanner read = new Scanner(System.in);

        System.out.print("Masukkan radius: ");
        final double rad = read.nextDouble();
        System.out.print("Masukkan tinggi: ");
        final double hgt = read.nextDouble();

        final VolumTabung VT = new VolumTabung(rad, hgt);

        System.out.println("Volum Tabung = " + VT.RumusVolumTabung());

        read.close();
    }
}
