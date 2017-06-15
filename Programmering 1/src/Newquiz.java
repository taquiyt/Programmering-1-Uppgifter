import java.util.Scanner;
public class Newquiz {
	public static void main(String[] args){
	
		System.out.println("Are you ready for a quiz?");
		Scanner input = new Scanner(System.in);
		String temp= input.nextLine();
		
		System.out.println("Q1) What is the capital of Alaska?"
				+ "\n\t1)Melbourne\n\t2)Anchorage\n\t3)Juneau");
		System.out.println(">");
		int Q1=input.nextInt(), Q2, Q3,Score=0;		
		if(Q1 ==3){
			System.out.println("That's right!");
			Score +=1;
			
		}else{ System.out.println("Nigga...");
		}
		
		System.out.println("Q2) Can you store cat in a int?"
				+ "\n\t1)Yes\n\t2)No");
		Q2=input.nextInt();
		if(Q2 == 2){
			System.out.println("Correct");
			Score+=1;
			
		}else{
			System.out.println("Wrong!");
		}
		System.out.println("Q3) What is the result of 9+6/3?"
				+ "\n\t1)5\n\t2)11\n\t3)15/3");
		Q3=input.nextInt();
		if(Q3==2){
			System.out.println("Correct");
			Score+=1;
		
		}else{System.out.println("False");
		}
		
		System.out.println("Overall your score is "+" "+ Score +" out of 3 Correct");
		
	}	
	

}
