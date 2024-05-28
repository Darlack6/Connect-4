import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class connect4{
	// Main
	public static void main(String args[]){
		String[][] board = new String[7][6];
        board = loadBoard();
		board[6][0]="x";
		board[6][1]="x";
		board[6][2]="x";
        for(int intRow=0;intRow<7;intRow++){
            for(int intCol=0;intCol<6;intCol++){
                System.out.print(board[intRow][intCol]);
            }
            System.out.println("\n");
        }
		
		System.out.println(winCheck(board, 6, 3, "x"));
	}

	public static String[][] loadBoard(){
        String strBoard[][] = new String[7][6];
        for(int intCol=0;intCol<7;intCol++){
            for(int intRow=0;intRow<6;intRow++){
                 strBoard[intCol][intRow]=null;
            }
        }
        return strBoard;
    }
	
	//square variable tells us what color the player is (e.g. are they x or o)
	public static boolean winCheck(String [][] board, int intcol, int introw, String square){
		boolean blnwin;
		try{
			if(board[introw-3][intcol] == square && board[introw-2][intcol] == square && board[introw-1][intcol] == square){
				blnwin = true;
			}else if(board[introw-2][intcol] == square && board[introw-1][intcol] == square && board[introw+1][intcol] == square){
				blnwin = true;
			}else if(board[introw-1][intcol] == square && board[introw+1][intcol] == square && board[introw+2][intcol] == square){
				blnwin = true;
			}else if(board[introw+1][intcol] == square && board[introw+2][intcol] == square && board[introw+3][intcol] == square){
				blnwin = true;
			}else if(board[introw][intcol-3] == square && board[introw][intcol-2] == square && board[introw][intcol-1] == square){
				System.out.println("you suck");
				blnwin = true;
			}else if(board[introw][intcol-2] == square && board[introw][intcol-1] == square && board[introw][intcol+1] == square){
				blnwin = true;
			}else if(board[introw][intcol-1] == square && board[introw][intcol+1] == square && board[introw][intcol+2] == square){
				blnwin = true;
			}else if(board[introw][intcol+1] == square && board[introw][intcol+2] == square && board[introw][intcol+3] == square){
				blnwin = true;
			}else if(board[introw][intcol+1] == square && board[introw][intcol+2] == square && board[introw][intcol+3] == square){
				blnwin = true;
			}else if(board[introw-3][intcol+3] == square && board[introw-2][intcol+2] == square && board[introw-1][intcol+1] == square){
				blnwin = true;
			}else if(board[introw-2][intcol+2] == square && board[introw-1][intcol+1] == square && board[introw+1][intcol-1] == square){
				blnwin = true;
			}else if(board[introw-1][intcol+1] == square && board[introw+1][intcol-1] == square && board[introw+2][intcol-2] == square){
				blnwin = true;
			}else if(board[introw+1][intcol-1] == square && board[introw+2][intcol-2] == square && board[introw+3][intcol-3] == square){
				blnwin = true;
			}else if(board[introw-3][intcol-3] == square && board[introw+2][intcol+2] == square && board[introw+1][intcol+1] == square){
				blnwin = true;
			}else if(board[introw+2][intcol+2] == square && board[introw+1][intcol+1] == square && board[introw-1][intcol-1] == square){
				blnwin = true;
			}else if(board[introw+1][intcol+1] == square && board[introw-1][intcol-1] == square && board[introw-2][intcol-2] == square){
				blnwin = true;
			}else if(board[introw-1][intcol-1] == square && board[introw-2][intcol-2] == square && board[introw-3][intcol-3] == square){
				blnwin = true;
			}else{
				blnwin = false;
			}
			return blnwin;
		}catch(ArrayIndexOutOfBoundsException e){
			blnwin = false;
			return blnwin;
		}
	}
}
