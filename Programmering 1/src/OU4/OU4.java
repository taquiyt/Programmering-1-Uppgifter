import java.util.*;    // Scanner 
import tjava.*;

	import static java.lang.System.out; 
public class OU4 {
	 
 
		public static void main (String[] args)
		{        
			out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");  
	        // mata in två naturliga heltal      
			Scanner    in = new Scanner (System.in);    
			out.println ("två naturliga heltal:");       
			String    tal1 = in.next ();        
			String    tal2 = in.next ();       
			out.println ();
			
			
			out.println();
	        // addera heltalen och visa resultatet   
			String 	summa = subtrahera (tal1, tal2); 
			visa(tal1,tal2,summa,'-');
	        // subtrahera heltalen och visa resultatet   
			// koden här   
			out.println();
	        // addera heltalen och visa resultatet   
			 	summa = addera (tal1, tal2); 
			visa(tal1,tal2,summa,'+');
			System.out.println("BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!!!!!!!!!!!!!!!!!1");
			}  
	    // addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras  
		// summa som en teckensträng.    
		public static String addera (String tal1, String tal2)
		{      
			
			int[] arraytal1;
			int[] arraytal2;
			
			int carry=0;
			int[] resultat;
			int test3;
			String a_char,a_char2;
			//char tal1pos, tal2pos;
			// koden ska skrivas här  
			if(tal1.length()>tal2.length())//ifall tal1 är större så är även 
				//längre
			{
				resultat=new int[tal1.length()+1];
				arraytal1=new int[tal1.length()];
				arraytal2=new int[tal1.length()];
				test3=tal1.length()-tal2.length();
				//resultat kan maximalt bli lika långt som talet plus ett tecken
				//array 1 måste bli lika långt som tal1 och array2 måste bli lika lång tal2
				
				for(int counter=0; counter<tal1.length();counter++)
				{
					//tal1pos=tal1.charAt(counter);
					//tal2pos=tal2.charAt(counter);
					a_char = Character.toString(tal1.charAt(counter));
					arraytal1[counter]=Integer.parseInt(a_char);
					//Så denna for-loop tar itu med skit
					//Den stoppar in det första siffran som ett string
					//sedan överförs det som en integer på första platsen för tal1
					
					
					
				}
				for(int counter=0; counter<tal2.length();counter++)
				{
					a_char2=Character.toString(tal2.charAt(counter));
					if(counter<tal2.length())//Resten
					arraytal2[test3+counter]=Integer.parseInt(a_char2);
					//Det denna gör är att den tar hänsyn till position vi sitter i
					//denna kommer alltså gå igenom if satsen om counter är mindre än
				}
				
			}
			else
			{
				resultat=new int[tal2.length()+1];
				arraytal1=new int[tal2.length()];
				arraytal2=new int[tal2.length()];
				test3=tal2.length()-tal1.length();
				
				for(int counter=0; counter<tal1.length();counter++)
				{
					//tal1pos=tal1.charAt(counter);
					//tal2pos=tal2.charAt(counter);
					a_char = Character.toString(tal1.charAt(counter));
					if(counter<tal1.length())
					arraytal1[test3+counter]=Integer.parseInt(a_char);
					}
				
				for(int counter=0; counter<tal2.length();counter++)
				{
					a_char2=Character.toString(tal2.charAt(counter));
					arraytal2[counter]=Integer.parseInt(a_char2);
				}
				
			}
			
			
			
			
			
			
			for(int counter=1;counter<resultat.length;counter++)
			{
				int  modulotest=((arraytal1[arraytal1.length-counter]+arraytal2[arraytal2.length-counter])+carry);
					if( 10<=modulotest)
						
					{//tänk antingen först karaktären är 1
						//eller tänk dig att det finns två karaktärer
				
						resultat[resultat.length-counter]=((arraytal1[arraytal1.length-counter]+arraytal2[arraytal2.length-counter]+carry)%10); //sista element//
						carry=1;
						if (counter==resultat.length-1);
						resultat[0]=carry;
				
					}
					else
					{
				
						resultat[resultat.length-counter]=((arraytal1[arraytal1.length-counter]+arraytal2[arraytal2.length-counter]+carry)%10);
						carry=0;
						if (counter==resultat.length-1);
						resultat[0]=0;
					}
				
			
			
			
			//Vi ska skapa en array som håller talen sedan så skriver vi ut dem
			//först och främst måste koden ta in två string och separera talen
			
		}  
			//String.setCharAt(int,char);
			//String.append(String);
			//s.insert(plats index, String);
			//String.hasNext();
			//hasNextInt();
			
			
			 // StringBuilder sbfNumbers = new StringBuilder();
              
              //define the separator you want in the string. This example uses space.
              String strSeparator ="";
             
       
              //finally convert StringBuffer to String using toString method
              
             
              /*
               * Second options is to use Arrays class as given below.
               * Use Arrays.toString method to convert int array to String.
               *
               * However, it will return String like [1, 2, 3, 4, 5]
               */
             
              String strNumbers = Arrays.toString(resultat);
             
              //you can use replaceAll method to replace brackets and commas
              strNumbers = strNumbers.replaceAll(",", strSeparator).replace("[","").replace("]","").replaceAll("\\s+","");
             
              
              
              if(resultat[0]==0)
              {
            	 strNumbers= removeCharAt(strNumbers,0);
              }
            	  
            	  
              return strNumbers;
              
		}

			
			
			
		
		
	    // subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar   
		// deras differens som en teckensträng.  
		// Det första heltalet är inte mindre än det andra heltalet.  
		public static String subtrahera (String tal1, String tal2) {   int[] arraytal1;
		int[] arraytal2;
		
		int[] resultat;
		int test3;
		String a_char,a_char2;
		//char tal1pos, tal2pos;
		// koden ska skrivas här  
		if(tal1.length()>tal2.length())//ifall tal1 är större så är även 
			//längre
		{
			resultat=new int[tal1.length()+1];
			arraytal1=new int[tal1.length()];
			arraytal2=new int[tal1.length()];
			test3=tal1.length()-tal2.length();
			//resultat kan maximalt bli lika långt som talet plus ett tecken
			//array 1 måste bli lika långt som tal1 och array2 måste bli lika lång tal2
			
			for(int counter=0; counter<tal1.length();counter++)
			{
				//tal1pos=tal1.charAt(counter);
				//tal2pos=tal2.charAt(counter);
				a_char = Character.toString(tal1.charAt(counter));
				arraytal1[counter]=Integer.parseInt(a_char);
				//Så denna for-loop tar itu med skit
				//Den stoppar in det första siffran som ett string
				//sedan överförs det som en integer på första platsen för tal1
				
				
				
			}
			for(int counter=0; counter<tal2.length();counter++)
			{
				a_char2=Character.toString(tal2.charAt(counter));
				if(counter<tal2.length())//Resten
				arraytal2[test3+counter]=Integer.parseInt(a_char2);
				//Det denna gör är att den tar hänsyn till position vi sitter i
				//denna kommer alltså gå igenom if satsen om counter är mindre än
			}
			
		}
		else
		{
			resultat=new int[tal2.length()+1];
			arraytal1=new int[tal2.length()];
			arraytal2=new int[tal2.length()];
			test3=tal2.length()-tal1.length();
			
			for(int counter=0; counter<tal1.length();counter++)
			{
				//tal1pos=tal1.charAt(counter);
				//tal2pos=tal2.charAt(counter);
				a_char = Character.toString(tal1.charAt(counter));
				if(counter<tal1.length())
				arraytal1[test3+counter]=Integer.parseInt(a_char);
				}
			
			for(int counter=0; counter<tal2.length();counter++)
			{
				a_char2=Character.toString(tal2.charAt(counter));
				arraytal2[counter]=Integer.parseInt(a_char2);
			}
			
		}
		
		
		
		
		
		
		for(int counter=1;counter<resultat.length;counter++)
		{
			int  modulotest=((arraytal1[arraytal1.length-counter]-arraytal2[arraytal2.length-counter]));
				if(modulotest<0)
					{//tänk antingen först karaktären är 1
					//eller tänk dig att det finns två karaktärer
					
					arraytal1[arraytal1.length-counter-1]=arraytal1[arraytal1.length-counter-1]-1;
					int tacarry=arraytal1[arraytal1.length-counter]+10;
					resultat[resultat.length-counter]=(tacarry-arraytal2[arraytal2.length-counter]); //sista element//
						}
				else
				{
			
					resultat[resultat.length-counter]=((arraytal1[arraytal1.length-counter]-arraytal2[arraytal2.length-counter]));
				}
			
		
		
		
		//Vi ska skapa en array som håller talen sedan så skriver vi ut dem
		//först och främst måste koden ta in två string och separera talen
		
	}  
		//String.setCharAt(int,char);
		//String.append(String);
		//s.insert(plats index, String);
		//String.has11111111Next();
		//hasNextInt();
		
		  StringBuffer sbfNumbers = new StringBuffer();
          
          //define the separator you want in the string. This example uses space.
          String strSeparator =""; 
          //finally convert StringBuffer to String using toString method
          
         
          /*
           * Second options is to use Arrays class as given below.
           * Use Arrays.toString method to convert int array to String.
           *
           * However, it will return String like [1, 2, 3, 4, 5]
           */
         
          String strNumbers = Arrays.toString(resultat);
         
          //you can use replaceAll method to replace brackets and commas
          strNumbers = strNumbers.replaceAll(",", strSeparator).replace("[","").replace("]","").replaceAll("\\s+","");
         
          if(tal1.length()==1&&tal2.length()==1){
        			  strNumbers= removeCharAt(strNumbers, 0);
        		  }
        	  else{
          
        	  if(resultat[0]==0&&resultat[1]==0)
        	  {
        		  strNumbers= removeCharAt(strNumbers,0);
        		  strNumbers= removeCharAt(strNumbers,0);
        	 
        	  }else if(resultat[0]==0){
        		  strNumbers= removeCharAt(strNumbers,0);
        		  }else if(((tal1.length()==1)&&(tal2.length()==1))){
        			  
        		  }};
        	  
        	
          
          return strNumbers;  
			
			
			
			// koden ska skrivas här    
			}  
	    // visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation 
		// utförd i samband med hetalen 
		public static void visa (String tal1, String tal2, String resultat, char operator)
		{   
			// sätt en lämplig längd på heltalen och resultatet       
			int    len1 = tal1.length ();       
			int    len2 = tal2.length ();      
			int    len  = resultat.length ();   
			int    maxLen = Math.max (Math.max (len1, len2), len);     
			tal1 = sattLen (tal1, maxLen - len1); 
	        tal2 = sattLen (tal2, maxLen - len2);     
	        resultat = sattLen (resultat, maxLen - len);  
	        // visa heltalen och resultatet       
	        out.println ("  " + tal1);  
	        out.println ("" + operator + " " + tal2);       
	        for (int i = 0; i < maxLen + 2; i++)       
	        	out.print ("-");     
	        out.println ();   
	        out.println ("  " + resultat + "\n");
	          
	        
	    // sattLen lägger till ett angivet antal mellanslag i början av en given sträng 
	        }
		
		public static String sattLen (String s, int antal) 
		{         StringBuilder  sb = new StringBuilder (s);  
		for (int i = 0; i < antal; i++) 
			sb.insert (0, " ");  
     
		return sb.toString (); 
		}
		
		public static String removeCharAt(String s, int pos) 
		{
		      return s.substring(0, pos) + s.substring(pos + 1);
		      }
} 


