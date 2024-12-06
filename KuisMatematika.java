import java.util.Random;
import java.util.Scanner;

public class KuisMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean lanjut = true;

        while (lanjut) {
            // Menghasilkan dua bilangan acak
            int bilanganPertama = random.nextInt(100); // Bilangan pertama antara 0 dan 99
            int bilanganKedua = random.nextInt(100); // Bilangan kedua antara 0 dan 99

            // Menghasilkan operator acak
            String operator = generateOperator(random);

            // Menghitung hasil berdasarkan operator
            double hasil = 0;
            switch (operator) {
                case "*":
                    hasil = bilanganPertama * bilanganKedua;
                    break;
                case "/":
                    // Menghindari pembagian dengan nol
                    while (bilanganKedua == 0) {
                        bilanganKedua = random.nextInt(100);
                    }
                    hasil = (double) bilanganPertama / bilanganKedua;
                    break;
                case "%":
                    // Menghindari modulus dengan nol
                    while (bilanganKedua == 0) {
                        bilanganKedua = random.nextInt(100);
                    }
                    hasil = bilanganPertama % bilanganKedua;
                    break;
            }

            // Menampilkan soal kuis
            System.out.printf("%d %s %d = ?\n", bilanganPertama, operator, bilanganKedua);
            System.out.print("Jawab: ");
            double jawabanUser  = scanner.nextDouble();

            // Menampilkan hasil
            if (jawabanUser  == hasil) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.printf("Jawaban Anda salah! Hasil yang benar adalah: %.2f\n", hasil);
            }

            // Menanyakan kepada pengguna apakah ingin melanjutkan
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
        scanner.close();
    }

    private static String generateOperator(Random random) {
        int operatorIndex = random.nextInt(3); // 0, 1, atau 2
        switch (operatorIndex) {
            case 0:
                return "*"; // Perkalian
            case 1:
                return "/"; // Pembagian
            case 2:
                return "%"; // Modulus
            default:
                return "*"; // Default ke perkalian
        }
    }
}
    
      
    

