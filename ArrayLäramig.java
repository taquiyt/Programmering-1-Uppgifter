
public class ArrayLäramig {
	public static void main(String[] args){
		System.out.println("Index\tValue");
		int Taqui[]= {0,1,2,3,4,5,6,7,8,9};
		
		for (int counter=0; counter<Taqui.length;counter++){
			System.out.println(counter+"\t" + Taqui[counter] +"\t" + Taqui[(Taqui.length/4)]);
		}
	}
}
