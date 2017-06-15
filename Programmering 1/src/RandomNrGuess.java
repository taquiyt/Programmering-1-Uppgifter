import java.util.Scanner;
import java.util.Random;

public class RandomNrGuess {
	public static void main(String[] args){
		System.out.println("I have a number between 1 and 10. Try to guess it.");
		Scanner input=new Scanner(System.in);
		Random taqui=new Random();
		System.out.print("Your guess is:");
		int guess = input.nextInt();
		int number=1+taqui.nextInt(10);
		
		while(guess != number){
			System.out.println("This is incorrect. Guess again! ");
			guess =input.nextInt();
			}
		System.out.println("Wow great job!");
	}

}
