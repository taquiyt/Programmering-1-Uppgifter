import java.util.Scanner;
import java.util.Random;


public class HiLowWithTries {
	public static void main(String[] args){
		System.out.print("Im Thinking of a number between 1-100. You have 7 guesses\n First Guess:");
		Scanner input = new Scanner(System.in);
		Random RNG= new Random();
		int siffrat�nka=1+RNG.nextInt(100);
		int gissning=input.nextInt();
		int antalgissningar=1;
			while(siffrat�nka !=gissning){
				//Medans detta inte �r sant g� igenom denna while sats:
			if(siffrat�nka < gissning && antalgissningar<=7){
				System.out.println("You are too high!");
				antalgissningar++; // ifall b�da �r sant g� genom denna
				//d� �r personen f�r h�g
				//l�gger till +1 i antalgissningar
			}else if(siffrat�nka > gissning && antalgissningar<=7){
				System.out.println("You are too low");
				//ifall b�da �r sant g� igenom denna else if
				//addera sedan 1 p� antal gissningar
				antalgissningar++;
			}else if(antalgissningar==8){
				System.out.println("Sorry you didnt guess it in 7 tries you lose");
				System.exit(0);
			}
			if(antalgissningar <=7){
			System.out.print("Guess #" + antalgissningar+" : ");
			gissning=input.nextInt();}
			
			}
			//eftersom hela grejen �r falsk kommer vi hoppa ur loopen 
			//vilket leder till att vi detta stadie
			
		
		System.out.println("Nice job you won!");
		
		
	}

}
