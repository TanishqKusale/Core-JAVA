import java.util.Scanner;

public class sumseries
{
	public static void main(String[] args)
	{
		int num,sum;
		System.out.println("Enter number");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		sum=(num*(num+1))/2;
		
		System.out.println("Sum of "+num+" numbers is "+sum);
		
	}
}
