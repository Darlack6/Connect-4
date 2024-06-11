import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class mainGame implements ActionListener{
    //Properties
    JFrame theframe = new JFrame();
    playpanel theplay = new playpanel();
    int intUserCol;
    public static String[][] board = new String[6][7];
    String strPlayer = "x";
    Boolean blnWin = false;
    //buttons

    JButton col0 = new JButton("Column 0");
    JButton col1 = new JButton("Column 1");
    JButton col2 = new JButton("Column 2");
    JButton col3 = new JButton("Column 3");
    JButton col4 = new JButton("Column 4");
    JButton col5 = new JButton("Column 5");
    JButton col6 = new JButton("Column 6");

    //Methods
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == col0){
            intUserCol = 0;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        else if(evt.getSource() == col1){
            intUserCol = 1;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        if(evt.getSource() == col2){
            intUserCol = 2;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        if(evt.getSource() == col3){
            intUserCol = 3;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        if(evt.getSource() == col4){
            intUserCol = 4;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        if(evt.getSource() == col5){
            intUserCol = 5;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
        if(evt.getSource() == col6){
            intUserCol = 6;
            board = placeMove(intUserCol, board, strPlayer);
            blnWin = winCheck(board, strPlayer);
            
            for(int intRow=0;intRow<6;intRow++){
                for(int intCol=0;intCol<7;intCol++){
                    System.out.print(board[intRow][intCol]);
                }
                System.out.println("\n");
            }
            System.out.println(blnWin);

            if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}

            if(blnWin == true){
                System.out.println("win");
            }
        }
    }
    //Constructor
    public mainGame(){
        theplay.setPreferredSize(new Dimension(1280,720));
        theplay.setLayout(null);


        col0.setSize(170,30);
        col1.setSize(170,30);
        col2.setSize(170,30);
        col3.setSize(170,30);
        col4.setSize(170,30);
        col5.setSize(170,30);
        col6.setSize(170,30);

        col0.setLocation(1000,20);
        col1.setLocation(1000,50);
        col2.setLocation(1000,80);
        col3.setLocation(1000,110);
        col4.setLocation(1000,140);
        col5.setLocation(1000,170);
        col6.setLocation(1000,200);

        col0.addActionListener(this);
        col1.addActionListener(this);
        col2.addActionListener(this);
        col3.addActionListener(this);
        col4.addActionListener(this);
        col5.addActionListener(this);
        col6.addActionListener(this);

        theplay.add(col0);
        theplay.add(col1);
        theplay.add(col2);
        theplay.add(col3);
        theplay.add(col4);
        theplay.add(col5);
        theplay.add(col6);

        theframe.setContentPane(theplay);
		theframe.pack();
        theframe.setResizable(false);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.setVisible(true);
    }


    //main
    public static void main(String args[]){
        board = loadBoard();
        new mainGame();
    }

    public static String[][] placeMove(int intUserCol, String[][] board, String strPlayer){
		for (int intRow = 5; intRow >= 0; intRow--){
			if(board[intRow][intUserCol] == "0"){
				board[intRow][intUserCol] = strPlayer;
				break;
			}
		}

        return board;
	}

	public static String[][] loadBoard(){
        String strBoard[][] = new String[6][7];
        for(int intRow=0;intRow<6;intRow++){
            for(int intCol=0;intCol<7;intCol++){
                 strBoard[intRow][intCol]="0";
            }
        }
        return strBoard;
    }
    
	//square variable tells us what color the player is (e.g. are they x or o)
	public static boolean winCheck(String [][] board, String square){
		//Horizontal win
		for(int intRow=0;intRow<6;intRow++){
			for(int intCol=0;intCol<4;intCol++){
				if(board[intRow][intCol] == square && board[intRow][intCol+1] == square && board[intRow][intCol+2] == square && board[intRow][intCol+3] == square){
					return true;
				}
			}
		}
		//Vertical win
		for(int intRow=0;intRow<3;intRow++){
			for(int intCol=0;intCol<7;intCol++){
				if(board[intRow][intCol] == square && board[intRow+1][intCol] == square && board[intRow+2][intCol] == square && board[intRow+3][intCol] == square){
					return true;
				}
			}
		}
		//Diagonal Upwards (to the right) Win
		for(int intRow=3;intRow<6;intRow++){
			for(int intCol=0;intCol<4;intCol++){
				if(board[intRow][intCol] == square && board[intRow-1][intCol+1] == square && board[intRow-2][intCol+2] == square && board[intRow-3][intCol+3] == square){
					return true;
				}
			}
		}
		//Diagonal Downwards (to the left) Win
		for(int intRow=0;intRow<3;intRow++){
			for(int intCol=0;intCol<4;intCol++){
				if(board[intRow][intCol] == square && board[intRow+1][intCol+1] == square && board[intRow+2][intCol+2] == square && board[intRow+3][intCol+3] == square){
					return true;
				}
			}
		}
		return false;
	} 
}
