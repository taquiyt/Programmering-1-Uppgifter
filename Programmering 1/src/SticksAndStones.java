import java.util.Scanner;
import java.util.Random;
public class SticksAndStones {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random RNG=new Random();
		//Grund saker, efter detta börjar spelet
		System.out.print("Player 1, Enter your name:");
		String name1=input.next();
		System.out.print("\nPlayer 2, enter your name:");
		String name2=input.next();
		int A=1+RNG.nextInt(10);
		int B=1+RNG.nextInt(10);
		int C=1+RNG.nextInt(10);
		int counter=0;
		int cheat1=0, cheat2=0, cheat3=0;
		System.out.println("A:"+A +"\t" +"B:"+B+"\t"+"C:"+C);
		while(A+B+C!=0){
			if (counter%2==0){
			System.out.print("\n"+name1+" "+ "your turn! Pick a Pile:");
			String name1pick=input.next();
			if (name1pick.equals("A")&&A!=0){
				System.out.print("\nHow many do you want to remove from " +name1pick +": ");
				int name1stickpick=input.nextInt();
				
				A-=name1stickpick;
				
				if(A<0){
					System.out.println("You can't put make it negative!");
					counter++;
					A+=name1stickpick;
				}else if(A==0){
					cheat1=1;
				}
			}else if(name1pick.equals("B")&&B!=0){
				System.out.print("\nHow many do you want to remove from " +name1pick+": ");
				int name1stickpick=input.nextInt();
				B-=name1stickpick;
				
				if(B<0){
					System.out.println("You can't put negative numbers!");
					counter++;
					B+=name1stickpick;
					
				}else if(B==0){
					cheat2=1;
				}
				}else if(name1pick.equals("C")&&C!=0){
					System.out.print("\nHow many do you want to remove from " +name1pick+": ");
					int name1stickpick=input.nextInt();
					
					C-=name1stickpick;
					if(C<0){
						System.out.println("You can't put negative numbers!");
						counter++;
						C+=name1stickpick;
						
					}else if(C==0){
						cheat3=1;
					}
				}
			
			}
			if(counter%2==1){
				System.out.print("\n"+" "+name2+ " your turn! Pick a Pile:");
				String name1pick=input.next();
				if (name1pick.equals("A")&&A!=0){
					System.out.print("\nHow many do you want to remove from " +name1pick+": ");
					int name1stickpick=input.nextInt();
					
					A-=name1stickpick;
					if(A<0){
						System.out.println("You can't put make it negative!");
						counter++;
						A+=name1stickpick;
					}else if(A==0){
						cheat1=1;
					}
				}else if(name1pick.equals("B")&&B!=0){
					System.out.print("\nHow many do you want to remove from " +name1pick+": ");
					int name1stickpick=input.nextInt();
					
					B-=name1stickpick;
					if(B<0){
						System.out.println("You can't put negative numbers!");
						counter++;
						B+=name1stickpick;
					}else if(B==0){
						cheat2=1;
					}
					}else if(name1pick.equals("C")&&C!=0){
						System.out.print("\nHow many do you want to remove from " +name1pick+": ");
						int name1stickpick=input.nextInt();
						if(C<0){
							System.out.println("You can't put negative numbers!");
							counter++;
							C+=name1stickpick;
						}else if(C==0){
							cheat3=1;
						}
						C-=name1stickpick;
						}
				if(A==0 && name1pick.equals("A")&& cheat1==1){
					System.out.println(counter%2==0?"Nice Try "+name1+" ! ":"");
					System.out.println(counter%2==1? "Nice Try "+ name2 + " ! ": " ");
					counter++;
				}else if(B==0 && name1pick.equals("B")&&cheat2==1){
					System.out.println(counter%2==0?"Nice Try "+name1+" ! ":" " );
					System.out.println(counter%2==1? "Nice Try "+ name2 + " ! ": " ");
					counter++;
				}else if(C==0 && name1pick.equals("C")&&cheat3==1){
					System.out.println(counter%2==0?"Nice Try "+name1+" ! ":" " );
					System.out.println(counter%2==1? "Nice Try "+ name2 + " ! ": " ");
					counter++;
				}
				
			}
			
			counter++;
			System.out.println("A:"+A +"\t" +"B:"+B+"\t"+"C:"+C);
		}
		
		if(A==0 && B==0 && C==0 && counter%2==0){
			System.out.println(name1+" Is the winner!");
			
		}else if (A==0 && B==0 && C==0 && counter%2==1){
			System.out.println(name2+" Is the Winner!");
			
		}
		
		
		
	}
}
