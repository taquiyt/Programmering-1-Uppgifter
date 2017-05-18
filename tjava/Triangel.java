package tjava;


public class Triangel 
{

		
	public static double cirkelInneEnTriangel(double sida1, double sida2, double sida3)
	{
		double s =((sida1+sida2+sida3)/2);
		double R=Math.sqrt(((s-sida1)*(s-sida2)*(s-sida3))/s);
		if(sida1==0||sida2==0|| sida3 ==0){
			return 0;
		}
		return R;
		
	}
	
	public static double area(double sida1, double sida2, double sida3)
	{
		double s =((sida1+sida2+sida3)/2);
		 double area=Math.sqrt(s*(s-sida1)*(s-sida2)*(s-sida3));
		 return area;
		
	}
	
	public static double omkrets(double sida1,double sida2,double sida3){
		double omkrets=sida1+sida2+sida3;
		return omkrets;
		
	}
	
	public static double sida3(double sida1, double sida2, double alfa){
		double sida3=Math.sqrt(Math.pow(sida1,2)+Math.pow(sida2,2) - 2*sida1*sida2*Math.cos(alfa));
		return sida3;
	}
	
	

	
	// bisektris tar emot två sidor i en triangel och vinkeln (i radianer) mellan dessa sidor.
	// Metoden returnerar längden av den motsvarande bisektrisen - den som delar den givna vinkeln 
	// i två lika delar.
	
	
	public static double bisektris (double b, double c, double alfa) 
	{     
		double    p = 2 * b * c * Math.cos (alfa / 2);     
		double    bis = p / (b + c);  
		return bis; 
	}
	
	public static double cirkelUteEnTriangel(double sida1, double sida2, double sida3)
	{
		double s =(sida1+sida2+sida3)/2;
		double R=(sida1*sida2*sida3)/((4*(Math.sqrt(s*((s-sida1)*(s-sida2)*(s-sida3))))));
		
		if(sida1==0||sida2==0|| sida3 ==0){
			return 0;
		}
		return R;
	}
	
}
