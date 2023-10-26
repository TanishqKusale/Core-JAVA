package pkg;

import java.util.Scanner;

public class Point2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y");
		Tester T=new Tester(sc.nextInt(),sc.nextInt());
		System.out.println(T);
		
//		
//		Tester T1=new Tester(2,3);
//		Tester T2=new Tester(3,5);
//		Tester T3=new Tester(8,10);
//		Tester T4=new Tester(9,20);
//	    Tester T5=new Tester(8,5);
	
	    Tester[] All=new Tester[5];
	    System.out.println("1:Show all 2:Add new");
	    int ch,index=0;
	    do
	    {
	    	System.out.println("Enter Choice");
			ch = sc.nextInt();
			switch (ch)
			{
			case 1: 
				for(int i=0;i<All.length;i++)
					   {
						   System.out.println(All[i]);
						   
					   }
				break;
			case 2:
				if (index < All.length) {
					System.out.println("Enter x  y ");
					Tester TObj = new Tester(sc.nextInt(), sc.nextInt());

					All[index] = TObj;
					index++;
				} else {
					System.out.println("array is full......");
				}
				break;
			
				
				default:
					
			}
	    }while(ch!=4);
	    sc.close();
//	    All[0]=T1;
//	    All[1]=T2;
//	    All[2]=T3;
//	    All[3]=T4;
//	    All[4]=T5;
//	    
//	    
//	   for(int i=0;i<All.length;i++)
//	   {
//		   System.out.println(All[i]);
//		   
//	   }
	}

}
