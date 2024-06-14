public class connect4 {
    //properties

    //methods
    public String[][] placeMove(int intUserCol, String[][] board, String strPlayer){
		for (int intRow = 5; intRow >= 0; intRow--){
			if(board[intRow][intUserCol] == "0"){
				board[intRow][intUserCol] = strPlayer;
				break;
			}
		}

        return board;
	}
    public Integer row(int intUserCol, String[][] board){
		for (int intRow = 5; intRow >= 0; intRow--){
			if(board[intRow][intUserCol] == "0"){
				return intRow;
            }
        }
        return 0;
	}
    
	//square variable tells us what color the player is (e.g. are they x or o)
	public boolean winCheck(String [][] board, String square){
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
    public boolean gameInfo(String strText){
        String strVerify = "";
        try{
            for (int i = 0; i < 4; i++){
                char c = strText.charAt(i);   
                strVerify = strVerify+c;
            }
            System.out.println(strVerify);
            if(strVerify.equals("game")){
                return true;
            }
            return false;
        }catch(StringIndexOutOfBoundsException e){
            return false;
        }
    }public int maxY(String[][] board, int intUserCol){
    for (int intRow = 5; intRow >= 0; intRow--){
        if(board[intRow][intUserCol] == "0"){
            return 46+(intRow-4)*8;
        }
    }
    return 0;
    }

    //Constructor
    public connect4(){
    }  
}
