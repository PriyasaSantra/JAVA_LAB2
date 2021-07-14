import java.util.Scanner;
public class Armstrong
{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);   
	   System.out.println("Enter the number : ");
	   int n = scan.nextInt();
	   int m;
        m = n;
        int sum = 0;
        int r, cube;
        while(m > 0) {
            r = m%10;
            cube = r*r*r;
            sum = sum + cube;
            m = m/10;
        }
        
        if(sum == n)
        System.out.println("The number is Armstrong number.");
        else
        System.out.println("The number is not Armstrong number.");
	}
}
