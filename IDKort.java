import java.util.*;
public class IDKort {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Antal personer i en skola?\n>");
		int antal =input.nextInt();
		String[] name=new String[antal];
		double[] betyg=new double[antal];
		int[] IDKort=new int[antal];
		
		
		
		for(int counter=0;counter<antal;counter++)
		{
			System.out.println("Name of " +(counter+1)+" person");
			name[counter]=input.next();
			System.out.println("Grade of " +name[counter]);
			betyg[counter]=input.nextDouble();
			System.out.println("ID number of " + name[counter]);
			IDKort[counter]= input.nextInt();
			
		}
		
		System.out.println("Skriver Ut de som är del av skolan!");
		
		for (int counter=0; counter<antal;counter++)
		{
			System.out.print(name[counter]+" " );
			System.out.print(betyg[counter]+" ");
			System.out.println(IDKort[counter]+" ");
			
		}
		while(true){
		System.out.print("Who are you seaching for?\n>");
		int IDkort=input.nextInt();
		int test=0;
		
		for(int counter=0; counter<antal;counter++)
		{
			if(IDkort == IDKort[counter])
			{
				System.out.println(name[counter]+ " "+betyg[counter]+ " "+ IDKort[counter]);
				test++;
			}
		}
		if (test==0){
			System.out.println("Person does not exist");
		}
		}
		
	}

	
}
