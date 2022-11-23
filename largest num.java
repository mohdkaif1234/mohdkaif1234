import java.util.*;
 
public class Main  {
 
   public static void main(String[] args) {

        int a, b,c;

        Scanner obj=new Scanner(System.in)

        a=obj.nextInt();

        b=obj.nextInt();

       c=obj.nextInt();
        if (a>b&& b>c && a>c)

        {
  
          System.out.println("largest number\n"+a);

        }
 
           else if (b>c){
  
          System.out.println("largest number\n"+b);
 
           }

            else{
 
               System.out.println("largest number\n"+c);

            
            }
    
}
}        
       