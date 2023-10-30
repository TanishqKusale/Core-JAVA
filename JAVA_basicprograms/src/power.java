import java.util.Scanner;

public class power
{
	int Power(int num,int pow)
	{
		int p=1;
		
		for(int i=1;i<=pow;i++)
		{
			p*=num;
		}
		
			return p;
	}
	
	
	public static void main(String[] args)
	{
		int num,pow;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
			num=sc.nextInt();
			
		System.out.println("Enter power");
			pow=sc.nextInt();
			power calc=new power();
		int answer=calc.Power(num,pow);
		
		System.out.println(num+" to the power "+pow+" is "+answer);
	}
}