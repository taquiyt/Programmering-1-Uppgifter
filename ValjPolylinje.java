import java.util.Arrays;
import java.util.Random;


class ValjPolylinje {  
	public static final Random  rand = new Random ();    
	public static final int    ANTAL_POLYLINJER = 10;  
	public static void main (String[] args)    
	{   
		// skapa ett antal slumpmässiga polylinjer     
		Polylinje1[]    polylinjer = new Polylinje1[ANTAL_POLYLINJER];     
		double minstafarg = 0;

		int vetvilken = 0;
		for (int i = 0; i < ANTAL_POLYLINJER; i++)         
			polylinjer[i] = slumpPolylinje ();  
		System.out.println(Arrays.toString(polylinjer));

		System.out.println("Detta är längden på polylinjen "+ polylinjer.length);
		for(int counter=0; counter<polylinjer.length;counter++)
		{ 
			System.out.println("detta är min beräknare på vilken linje jag är på "+counter);

			if(polylinjer[counter].getFarg().equals("Gul"))
			{
				System.out.println("detta kolla färgen på denna linje "+polylinjer[counter].getFarg());
				minstafarg=polylinjer[counter].langd();
				System.out.println("Detta är värdet på min minsta färg "+minstafarg);
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
					System.out.println("detta kolla färgen på där den minsta "+polylinjer[counter].getFarg());
					minstafarg=polylinjer[counter].langd();
					System.out.println(minstafarg);

					vetvilken = counter;
				}
				System.out.println( "längden på den linje som finns här "+ polylinjer[counter].langd());
				System.out.println("detta är counter den skriver ut "+ counter);
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
		// bestäm den kortaste av de polylinjer som är gula            
		// visa den valda polylinjen   
	}  

	// slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i   
	// det engelska alfabetet, och slumpmässiga koordinater.    
	public static Punkt slumpPunkt ()   
	{       
		String    n = "" + (char) (65 + rand.nextInt (26));  
		int    x = rand.nextInt (11);       
		int    y = rand.nextInt (11);  
		return new Punkt (n, x, y);  
	}  
	// slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd   
	// eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn    
	// kan inte ha samma namn.     
	public static Polylinje1 slumpPolylinje ()     
	{         // skapa en tom polylinje, och lägg till hörn till den     
		Polylinje1    polylinje = new Polylinje1 ();       
		int    antalHorn = 2 + rand.nextInt (7);        
		int    antalValdaHorn = 0;         
		boolean[]    valdaNamn = new boolean[26];    
		// ett och samma namn kan inte förekomma flera gånger     
		Punkt    valdPunkt = null;   
		char    valtChar = 0;    
		Punkt[] horn =new Punkt[antalHorn];

		String farg ="" ;

		int ValavFargRNG;     


		while (antalValdaHorn < antalHorn)     
		{




			ValavFargRNG= 1+rand.nextInt(3);

			switch (ValavFargRNG) {
			case 1:  farg = "Blå";    
			break;
			case 2:  farg = "Röd";        
			break;
			case 3:  farg = "Gul";
			break;

			}
			horn[antalValdaHorn]=slumpPunkt();



			//ha en swich sats mellan färgerna gör en random funktion som får det att hamna mellan ett och 4 och därmed får du programmet att fungera!
			antalValdaHorn++;

		}   
		polylinje =new Polylinje1(horn);

		polylinje.setFarg(farg);
		// sätt färg    
		return polylinje;
	} 
} 