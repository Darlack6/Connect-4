/**Program Name: Connect 4
 * Created by: Adeline Lue Sang & Derek Lien
 * Version number: 0.2*/

import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.event.*;

public class mainGame implements ActionListener, ChangeListener{
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
	
	JButton play = new JButton("Play");
	JButton help = new JButton("Help");
	JButton day = new JButton("Day Mode");
	JButton night = new JButton("Night Mode");
	JButton cave = new JButton("Cave Mode");
	JButton custom = new JButton("Custom");
	
	JTextField ipField = new JTextField("192.168.12.1");
	JTextField portField = new JTextField("1234");
	JLabel iplab = new JLabel("IP Address");
	JLabel portlab = new JLabel("Port Number");

    SuperSocketMaster ssm;
 
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
        }else if(evt.getSource() == col1){
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
        }else if(evt.getSource() == col2){
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
        }else if(evt.getSource() == col4){
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
        }else if(evt.getSource() == col5){
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
        }else if(evt.getSource() == col6){
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
        }else if(evt.getSource() == play){
            if(ipField.getText().equals("") && portField.getText().equals("")){
                System.out.println("Enter a port number and/or IP Address\n");
                theframe.setContentPane(hmpanel);
                theframe.pack();
                theframe.repaint();
            }else if(ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in server mode\n");
                theframe.setContentPane(thpanel);
                theframe.pack();
                theframe.repaint();
                ssm = new SuperSocketMaster(Integer.parseInt(portField.getText()), this);
                ssm.connect();			
            }else if(!ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in client mode\n");
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
            
            if(part[1] == "flower"){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1] == "moon"){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1] == "diamond"){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2] == "star"){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2] == "sapphire"){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "day";
			theframe.setContentPane(theplay);
			theframe.pack();
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
            
            if(part[1] == "flower"){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1] == "moon"){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1] == "diamond"){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2] == "star"){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2] == "sapphire"){
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
            
            if(part[1] == "flower"){
                theplay.imgp1 = theplay.imgFlower;
            }else if(part[1] == "moon"){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1] == "diamond"){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2] == "star"){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2] == "sapphire"){
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
            }else if(part[1] == "moon"){
                theplay.imgp1 = theplay.imgMoon;
            }else if(part[1] == "diamond"){
                theplay.imgp1 = theplay.imgDiamond;
            }
            
            if(part[2] == "sun"){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2] == "star"){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2] == "sapphire"){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "custom";
			theframe.setContentPane(theplay);
			theframe.pack();
		}else if(evt.getSource() == theSend){
            ssm.sendText(theSend.getText());
            theSend.setText("");
        }else if(evt.getSource() == ssm){
           theChat.append(ssm.readText() + "\n");
        }
    }
    
    public void stateChanged(ChangeEvent evt){
	}
    
    //Constructor
    public mainGame(){
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
        play.setSize(300, 75);
        day.setSize(320, 320);
        help.setSize(300, 75);
        night.setSize(320, 320);
        cave.setSize(320, 320);
        custom.setSize(320, 320);
        ipField.setSize(170, 100);
        portField.setSize(170, 100);
        theScroll.setSize(300,300);
        theSend.setSize(300,100);

        col0.setLocation(1000,20);
        col1.setLocation(1000,50);
        col2.setLocation(1000,80);
        col3.setLocation(1000,110);
        col4.setLocation(1000,140);
        col5.setLocation(1000,170);
        col6.setLocation(1000,200);
        play.setLocation(290, 440);
        help.setLocation(290, 540);
        day.setLocation(300, 10);
        night.setLocation(640, 10);
        cave.setLocation(300, 350);
		custom.setLocation(640, 350);
		ipField.setLocation(590, 440);
        portField.setLocation(590, 540);
        theScroll.setLocation(0,0);
        theSend.setLocation(0,310);

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
	}
}
