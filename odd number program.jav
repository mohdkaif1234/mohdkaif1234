import java.util.*;
public class Main{
    public static void main(String Args[]){
        Scanner object=new Scanner(System.in);
        System.out.println("Enter your number :");
        int x=object.nextInt();
        if(x%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}