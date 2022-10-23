package Generaliazation;

public class TestGeneralization {

	public static void main(String[] args) 
	{
		Flipkart fk= new Flipkart();
		fk.FlipKart();
		fk.Cloths();
		fk.Electronics();
		fk.Grosery();
		fk.cart();
		
		System.out.println("          ");
		
		Amazon1 az= new Amazon1();
		az.Amazon();
		az.Cloths();
		az.Electronics();
		az.Grosery();
		az.cart();
	}

}
