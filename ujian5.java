public class ujian5{
public static void main(String[] args){
    int[] array ={1,3,4,2,5};
    cekDuplikat(array);
}
    public static void cekDuplikat(int[] array){
        boolean adaDuplikat=false;

    for(int i = 0;i< array.length;i++){
        for(int j = i + 1;j< array.length;j++){
            
            if(array [i] ==array [j]){
        System.out.println("Array memiliki elemen duplikat: " + array[i]);
             adaDuplikat = true;
            }
        }
    }
    if(!adaDuplikat){
        System.out.println("Tidak ada elemen duplikat.");
    }
    }
}  

