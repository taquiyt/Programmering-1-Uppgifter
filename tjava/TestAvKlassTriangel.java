package tjava;
import tjava.*;
import java.util.*;
public class TestAvKlassTriangel {
	public static void main(String[] args){
		System.out.println("Idag skall vi testa funktionerna f�r metoden Triangel!\n Klicka knapp f�r att forts�tta");
		Scanner input = new Scanner(System.in);
		String a =input.next();
		System.out.println("Skriv in sida 1");
		double sida1=input.nextDouble();
		System.out.println("Skriv in sida 2");
		double sida2=input.nextDouble();
		System.out.println("Skriv in sida 3");
		double sida3=input.nextDouble();
		System.out.println("Skriv in vinkeln alfa");
		double alfa=input.nextDouble();
		
		double area=Triangel.area(sida1,sida2,sida3);
		double omkrets=Triangel.omkrets(sida1, sida2, sida3);
		double tredjesidan=Triangel.sida3(sida1, sida2, alfa);
		
	System.out.println("Arean f�r Triangeln: "+area +"\nOmkrets f�r Triangeln: "+ omkrets +"\nTredje sidan av en triangel om vi inte visste den: "+tredjesidan);
	}

}
