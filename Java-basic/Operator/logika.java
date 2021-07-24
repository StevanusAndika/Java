class  logika
 {
   public static void main(String args[])
   { 
    boolean X,Y,Z;
   
    System.out.println("===OR(||)===");
   //OR /atau ||
      //true=1;false=0;
   
    X=true;
    Y=true;
    Z=X||Y;
    /*
      X=1
      Y=1;
      Z=1+1=2
      2 dikonversi jd 1,berarti true
      */
    
    System.out.println(X+"||"+Y+"="+Z);
    
    X=false;
    Y=false;
    Z=X||Y;
    System.out.println(X+"||"+Y+"="+Z);
    
    
    System.out.println("\n");
    
    System.out.println("===AND(&&)===");
    X=false;
    Y=true;
    Z=X&&Y;
    /*
     X=false
     Y=true
     Z=X*Y
     0*1
     Z=0(false)
     

      
      */
    
    System.out.println(X+"&&"+Y+"="+Z);
    
    X=false;
    Y=false;
    Z=X&&Y;
    System.out.println(X+"&&"+Y+"="+Z);
    
 
 
 //exclusive or
    
    System.out.println("===XOR(^)===");
    
    X=false;
    Y=false;
    Z=X^Y;
    
    /*
         X=false
     Y=true
     Z=X*Y
     0*1
     Z=0(false)
      */
    
    System.out.println(X+"^"+Y+"="+Z);

    
    X=true;
    Y=true;
   
    System.out.println(X+"^"+Y+"="+Z);
    
    X=false;
    Y=true;
    System.out.println(X+"^"+Y+"="+Z);
    
    //Not/negasi->>>>flipping(!)
    
    System.out.println("====Negasi(!)===");
   X=false;
   Z=!X;
   System.out.println(X+"--->"+"="+Z);
    
    X=true;
    Z=!X;
    System.out.println(X+"--->"+"="+Z);
   
   }
   
   
   }
