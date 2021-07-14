import java.util.*;
class Name_print
	{
	  public static void Print(String name,int n)
	  {
	      for(int i=0;i<n;i++)
	        System.out.println(name); 
	  }
	  public static void main(String[] args) 
	  {
	    Scanner scan = new Scanner(System.in);  
	    System.out.print("Enter your name : ");
	    String name = scan.nextLine(); 
	    System.out.print("Number of times of printing the name : ");
	    int n = scan.nextInt();
	    Print(name,n);
	  }    
	   
	}

