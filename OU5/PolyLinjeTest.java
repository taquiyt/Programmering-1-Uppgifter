import java.io.PrintWriter;
import java.util.Arrays;

public class PolyLinjeTest {
	public static void main (String[] args) 
		{       
			PrintWriter   out = new PrintWriter (System.out, true); 
		Punkt    p1 = new Punkt ("A",3,4);     
		Punkt    p2 = new Punkt ("B",5,6);
		Punkt 	 p3=  new Punkt ("C",7,8);
		Punkt 	 p4=  new Punkt ("D",6,4);
		Punkt 	 p5=  new Punkt ("E",3,5);
		Punkt 	 p6=  new Punkt ("F",5,4);
		Punkt 	 p7=  new Punkt ("G",8,8);
		Punkt[] horn={p1,p2,p3,p4,p5};
		Polylinje1 poly1 = new Polylinje1(horn);
		out.println(poly1);
		
		// testa en konstruktor och en transformator      
		poly1.setFarg("Gul");
		out.println(poly1);
		poly1.setBredd(12);
		out.println(poly1);
	    // testa inspektorer       
		 
		out.println(Arrays.toString(poly1.getHorn()));
		
	 
	    // testa en combinator och en comparator 
		double    d = poly1.langd();     
		out.println (d);      
		
		String färg=poly1.getFarg();
		out.println(färg);
		
		int bredd =poly1.getBredd();
		out.println(bredd);
		
		poly1.laggTill(p6);
		out.println(poly1);
		
		poly1.laggTillFramfor(p7,"C");
		out.println(poly1);
		
		poly1.taBort("G");
		out.println(poly1);
		}
		
	}

