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
		//det detta g�r att objektet e pekar till en vektor.
	}
	
	//konstrukt�r skapas genom att ha samma namn som klassen.
	//this.globalvariabel g�r det s� att man referar till den variabeln
}
