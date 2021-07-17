import java.util.Scanner;
//import library

 public class program_input_output
 {
   
   

   public static void main(String args[])
   { 
     Scanner input=new Scanner(System.in);
     //panggil/initialization library
     String nama,alamat,sekolah,hobi;
     
     int kelas;
     
     System.out.println("Siapa nama anda??:");
     
     nama=input.nextLine();
     
     System.out.println("Nama Anda adalah:"+nama);
     
     System.out.println("Dimana Anda tinggal??:");
     
     alamat=input.nextLine();
     
     System.out.println("Anda tinggal di:"+alamat);
     
     System.out.println("Dimana anda sekolah??:");
     
     sekolah=input.nextLine();
     
     System.out.println("Anda sekolah di:"+sekolah);
     
     System.out.println("Anda kelas berapa??:");
     
     kelas=input.nextInt();
     
     System.out.println("Anda kelas:"+kelas);
     
     System.out.println("==============================");
     
     System.out.println("Halo nama anda adalah:"+nama +"\n" +"Anda tinggal di:"+alamat +"\n"+"Anda sekolah di:"+sekolah  +"\n"+"Anda kelas:"+kelas);
     
    System.out.println("Salam kenal... \n");
    
     System.out.println("Program finish..."); 
    
     
   
   }
 }

