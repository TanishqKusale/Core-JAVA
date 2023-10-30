import java.util.Scanner;

public class sumoddeven
{
	public static void main(String[] args)
	{
		int n,evensum=0,oddsum=0;
			
		System.out.println("Enter number");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			
			for(int i=1;i<=n;i++)
			{
				if(i%2==0)
				{
					evensum+=i;
				}
				else
				{
					oddsum+=i;
				}
			}
			
		System.out.println("Sum of even numbers till "+n+" is "+evensum);
		System.out.println("Sum of odd numbers till "+n+" is "+oddsum);
			

	}
}