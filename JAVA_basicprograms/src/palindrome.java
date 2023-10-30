import java.util.Scanner;

public class palindrome
{
	
	int revnum(int n)
	{
		int temp,rev=0;
		while(n!=0)
		{
			temp=n%10;
			rev*=10;
			rev +=temp;
			n/=10;
		}
		return rev;
	}
	
	public static void main(String[] args)
	{
		int n,rev;
		
		System.out.println("Enter number to check if it's palindrome or not");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		palindrome p=new palindrome();
		
		int pal=p.revnum(n);
		if (n==pal)
		{
			System.out.println("Number is palindrome");
		}
		
		else 
		{
			System.out.println("Number is not a palindrome");
			
		}
	}
}