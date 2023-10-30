import java.util.Scanner;

public class evenodd
{
	public static void main(String[] args)
	{
		Scanner sc;
		sc=new Scanner(System.in);
		
		int num;
		System.out.println("Enter Number:");
		num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}
		else 
		{
			System.out.println(num+" is odd");
		}
		sc.close();
	}
	
}