package pkg;


public class Tester {

		private int x;
		private int y;
	
	public Tester(int x,int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
	public int getx()
	{
		return x;
	}
	public void setx(int x)
	{
		this.x=x;
	}
	
	public int gety()
	{
		return y;
	}
	public void sety(int y)
	{
		this.y=y;
	}
	public String toString()
	{
		System.out.println("this is Tester class toString()");
		return x+" "+y;
	}
}
