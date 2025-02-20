import java.util.Scanner;

public class S1DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membaca input dari object scanner
        int T = scanner.nextInt(); // Jumlah text case

        for (int i = 0; i < T; i++) {
            try {
                String input = scanner.next();
                long n = Long.parseLong(input);

                if (n == 1) {
                    System.out.println("Program akan keluar...");
                    System.exit(0); // Menghentikan program
                }

                // Menampilkan suatu data bisa digunakan dalam tipe data apa
                System.out.println(n + " can be fitted in :");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }

            } catch (Exception e) { // ketika suatu data tidak fit di 4 tipe data
                System.out.println(scanner.next() + "can't be fitted anywhere");
            }
        }
        scanner.close();
    }
}