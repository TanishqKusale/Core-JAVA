import java.util.Scanner;

public class menu
{
	public static void main(String[] args)
	{
		System.out.println("1. Show Array  2.Add Array  3. get element  4.exit");
		int ch,index=0;
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		do{
			System.out.println("Enter Choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Array Elemnts: ");
					for(int i:arr)
					{
						System.out.println(i);
					}
					break;
				case 2:
					
					if(index<arr.length)
					{
						System.out.println("Enter Array Elements: ");
						arr[index]=sc.nextInt();
						index++;
					}
					else
					{
						System.out.println("Array is full");
						
					}
					break;
					
				case 3:
						
				case 4:
				System.out.println("Exit");
			}
				
			
		}while(ch!=4);
	}
}