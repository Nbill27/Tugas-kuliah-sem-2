import java.util.Scanner;
public class F3{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jarak perjalanan dalam kilometer
        System.out.print("Masukkan jarak perjalanan (dalam kilometer): ");
        double jarak = input.nextDouble();

        // Tarif per kilometer
        double tarifPerKm = 10000;

        // Bonus jika jarak melebihi 15 kilometer
        double bonusTambahan = (jarak > 15) ? 5000 : 0;

        // Hitung biaya total
        double biayaTotal = (jarak * tarifPerKm) + bonusTambahan;

        // Cetak hasil
        System.out.println("Biaya perjalanan: " + biayaTotal + " rupiah");
        System.out.println("Tarif per kilometer: " + tarifPerKm + " rupiah");

        
        input.close();
    }
}
