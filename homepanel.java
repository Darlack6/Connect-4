import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class homepanel extends JPanel{
	
	/**Properties*/
	BufferedImage imghome;
	Font font = new Font("ARCADECLASSIC.ttf", 150, 150);
	

	/**Methods*/
	/**Set up panel graphics*/
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(imghome, 0, 0, null);
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("Connect-4",320,300);
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

	/**Constructor*/
	public homepanel(){
		imghome = loadImage("pixellake.JPG");
	}
}
