import java.util.Scanner;

public class GajiBersih {
    
    double gajikotor;

    public GajiBersih(double gajikotor) {
        this.gajikotor = gajikotor;
    }

    public double findGajiBersih(double gajikotor) {
        double pajak = 0.1;
        double potongan = pajak * gajikotor;
        double gajibersih = gajikotor - potongan;
        return gajibersih;
    }

    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        System.out.print("Masukkan Gaji Kotor: ");
        double gk = read.nextDouble();

        GajiBersih GB = new GajiBersih(gk);

        System.out.println("Gaji Bersih: " + GB.findGajiBersih(gk));

        read.close();
    }
}