import java.util.Scanner;
import java.util.Random;


public class HiLowWithTries {
	public static void main(String[] args){
		System.out.print("Im Thinking of a number between 1-100. You have 7 guesses\n First Guess:");
		Scanner input = new Scanner(System.in);
		Random RNG= new Random();
		int siffratänka=1+RNG.nextInt(100);
		int gissning=input.nextInt();
		int antalgissningar=1;
			while(siffratänka !=gissning){
				//Medans detta inte är sant gå igenom denna while sats:
			if(siffratänka < gissning && antalgissningar<=7){
				System.out.println("You are too high!");
				antalgissningar++; // ifall båda är sant gå genom denna
				//då är personen för hög
				//lägger till +1 i antalgissningar
			}else if(siffratänka > gissning && antalgissningar<=7){
				System.out.println("You are too low");
				//ifall båda är sant gå igenom denna else if
				//addera sedan 1 på antal gissningar
				antalgissningar++;
			}else if(antalgissningar==8){
				System.out.println("Sorry you didnt guess it in 7 tries you lose");
				System.exit(0);
			}
			if(antalgissningar <=7){
			System.out.print("Guess #" + antalgissningar+" : ");
			gissning=input.nextInt();}
			
			}
			//eftersom hela grejen är falsk kommer vi hoppa ur loopen 
			//vilket leder till att vi detta stadie
			
		
		System.out.println("Nice job you won!");
		
		
	}

}
