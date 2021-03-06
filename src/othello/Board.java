package othello;

public class Board {
	private char[][] board;
	char player1Char='0';
	char player2Char='*';
//	Pair <Character,Boolean> p=new Pair<Character,Boolean>(player1Char, true);
	public static final int PLAYER1WON = 1;
	public static final int PLAYER2WON = 2;
	public static final int NOT_FINISHED = 0;
	public static final int DRAW = 3;
	
	public Board() {
		board = new char[3][3];
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		
	}
//	
//	public void print() {
//		for (int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.print(board[i][j] + "|");
//			}
//			System.out.println();
//			System.out.println("--------------");
//		}
//	}

//	public Pair<Character,Boolean> makeAMove(int x, int y, char symbol) {
//		if (symbol != player1Char && symbol != player2Char) {
//			p.data1=symbol;
//			p.data2=false;
//			return p ;
//		}
//		
//		if (x < 0 || x >2 || y < 0 || y > 2 || board[x][y] != ' ') {
//			p.data1=symbol;
//			p.data2=false;
//			return p;
//		}
//		
//		board[x][y] = symbol;
//		p.data1=symbol;
//		p.data2=true;
//		return p;
//	}

	public void insert(int x,int y,char symbol)
	{
		board[x][y]=symbol;
	}
	public int getGameStatus() {
		for (int i = 0; i < 3; i++) {
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
				if (board[i][0] == player1Char) {
					return PLAYER1WON;
				} else if (board[i][0] == player2Char) {
					return PLAYER2WON;
				}
			}
		}
		
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
				if (board[0][j] == player1Char) {
					return PLAYER1WON;
				} else if (board[0][j] == player2Char) {
					return PLAYER2WON;
				}
			}
		}
		
		if (board[2][0] == board[1][1] && board[2][0] == board[0][2]) {
			if (board[2][0] == player1Char) {
				return PLAYER1WON;
			} else if (board[2][0] == player2Char) {
				return PLAYER2WON;
			}
		}
		
		if (board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
			if (board[0][0] == player1Char) {
				return PLAYER1WON;
			} else if (board[0][0] == player2Char) {
				return PLAYER2WON;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == ' ') {
					return NOT_FINISHED;
				}
			}
		}
		return DRAW;
	}
}
