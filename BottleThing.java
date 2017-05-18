
public class BottleThing{
	public static void main(String[] args){
		int BeerNum = 99;
		String word = " Bottles";
		while (BeerNum > 0) {
			if (BeerNum == 1)
			{
				word = "Bottle";
				}
			if (BeerNum > 0){
			System.out.println(BeerNum+ "" +word + " of beer on the wall");
			System.out.println(BeerNum + ""+ word + " of beer on the wall");
			System.out.println(BeerNum + "" + word + " of beer");
			System.out.println("Take one down. ");
			System.out.println(" Pass it around");
			BeerNum = BeerNum-1;
			}
			else { 
				System.out.println("No more bottles of beer on the wall");
			}
					
		}
	}
}