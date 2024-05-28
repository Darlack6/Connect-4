import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class connect4{
	
	// Main
	public static void main(String args[]){
		connect4 x = new connect4();
		x.resetBoard();
	}
	
	// MODEL
	public static void resetBoard(){
		String [][] board = new String [7][6];
		for(int i = 0; i < 6; i++){
			System.out.print("\n");
			for(int a = 0; a < 7; a++){
				board [a][i] = null;
				System.out.print("x");
			}
		} 
	}
	
	//square variable tells us what color the player is (e.g. are they x or o)
	public static boolean winCheck(String [][] board, int introw, int intcol, String square){
		boolean blnwin;
		
		if(board[intcol-3][introw] == square && board[intcol-2][introw] == square && board[intcol-1][introw] == square){
			blnwin = true;
		}else if(board[intcol-2][introw] == square && board[intcol-1][introw] == square && board[intcol+1][introw] == square){
			blnwin = true;
		}else if(board[intcol-1][introw] == square && board[intcol+1][introw] == square && board[intcol+2][introw] == square){
			blnwin = true;
		}else if(board[intcol+1][introw] == square && board[intcol+2][introw] == square && board[intcol+3][introw] == square){
			blnwin = true;
		}else if(board[intcol][introw-3] == square && board[intcol][introw-2] == square && board[intcol][introw-1] == square){
			blnwin = true;
		}else if(board[intcol][introw-2] == square && board[intcol][introw-1] == square && board[intcol][introw+1] == square){
			blnwin = true;
		}else if(board[intcol][introw-1] == square && board[intcol][introw+1] == square && board[intcol][introw+2] == square){
			blnwin = true;
		}else if(board[intcol][introw+1] == square && board[intcol][introw+2] == square && board[intcol][introw+3] == square){
			blnwin = true;
		}else if(board[intcol][introw+1] == square && board[intcol][introw+2] == square && board[intcol][introw+3] == square){
			blnwin = true;
		}else if(board[intcol-3][introw+3] == square && board[intcol-2][introw+2] == square && board[intcol-1][introw+1] == square){
			blnwin = true;
		}else if(board[intcol-2][introw+2] == square && board[intcol-1][introw+1] == square && board[intcol+1][introw-1] == square){
			blnwin = true;
		}else if(board[intcol-1][introw+1] == square && board[intcol+1][introw-1] == square && board[intcol+2][introw-2] == square){
			blnwin = true;
		}else if(board[intcol+1][introw-1] == square && board[intcol+2][introw-2] == square && board[intcol+3][introw-3] == square){
			blnwin = true;
		}else if(board[intcol-3][introw-3] == square && board[intcol+2][introw+2] == square && board[intcol+1][introw+1] == square){
			blnwin = true;
		}else if(board[intcol+2][introw+2] == square && board[intcol+1][introw+1] == square && board[intcol-1][introw-1] == square){
			blnwin = true;
		}else if(board[intcol+1][introw+1] == square && board[intcol-1][introw-1] == square && board[intcol-2][introw-2] == square){
			blnwin = true;
		}else if(board[intcol-1][introw-1] == square && board[intcol-2][introw-2] == square && board[intcol-3][introw-3] == square){
			blnwin = true;
		}else{
			blnwin = false;
		}
		return blnwin;
	}

}
