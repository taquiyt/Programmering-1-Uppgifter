import java.util.*;    // Scanner 
import tjava.*;

	import static java.lang.System.out; 
public class OU4 {
	 
 
		public static void main (String[] args)
		{        
			out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");  
	        // mata in tv� naturliga heltal      
			Scanner    in = new Scanner (System.in);    
			out.println ("tv� naturliga heltal:");       
			String    tal1 = in.next ();        
			String    tal2 = in.next ();       
			out.println ();
			
			
			out.println();
	        // addera heltalen och visa resultatet   
			String 	summa = subtrahera (tal1, tal2); 
			visa(tal1,tal2,summa,'-');
	        // subtrahera heltalen och visa resultatet   
			// koden h�r   
			out.println();
	        // addera heltalen och visa resultatet   
			 	summa = addera (tal1, tal2); 
			visa(tal1,tal2,summa,'+');
			System.out.println("BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM!!!!!!!!!!!!!!!!!!!!1");
			}  
	    // addera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar deras  
		// summa som en teckenstr�ng.    
		public static String addera (String tal1, String tal2)
		{      
			
			int[] arraytal1;
			int[] arraytal2;
			
			int carry=0;
			int[] resultat;
			int test3;
			String a_char,a_char2;
			//char tal1pos, tal2pos;
			// koden ska skrivas h�r  
			if(tal1.length()>tal2.length())//ifall tal1 �r st�rre s� �r �ven 
				//l�ngre
			{
				resultat=new int[tal1.length()+1];
				arraytal1=new int[tal1.length()];
				arraytal2=new int[tal1.length()];
				test3=tal1.length()-tal2.length();
				//resultat kan maximalt bli lika l�ngt som talet plus ett tecken
				//array 1 m�ste bli lika l�ngt som tal1 och array2 m�ste bli lika l�ng tal2
				
				for(int counter=0; counter<tal1.length();counter++)
				{
					//tal1pos=tal1.charAt(counter);
					//tal2pos=tal2.charAt(counter);
					a_char = Character.toString(tal1.charAt(counter));
					arraytal1[counter]=Integer.parseInt(a_char);
					//S� denna for-loop tar itu med skit
					//Den stoppar in det f�rsta siffran som ett string
					//sedan �verf�rs det som en integer p� f�rsta platsen f�r tal1
					
					
					
				}
				for(int counter=0; counter<tal2.length();counter++)
				{
					a_char2=Character.toString(tal2.charAt(counter));
					if(counter<tal2.length())//Resten
					arraytal2[test3+counter]=Integer.parseInt(a_char2);
					//Det denna g�r �r att den tar h�nsyn till position vi sitter i
					//denna kommer allts� g� igenom if satsen om counter �r mindre �n
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
						
					{//t�nk antingen f�rst karakt�ren �r 1
						//eller t�nk dig att det finns tv� karakt�rer
				
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
				
			
			
			
			//Vi ska skapa en array som h�ller talen sedan s� skriver vi ut dem
			//f�rst och fr�mst m�ste koden ta in tv� string och separera talen
			
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

			
			
			
		
		
	    // subtrahera tar emot tv� naturliga heltal givna som teckenstr�ngar, och returnerar   
		// deras differens som en teckenstr�ng.  
		// Det f�rsta heltalet �r inte mindre �n det andra heltalet.  
		public static String subtrahera (String tal1, String tal2) {   int[] arraytal1;
		int[] arraytal2;
		
		int[] resultat;
		int test3;
		String a_char,a_char2;
		//char tal1pos, tal2pos;
		// koden ska skrivas h�r  
		if(tal1.length()>tal2.length())//ifall tal1 �r st�rre s� �r �ven 
			//l�ngre
		{
			resultat=new int[tal1.length()+1];
			arraytal1=new int[tal1.length()];
			arraytal2=new int[tal1.length()];
			test3=tal1.length()-tal2.length();
			//resultat kan maximalt bli lika l�ngt som talet plus ett tecken
			//array 1 m�ste bli lika l�ngt som tal1 och array2 m�ste bli lika l�ng tal2
			
			for(int counter=0; counter<tal1.length();counter++)
			{
				//tal1pos=tal1.charAt(counter);
				//tal2pos=tal2.charAt(counter);
				a_char = Character.toString(tal1.charAt(counter));
				arraytal1[counter]=Integer.parseInt(a_char);
				//S� denna for-loop tar itu med skit
				//Den stoppar in det f�rsta siffran som ett string
				//sedan �verf�rs det som en integer p� f�rsta platsen f�r tal1
				
				
				
			}
			for(int counter=0; counter<tal2.length();counter++)
			{
				a_char2=Character.toString(tal2.charAt(counter));
				if(counter<tal2.length())//Resten
				arraytal2[test3+counter]=Integer.parseInt(a_char2);
				//Det denna g�r �r att den tar h�nsyn till position vi sitter i
				//denna kommer allts� g� igenom if satsen om counter �r mindre �n
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
					{//t�nk antingen f�rst karakt�ren �r 1
					//eller t�nk dig att det finns tv� karakt�rer
					
					arraytal1[arraytal1.length-counter-1]=arraytal1[arraytal1.length-counter-1]-1;
					int tacarry=arraytal1[arraytal1.length-counter]+10;
					resultat[resultat.length-counter]=(tacarry-arraytal2[arraytal2.length-counter]); //sista element//
						}
				else
				{
			
					resultat[resultat.length-counter]=((arraytal1[arraytal1.length-counter]-arraytal2[arraytal2.length-counter]));
				}
			
		
		
		
		//Vi ska skapa en array som h�ller talen sedan s� skriver vi ut dem
		//f�rst och fr�mst m�ste koden ta in tv� string och separera talen
		
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
			
			
			
			// koden ska skrivas h�r    
			}  
	    // visa visar tv� givna naturliga heltal, och resultatet av en aritmetisk operation 
		// utf�rd i samband med hetalen 
		public static void visa (String tal1, String tal2, String resultat, char operator)
		{   
			// s�tt en l�mplig l�ngd p� heltalen och resultatet       
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
	          
	        
	    // sattLen l�gger till ett angivet antal mellanslag i b�rjan av en given str�ng 
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


