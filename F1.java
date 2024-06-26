import java.util.Scanner;
public class F1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan: ");
            int bilangan = scanner.nextInt();

            boolean isGanjil = isGanjil(bilangan);

            if (isGanjil) {
                System.out.println(bilangan + " adalah bilangan ganjil");
            } else {
                System.out.println(bilangan + " adalah bilangan genap");
            }
        }
    }

    public static boolean isGanjil(int bilangan) {
        return bilangan % 2 != 0;
    }
}
