import java.util.*;
class Change_case
	{
	  public static void change(String word,int str)
	  {
	    if(str==1)  
	    System.out.print("In Upper Case : "+ word.toUpperCase());
	    else
	    System.out.print("In Lower Case : "+ word.toLowerCase());
	  }
	  public static void main(String[] args) 
	  {
	    Scanner scan = new Scanner(System.in);  
	    System.out.print("Enter String: ");
	    String word = scan.nextLine(); 
	    System.out.println("SELECT OPTION FOR LOWERCASE AND UPPERCASE: ");
	    System.out.println("SELECT 1 for UPPERCASE: ");
	    System.out.println("SELECT 2 for lowercase: ");
	    int str = scan.nextInt(); 
	    change(word,str);
	  }    
	   
	}
