import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class playpanel extends JPanel{
    /**properties*/
	String theme = "day";
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
    
    
    /**methods*/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgbg,0,0,null);
        
        //y-axis offput by 79 pixels
        g.drawImage(imgboard,100,100,null);
        g.drawImage(imgDiamond, 125, 125, null);
        g.drawImage(imgMoon, 125, 204, null);
        g.drawImage(imgMoon, 125, 283, null);
        g.drawImage(imgMoon, 125, 362, null);
        g.drawImage(imgMoon, 125, 441, null);
        g.drawImage(imgMoon, 125, 520, null);
        
        //x-axis offput by 126
        g.drawImage(imgSap, 226, 125, null);
        g.drawImage(imgSap, 327, 125, null);
        g.drawImage(imgSap, 428, 125, null);
        g.drawImage(imgSap, 529, 125, null);
        g.drawImage(imgSap, 630, 125, null);
        g.drawImage(imgSap, 731, 125, null);
        
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
