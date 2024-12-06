import java.util.HashMap;
import java.util.Map;

public class ujian6{
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        hitungFrekuensi(array);
    }

    public static void hitungFrekuensi(int[] array){
        //menggunakan HasMap untuk menyimpan frekuensi setiap elemen
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        //menghitung frekuensi setiap elemen
        for (int elemen : array){
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);
        }

        //menampilkan hasil frekuensi
        for (Map.Entry<Integer, Integer> entry : frekuensiMap.entrySet()){
              System.out.println(entry.getKey() + "muncul" + entry.getValue() + "kali");
        }
    }
}