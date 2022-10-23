package polymarphism;

public class MethodOverloading 
{
	int a=20;
	int b=30;
	int sum;
	public void addition()
	{
		sum=a+b;
		System.out.println(sum);
	}
	private void addition(int a)
	{
		sum=a+b;
		System.out.println(sum);
	}
	void addition(int a, int b)
	{
		sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		MethodOverloading o= new MethodOverloading();
		o.addition();
		o.addition(60);
		o.addition(58, 36); 
	}

}
