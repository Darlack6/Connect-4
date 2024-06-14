/**Program Name: Connect 4
 * Created by: Adeline Lue Sang & Derek Lien
 * Version number: 0.2*/

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.event.*;

public class mainGame2 implements ActionListener, ChangeListener{
    //Properties
    JFrame theframe = new JFrame("Connect-4");
    playpanel theplay = new playpanel();
    homepanel hmpanel = new homepanel();
	helppanel hppanel = new helppanel();
	themepanel thpanel = new themepanel();
    
    JTextArea theChat = new JTextArea();
    JTextField theSend = new JTextField();
    JScrollPane theScroll = new JScrollPane(theChat);
    int intUserCol;
    public static String[][] board = new String[6][7];
    String part [] = new String [3]; 

    String strPlayer = "o";
    Boolean blnHostPlayerTurn;
    Boolean blnWin = false;
    int intCounter;
    int intYMax;
    double dblTime = 0;
    //buttons

    JButton col0 = new JButton("Column 1");
    JButton col1 = new JButton("Column 2");
    JButton col2 = new JButton("Column 3");
    JButton col3 = new JButton("Column 4");
    JButton col4 = new JButton("Column 5");
    JButton col5 = new JButton("Column 6");
    JButton col6 = new JButton("Column 7");
	
	JButton play = new JButton("Play");
	JButton help = new JButton("Help");
	JButton day = new JButton("Day Mode");
	JButton night = new JButton("Night Mode");
	JButton cave = new JButton("Cave Mode");
	JButton custom = new JButton("Custom");
	
	JTextField ipField = new JTextField("");
	JTextField portField = new JTextField("1234");
    JLabel moveLabel = new JLabel();
	JLabel iplab = new JLabel("IP Address");
	JLabel portlab = new JLabel("Port Number");

    Timer theTimer = new Timer(1000/48,this);

    SuperSocketMaster ssm;
 
    //Methods
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == col0){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 0;
                theplay.intX = 0;
                theplay.intY = 0;    

                intYMax = maxY(board,intUserCol) - 8;
                theTimer.start();
                
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game0");

                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                
                for(int intRow=0;intRow<6;intRow++){
                    for(int intCol=0;intCol<7;intCol++){
                        System.out.print(board[intRow][intCol]);
                    }
                    System.out.println("\n");
                }
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col1){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 1;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game1");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col2){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 2;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game2");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col3){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 3;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game3");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col4){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 4;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game4");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col5){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 5;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game5");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if(evt.getSource() == col6){
            if(blnHostPlayerTurn==true){
                strPlayer = "x";
                intUserCol = 6;
                board = placeMove(intUserCol, board, strPlayer);
                blnWin = winCheck(board, strPlayer);
                ssm.sendText("game6");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
            }
            if(blnWin == true){
                System.out.println("You win");
            }
            theframe.setContentPane(theplay);
            theframe.pack();
            theplay.repaint();
        }else if (evt.getSource() == theTimer){
            if(theplay.intY < intYMax){
                theplay.intY = theplay.intY + 1;
                theframe.repaint();
            }else{
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
                theTimer.stop(); 
            }

        }else if(evt.getSource() == play){
            if(ipField.getText().equals("") && portField.getText().equals("")){
                System.out.println("Enter a port number and/or IP Address\n");
                theframe.setContentPane(hmpanel);
                theframe.pack();
                theframe.repaint();
            }else if(ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in server mode\n");
                blnHostPlayerTurn=true;
                theframe.setContentPane(thpanel);
                theframe.pack();
                theframe.repaint();
                ssm = new SuperSocketMaster(Integer.parseInt(portField.getText()), this);
                ssm.connect();			
            }else if(!ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in client mode\n");
                blnHostPlayerTurn=false;
                theframe.setContentPane(thpanel);
                theframe.pack();
                theframe.repaint();
                ssm = new SuperSocketMaster(ipField.getText(), Integer.parseInt(portField.getText()),this);	
                ssm.connect();		
            }else if(!ipField.getText().equals("") && portField.getText().equals("")){
                System.out.println("Need port number or port/ip\n");
                theframe.setContentPane(hmpanel);
                theframe.pack();
                theframe.repaint();
            }
		}else if(evt.getSource() == help){
			theframe.setContentPane(hppanel);
			theframe.pack();
		}else if(evt.getSource() == day){
            part = themer("day");
            if(part[0].equals("day")){
                theplay.imgbg = theplay.imgDbg;
                theplay.imgboard = theplay.imgDBoard;
            }else if(part[0].equals("night")){
                theplay.imgbg = theplay.imgNbg;
                theplay.imgboard = theplay.imgNBoard;
            }else if(part[0].equals("cave")){
                theplay.imgbg = theplay.imgCbg;
                theplay.imgboard = theplay.imgCBoard;
            }
            
            if(part[1].equals("flower")){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1].equals("moon")){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1].equals("diamond")){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "day";
			theframe.setContentPane(theplay);
			theframe.pack();
			
			theplay.repaint();
		}else if(evt.getSource() == night){
            part = themer("night");
            if(part[0].equals("day")){
                theplay.imgbg = theplay.imgDbg;
                theplay.imgboard = theplay.imgDBoard;
            }else if(part[0].equals("night")){
                theplay.imgbg = theplay.imgNbg;
                theplay.imgboard = theplay.imgNBoard;
            }else if(part[0].equals("cave")){
                theplay.imgbg = theplay.imgCbg;
                theplay.imgboard = theplay.imgCBoard;
            }
            
            if(part[1].equals("flower")){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1].equals("moon")){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1].equals("diamond")){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2].equals("sun")){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "night";
			theframe.setContentPane(theplay);
			theframe.pack();
			theplay.repaint();
		}else if(evt.getSource() == cave){
            part = themer("cave");
            if(part[0].equals("day")){
                theplay.imgbg = theplay.imgDbg;
                theplay.imgboard = theplay.imgDBoard;
            }else if(part[0].equals("night")){
                theplay.imgbg = theplay.imgNbg;
                theplay.imgboard = theplay.imgNBoard;
            }else if(part[0].equals("cave")){
                theplay.imgbg = theplay.imgCbg;
                theplay.imgboard = theplay.imgCBoard;
            }
            
            if(part[1].equals("flower")){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1].equals("moon")){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1].equals("diamond")){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "cave";
			theframe.setContentPane(theplay);
			theframe.pack();
		}else if(evt.getSource() == custom){
            part = themer("custom");
            if(part[0].equals("day")){
                theplay.imgbg = theplay.imgDbg;
                theplay.imgboard = theplay.imgDBoard;
            }else if(part[0].equals("night")){
                theplay.imgbg = theplay.imgNbg;
                theplay.imgboard = theplay.imgNBoard;
            }else if(part[0].equals("cave")){
                theplay.imgbg = theplay.imgCbg;
                theplay.imgboard = theplay.imgCBoard;
            }
            
            if(part[1] == "flower"){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1].equals("moon")){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1].equals("diamond")){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "custom";
			theframe.setContentPane(theplay);
			theframe.pack();
		}else if(evt.getSource() == theSend){
            ssm.sendText(theSend.getText());
            theChat.append("You: "+theSend.getText()+ "\n");
            theSend.setText("");
        }else if(evt.getSource() == ssm){
            if(gameInfo(ssm.readText()) == true){
                placeMove(Character.getNumericValue(ssm.readText().charAt(4)), board, strPlayer);
                theTimer.start();

                blnWin = winCheck(board, strPlayer);
                intYMax = maxY(board,intUserCol);
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
                moveLabel.setText("Your Move");
                if(blnWin == true){
                    System.out.println("You lost");
                }
                blnHostPlayerTurn=true;
            }else{
                theChat.append("Opponent: "+ssm.readText() + "\n");
            }
        }
    }
    
    public void stateChanged(ChangeEvent evt){
	}
    
    //Constructor
    public mainGame2(){
        hmpanel.setLayout(null);
        thpanel.setLayout(null);
        hppanel.setLayout(null);
        theplay.setLayout(null);
        
        col0.setSize(170,30);
        col1.setSize(170,30);
        col2.setSize(170,30);
        col3.setSize(170,30);
        col4.setSize(170,30);
        col5.setSize(170,30);
        col6.setSize(170,30);
        play.setSize(300, 90);
        day.setSize(320, 320);
        help.setSize(300, 90);
        night.setSize(320, 320);
        cave.setSize(320, 320);
        custom.setSize(320, 320);
        ipField.setSize(280, 95);
        portField.setSize(280, 95);
        theSend.setSize(350, 40);
        theScroll.setSize(350, 300);
        moveLabel.setSize(300,300);

        col0.setLocation(890,120);
        col1.setLocation(1070,120);
        col2.setLocation(890,160);
        col3.setLocation(1070,160);
        col4.setLocation(890,200);
        col5.setLocation(1070,200);
        col6.setLocation(990,240);
        play.setLocation(360, 350);
        help.setLocation(360, 450);
        day.setLocation(300, 10);
        night.setLocation(640, 10);
        cave.setLocation(300, 350);
		custom.setLocation(640, 350);
		ipField.setLocation(680, 350);
        portField.setLocation(680, 445);
        theSend.setLocation(890, 600);
        theScroll.setLocation(890, 300);
        moveLabel.setLocation(700,5);

        col0.addActionListener(this);
        col1.addActionListener(this);
        col2.addActionListener(this);
        col3.addActionListener(this);
        col4.addActionListener(this);
        col5.addActionListener(this);
        col6.addActionListener(this);
        play.addActionListener(this);
        help.addActionListener(this);
        day.addActionListener(this);
        night.addActionListener(this);
        cave.addActionListener(this);
        custom.addActionListener(this);
        theSend.addActionListener(this);

        theChat.setEnabled(false);

        theplay.add(col0);
        theplay.add(col1);
        theplay.add(col2);
        theplay.add(col3);
        theplay.add(col4);
        theplay.add(col5);
        theplay.add(col6);
        theplay.add(theScroll);
        theplay.add(theSend);
        theplay.add(moveLabel);
        hmpanel.add(play);
        hmpanel.add(help);
        thpanel.add(day);
        thpanel.add(night);
        thpanel.add(cave);
        thpanel.add(custom);
        hmpanel.add(ipField);
        hmpanel.add(portField);
        
		play.setHorizontalAlignment(JButton.CENTER);
		help.setHorizontalAlignment(JButton.CENTER);
		day.setHorizontalAlignment(JButton.CENTER);
		night.setHorizontalAlignment(JButton.CENTER);
		cave.setHorizontalAlignment(JButton.CENTER);
		custom.setHorizontalAlignment(JButton.CENTER);
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		theframe.setPreferredSize(new Dimension(1280,720));
        theframe.setLayout(null);
        theframe.setContentPane(hmpanel);
		theframe.pack();
        theframe.setResizable(false);
		theframe.setVisible(true);
    }


    //main
    public static void main(String args[]){
        board = loadBoard();
        new mainGame2();
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
    public static String [] themer(String theme){
		
		int i;
		int a;
		String [][] array = new String [4][3];
		String [] part = new String [3];
		
		try{
			BufferedReader themescsv = new BufferedReader(new FileReader("themes.csv"));
			
			for(i = 0; i < 4; i++){
				String strLine = themescsv.readLine();
				if(strLine == null){
					strLine = " , , ";
				}
				String [] strPart = strLine.split(",");
				for(a = 0; a < 3; a++){
					array [i][a] = strPart[a];
				}
			}
			themescsv.close();
		
			if(theme == "day"){
				part [0] = array [0][0];
				part [1] = array [0][1];
				part [2] = array [0][2];
			}else if(theme == "night"){
				part [0] = array [1][0];
				part [1] = array [1][1];
				part [2] = array [1][2];
			}else if(theme == "cave"){
				part [0] = array [2][0];
				part [1] = array [2][1];
				part [2] = array [2][2];
			}else if(theme == "custom"){
				part [0] = array [3][0];
				part [1] = array [3][1];
				part [2] = array [3][2];
			}
            System.out.println(part[0] + part[1] + part[2]);
				
		}catch(IOException e){
			for(i = 0; i < 4; i++){
				part[0] = "day";
				part[1] = "sun";
				part[2] = "flower";
			} 
			System.out.println("exception triggered");
		}
		return part;
	}public static boolean gameInfo(String strText){
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
    }public static int maxY(String[][] board, int intUserCol){
        for (int intRow = 5; intRow >= 0; intRow--){
			if(board[intRow][intUserCol] == "0"){
				return 47+(intRow-4)*8;
			}
		}
        return 0;
    }
}
