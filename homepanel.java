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

	/**Constructor*/
	public homepanel(){
		try{
			imghome = ImageIO.read(new File("pixellake.JPG"));
		}catch(IOException e){
			System.out.println("Cannot load image");
		}
	}
}
