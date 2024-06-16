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

public class mainGame implements ActionListener, ChangeListener, MouseMotionListener, MouseListener{
    /**Properties*/
        /**General Program Properties*/
    int intUserCol;
    int intUserRow;
    int intX;
    int intY;
    public static String[][] board = loadBoard();
    String part [] = new String [3]; 
    String strPlayer = "o";
    Boolean blnHostPlayerTurn;
    Boolean blnWin = false;
    Boolean blnfocus;
    double dblTimer; 
    int intCounter;
        /**objects*/
    connect4 theConnect = new connect4();
    playpanel theplay = new playpanel();
    homepanel hmpanel = new homepanel();
	helppanel hppanel = new helppanel();
	themepanel thpanel = new themepanel();
    endpanel theEnd = new endpanel();
        /** Frames, Text Areas, Fields, Scroll panes and Labels */
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
	
        /**buttons*/
    JButton drop = new JButton("DROP");
	JButton play = new JButton("Play");
	JButton help = new JButton("Help");
	JButton day = new JButton("Day Mode");
	JButton night = new JButton("Night Mode");
	JButton cave = new JButton("Cave Mode");
	JButton custom = new JButton("Custom");
	JButton back = new JButton("Back");
    JButton quit = new JButton("Quit");
        /** SSM */
    SuperSocketMaster ssm;
        /** Timer */
    Timer theTimer = new Timer(1000/60, this);
    Timer theTimer2 = new Timer(1000/60, this);
        /** Font */
    Font fntAerialLarge = new Font("Arial",Font.PLAIN,40);
    Font fntAerialSmall = new Font("Arial",Font.PLAIN,10);
    /**Methods*/
    
    /**Action Listener*/
    public void actionPerformed(ActionEvent evt){
        if(evt.getSource() == drop){
            if(blnfocus == false){
				/**If user chooses column 1*/
                if(intX > 70 && intX < 185){
					/**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
                        /**set variables for drawing*/
                        theplay.intX=0;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 0;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**animate checker*/
                        theTimer.start();
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game0");
                        blnHostPlayerTurn=false;
                        strPlayer = "o";
                        intCounter++;
                        /**updates frame*/
                        theplay.intCheckerX = 0;
                        theplay.intCheckerY = 0;
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 1*/
                }else if(intX > 185 && intX < 285){
                    /**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
                        /**set variables for drawing*/
                        theplay.intX=1;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 1;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**animate checker*/
                        theTimer.start();
                         /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game1");
                        blnHostPlayerTurn=false;
                        strPlayer = "o";
                        intCounter++;
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 2*/
                }else if(intX > 285 && intX < 385){
                    /**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
                        /**set variables for drawing*/
                        theplay.intX=2;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 2;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**animate checker*/
                        theTimer.start();
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game2");
                        blnHostPlayerTurn=false;
                        strPlayer = "o";
                        intCounter++;
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 3*/
                }else if(intX> 385 && intX < 485){
                    /**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
                        /**set variables for drawing*/
                        theplay.intX=3;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 3;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**animate checker*/
                        theTimer.start();
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game3");
                        blnHostPlayerTurn=false;
                        strPlayer = "o";
                        intCounter++;
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 4*/
                }else if(intX > 485 && intX < 585){
					/**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
						/**set variables for drawing*/
                        theplay.intX=4;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 4;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
						/**places checker*/
                        theTimer.start();
                        /**animate check*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game4");
                        blnHostPlayerTurn=false;
                        intCounter++;
                        System.out.println(intCounter);
                        strPlayer = "o";
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 5*/
                }else if(intX > 585 && intX < 685){
                    if(blnHostPlayerTurn==true){
						/**set variables for drawing*/
                        theplay.intX=5;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 5;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
                        /**animate checker*/
                        theTimer.start();
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game5");
                        blnHostPlayerTurn=false;
                        intCounter++;
                        System.out.println(intCounter);
                        strPlayer = "o";
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**If user chooses column 6*/
                }else if(intX > 685 && intX < 785){
					/**Only plays if its client side turn*/
                    if(blnHostPlayerTurn==true){
						/**set variables for drawing*/
                        theplay.intX=6;
                        theplay.intY=-10;
                        strPlayer = "x";
                        intUserCol = 6;
                        theplay.intCol = intUserCol;
                        theplay.intRow = theConnect.row(intUserCol, board);
                        /**places checker*/
                        board = theConnect.placeMove(intUserCol, board, strPlayer);
						/**animate checker*/
                        theTimer.start();
                        /**win check*/
                        blnWin = theConnect.winCheck(board, strPlayer);
                        /**send column to other user and switches checker to other user*/
                        ssm.sendText("game6");
                        blnHostPlayerTurn=false;
                        intCounter++;
                        System.out.println(intCounter);
                        strPlayer = "o";
                        /**updates frame*/
                        moveLabel.setText("Opponent's Move");
                        theframe.setContentPane(theplay);
                        theframe.pack();
                        theplay.repaint();
                    }
                /**if drop without chooseing column, leave panel as is*/
                }else{
                    theframe.setContentPane(theplay);
                    theframe.pack();
                    theplay.repaint();
                }
            }
            /**show win screen if win*/
            if(blnWin == true){
                theEnd.blnWin = true; 
                theframe.setContentPane(theEnd);
                theframe.pack();
                theframe.repaint();
			/**print draw if tie*/
            }else if(intCounter == 21){
                System.out.println("Draw");
            }
        /**timer triggers animation*/
        }else if(evt.getSource() == theTimer){
            theplay.intY++;
            theframe.repaint();
            /**stop timer when piece is in place*/ 
            if(theplay.intY > theConnect.maxY(board,intUserCol)){
                theTimer.stop();
                theplay.blnAnimDone = true;
                theplay.intY=-30;
            }
        /**exit program when quit button pressed*/
        }else if(evt.getSource() == quit){
            System.exit(0);
        }else if(evt.getSource() == play){
			/**ask for IP and Port if neither entered*/
            if(ipField.getText().equals("") && portField.getText().equals("")){
                System.out.println("Enter a port number and/or IP Address\n");
                theframe.setContentPane(hmpanel);
                theframe.pack();
                theframe.repaint();
            /**start program as server if only port number is entered*/
            }else if(ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in server mode\n");
                blnHostPlayerTurn=true;
                theframe.setContentPane(thpanel);
                theframe.pack();
                theframe.repaint();
                ssm = new SuperSocketMaster(Integer.parseInt(portField.getText()), this);
                ssm.connect();	
            /**start program as client if IP address and port number are entered*/		
            }else if(!ipField.getText().equals("") && !portField.getText().equals("")){
                System.out.println("Starting chat in client mode\n");
                blnHostPlayerTurn=false;
                theframe.setContentPane(thpanel);
                theframe.pack();
                theframe.repaint();
                ssm = new SuperSocketMaster(ipField.getText(), Integer.parseInt(portField.getText()),this);	
                ssm.connect();		
            /**ask for port number if only IP address is entered*/
            }else if(!ipField.getText().equals("") && portField.getText().equals("")){
                System.out.println("Need port number or port/ip\n");
                theframe.setContentPane(hmpanel);
                theframe.pack();
                theframe.repaint();
            }
        /**switch to help panel*/
		}else if(evt.getSource() == help){
			theframe.setContentPane(hppanel);
			theframe.pack();
		/**switch to back to home panel*/
		}else if(evt.getSource() == back){
			theframe.setContentPane(hmpanel);
			theframe.pack();
		/**set background/board, piece 1, and piece 2 to day theme*/
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
			/**switch to play panel*/
			theframe.setContentPane(theplay);
			theframe.pack();
			theframe.repaint();
		/**set background/board, piece 1, and piece 2 to night theme*/
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
			/**switch to play panel*/
			theframe.setContentPane(theplay);
			theframe.pack();
			theframe.repaint();
		/**set background/board, piece 1, and piece 2 to cave theme*/
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
			/**switch to play panel*/
			theframe.setContentPane(theplay);
			theframe.pack();
            theframe.repaint();
        /**show text in chat when send*/
		}else if(evt.getSource() == theSend){
            ssm.sendText(theSend.getText());
            theChat.append("You: "+theSend.getText()+ "\n");
            theSend.setText("");
        /**derek pls do these*/
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
                    theEnd.blnWin = false; 
                    theframe.setContentPane(theEnd);
                    theframe.pack();
                    theEnd.repaint();
                }
                blnHostPlayerTurn=true;
            }else{
                theChat.append("Opponent: "+ssm.readText() + "\n");
            }
        }
    }
    
    public void stateChanged(ChangeEvent evt){
	}
	
	/**repaint piece position when dragged with mouse*/ 
    public void mouseDragged(MouseEvent evt){
        if(evt.getX() > theplay.intCheckerX && evt.getX() < theplay.intCheckerX + 60 && evt.getY() > theplay.intCheckerY && evt.getY() < theplay.intCheckerY + 60){
            blnfocus = true;
            theplay.intCheckerX = evt.getX();
            theplay.intCheckerY = evt.getY();
            theplay.repaint();
        }else{
            if(blnfocus == true){
                theplay.intCheckerX = evt.getX();
                theplay.intCheckerY = evt.getY();
                intX = evt.getX() - 35;
                intY = evt.getY() - 54;
                theplay.repaint();
            }
        }
    }
    
    /**derek do this*/
    public void mouseMoved(MouseEvent evt){
        blnfocus=false;
    }
    
    public void mouseEntered(MouseEvent evt){
    }
    
    public void mouseExited(MouseEvent evt){
    }
    
    public void mousePressed(MouseEvent evt){
    }
    
    public void mouseClicked(MouseEvent evt){
    }
    
    /**set drag piece position back to 0,0 when mouse released*/
    public void mouseReleased(MouseEvent evt){
		theplay.intCheckerX = 0;
		theplay.intCheckerY = 0;
    }
    
    /**Constructor*/
    public mainGame(){
		
		/**start timer*/
        theTimer2.start();
        
        /**set panel layout to null*/
        hmpanel.setLayout(null);
        thpanel.setLayout(null);
        hppanel.setLayout(null);
        theplay.setLayout(null);
        theEnd.setLayout(null);
        
        /**set component sizes*/
        drop.setSize(360,50);
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
        back.setSize(100, 40);
        quit.setSize(300, 60);

		/**set component locations*/
        drop.setLocation(890,120);
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
        one.setLocation(150, 525);
        two.setLocation(250, 525);
        three.setLocation(350, 525);
        four.setLocation(450, 525);
        five.setLocation(550, 525);
        six.setLocation(650, 525);
        seven.setLocation(750, 525);
        back.setLocation(20, 0);
        quit.setLocation(490, 500);

		/**add ActionListener to components*/
        drop.addActionListener(this);
        play.addActionListener(this);
        help.addActionListener(this);
        day.addActionListener(this);
        night.addActionListener(this);
        cave.addActionListener(this);
        custom.addActionListener(this);
        theSend.addActionListener(this);
        back.addActionListener(this);
        quit.addActionListener(this);
        theChat.setEnabled(false);
        theframe.addMouseMotionListener(this);
        theframe.addMouseListener(this);

        /**set component colors*/
		drop.setForeground(Color.BLACK);
		drop.setBackground(Color.WHITE);
		back.setForeground(Color.BLACK);
		back.setBackground(Color.WHITE);
		one.setForeground(Color.WHITE);
		two.setForeground(Color.WHITE);
		three.setForeground(Color.WHITE);
		four.setForeground(Color.WHITE);
		five.setForeground(Color.WHITE);
		six.setForeground(Color.WHITE);
		seven.setForeground(Color.WHITE);
		moveLabel.setForeground(Color.WHITE);
		quit.setBackground(new Color(6,40,61));
		quit.setForeground(Color.WHITE);
		
		/**set component fonts*/
		moveLabel.setFont(fntAerialLarge);
		quit.setFont(fntAerialLarge);
		
		/**add components to panel*/
        theplay.add(drop);
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
        hppanel.add(back);
        theEnd.add(quit);
        
        /**center button texts*/
		play.setHorizontalAlignment(JButton.CENTER);
		help.setHorizontalAlignment(JButton.CENTER);
		day.setHorizontalAlignment(JButton.CENTER);
		night.setHorizontalAlignment(JButton.CENTER);
		cave.setHorizontalAlignment(JButton.CENTER);
		custom.setHorizontalAlignment(JButton.CENTER);
		
		/**program exits when closed*/
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**frame settings*/
		theframe.setPreferredSize(new Dimension(1280,720));
        theframe.setLayout(null);
        theframe.setContentPane(hmpanel);
		theframe.pack();
        theframe.setResizable(false);
		theframe.setVisible(true);
    }
    
    /**main method*/
    public static void main(String args[]){
        new mainGame();
    }

	/**read from themes.csv and organize into 1d array of background/board, piece 1, and piece 2 design depedning on theme*/ 
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
