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
        /** Draws existing checkers */
        for(int intRow = 0; intRow < 6; intRow++){
            for(int intCol = 0; intCol < 7; intCol++){
                if(mainGame.board[intRow][intCol] == "x"){
                    g.drawImage(imgp1, intCol*101 + 125, (5-intRow)*-80+520, null);
                }else if(mainGame.board[intRow][intCol] == "o"){
                    g.drawImage(imgp2, intCol*101 + 125, (5-intRow)*-80+520, null);
                }
            }
        }
        /** Draws falling checker */
        if(mainGame.board[intRow][intCol] == "x"){
            g.drawImage(imgp1, intX * 100 + 125, intY*10 + 50, null);
        }else if(mainGame.board[intRow][intCol] == "o"){
            g.drawImage(imgp2, intX * 100 + 125, intY*10 + 50, null);
        }
        /** Draws all checkers once fall animation is done */

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
    
    /**gets image from jar file, if not found, uses from local file*/
    public BufferedImage loadImage(String strFileName){
        InputStream imageclass = null;
        imageclass = this.getClass().getResourceAsStream(strFileName);
        if(imageclass == null){
        }else{
            try{
                return ImageIO.read(imageclass);
            }catch(IOException e){
                System.out.println("Unable to load file");
            }
        }
        try{
            System.out.println("loading from file");
            BufferedImage theimage = ImageIO.read(new File(strFileName));
            return theimage;
        }catch(IOException e){
            System.out.println("Unable to load local image file: \""+strFileName+"\"");
            return null;
        }
    }
    
    /**constructor*/
    public playpanel(){
        super();
        
        imgCBoard = loadImage("caveboard.png");
        imgDBoard = loadImage("dayboard.png");
        imgNBoard = loadImage("nightboard.png");
        
        imgCbg = loadImage("cavebg.png");
        imgDbg = loadImage("daybg.png");
        imgNbg = loadImage("nightbg.png");
        
        imgFlower = loadImage("flower.png");
        imgSun = loadImage("sun.png");
        imgDiamond = loadImage("diamond.png");
        imgSap = loadImage("sapphire.png");
        imgMoon = loadImage("moon.png");
        imgStar = loadImage("star.png");
		
    }
}
