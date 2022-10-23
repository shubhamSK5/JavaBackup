package core.Java.ExceptionHandeling;

public class TryCatch 
{

	public static void main(String[] args) 
	{
		int a=0;
		int b=20;
		try {
				System.out.println("Addotion ="+(b/a));
			}
		catch(ArithmeticException s)
		{
			System.out.println("Enter Non-Zero Number");
		}
	}

}
