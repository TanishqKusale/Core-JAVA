import java.util.Scanner;

public class primenumber
{
	public static void main(String[] args)
	{
		int num;
		boolean flag=false;
		
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			else
				flag=true;
		}
		
		if(flag==true)
		{
			System.out.println("Given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not prime number");
		}	
		
	}
}