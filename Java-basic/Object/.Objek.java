import java.util.*;

 // Compiler version JDK 11.0.2

 class Objek
 //buat class dgn nama objek
 {
    //buat constructor(nama sama dgn nama class)//
      
   public Objek(String lingkungan)
       //buat satu parameter  dgn tipe string dan nama lingkungan
 
   { 
    System.out.println("Susasana lingkunganku:\n"+lingkungan);
    //buat baris perintah yg akan dijalankan saat membuat instance objek baru
    

     
   }
   
   public static void main(String [] args)
   {
     
     /*buat instance dari class objek memanfaatkan constructor yg
        sudahdibuat sebelumnya
         buat objek baru untuk menggambarkan suasana*/
     Objek lingkunganObjek=new Objek("Indah asri");
     
 }
}
