import java.util.*;

public class Main
{

	public static void main(String[] args) {

	    String name ,reverse="";

	    int len;

	    Scanner obj=new Scanner(System.in);

	    System.out.println("enter your name");

	    name=obj.nextLine();

	    System.out.println("name="+name);

	    len=name.length();

	    for(int i=(len-1); i>=0;i--)

	     reverse=reverse+name.charAt(i);

	     {

	    if(name.equals(reverse))

		  System.out.println("your name is palindrome="+name);

  	    else

		
            {

		  System.out.println("your name is not a palindrome="+name);

	     }

	     }

	}

}