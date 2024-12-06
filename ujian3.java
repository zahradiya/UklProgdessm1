import java.util.Scanner;   
public class ujian3 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //meminta pengguna untuk memasukkan bilangan bulat positif
        System.out.println("Masukkan bilangan bulat positif: ");
           int bilangan = scanner.nextInt();

        //memeriksa apakah bilangan yang dimasukkan valid (positif)
        if (bilangan < 0){
            System.out.println("Bilangan harus positif. ");
        }else{
            long faktorial = 1;   //menggunakan long untuk menyimpan hasil faktorial

            //menghitung faktorial
            for (int i = 1; i < bilangan; i++){
                faktorial *= i;
            }

            //menampilkan hasil
            System.out.println("Fatorial dari" + bilangan + " adalah: " + faktorial);
        }

        //menutup scanner
        scanner.close();
    }
}
