import java.util.*;
public class ArrayPlugg2 
{
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
		System.out.println("");
		System.out.print("Write a Value:");
		int number=input.nextInt();
		
		for(int counter = 0; counter<10; counter++)
		{
			if (array[counter]==number){
				System.out.println(number+" Is in the array");
			
				System.exit(0);
				
			}else{
				System.out.println(number +" is not in the Array");
				System.exit(0);
			}
		}
	}
}
