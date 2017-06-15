import java.lang.reflect.Array;
import java.util.Random;
public class ArrayPlugg 
{
	public static void main(String[] args)
	{
		int[] array1=new int[10];
		int[] array2= new int[10];
		Random rng=new Random();
		
		for(int counter=0; counter<10;counter++)
		{
			array1[counter] =1+rng.nextInt(100);
			array2[counter]= array1[counter];
			array1[array1.length-1] =-7;
		}
		System.out.print("Array1: ");
		for(int newcounter=0; newcounter<10; newcounter++){
			System.out.print(array1[newcounter]+" ");
		}
		System.out.println();
		System.out.print("Array2: ");
		
	for (int nextcounter=0; nextcounter<array1.length; nextcounter++){
		System.out.print(array2[nextcounter] +" ");
		
	}
		
	}
	

}
