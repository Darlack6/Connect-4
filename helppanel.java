import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class helppanel extends JPanel{
	
	/**Properties*/
	BufferedImage imghome;

	/**Methods*/
	/**Set up panel graphics*/
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(imghome, 0, 0, null);
	}

	/**Constructor*/
	public helppanel(){
		try{
			imghome = ImageIO.read(new File("pixellake.JPG"));
		}catch(IOException e){
			System.out.println("Cannot load image");
		}
	}
}
