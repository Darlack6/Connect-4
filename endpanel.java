import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class endpanel extends JPanel{
    //propertiesjavac
    BufferedImage imgWin, imgLose;
    boolean blnWin;
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        if(blnWin == true){
            g.drawImage(imgWin,0,0,null);
        }else{
            g.drawImage(imgLose,0,0,null);
        }
    }
    public endpanel(){
        super();
        try{
            imgWin = ImageIO.read(new File("win.png"));
            imgLose = ImageIO.read(new File("lose.png"));
        }catch(IOException e){

        }
    }
}