import java.util.*;

public class OU3
{
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Antal stationer U?");
		int U = input.nextInt();
		System.out.println("Antal stationer V");
		int V = input.nextInt();
		
		double[] ai =new double[U+1];
		double[][] bij=new double[U+1][V+1];
		double[] cj =new double [V+1];
		
		
		for(int counter=1; counter<ai.length;counter++)
		{
			System.out.println("Str�cka mellan ai "+counter+"\n");
			ai[counter]=input.nextDouble();
			
		}
		
		for(int countercj=1;countercj<cj.length;countercj++)
		{
			
			System.out.println("Skriv in den l�ngd " +countercj +"\nL�ngd tunnelbana p� cj:");
			cj[countercj]=input.nextDouble();
		}
		for(int counter=1;counter<ai.length;counter++)
		{
			for(int newcounter=1;newcounter<cj.length;newcounter++)
			{
				System.out.print("Detta �r d� b" +counter);
				System.out.println(newcounter);
			bij[counter][newcounter]=input.nextDouble();
			
			}
		}
		int [] index=langd.mellanstationer(ai,bij,cj);
		System.out.print("Mellanstationerna �r U"+index[1]);
		System.out.println("och V"+index[2]);
		System.out.println("Detta kommer vara den kortaste str�ckan "+langd.langd(ai,bij,cj));
	
	}
	 
	
	

} 



