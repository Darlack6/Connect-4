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
		board[0][4]="x";
		board[0][3]="x";
		board[0][2]="x";

		board[0][5]="H";
        for(int intRow=0;intRow<6;intRow++){
            for(int intCol=0;intCol<7;intCol++){
                System.out.print(board[intCol][intRow]);
            }
            System.out.println("\n");
        }
		
		System.out.println(winCheck(board, 0, 5, "x"));
	}	

	public static String[][] loadBoard(){
        String strBoard[][] = new String[7][6];
        for(int intCol=0;intCol<7;intCol++){
            for(int intRow=0;intRow<6;intRow++){
                 strBoard[intCol][intRow]="o";
            }
        }
        return strBoard;
    }
	
	//square variable tells us what color the player is (e.g. are they x or o)
	public static boolean winCheck(String [][] board, int intcol, int introw, String square){
		boolean blnwin = false;
		if(intcol == 0){
			if(board[1][introw] == square && board[2][introw] == square && board[3][introw] == square){
				return blnwin = true;
			}
		}else if(intcol == 1){
			if(board[0][introw] == square && board[2][introw] == square && board[3][introw] == square){
				return blnwin = true;
			}
			else if(board[2][introw] == square && board[3][introw] == square && board[4][introw] == square){
				return blnwin = true;
			}
		}else if(intcol == 2){
			if(board[0][introw] == square && board[1][introw] == square && board[3][introw] == square){
				return blnwin = true;
			}
			else if(board[1][introw] == square && board[3][introw] == square && board[4][introw] == square){
				return blnwin = true;
			}
			else if(board[3][introw] == square && board[4][introw] == square && board[5][introw] == square){
				return blnwin = true;
			}
		}else if(intcol == 3){
			if(board[0][introw] == square && board[1][introw] == square && board[2][introw] == square){
				return blnwin = true;
			}
			else if(board[1][introw] == square && board[2][introw] == square && board[4][introw] == square){
				return blnwin = true;
			}
			else if(board[2][introw] == square && board[4][introw] == square && board[5][introw] == square){
				return blnwin = true;
			}
		}else if(intcol == 4){
			if(board[1][introw] == square && board[2][introw] == square && board[3][introw] == square){
				return blnwin = true;
			}
			else if(board[2][introw] == square && board[3][introw] == square && board[5][introw] == square){
				return blnwin = true;
			}
		}else if(intcol == 5){
			if(board[2][introw] == square && board[3][introw] == square && board[4][introw] == square){
				return blnwin = true;
			}
		}

		if(introw == 0){
			if(board[intcol][1] == square && board[intcol][2] == square && board[intcol][3] == square){
				return blnwin = true;
			}
		}else if(introw == 1){
			if(board[intcol][0] == square && board[intcol][2] == square && board[intcol][3] == square){
				return blnwin = true;
			}
			else if(board[intcol][2] == square && board[intcol][3] == square && board[intcol][4] == square){
				return blnwin = true;
			}
		}else if(introw == 2){
			if(board[intcol][0] == square && board[intcol][1] == square && board[intcol][3] == square){
				return blnwin = true;
			}
			else if(board[intcol][1] == square && board[intcol][3] == square && board[intcol][4] == square){
				return blnwin = true;
			}
			else if(board[intcol][3] == square && board[intcol][4] == square && board[intcol][5] == square){
				return blnwin = true;
			}
		}else if(introw == 3){
			if(board[intcol][0] == square && board[intcol][1] == square && board[intcol][2] == square){
				return blnwin = true;
			}
			else if(board[intcol][1] == square && board[intcol][2] == square && board[intcol][4] == square){
				return blnwin = true;
			}
			else if(board[intcol][2] == square && board[intcol][4] == square && board[intcol][5] == square){
				return blnwin = true;
			}
			else if(board[intcol][4] == square && board[intcol][5] == square && board[intcol][6] == square){
				return blnwin = true;
			}
		}else if(introw == 4){
			if(board[intcol][1] == square && board[intcol][2] == square && board[intcol][3] == square){
				return blnwin = true;
			}
			else if(board[intcol][2] == square && board[intcol][3] == square && board[intcol][5] == square){
				return blnwin = true;
			}
			else if(board[intcol][3] == square && board[intcol][5] == square && board[intcol][6] == square){
				return blnwin = true;
			}
		}
		else if(introw == 5){
			if(board[intcol][2] == square && board[intcol][3] == square && board[intcol][4] == square){
				return blnwin = true;
			}
			else if(board[intcol][3] == square && board[intcol][4] == square && board[intcol][6] == square){
				return blnwin = true;
			}
		}
		else if(introw == 6){
			if(board[intcol][3] == square && board[intcol][4] == square && board[intcol][5] == square){
				return blnwin = true;
			}
		}
		return blnwin;
	} 
	
}
