import java.util.*;     // Scanner, Locale


class Nyasaker {
    public static void main (String[] args){
    System.out.println ("TEMPERATURER\n");  // inmatningsverktyg
    Scanner    in = new Scanner (System.in);
    in.useLocale (Locale.US);  // mata in uppgifter om antalet veckor och antalet m�tningar
     System.out.print ("antalet veckor: ");
     int    antalVeckor  = in.nextInt ();
     System.out.print ("antalet m�tningar per vecka: ");
     int    antalMatningarPerVecka = in.nextInt ();  // plats att lagra temperaturer
     double[][]    t = new double[antalVeckor + 1][antalMatningarPerVecka + 1];  // mata in temperaturerna
     for (int vecka = 1; vecka <= antalVeckor; vecka++) {
       System.out.println ("temperaturer - vecka " + vecka + ":");
       for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
      t[vecka][matning] = in.nextDouble ();}
      System.out.println ();  // visa temperaturerna
       System.out.println ("temperaturerna:");
       for (int vecka = 1; vecka <= antalVeckor; vecka++){
         for (int matning = 1; matning <= antalMatningarPerVecka; matning++)
         System.out.print (t[vecka][matning] + " ");
         System.out.println ();}
         System.out.println ();
        // den minsta, den st�rsta och medeltemperaturen � veckovis
        double[]    minT = new double[antalVeckor + 1];
        double[]    maxT = new double[antalVeckor + 1];
        double[]    sumT = new double[antalVeckor + 1];
        double[]    medelT = new double[antalVeckor + 1];         
       
        
        for(int tempv=1;tempv<=antalVeckor;tempv++)
        {
        	minT[tempv]= t[tempv][1];
            maxT[tempv]= t[tempv][1];
        	for (int tempm=1; tempm<=antalMatningarPerVecka;tempm++)
        	{
        		minT[tempv] = Math.min(minT[tempv],t[tempv][tempm]);
        		maxT[tempv] = Math.max(maxT[tempv], t[tempv][tempm]);
        		sumT[tempv] +=t[tempv][tempm];
        			
            }
        	
        	medelT[tempv]=sumT[tempv]/antalMatningarPerVecka;
        }
        for(int tempv=1;tempv<=antalVeckor;tempv++){
        	System.out.println("Detta �r minsta temperaturen f�r vecka "+tempv);
        	System.out.println(minT[tempv]);
        	System.out.println("Detta �r den H�gsta temperaturen f�r vecka "+tempv);
        	System.out.println(maxT[tempv]);
        	System.out.println("Detta �r den sammanlagda temperaturen f�r vecka "+tempv);
        	System.out.println(sumT[tempv]);
        	System.out.println("Detta �r den medeltemperaturen f�r vecka "+tempv);
        	System.out.println(medelT[tempv]+"\n\n\n");
        	}
        
        
        // koden ska skrivas h�r
       // visa den minsta, den st�rsta och medeltemperaturen f�r varje vecka  
        // koden ska skrivas h�r
       // den minsta, den st�rsta och medeltemperaturen - hela m�tperioden
       double    minTemp = minT[1];
       double    maxTemp = maxT[1];
       double    sumTemp = sumT[0];
       double    medelTemp = 0;         // koden ska skrivas h�r
       // visa den minsta, den st�rsta och medeltemperaturen i hela m�tperioden         // koden ska skrivas h�r
       for(int rad=1; rad<=antalVeckor; rad++){
    	   minTemp=Math.min(minTemp,minT[rad]);
    	   maxTemp=Math.max(maxTemp,maxT[rad]);
    	   sumTemp+=sumT[rad];
    	   medelTemp+=medelT[rad]/antalVeckor;
       }
       String s = null;
       double worth = 0;
       
       for(int counter=1;counter<=4;counter++){
    	   if(counter==1){
    		   s= "Minimala temperaturen";
    		   worth=minTemp;
    	   }else if(counter==2){
    		   s= "maximala temperaturen";
    		   worth=maxTemp; 
    	   }else if(counter ==3){
    		    s= "Summan av temperaturerna";
    		    worth=sumTemp; 
    	   }else if (counter==4){
    		    s= "Medelv�rdet av temperaturerna";
    		    worth=medelTemp; 
    	   }
    	   if(antalVeckor==1){
    		   System.out.println("F�r veckan "+ antalVeckor+" �r detta "+s+"\n"+worth);
    	   }else if (antalVeckor>1){
       System.out.println("F�r antalet veckor "+ antalVeckor+" �r detta "+s+"\n"+worth);
    	   }
       }
       }
       }  
