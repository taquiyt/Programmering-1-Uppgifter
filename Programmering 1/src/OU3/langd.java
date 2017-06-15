
public class langd {
	public static int[] mellanstationer (double[] a, double[][] b, double[] c)     
	{  
		         
			
			
			int[] index = new int[3];
			double summa=a[1]+b[1][1]+c[1];
			index[1]=1;
			index[2]=1;
			
			
			
			for(int counter =1; counter<a.length; counter++)
			{
				for(int secondcounter=1;secondcounter<c.length; secondcounter++)
				{
					double temp=a[counter]+b[counter][secondcounter]+c[secondcounter];
					if(summa >temp)
					{
							summa= temp;
							index[1] =counter;
							index[2] =secondcounter;
					
					}
				
				
			}
				
		}
			
			return index;
		}
		
		    // langd returnerar längden av den kortaste vägen.    

	public static double langd (double[] a, double[][] b, double[] c)     
	{        
		
		int[] index1=mellanstationer(a, b, c);
		
		
		
		double summa=a[index1[1]]+b[index1[1]][index1[2]]+c[index1[2]];
		
		return summa;
		
	}

}
