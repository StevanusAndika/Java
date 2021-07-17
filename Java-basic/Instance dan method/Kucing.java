import java.util.*;
public class Kucing
 {
   int umurKucing;
   
   public Kucing(String nama)
   {
     //constructor dgn satu parameter yaitu nama
     System.out.println("Nama kucingku:"+nama);
     
   }
   public void aturUmur(int umur)
   {
     /*instance variabel
     dibuat dlm method aturUmur
     method mempunyai satu paramater yaitu umur
     dgn tipe dsta integer
     void artinya tidak mengembalikan nilai
     
     
     */
     umurKucing=umur;
     //nilai dalam parameter umur disimpan dlm var umurKucing
     
     
   }
   public int ambilUmur()
   { 
     //void tidak ditemukan,ada nilai balikan yg dihasilkan
     
     System.out.println("Umur kucingku:"+umurKucing+"tahun");
     
     return umurKucing;
     //nilai didalam  var umurKucing  menjadi nilai balikkan
   }
   
   public static void main(String args[])
   
   { 
     //object baru dibuat dan constructor Kucing dijalankan
     Kucing kucingku=new Kucing("Apin");
     //dimana  "Apin"mengisi paramater nama dlm constructor
     
     
   
     kucingku.aturUmur(4);
     //method aturUmur dlm object kucingku digunakan mengisi var umur dgn nilai 5
     
     
     kucingku.ambilUmur();
     
     //tampilkan nilai dgn  kucingku.ambilUmur
     System.out.println("umur kucing adalah:"+kucingku.umurKucing);
   }
 }
