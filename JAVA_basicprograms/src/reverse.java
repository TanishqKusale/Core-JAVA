import java.util.Scanner;

public class reverse
{
	

	
	public static void main(String[] args)
	{
		
		
		int temp,n,rev=0;
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Number before reverse: "+n);
		while(n!=0)
		{
			temp=n%10;
			rev*=10;
			rev +=temp;
			n/=10;
		}
	
		
		System.out.println("Number after reverse "+rev);
		
	}
}