package polymarphism;

public class MethodOverloadingChild extends MethodOverloadingPerent
{
	public void mobile()
    {
    	System.out.println("To buy Mi mobile click here");
    }
    public void Laptop()
    {
    	System.out.println("to buy Dell Laptop click here");
    }
    void Headphone()
    {
    	System.out.println("to buy Sony Headphone click here");
    }
	public static void main(String[] args) 
	{
		System.out.println("*******perent class********");
		MethodOverloadingPerent perent =new MethodOverloadingPerent();
		perent.mobile();
		perent.Laptop();
		perent.Headphone();
		perent.Watch();
		System.out.println("              ");
		System.out.println("*******child class********");
		MethodOverloadingChild child =new MethodOverloadingChild();
		child.mobile();
		child.Laptop();
		child.Headphone();
	}

}
