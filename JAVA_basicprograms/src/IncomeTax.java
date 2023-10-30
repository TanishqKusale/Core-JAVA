import java.util.Scanner;

public class IncomeTax
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double sal,tax;
		System.out.println("Enter Number: ");
		sal=sc.nextDouble();
		
		if(sal<150000)
		{
			System.out.println("No Tax");
		}
		
		else if(sal>50000 && sal<300000)
		{
			tax=sal*0.2;
			System.out.println(tax+" is your Tax");
		}	
		else
		{
			tax=sal*0.3;
			System.out.println(tax+" is your Tax");
		}
		sc.close();
		
	}
}