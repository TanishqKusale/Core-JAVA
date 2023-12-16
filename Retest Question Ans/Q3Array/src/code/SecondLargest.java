package code;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10789,2035,1899,1456,2013};
		for(int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("2nd largest element in the array "+arr[1]);
	}

}
