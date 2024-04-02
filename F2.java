import java.util.Scanner;
public class F2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        try {
            System.out.print("Masukkan jumlah hari: ");
            int jumlahHari = scanner.nextInt();

            int[] bungaMekarHarian = new int[jumlahHari];

            for (int i = 0; i < jumlahHari; i++) {
                System.out.print("Masukkan jumlah bunga mekar hari " + (i + 1) + ": ");
                bungaMekarHarian[i] = scanner.nextInt();
            }

            int totalBungaMekar = 0;
            for (int bungaMekar : bungaMekarHarian) {
                totalBungaMekar += bungaMekar;
            }

            System.out.println("Total bunga mekar selama " + jumlahHari + " hari: " + totalBungaMekar);
        } finally {
            scanner.close(); 
        }
    }
}
