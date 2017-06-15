import java.util.Scanner;
import java.util.*;

public class OU3ny {
	public static void main(String[] args){
		
		Scanner input =new Scanner(System.in);
		System.out.println("Antal stationer U?");
		int U = input.nextInt();
		System.out.println("Antal stationer V");
		int V = input.nextInt();
		
		
		
		int[] index = new int[2];
		double summa=ai[1]+bij[1][1]+cj[1];
		
		
		for(int counter =1; counter<=U; counter++)
		{
			for(int secondcounter=1;secondcounter<=V; secondcounter++)
			{
				if(summa <ai[counter]+bij[counter][secondcounter]+cj[secondcounter])
						summa= ai[counter]+bij[counter][secondcounter]+cj[secondcounter];
						index[0] = counter;
						index[1] =secondcounter;
				
			}
			
			
		}
		
		
		System.out.println(index[0]);
		System.out.println(index[1]);
		
	}
	}


