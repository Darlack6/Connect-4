import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class connect4{
	// Main
	public static void main(String args[]){
		String[][] board = new String[6][7];
        board = loadBoard();
		int intUserCol = 0;
		boolean blnWin = false;
		String strPlayer = "x";

		//User plays
		while(blnWin == false){
			System.out.println("Choose a column");
			BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
			try{
			intUserCol = Integer.parseInt(keyboard.readLine()) - 1;
			}catch(IOException e){

			}

			while(intUserCol < 0 || intUserCol > 7){
				try{
					System.out.println("Choose a column greater than 0 and less than 7");
					intUserCol = Integer.parseInt(keyboard.readLine()) - 1;
					}catch(IOException e){
		
					}
			}

			while(board[0][intUserCol] != "0"){
				try{
					System.out.println("Column full, choose another column");
					intUserCol = Integer.parseInt(keyboard.readLine()) - 1;
					}catch(IOException e){
		
					}
				while(intUserCol < 0 || intUserCol > 7){
					try{
						System.out.println("Choose a column greater than 0 and less than 7");
						intUserCol = Integer.parseInt(keyboard.readLine()) - 1;
						}catch(IOException e){
			
						}
				}
			}

			for (int intRow = 5; intRow >= 0; intRow--){
				if(board[intRow][intUserCol] == "0"){
					board[intRow][intUserCol] = strPlayer;
					break;
				}
			}

			for(int intRow=0;intRow<6;intRow++){
				for(int intCol=0;intCol<7;intCol++){
					System.out.print(board[intRow][intCol]);
				}
				System.out.println("\n");
			}
			blnWin = winCheck(board, "x");
			System.out.println(winCheck(board, "x"));

			if (blnWin == true){
				if(strPlayer.equals("x")){
					System.out.println("Player 1 wins");
				}else{
					System.out.println("Player 2 wins");
				}
			}
			
			if(strPlayer.equals("x")){
				strPlayer = "o";
			}else{
				strPlayer = "x";
			}
		}
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
