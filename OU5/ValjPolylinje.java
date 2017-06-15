import java.util.Arrays;
import java.util.Random;


class ValjPolylinje {  
	public static final Random  rand = new Random ();    
	public static final int    ANTAL_POLYLINJER = 10;  
	public static void main (String[] args)    
	{   
		// skapa ett antal slumpm�ssiga polylinjer     
		Polylinje1[]    polylinjer = new Polylinje1[ANTAL_POLYLINJER];     
		double minstafarg = 0;

		int vetvilken = 0;
		for (int i = 0; i < ANTAL_POLYLINJER; i++)         
			polylinjer[i] = slumpPolylinje ();  
		System.out.println(Arrays.toString(polylinjer));

		System.out.println("Detta �r l�ngden p� polylinjen "+ polylinjer.length);
		for(int counter=0; counter<polylinjer.length;counter++)
		{ 
			System.out.println("detta �r min ber�knare p� vilken linje jag �r p� "+counter);

			if(polylinjer[counter].getFarg().equals("Gul"))
			{
				System.out.println("detta kolla f�rgen p� denna linje "+polylinjer[counter].getFarg());
				minstafarg=polylinjer[counter].langd();
				System.out.println("Detta �r v�rdet p� min minsta f�rg "+minstafarg);
				vetvilken=counter;
				break;
			}
			//mhm


		}
		for(int counter=0; counter<polylinjer.length;counter++)
		{
			if(polylinjer[counter].getFarg().equals("Gul")){
				
				if(minstafarg>polylinjer[counter].langd())
				{
					System.out.println("detta kolla f�rgen p� d�r den minsta "+polylinjer[counter].getFarg());
					minstafarg=polylinjer[counter].langd();
					System.out.println(minstafarg);

					vetvilken = counter;
				}
				System.out.println( "l�ngden p� den linje som finns h�r "+ polylinjer[counter].langd());
				System.out.println("detta �r counter den skriver ut "+ counter);
			}
		}

		if(!(polylinjer[vetvilken].getFarg().equals("Gul")))
		{
			System.out.println("inga gula");
		}else{


			System.out.println(polylinjer[vetvilken]);
			System.out.println(minstafarg);

			Polylinje1.PolylinjeIterator it =  polylinjer[vetvilken].new PolylinjeIterator();

			while(it.finnsHorn())
			{
				System.out.println(it.finnsHorn());
				System.out.println(it.horn());
				it.gaFram();

			}
		}
		// visa polylinjerna  
		// best�m den kortaste av de polylinjer som �r gula            
		// visa den valda polylinjen   
	}  

	// slumpPunkt returnerar en punkt med ett slumpm�ssigt namn, som �r en stor bokstav i   
	// det engelska alfabetet, och slumpm�ssiga koordinater.    
	public static Punkt slumpPunkt ()   
	{       
		String    n = "" + (char) (65 + rand.nextInt (26));  
		int    x = rand.nextInt (11);       
		int    y = rand.nextInt (11);  
		return new Punkt (n, x, y);  
	}  
	// slumpPolylinje returnerar en slumpm�ssig polylinje, vars f�rg �r antingen bl�, eller r�d   
	// eller gul. Namn p� polylinjens h�rn �r stora bokst�ver i det engelska alfabetet. Tv� h�rn    
	// kan inte ha samma namn.     
	public static Polylinje1 slumpPolylinje ()     
	{         // skapa en tom polylinje, och l�gg till h�rn till den     
		Polylinje1    polylinje = new Polylinje1 ();       
		int    antalHorn = 2 + rand.nextInt (7);        
		int    antalValdaHorn = 0;         
		boolean[]    valdaNamn = new boolean[26];    
		// ett och samma namn kan inte f�rekomma flera g�nger     
		Punkt    valdPunkt = null;   
		char    valtChar = 0;    
		Punkt[] horn =new Punkt[antalHorn];

		String farg ="" ;

		int ValavFargRNG;     


		while (antalValdaHorn < antalHorn)     
		{




			ValavFargRNG= 1+rand.nextInt(3);

			switch (ValavFargRNG) {
			case 1:  farg = "Bl�";    
			break;
			case 2:  farg = "R�d";        
			break;
			case 3:  farg = "Gul";
			break;

			}
			horn[antalValdaHorn]=slumpPunkt();



			//ha en swich sats mellan f�rgerna g�r en random funktion som f�r det att hamna mellan ett och 4 och d�rmed f�r du programmet att fungera!
			antalValdaHorn++;

		}   
		polylinje =new Polylinje1(horn);

		polylinje.setFarg(farg);
		// s�tt f�rg    
		return polylinje;
	} 
} 