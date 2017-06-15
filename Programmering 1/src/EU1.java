import java.util.*;

public class EU1
{
	
	
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		int[] taqui={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,0,18,19};
		//*for (int counter=0; counter<taqui.length;counter++)
		//{
			//System.out.println("Skriv in element " + counter + " i Taqui");
			//taqui[counter]=input.nextInt();
			
			
		//}
		
		System.out.println (java.util.Arrays.toString (taqui));
		
		
		System.out.println(min(taqui));
		
		
		
	}
	// min returnerar det minsta elementet i en sekventiell samling. // 
	//Om samlingen är tom, kastas ett undantag av typen IllegalArgumentException.
	public static int min (int[] element) throws IllegalArgumentException 
	{    
		if (element.length == 0)        
			throw new IllegalArgumentException ("tom samling");  
	
    // hör ihop med spårutskriften 2:     
		int    antalVarv = 1;  
    int[]    sekvens = element;    
    int      antaletPar = sekvens.length/2;   
    int      antaletOparadeElement = sekvens.length%2;   
    int      antaletTankbaraElement = antaletPar + antaletOparadeElement;   
    int[]    delsekvens = new int[antaletTankbaraElement];  
    int  i = 0;     
    int  j = 0; 
    
    while (antaletTankbaraElement>antaletOparadeElement) 
    
    {   
    	// skilj ur en delsekvens med de tänkbara elementen    
    	i = 0;
    	j = 0;
    	while (j < antaletPar)         
    		
    	{   
    		
    		delsekvens[j++] = (sekvens[i] < sekvens[i + 1])? sekvens[i] : sekvens[i + 1];       
    		i +=2;  
    	System.out.println("detta är delsekvens "+java.util.Arrays.toString (delsekvens));
    	}        
    	if (antaletOparadeElement == 1)         
    		delsekvens[j] = sekvens[i]; 
    	
    
        // utgå nu ifrån delsekvensen       
    	
    	sekvens = delsekvens; 
    	antaletOparadeElement = antaletTankbaraElement%2;  
    	antaletPar = (antaletTankbaraElement/2);      
    	antaletTankbaraElement = antaletPar + antaletOparadeElement; 
    	
        // spårutskrift 1 – för att följa sekvensen 
     
        // spårutskrift 2 - för att avsluta loopen i förväg      
    	// (för att kunna se vad som händer i början)      
    	//if (antalVarv++ == 10)       
     //   System.exit (0);     
    // sekvens[0] är det enda återstående tänkbara elementet    
    	// - det är det minsta elementet
    	
    	System.out.println (java.util.Arrays.toString (sekvens)); 
	}
    	return sekvens[0];//(sekvens[0] < sekvens[1])? sekvens[0] : sekvens[1];
    
	}
}

