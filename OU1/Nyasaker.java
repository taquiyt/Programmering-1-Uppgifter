import java.util.*;     // Scanner, Locale


class Nyasaker {
    public static void main (String[] args){
    System.out.println ("TEMPERATURER\n");  // inmatningsverktyg
    Scanner    in = new Scanner (System.in);
    in.useLocale (Locale.US);  // mata in uppgifter om antalet veckor och antalet mätningar
     System.out.print ("antalet veckor: ");
     int    antalVeckor  = in.nextInt ();
     System.out.print ("antalet mätningar per vecka: ");
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
        // den minsta, den största och medeltemperaturen – veckovis
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
        	System.out.println("Detta är minsta temperaturen för vecka "+tempv);
        	System.out.println(minT[tempv]);
        	System.out.println("Detta är den Högsta temperaturen för vecka "+tempv);
        	System.out.println(maxT[tempv]);
        	System.out.println("Detta är den sammanlagda temperaturen för vecka "+tempv);
        	System.out.println(sumT[tempv]);
        	System.out.println("Detta är den medeltemperaturen för vecka "+tempv);
        	System.out.println(medelT[tempv]+"\n\n\n");
        	}
        
        
        // koden ska skrivas här
       // visa den minsta, den största och medeltemperaturen för varje vecka  
        // koden ska skrivas här
       // den minsta, den största och medeltemperaturen - hela mätperioden
       double    minTemp = minT[1];
       double    maxTemp = maxT[1];
       double    sumTemp = sumT[0];
       double    medelTemp = 0;         // koden ska skrivas här
       // visa den minsta, den största och medeltemperaturen i hela mätperioden         // koden ska skrivas här
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
    		    s= "Medelvärdet av temperaturerna";
    		    worth=medelTemp; 
    	   }
    	   if(antalVeckor==1){
    		   System.out.println("För veckan "+ antalVeckor+" är detta "+s+"\n"+worth);
    	   }else if (antalVeckor>1){
       System.out.println("För antalet veckor "+ antalVeckor+" är detta "+s+"\n"+worth);
    	   }
       }
       }
       }  
