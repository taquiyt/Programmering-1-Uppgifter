

	import java.util.Arrays;

public class Polylinje1 {   
	private Punkt[]    horn;   
	private String     farg = "svart"; 
	private int        bredd = 1;  
	
    public Polylinje1 ()   
    { 
    	
    	this.horn = new Punkt[0];   
    	}  
    public Polylinje1 (Punkt[] horn)  
    {         
    	           
    		this.horn =horn; 
    	//här tas bara referensen och kopieras till horn. 
    }  
    public String toString () 
    {
    
    	return String.format("%s %s %s",Arrays.toString(horn),farg, bredd);
    }  
    public Punkt[] getHorn ()
    {
    	
    	
    	
    	return horn;
    }  
    public String getFarg ()
    {
    	
    	return farg;
    }  
    public int getBredd () 
    {
    	return bredd;
    }  
    public void setFarg (String farg)
    {
    	this.farg=farg;
    }  
    public void setBredd (int bredd) 
    {
    	this.bredd=bredd;
    }  
    public double langd () 
    {
    	double längd =0;
    	for(int counter=1; counter<this.horn.length;counter++)
    	{
    		
    		längd+=this.horn[counter-1].avstand(this.horn[counter]);
    	}
    	return längd;
    }  
    public void laggTill (Punkt horn)     {      
    	Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0;
        for (i = 0; i < this.horn.length; i++) 
        	h[i] = this.horn[i];     
        h[i] = horn;  
        this.horn = h;   
        }  
    public void laggTillFramfor (Punkt horn, String hornNamn) {
    	Punkt[]    h = new Punkt[this.horn.length + 1]; 
        int    i = 0;
        for (i = 0; i < this.horn.length; i++)
        {
        	
        	if(this.horn[i].getName()==hornNamn)
        	{
        		
        	h[i] =  horn;
        	 	
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
    	if (Polylinje1.this.horn.length > 0)    
    		aktuell = 0;     
    	
    }  
    public boolean finnsHorn ()    
    {       
    	return aktuell != -1;    
    	}  
    public Punkt horn () throws java.util.NoSuchElementException   
    {    
    	if (!this.finnsHorn ())   throw new java.util.NoSuchElementException() ;
        Punkt    horn = Polylinje1.this.horn[aktuell];  
        return horn;    
        
    }  
    public void gaFram ()    
    {
    	if (aktuell >= 0  &&   aktuell < Polylinje1.this.horn.length - 1)       
    		aktuell++;        
    	else            
    		aktuell = -1;    
    } 
    
    } 
    	
    }