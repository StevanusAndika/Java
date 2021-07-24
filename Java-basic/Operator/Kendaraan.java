import java.util.*;

 // Judul:program operator instanceof

 class Kendaraan{}
public    class Motor extends Kendaraan
   {
     //constructor
     
     
   public static void main(String args[])
   { 
     Kendaraan a=new Motor ();
       //var referensi dibuat dgn menggunakan constructor yg di definiisikan dlm class
    
     boolean result=a instanceof Motor;
         //Jika objek direferensikan oleh var  disebelah kiri operator
    
    
    System.out.println(result);
    }
   }
