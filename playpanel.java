import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class playpanel extends JPanel{
    /**properties*/
	String theme = "day";
    int intCheckerX = 34;
    int intCheckerY = 54;
    BufferedImage imgCBoard;
    BufferedImage imgDBoard;
    BufferedImage imgNBoard; 
    BufferedImage imgCbg; 
    BufferedImage imgDbg; 
    BufferedImage imgNbg; 
    BufferedImage imgFlower;
    BufferedImage imgSun;
    BufferedImage imgDiamond; 
    BufferedImage imgSap; 
    BufferedImage imgMoon; 
    BufferedImage imgStar; 
    
    BufferedImage imgbg; 
    BufferedImage imgboard;
    BufferedImage imgp1; 
    BufferedImage imgp2; 
    
    int intX, intY, intRow, intCol;
    boolean blnAnimDone = false;
    

    /**methods*/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgbg,0,0,null);
        g.drawImage(imgboard,100,100,null);
        g.drawImage(imgp1,0,0,null);
        g.drawImage(imgp1,intCheckerX-35,intCheckerY-54,null);

        for(int intRow = 0; intRow < 6; intRow++){
            for(int intCol = 0; intCol < 7; intCol++){
                if(mainGame.board[intRow][intCol] == "x"){
                    g.drawImage(imgp1, intCol*101 + 125, (5-intRow)*-80+520, null);
                }else if(mainGame.board[intRow][intCol] == "o"){
                    g.drawImage(imgp2, intCol*101 + 125, (5-intRow)*-80+520, null);
                }
            }
        }

        if(mainGame.board[intRow][intCol] == "x"){
            g.drawImage(imgp1, intX * 100 + 125, intY*10 + 50, null);
        }else if(mainGame.board[intRow][intCol] == "o"){
            g.drawImage(imgp2, intX * 100 + 125, intY*10 + 50, null);
        }

        if(blnAnimDone == true){
            for(int intRow = 0; intRow < 6; intRow++){
                for(int intCol = 0; intCol < 7; intCol++){
                    if(mainGame.board[intRow][intCol] == "x"){
                        g.drawImage(imgp1, intCol*101 + 125, (5-intRow)*-80+520, null);
                    }else if(mainGame.board[intRow][intCol] == "o"){
                        g.drawImage(imgp2, intCol*101 + 125, (5-intRow)*-80+520, null);
                    }
                }
            }
            blnAnimDone = false;
        }
    }
    
    /**constructor*/
    public playpanel(){
        super();
        
        try{
			imgCBoard = ImageIO.read(new File("caveboard.png"));
			imgDBoard = ImageIO.read(new File("dayboard.png"));
			imgNBoard = ImageIO.read(new File("nightboard.png"));
			
			imgCbg = ImageIO.read(new File("cavebg.png"));
			imgDbg = ImageIO.read(new File("daybg.png"));
			imgNbg = ImageIO.read(new File("nightbg.png"));
			
			imgFlower = ImageIO.read(new File("flower.png"));
			imgSun = ImageIO.read(new File("sun.png"));
			imgDiamond = ImageIO.read(new File("diamond.png"));
			imgSap = ImageIO.read(new File("sapphire.png"));
			imgMoon = ImageIO.read(new File("moon.png"));
			imgStar = ImageIO.read(new File("star.png"));
		
		}catch(IOException e){
        }
		
    }
}
