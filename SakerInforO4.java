import java.io.Serializable;

public class  SakerInforO4 implements Serializable {
	private double x;
	private double y;
	
	
	public String toString(){
		String s="";
		s= this.x+this.y;
				return s;
	}
	
	private int [] e = null;
	
	public SakerInforO4(){
		this.e=new int[0];
		//det detta gör att objektet e pekar till en vektor.
	}
	
	//konstruktör skapas genom att ha samma namn som klassen.
	//this.globalvariabel gör det så att man referar till den variabeln
}
