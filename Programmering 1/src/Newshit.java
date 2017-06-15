import java.util.Random;
import java.util.Scanner;


public class Newshit {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random random= new Random();
		System.out.println("Pls guess a number!");
		int Siffra=input.nextInt();
		for(int counter=0;counter<5;counter++){
			int stuff=random.nextInt(6);
			if(Siffra==stuff){
				System.out.println("True"+ " "+stuff + " "+Siffra);
				}
			else if(Siffra<stuff){
				System.out.println("Hoe"+"  " +stuff +" "+Siffra);
			}else{
				System.out.println("haha gay");
			}
		}
			
	}
}
