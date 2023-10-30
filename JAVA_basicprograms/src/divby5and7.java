import java.util.Scanner;

public class divby5and7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number: ");
		num=sc.nextInt();
		if(num%5==0 && num%7==0)
		{
			System.out.println(num+" is dvisible by both 5 and 7");
		}
		else
		{
			System.out.println(num+" is not divisible by 5 and 7");
		}
		sc.close();
	}
	
}