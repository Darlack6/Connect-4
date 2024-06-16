import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class endpanel extends JPanel{
    /**properties*/
    BufferedImage imgWin, imgLose, imgDraw;
    String strWin;
    /** Methods */
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(strWin.equals("win")){
            g.drawImage(imgWin,0,0,null);
        }else if(strWin.equals("lose")){
            g.drawImage(imgLose,0,0,null);
        }else{
            g.drawImage(imgDraw,0,0,null);
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

    /* Constructor */
    public endpanel(){
        super();
        imgWin = loadImage("win.png");
        imgLose = loadImage("lose.png");
        imgDraw = loadImage("draw.png");
    }
}