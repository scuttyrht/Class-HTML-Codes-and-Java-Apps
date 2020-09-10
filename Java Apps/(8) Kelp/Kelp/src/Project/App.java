package Project;

import java.util.Scanner;
import MethodContainer.Methods;

public class App extends Methods{
    public static void main(String[] args) throws Exception {
        Methods m = new Methods();
        m.setUsername("user");
        m.setPassword("40");
        int d;
        d = 0;

        Scanner scn = new Scanner(System.in); 
        for (int i = 1; i <= 3; i++) {
            pr("Masukkan username: ");
            String username = scn.next();
            pr("masukkan ID: ");
            String ID = scn.next();

            if(m.getUsername().equals(username) && m.getPassword().equals(ID)){
                prln("\nSelamat datang di Java program, " + username);
                m.setPajak(0.1);
                boolean retry = true;

                while (retry == true){
                    pr("Masukkan gaki kotor (>1000): Rp. ");
                    double cekGajiKotor = scn.nextDouble();

                    if (cekGajiKotor >= 1000) {
                        m.setGajiKotor(cekGajiKotor);
                        double potongan = m.getPajak() * m.getGajiKotor();
                        m.setGajiBersih(m.getGajiKotor() - potongan);
                        prln("Gaji Bersih: Rp. " + m.getGajiBersih());

                        retry = false;
                        scn.close();
                    }

                    else {
                        prln("Pastikan lebih dari 1000\n");
                    }
                }

                break;
            }
            
            else {
                d += 1;

                if(d == 3) {
                    prln("PERINGATAN! Anda harus hubungi admin!");
                    break;
                }

                else {
                    prln("ID atau username salah. Coba lagi\n");
                }
            }
        }
    }
}

