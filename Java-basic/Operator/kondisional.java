/*
  rumus umum:exp1:exp2:?exp3
  
  Dimana expresi1 merupakan pernyataan boolean yang memiliki hasil salah satunya berupa true atau false. 
  expresi2 akan di eksekusi jika nilai boolean pada expresi1 bernilai true
   dan expresi3 akan dijalankan jika nilai boolean pada expresi1 bernilai false.
  
     */

import java.util.*;

 // Compiler version JDK 11.0.2

 class kondisional
 {
   public static void main(String args[])
   { 
    int skor=70;
    //jika skor maksimal  yg diminta adalah 70,maka yg dapet skor/result dibawah itu akan diminta coba lg
    
    
    String keterangan;
    System.out.println("===contoh operator tenary===");
    keterangan=skor<50?"Coba lg":"Permainan yg baik";
    System.out.println(keterangan);
   }
 }
