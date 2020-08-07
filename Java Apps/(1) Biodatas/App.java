import java.util.Scanner;
        
public class App {
    
    public static void main(String[] args) {
        //Inputs
        Scanner read = new Scanner(System.in);
        
        // Variables
        int[] NIS;
        NIS = new int[2];
        String[] Name;
        Name = new String[2];
        String[] Address;
        Address = new String[2];
        String[] Sex;
        Sex = new String[2];
        int[] Number;
        Number = new int[2];
        float[] Weight;
        Weight = new float[2];
        float[] Height;
        Height = new float[2];
        
        // Functions
            // For 'Data: 1'
            System.out.println("DATA DIRI");
            System.out.print("NIS\t: ");
            NIS[0] = read.nextInt();
            System.out.print("Nama\t: ");
            Name[0] = read.next();
            System.out.print("Alamat\t: ");
            Address[0] = read.next();
            System.out.print("JenKel\t: ");
            Sex[0] = read.next();
            System.out.print("No. HP\t: ");
            Number[0] = read.nextInt();
            System.out.print("Berat\t: ");
            Weight[0] = read.nextFloat();
            System.out.print("Tinggi\t: ");
            Height[0] = read.nextFloat();
            System.out.println(" ");
            
            // For 'Data: 2'
            System.out.println("DATA TEMAN SEBANGKU");
            System.out.print("NIS\t: ");
            NIS[1] = read.nextInt();
            System.out.print("Nama\t: ");
            Name[1] = read.next();
            System.out.print("Alamat\t: ");
            Address[1] = read.next();
            System.out.print("JenKel\t: ");
            Sex[1] = read.next();
            System.out.print("No. HP\t: ");
            Number[1] = read.nextInt();
            System.out.print("Berat\t: ");
            Weight[1] = read.nextFloat();
            System.out.print("Tinggi\t: ");
            Height[1] = read.nextFloat();
            System.out.println(" ");
            
        // Table (Data Usage)
        System.out.println("-------------------------------------------------");
        System.out.print("BIODATA SISWA SMKN 24 JAKARTA" +  "\n" + 
                "KELAS XI RPL II" + "\n" + "TAHUN 2020");
        System.out.println("-------------------------------------------------");
        System.out.println("NIS\tNama\tAlamat\t\tJK\tNo. HP\t\tBerat\tTinggi");
        System.out.println(NIS[0] + "\t" + Name[0] + "\t" + Address[0] +
                "\t\t" + Sex[0] + "\t" + Number[0] + "\t\t" + Weight[0] + "\t" +
                Height[0]);
        System.out.println(NIS[1] + "\t" + Name[1] + "\t" + Address[1] +
                "\t\t" + Sex[1] + "\t" + Number[1] + "\t\t" + Weight[1] + "\t" +
                Height[1]);

        // Scanner Closure
        read.close();
    }
}
