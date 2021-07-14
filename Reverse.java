import java.util.*;
	class Reverse
	{
	  public static void rev(String word)
	  {
	    int len=word.length();
	    for(int i=len-1;i>=0;i--)
	       System.out.print(word.charAt(i));  
	  }
	  public static void main(String[] args) 
	  {
	    Scanner scan = new Scanner(System.in);  
	    System.out.print("Enter the string : ");
	    String word = scan.nextLine(); 
	    rev(word);
	  }    
	   
	}
