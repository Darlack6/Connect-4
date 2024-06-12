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
        g.drawImage(imgboard,250,100,null);
        
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
			
			imgFlower = ImageIO.read(new File("flower.jpg"));
			imgSun = ImageIO.read(new File("sun.jpg"));
			imgDiamond = ImageIO.read(new File("diamond.jpg"));
			
			imgSap = ImageIO.read(new File("sapphire.jpg"));
			imgMoon = ImageIO.read(new File("moon.jpg"));
			imgStar = ImageIO.read(new File("star.jpg"));
		
		}catch(IOException e){
        }
		
    }
}