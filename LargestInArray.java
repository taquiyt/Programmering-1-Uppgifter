import java.util.Random;
import java.util.Scanner;

public class LargestInArray {
	public static void main(String[] args)
	{
		Scanner input=new Scanner (System.in);
		Random rng =new Random();
		
		int[] array=new int[10];
		
		for(int counter=0; counter<10;counter++)
		{
			array[counter]=rng.nextInt(100)+1;
		}
		System.out.print("Array:"+" ");
		for(int counter=0; counter<10;counter++ )
		{
			System.out.print(array[counter]+" ");
		}
	
		int storsta=array[0];
		for(int counter=0; counter<10;counter++){
			if (storsta<array[counter])
			{
				storsta=array[counter];
			}
			
		}
		System.out.println("");
		System.out.println(storsta);
	}

}
