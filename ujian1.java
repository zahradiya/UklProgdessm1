import java.util.Scanner;
public class ujian1{
    public static void main(String[] args){
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Menentukan apakah bilangan tersebut ganjil atau genap
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        // Menutup scanner
        scanner.close();
    }
}