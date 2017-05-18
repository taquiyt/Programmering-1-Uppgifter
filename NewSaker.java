import java.util.Scanner;

public class NewSaker {


	public static int min (int[] element){
		int minstatal=element[0];
		for(int counter=0;counter<element.length;counter++){
			if(minstatal > element[counter])
				minstatal=element[counter];
		}

		return minstatal;
	}
	public static void main(String[] args)
	{
		
		int[] taqui={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,0,18,19};
		//*for (int counter=0; counter<taqui.length;counter++)
		//{
		//System.out.println("Skriv in element " + counter + " i Taqui");
		//taqui[counter]=input.nextInt();


		//}

		System.out.println (java.util.Arrays.toString (taqui));


		System.out.println(min(taqui));
	}
}


