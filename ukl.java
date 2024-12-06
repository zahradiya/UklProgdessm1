import java.util.Scanner;
public class ukl {
 
       
        public static double hitungLuasPermukaan(double r) {
            return 4 * 3.14 * r * r;
        }
    
        // Fungsi untuk menghitung volume bola
        public static double hitungVolume(double r) {
            return (4.0 / 3) * 3.14 * r * r * r;
        }   // Nilai hasil perhitungan dikembalikan ke pemanggilan 
    
        public static void main(String[] args) {
            // Membuat scanner untuk input
            Scanner input = new Scanner(System.in);
    
            // Meminta input dari pengguna
            System.out.print("Masukkan jari-jari bola: ");
            double r = input.nextDouble();
    
            // Menghitung luas permukaan dan volume bola
            double luas = hitungLuasPermukaan(r);
            double volume = hitungVolume(r);
    
            // Menampilkan hasil
            System.out.println("Luas Permukaan Bola: " + luas);
            System.out.println("Volume Bola: " + volume);

            // Menutup scanner
            input.close();
    
    }
}
