import java.util.Scanner;
public class ArrayPlug3TicTackToe {
	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner input = new Scanner(System.in);
		initBoard();
		int player=0;
		
		int tiles=9;
		
		
		while(tiles>0){
			tiles=9;
			for(int counter1=0;counter1<3;counter1++)
			{
				for(int counter2=0;counter2<3;counter2++)
				{
					if(board[counter1][counter2]=='O'||board[counter1][counter2]=='X')
					{
						tiles=tiles-1;
					}
				}
					
			}
			
			if(player%2==0)
			{
				displayBoard();
				System.out.println("X, it is your turn!\n pick a poistion");
				int columnx=input.nextInt();
				int columny=input.nextInt();			
				board[columnx][columny]='X';
				player++;
			}
			else if(player%2==1)
			{
				displayBoard();
				System.out.println("O, it is your turn!\n pick a poistion");
				int columnx=input.nextInt();
				int columny=input.nextInt();			
				board[columnx][columny]='O';
				player++;
			}
			
			if(board[0][0]=='X' && board[1][0]=='X'&&board[2][0]=='X')
			{
				System.out.println("X, you won!, Congrats!");
				
				
			}
			
		}
		

	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
		}
	
}
	

	
		


