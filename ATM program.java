import java.util.*;
public class Main{
    public static void main(String args[]){
        int balance =10000 , withdraw , deposite;
        Scanner obj = new Scanner(System.in);
        
        
        while(true)
        {
            System.out.println("Atm is ready to transaction********");
            System.out.println("Choose 1 for withdraw**************");
            System.out.println("Choose 2 for deposite************* ");
            System.out.println("Choose 3 for checking your balance ");
            System.out.println("choose 4 for exit*****************");
            
            
            int choice =obj.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter your money to be withdrwal");
                    withdraw = obj.nextInt();  
                    if (balance>=withdraw)
                    {balance=balance-withdraw;
                    System.out.println("collect your transaction ");
                    }
                  else
                   {
                System.out.println("aukat ke bahar ");
                break;
             
                   }   
               case 2:
                   System.out.println("deposite your money");
                    deposite = obj.nextInt();
                    deposite=balance + deposite;
                    System.out.println("your balance is deposite in your bank ");
                    System.out.println("");  
                    break;  
                    
                case 3:
                    System.out.println("balance:"+balance);
                    System.out.println("--------");
                    break;
                case 4:
                    System.exit(0);
            }
            
        }
        
    }
}
