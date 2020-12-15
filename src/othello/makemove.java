package othello;

import java.awt.Color;

public class makemove {

	private int[][] board;
	//char player1Char='O';
	//char player2Char='X';
	public static final int PLAYER1WON = 1;
	public static final int PLAYER2WON = 2;
	public static final int NOT_FINISHED = 0;
	public static final int DRAW = 3;
	public static final int invalid_move = 4;
	public static final int valid_move = 5;
	
	public makemove()
	{
		board = new int[8][8];
		for (int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				board[i][j] = 0;
			}
		}
		board [3][3]=1;
		board [3][4]=2;
		board [4][3]=2;
		board [4][4]=1;
		
	}
	public  int getGameStatus()
	{
		int one=0,two=0,flag=0;
		for (int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {

				if(board[i][j] == 0) {					
					flag=1;
					
				}
			    if(board[i][j] == 1)
					one++;
				else if(board[i][j] == 2)
					two++;
			}
		
		}
		
		if(one==0&&two!=0)
			{
				return PLAYER2WON;
			}
			else if(one==two&&flag==0)
				return DRAW;
			else if(one!=0&&two==0)
				return PLAYER1WON;
		
		return NOT_FINISHED;
	}

	
	
	public  Pair<Integer> move(int playernumber,int x,int y)
	{
		int a[]={1,1,1,0,0,-1,-1,-1};
		int b[]={1,0,-1,1,-1,1,0,-1};
		Pair <Integer>p=new Pair<>();
		if(board[x][y]==0)
		{			
		for(int k=0;k<a.length;k++)
			{
				for(int i=x,j=y;;i=i+a[k], j=j+b[k])
				{
					if(i+a[k]>=7)
						break;
					if(j+b[k]>=7)
						break;
					if(i+a[k]<1)
						break;
					if(j+b[k]<1)
						break;
					if(board[x+a[k]][y+b[k]]==playernumber||board[x+a[k]][y+b[k]]==0)
						break;
					if(board[i+a[k]][j+b[k]]!=playernumber&&board[i+a[k]][j+b[k]]!=0)
					{
						if(board[i+2*a[k]][j+2*b[k]]!=playernumber)
							continue;
						if(board[i+2*a[k]][j+2*b[k]]==playernumber)
						{
							p.x=a[k];
							p.y=b[k];
							p.check=valid_move;
							board=changeboard(board,x, y, a[k],b[k],playernumber);
							return p;
						}
					}						
				}
			}
		}
		return p;
	}
	public int[][] changeboard(int board[][],int x,int y,int a,int b,int playernumber )
	{
		for(int i=x,j=y;;i=i+a,j=j+b)
		{
			board[x][y]=playernumber;
			if(i+a>=7)
				break;
			if(j+b>=7)
				break;
			if(i+a<2)
				break;
			if(j+a<2)
				break;
			if(board[i][j]==0)
			{
				break;
			}
			board[i][j]=playernumber;			
		}
		return board;
	}

}
