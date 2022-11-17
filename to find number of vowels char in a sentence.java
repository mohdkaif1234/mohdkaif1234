import java.util.*;

public class Main
{

	public static void main(String[] args) {

	    int count=0;

	    String sentence;

	    System.out.println("Enter a sentence");

	    Scanner obj=new Scanner(System.in);

	    sentence=obj.nextLine();

	    for(int i=0;i<sentence.length();i++){

               char ch = sentence.charAt(i);

		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){

		        count++;

		    }

	    }

	    System.out.println("number of vowels in the given sentence is :"+count);

	}

}
