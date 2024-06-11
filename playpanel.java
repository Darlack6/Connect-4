import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
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
    
    String part [] = new String [3]; 
    
    /**methods*/
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imgbg,0,0,null);
        g.drawImage(imgboard,250,100,null);
        
        /**draws background*/
        
    }
    /**gets image from jar file, if not found, uses from local file*/
    /*public BufferedImage loadImage(String strFileName){
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
    }*/
    
    //outputs array of bg, piece1, and piece2 design depending on theme
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
			}else if(theme.equals("night")){
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
        
        if(theme == "day"){
			part = themer("day");
		}else if(theme == "night"){
			part = themer("night");
		}else if(theme == "cave"){
			part = themer("cave");
		}
		
		if(part[0].equals("day")){
			imgbg = imgDbg;
			imgboard = imgDBoard;
		}else if(part[0] == "night"){
			imgbg = imgNbg;
			imgboard = imgNBoard;
		}else if(part[0] == "cave"){
			imgbg = imgCbg;
			imgboard = imgCBoard;
		}
		
		if(part[1] == "flower"){
			imgp1 = imgFlower;
		}else if(part[1] == "moon"){
			imgp1 = imgMoon;
		}else if(part[1] == "diamond"){
			imgp1 = imgDiamond;
		}
		
		if(part[2] == "sun"){
			imgp2 = imgSun;
		}else if(part[2] == "star"){
			imgp2 = imgStar;
		}else if(part[2] == "sapphire"){
			imgp2 = imgSap;
		}
        
        
    }
}
