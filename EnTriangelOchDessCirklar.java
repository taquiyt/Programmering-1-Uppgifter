import java.util.*;
import tjava.Triangel;

public class EnTriangelOchDessCirklar 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Skriv in första sidan!\nSida 1:");
		double sida1=input.nextDouble();
		System.out.print("Skriv in andra sidan!\nSida 2:");
		double sida2=input.nextDouble();
		System.out.print("Skriv in tredje sidan!\nSida 3:");
		double sida3=input.nextDouble();
	double RCirkelInne= Triangel.cirkelInneEnTriangel(sida1, sida2,sida3);
	double RCirkelUte=Triangel.cirkelUteEnTriangel(sida1, sida2,sida3);
	if(RCirkelInne==0||RCirkelUte==0){
		System.out.println("Something went Wrong Try again!");
	}else
	{
	System.out.println("Sidorna som kom på triangeln är:\nSida1:"+ sida1 +"\nSida2:"+sida2+"\nSida3:"+ sida3);
	System.out.println("Radien på Cirkeln innuti Triangeln är:\nRadien för Cirkel Inne: "+RCirkelInne+ "\nRadien för Cirkel Ute:" + RCirkelUte);
	}
	
	}

}
