import java.util.Arrays;

public class Polylinje {   
	private Punkt[]    horn;   
	private String     farg = "svart"; 
	private int        bredd = 1;  
    public Polylinje ()   
    { 
    	this.horn = new Punkt[0];   
    	}  
    public Polylinje (Punkt[] horn)  
    {         
    	this.horn = new Punkt[horn.length];        
    	for (int i = 0; i < horn.length; i++)           
    		this.horn[i] = new Punkt (horn[i]); 
    	
    	//så vad är problemet är att jag inte dog och skapade en punkt. 
    	//this seems stupid
    	
    	}  
    public String toString () 
    {
    
    	return String.format("%s %s %s",Arrays.toString(horn),farg, bredd);
    }  
    public Punkt[] getHorn ()
    {
    	
    	Punkt[] siffra= new Punkt[this.horn.length];
    	for(int counter=0; counter<this.horn.length;counter++)
    	siffra[counter] = new Punkt(horn[counter]);
    	
    	return siffra;
    }  
    public String getFarg ()
    {
    	return farg;
    }  
    public int getBredd () 
    {
    	return bredd;
    }  
    public void setFarg (String Farg)
    {
    	this.farg=Farg;
    }  
    public void setBredd (int bredd) 
    {
    	this.bredd=bredd;
    }  
    public double langd (Punkt[] allahorn) 
    {
    	double längd =0;
    	for(int counter=1; counter<=allahorn.length;counter++)
    	{
    		
    		längd+=allahorn[counter-1].avstand(allahorn[counter]);
    	}
    	return längd;
    }  
    public void laggTill (Punkt horn)     {      
    	Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0;
        for (i = 0; i < this.horn.length; i++) 
        	h[i] = this.horn[i];     
        h[i] = new Punkt (horn);  
        this.horn = h;   
        }  
    public void laggTillFramfor (Punkt horn, String hornNamn) {
    	Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0;
        for (i = 0; i < this.horn.length; i++)
        {
        	
        	if(this.horn[i].getName()==hornNamn)
        	{
        		
        	h[i] = new Punkt (horn);
        	 	
            }
        	if(h[i]==null)
        	{
        	h[i] = this.horn[i];
        	}
        	else
        	{
        		h[i+1]=this.horn[i];
        	}
        	
        
        
        }
        
        
        this.horn = h; 
    }  
    public void taBort (String hornNamn) {
    	Punkt[]    h = new Punkt[this.horn.length-1]; 
        int    i = 0;
        for (i = 0; i < h.length; i++) {
        	if(this.horn[i].getName()==hornNamn){
        		for(int counter=i; counter<h.length;counter++)
        		{
        		h[counter]=this.horn[counter+1];
        		
        		
        			
        		
        			
        		}
        		break;
        		
        		
        		
        		
        	}else{
        		h[i] = this.horn[i];
        	}
        	
        	
        	
        }
        	
        
        this.horn = h; 
    	
    } public class PolylinjeIterator { 
    	private int    aktuell = -1;  
    	
    public PolylinjeIterator ()  
    {     
    	if (Polylinje.this.horn.length > 0)    
    		aktuell = 0;     
    	
    }       
    public boolean finnsHorn ()    
    {       
    	return aktuell != -1;    
    	}  
    public Punkt horn () throws java.util.NoSuchElementException   
    {    
    	if (!this.finnsHorn ())   throw new java.util.NoSuchElementException() ;
        Punkt    horn = Polylinje.this.horn[aktuell];  
        return horn;    
        
    }  
    public void gaFram ()    
    {
    	if (aktuell >= 0  &&   aktuell < Polylinje.this.horn.length - 1)       
    		aktuell++;        
    	else            
    		aktuell = -1;    
    } 
    
    } 
    
}  

