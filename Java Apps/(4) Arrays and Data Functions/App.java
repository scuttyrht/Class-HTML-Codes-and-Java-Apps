import java.project.refreshDiagnostics;
import java.util.Scanner;

public class App {
    
    static void bubbleSortAcsending(final int[] data) {  
        final int n = data.length;  
        int temp = 0;  
        for(int i=0; i < n; i++) {  
            for(int j=1; j < (n-i); j++) {  
                if(data[j-1] > data[j]){
                    temp = data[j-1];  
                    data[j-1] = data[j];  
                    data[j] = temp;  
                }                            
            }  
        }    
    }

    static void selectionSortDescending(final int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxElementIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[maxElementIndex] < data[j]) {
                    maxElementIndex = j;
                }
            }
     
            if (maxElementIndex != i) {
                final int temp = data[i];
                data[i] = data[maxElementIndex];
                data[maxElementIndex] = temp;
            }
        }
    }

    public static void main(final String[] args) throws Exception {
        final var read = new Scanner(System.in);

        int total_datas;
        int[] data;

        System.out.print("Input jumlah data yang ingin diinput: ");
        total_datas = read.nextInt();
        data = new int[total_datas];
        int step = 1;
        Boolean repeat = true;

        do {
            switch (step) {
                case 1:
                System.out.println("Masukkan data:");
                for (int i = 0; i < total_datas; i++) {
                    final int j = i + 1;
                    System.out.print("Data -" + j + ": ");
                    data[i] = read.nextInt();
                }

                System.out.println("\n\n" + "Tampilan data:");
                for (int i = 0; i < total_datas; i++) {
                    System.out.print(data[i] + " ");
                }
                step = 2;
                break;

                case 2:
                read.nextLine();
                System.out.print("\n\nPilihan:\n\t1. Search Data\n\t2. Urutan Data dengan `bubbleSortAscending()`\n" +
                "\t3. Urutan Data dengan `selectionSortDescending()`\n\t4. Ganti Data\n\t5. Keluar\nPilihan Anda: ");
                final int choice = read.nextInt();

                if (choice == 1) {
                    step = 3;
                    continue;
                } else if (choice == 2) {
                    step = 4;
                    continue;
                } else if (choice == 3) {
                    step = 5;
                    continue;
                } else if (choice == 4) {
                    step = 1;
                    continue;
                } else if (choice == 5) {
                    step = 6;
                    continue;
                } else {
                    System.out.println("Pilihan tidak ditemukan.");
                    break;
                }

                case 3:
                System.out.print("\nMasukkan angka yang ingin dicari: ");
                final int search = read.nextInt();
                int found = 0;

                for (int i = 0; i < data.length; i++) {
                    if (data[i] == search) {
                        found++;
                    }
                }

                if (found > 0) {
                    System.out.println("Angka '" + search + "' ditemukan dalam kumpulan data");
                } else {
                    System.out.println("Angka '" + search + "' tidak ditemukan dalam kumpulan data");
                }

                step = 2;
                break;

                case 4:
                System.out.println("Calling bubbleSortAcsending() function...");
                bubbleSortAcsending(data);
                System.out.println("\nHasil fungsi `bubbleSortAcsending()`:");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                }

                step = 2;
                break;

                case 5:
                System.out.println("Calling selectionSortDescending() function...");
                selectionSortDescending(data);
                System.out.println("\nHasil fungsi `selectionSortDescending()`:");
                for (int i = 0; i < data.length; i++) {
                    System.out.print(data[i] + " ");
                }

                step = 2;
                break;

                case 6:
                System.out.println("Exiting...");
                System.out.println("Closing app...");
                repeat = false;
                break;

                default:
                read.close();
                break;
            }
        } while(repeat == true);
    }
}
