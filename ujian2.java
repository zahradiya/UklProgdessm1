public class ujian2 {
    public static void main(String[] args){
      for(int i = 1; i <= 50; i++){
        //Mencetak nomer
        System.out.println(i+ ". ");

        //Memeriksa kondisi untuk mencetak pesan yang sesuai
        if(i==1){
            System.out.println("saya senang");
        }else if (i% 3 == 0){        //memeriksa apakah i adalah kelipatan 3
            System.out.println("saya anak angkatan 33");
        }else if (i % 2 == 0){
            System.out.println("saya anak moklet");
        }else{
            System.out.println("saya anak wikusama");
        }
    }    
    
    }
}
