/**Program Name: Connect 4
 * Created by: Adeline Lue Sang & Derek Lien
 * Version number: 0.2*/

 import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.event.*;

public class mainGame implements ActionListener, ChangeListener{
    /*Properties*/
        /*General Program Properties*/
    int intUserCol;
    int intUserRow;
    public static String[][] board = loadBoard();
    String part [] = new String [3]; 
    String strPlayer = "o";
    Boolean blnHostPlayerTurn;
    Boolean blnWin = false;
    int intCounter;
        /*objects*/
    connect4 theConnect = new connect4();
    playpanel theplay = new playpanel();
    homepanel hmpanel = new homepanel();
	helppanel hppanel = new helppanel();
	themepanel thpanel = new themepanel();
        /* Frames, Text Areas, Fields, Scroll panes and Labels */
    JFrame theframe = new JFrame("Connect-4");
    JTextArea theChat = new JTextArea();
    JTextField theSend = new JTextField();
    JTextField ipField = new JTextField("");
	JTextField portField = new JTextField("1234");
    JScrollPane theScroll = new JScrollPane(theChat);
    JLabel moveLabel = new JLabel("Host's Move");
	JLabel iplab = new JLabel("IP Address");
	JLabel portlab = new JLabel("Port Number");
	JLabel one = new JLabel("1");
	JLabel two = new JLabel("2");
	JLabel three = new JLabel("3");
	JLabel four = new JLabel("4");
	JLabel five = new JLabel("5");
	JLabel six = new JLabel("6");
	JLabel seven = new JLabel("7");
	
        /*buttons*/
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
        /* SSM */
    SuperSocketMaster ssm;
        /* Timer */
    Timer theTimer = new Timer(1000/60, this);
        /* Font */
    Font fntAerialLarge = new Font("Arial",Font.PLAIN,40);
    Font fntAerialSmall = new Font("Arial",Font.PLAIN,10);
    /*Methods*/
    public void actionPerformed(ActionEvent evt){
        /*If user clicks column 0*/
        if(evt.getSource() == col0){
            /*Only plays if its client side turn*/
            if(blnHostPlayerTurn==true){
                //set variables for drawing
                theplay.intX=0;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 0;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                //places checker
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                //animate checker
                theTimer.start();
                //win check
                blnWin = theConnect.winCheck(board, strPlayer);
                //send column to other user and switches checker to other user
                ssm.sendText("game0");
                blnHostPlayerTurn=false;
                strPlayer = "o";
                intCounter++;
                //updates frame
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){ //win
                System.out.println("You win");
            }else if(intCounter == 21){ //draw
                System.out.println("Draw");
            }
        /*If user clicks column 1*/
        }else if(evt.getSource() == col1){
            /*Only plays if its client side turn*/
            if(blnHostPlayerTurn==true){
                //set variables for drawing
                theplay.intX=1;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 1;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                //places checker
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                //animate checker
                theTimer.start();
                //win check
                blnWin = theConnect.winCheck(board, strPlayer);
                //send column to other user and switches checker to other user
                ssm.sendText("game1");
                blnHostPlayerTurn=false;
                strPlayer = "o";
                intCounter++;
                //updates frame
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){ //win 
                System.out.println("You win");
            }else if(intCounter == 21){ //draw
                System.out.println("Draw");
            }
        /*If user clicks column 2*/
        }else if(evt.getSource() == col2){
            /*Only plays if its client side turn*/
            if(blnHostPlayerTurn==true){
                //set variables for drawing
                theplay.intX=2;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 2;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                //places checker
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                //animate checker
                theTimer.start();
                //win check
                blnWin = theConnect.winCheck(board, strPlayer);
                //send column to other user and switches checker to other user
                ssm.sendText("game2");
                blnHostPlayerTurn=false;
                strPlayer = "o";
                intCounter++;
                //updates frame
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){ //win 
                System.out.println("You win");
            }else if(intCounter == 21){ //draw
                System.out.println("Draw");
            }
        /*If user clicks column 3*/
        }else if(evt.getSource() == col3){
            /*Only plays if its client side turn*/
            if(blnHostPlayerTurn==true){
                //set variables for drawing
                theplay.intX=3;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 3;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                //places checker
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                //animate checker
                theTimer.start();
                //win check
                blnWin = theConnect.winCheck(board, strPlayer);
                //send column to other user and switches checker to other user
                ssm.sendText("game3");
                blnHostPlayerTurn=false;
                strPlayer = "o";
                intCounter++;
                //updates frame
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){ // win 
                System.out.println("You win");
            }else if(intCounter == 21){ //draw
                System.out.println("Draw");
            }
        /*If user clicks column 4*/
        }else if(evt.getSource() == col4){
            if(blnHostPlayerTurn==true){
                theplay.intX=4;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 4;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);

                theTimer.start();
                
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                blnWin = theConnect.winCheck(board, strPlayer);
                ssm.sendText("game4");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){
                System.out.println("You win");
            }else if(intCounter == 42){
                System.out.println("Draw");
            }
        }else if(evt.getSource() == col5){
            if(blnHostPlayerTurn==true){
                theplay.intX=5;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 5;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                theTimer.start();
                blnWin = theConnect.winCheck(board, strPlayer);
                ssm.sendText("game5");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){
                System.out.println("You win");
            }else if(intCounter == 42){
                System.out.println("Draw");
            }
        }else if(evt.getSource() == col6){
            if(blnHostPlayerTurn==true){
                theplay.intX=6;
                theplay.intY=-10;
                strPlayer = "x";
                intUserCol = 6;
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                
                board = theConnect.placeMove(intUserCol, board, strPlayer);
                theTimer.start();
                blnWin = theConnect.winCheck(board, strPlayer);
                ssm.sendText("game6");
                blnHostPlayerTurn=false;
                intCounter++;
                System.out.println(intCounter);
                strPlayer = "o";
                moveLabel.setText("Opponent's Move");
                theframe.setContentPane(theplay);
                theframe.pack();
                theplay.repaint();
            }
            if(blnWin == true){
                System.out.println("You win");
            }else if(intCounter == 42){
                System.out.println("Draw");
            }
        }else if(evt.getSource() == theTimer){
            theplay.intY++;
            theframe.repaint();
            if(theplay.intY > theConnect.maxY(board,intUserCol)){
                theTimer.stop();
                theplay.blnAnimDone = true;
                theplay.intY=-30;
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
            
            if(part[2].equals("sun")){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "day";
			theframe.setContentPane(theplay);
			theframe.pack();
			theframe.repaint();
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
			theframe.repaint();
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
            
            if(part[2].equals("sun")){
                theplay.imgp2 = theplay.imgSun;
            }else if(part[2].equals("star")){
                theplay.imgp2 = theplay.imgStar;
            }else if(part[2].equals("sapphire")){
                theplay.imgp2 = theplay.imgSap;
            }
			theplay.theme = "cave";
			theframe.setContentPane(theplay);
            theframe.pack();
			theframe.repaint();
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
			theplay.theme = "custom";
			theframe.setContentPane(theplay);
			theframe.pack();
            theframe.repaint();
		}else if(evt.getSource() == theSend){
            ssm.sendText(theSend.getText());
            theChat.append("You: "+theSend.getText()+ "\n");
            theSend.setText("");
        }else if(evt.getSource() == ssm){
            if(theConnect.gameInfo(ssm.readText()) == true){
                theplay.intCol = intUserCol;
                theplay.intRow = theConnect.row(intUserCol, board);
                theplay.intX= ssm.readText().charAt(4);
                theplay.intY= theConnect.maxY(board, intUserCol);
                
                board=theConnect.placeMove(Character.getNumericValue(ssm.readText().charAt(4)), board, strPlayer);
                theTimer.start();
                blnWin = theConnect.winCheck(board, strPlayer);

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
    
    /*Constructor*/
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
        moveLabel.setSize(400,400);
        iplab.setSize(100, 100);
        portlab.setSize(100, 100);
        one.setSize(200, 200);
        two.setSize(200, 200);
        three.setSize(200, 200);
        four.setSize(200, 200);
        five.setSize(200, 200);
        six.setSize(200, 200);
        seven.setSize(200, 200);

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
        moveLabel.setLocation(350,-150);
        iplab.setLocation(100, 100);
        portlab.setLocation(100, 100);
        one.setLocation(100, 550);
        two.setLocation(200, 550);
        three.setLocation(300, 550);
        four.setLocation(400, 550);
        five.setLocation(500, 550);
        six.setLocation(600, 550);
        seven.setLocation(700, 550);

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

        /**fonts*/
            col0.setForeground(Color.BLACK);
            col1.setForeground(Color.BLACK);
            col2.setForeground(Color.BLACK);
            col3.setForeground(Color.BLACK);
            col4.setForeground(Color.BLACK);
            col5.setForeground(Color.BLACK);
            col6.setForeground(Color.BLACK);

            col0.setBackground(Color.WHITE);
            col1.setBackground(Color.WHITE);
            col2.setBackground(Color.WHITE);
            col3.setBackground(Color.WHITE);
            col4.setBackground(Color.WHITE);
            col5.setBackground(Color.WHITE);
            col6.setBackground(Color.WHITE);
            
            one.setForeground(Color.WHITE);
            two.setForeground(Color.WHITE);
            three.setForeground(Color.WHITE);
            four.setForeground(Color.WHITE);
            five.setForeground(Color.WHITE);
            six.setForeground(Color.WHITE);
            seven.setForeground(Color.WHITE);

            moveLabel.setForeground(Color.WHITE);
            moveLabel.setFont(fntAerialLarge);

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
        theplay.add(one);
        theplay.add(two);
        theplay.add(three);
        theplay.add(four);
        theplay.add(five);
        theplay.add(six);
        theplay.add(seven);
        
        
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
        new mainGame();
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
    public static String[][] loadBoard(){
        String strBoard[][] = new String[6][7];
        for(int intRow=0;intRow<6;intRow++){
            for(int intCol=0;intCol<7;intCol++){
                 strBoard[intRow][intCol]="0";
            }
        }
        return strBoard;
    }
}
