import java.util.Random;
import java.util.Scanner;

public class ArrayPlugg3 {
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
		int notarray=0;//så vi har en not array counter som kollar vilket värder vi chillar på
		for(int counter = 0; counter<10; counter++)
		{
			
			if (array[counter]==number)
			{
				System.out.println("The number "+number+" Is in the array and in the slot " +counter);
				
				
			}else if (array[counter]!=number){
				notarray++;//talet inte är number 1
				
				//så  om det finns ett nummer kommer kontrollen aldrig att uppnå 10
			}
			
		}
		if(notarray==10)
		System.out.println(number +" Is not in the Array");
	}

}
