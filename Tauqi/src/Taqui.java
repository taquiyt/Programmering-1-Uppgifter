import java.util.Arrays;
import java.util.Scanner;
public class Taqui{
	public static int[] newlist(int[] primtal){
		int[] newlist= new int[primtal.length+1];
		for(int counter=0;counter<primtal.length;counter++)
		{
			newlist[counter]=primtal[counter];
		}
		
		//52 sekunder när jag tog +1
		//
		return newlist;
	}

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String wasteoftime="";
		int[] primtal={2,3,5,7,11};
		int talstart=13;
		int kolla = 0;
		int 	n=0;
		while(true)
		{
			
			
			for(int counter=0; counter<primtal.length;counter++){
				if(primtal[counter]==0)
				{
					
				}else
				{
					kolla=talstart%primtal[counter];
				}
				
				if(kolla==0)
				{
					System.out.println("The number "+talstart+ "is not a primenumber");
					break;
					
					
				}else{
					
					
				}
				
				if(counter==primtal.length-1)
				{
					System.out.println("Talet " +talstart+ "Är ett primtal");
					 primtal=newlist(primtal);
					 primtal[5+n]=talstart;
					 n++;
					 
				}
			}
			
			System.out.println(Arrays.toString(primtal));
			
			talstart++;
			if(talstart>100000)
			{
				break;
				
			}
		}
		
	}
	
}