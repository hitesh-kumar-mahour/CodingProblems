package othello;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import othello.Board;

public class GameManager2 extends JFrame implements ActionListener{
	//your panel have 10 rows
	JPanel[] row = new JPanel[10];
	//your panel have 66 buttons
	JButton[] button = new JButton[66];
	int[] dimW = {400,35,160,90};
	int[] dimH = {45, 35};
	//defining object for dimension
	Dimension displayDimension = new Dimension(dimW[1], dimH[1]);
	Dimension regularDimension = new Dimension(dimW[1], dimH[1]);
	Dimension zeroButDimension = new Dimension(dimW[0], dimH[1]);
	Font font = new Font("Times new Roman", Font.CENTER_BASELINE, 14);

	//constructor for game output interface 
	GameManager2() {

		super("OTHELLO"); 
		setDesign();
		setSize(550,520);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);        
		GridLayout grid = new GridLayout(10,8);
		setLayout(grid);
		FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,12,3);
		FlowLayout f3 = new FlowLayout(FlowLayout.CENTER,12,0);
		for(int i = 0; i < 10; i++) {
			row[i] = new JPanel();
		}

		row[0].setLayout(f3);

		for(int i = 1; i < 9; i++)
			row[i].setLayout(f2);

		row[4].setLayout(f3);
		for(int i = 0; i < 66; i++) {
			button[i] = new JButton();
			button[i].setText("");
			button[i].setFont(font);
			button[i].setFocusable(true);
			button[i].setBackground(Color.blue);
			button[i].addActionListener(this);
		}
		button[28].setBackground(Color.black);
		button[29].setBackground(Color.white);
		button[37].setBackground(Color.black);
		button[36].setBackground(Color.white);
		
		button[0].setBackground(Color.cyan);
		button[65].setBackground(Color.cyan);
		button[0].setFont(font);
		
		button[0].setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		button[0].setPreferredSize(displayDimension);
		for(int i = 1; i < 65; i++)
			button[i].setPreferredSize(regularDimension);
		
		button[65].setPreferredSize(zeroButDimension);
		button[0].setText("START GAME-BLACK's Turn");
		button[0].setPreferredSize(zeroButDimension);

		row[0].add(button[0]);
		add(row[0]);
		
		for(int i = 1; i < 9; i++)
			row[1].add(button[i]);
		add(row[1]);

		for(int i = 9; i < 17; i++)
			row[2].add(button[i]);
		add(row[2]);

		for(int i = 17; i < 25; i++)
			row[3].add(button[i]);
		add(row[3]);
		
		for(int i = 25; i < 33; i++)
			row[4].add(button[i]);
		add(row[4]);

		for(int i = 33; i < 41; i++)
			row[5].add(button[i]);
		add(row[5]);
		
		for(int i = 41; i < 49; i++)
			row[6].add(button[i]);
		add(row[6]);
		
		for(int i = 49; i < 57; i++)
			row[7].add(button[i]);
		add(row[7]);
		
		for(int i = 57; i < 65; i++)
			row[8].add(button[i]);
		add(row[8]);
		row[9].add(button[65]);
		add(row[9]);
		setVisible(true);
	}
	private void setDesign() {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch(Exception e) {   
		}
	}
	
	private static final long serialVersionUID = 1L;
	int flag=0;

	private int getbutton(int x,int y)
	{
	
			return x*8 + y+1 ;	
	}
	private void play(int index,int symbol)
	{
		int x=index/8;
		int y=index%8;
		Pair <Integer> p = b.move(symbol,x,y);
		String currentPlayer="";
		//if(p.check==makemove.valid_move)
		//{
		if (flag==0)
			currentPlayer = "Black";
		else
			currentPlayer = "White";

		button[0].setText(currentPlayer + "'s turn");
		button[65].setText("CONTINUE GAME");
		button[65].setBackground(Color.cyan);
		

		//Pair <Integer> p = b.move(symbol,x,y);
		if(p.check==makemove.invalid_move)
		{
			if(button[index+1].getBackground()==Color.blue)
			button[index+1].setBackground(Color.blue);
			//else if(button[index+1].getBackground()==Color.black)
				//button[index+1].setBackground(Color.white);
			//else if(button[index+1].getBackground()==Color.white)
				//button[index+1].setBackground(Color.black);
			
			button[65].setBackground(Color.red);
			if(flag==0)
			button[65].setText("PLAYER WHITE's MOVE IS LOST");
			else
				button[65].setText("PLAYER BLACK's MOVE IS LOST");
		}
		for(int i=x+p.x,j=y+p.y;p.check==makemove.valid_move;i=i+p.x,j=j+p.y)
		{
			int num=getbutton(i,j);
			
			if(button[num].getBackground()==Color.blue)
			break;
			else if(symbol==1)
				button[num].setBackground(Color.black);
			else
				button[num].setBackground(Color.white);
			if(symbol==1)
				button[getbutton(x,y)].setBackground(Color.black);
			else
				button[getbutton(x,y)].setBackground(Color.white);
				
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameManager2 gm = new GameManager2();
		
	}
	makemove b=new makemove();
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		int status=b.getGameStatus();
		if(status==makemove.NOT_FINISHED)
		{
			for(int i=1;i<65;i++)
			{
				if(ae.getSource() == button[i])
				{			
					if(flag==0)
					{
						flag=1;
						play(i-1,1);
						
					}else
					{
						flag=0;
						play(i-1,2);
					}
				}
			}
		}
	
		status=b.getGameStatus();
		 if (status == Board.PLAYER1WON) {
			button[65].setText("player BLACK won");
			button[0].setText( "game is finished");
			button[65].setBackground(Color.red);
			button[0].setBackground(Color.green);
		}  if (status == Board.PLAYER2WON) {
			button[65].setText("player WHITE won");
			button[0].setText( "game is finished");
			button[65].setBackground(Color.red);
			button[0].setBackground(Color.green);
		}  if (status == Board.DRAW) {
			button[65].setText("GAME DRAW");
			button[0].setText("game is finished ");
			button[65].setBackground(Color.red);
			button[0].setBackground(Color.green);
		}
		
	}
}
