/**Program Name: Sinusoudial Function Simulator 
 * Created by: Adeline Lue Sang & Derek Lien
 * Version number: 0.1*/

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.*;

public class view extends JFrame implements ActionListener, ChangeListener, MouseListener, MouseMotionListener{
	
	// Properties
	JFrame theframe = new JFrame("Connect-4");
	
	homepanel hmpanel = new homepanel();
	mainGame plpanel = new mainGame();
	helppanel hppanel = new helppanel();
	themepanel thpanel = new themepanel();
	
	JButton play = new JButton("Play");
	JButton help = new JButton("Help");
	JButton day = new JButton("Day Mode");
	JButton night = new JButton("Night Mode");
	JButton cave = new JButton("Cave Mode");
	JButton custom = new JButton("Custom");
	
	// Methods
	public void actionPerformed(ActionEvent evt){
		if(evt.getSource() == play){
			theframe.setContentPane(thpanel);
			theframe.pack();
		}else if(evt.getSource() == help){
			theframe.setContentPane(hppanel);
			theframe.pack();
		}else if(evt.getSource() == day){
			theframe.setContentPane(plpanel);
			theframe.pack();
			plpanel.theme = "day";
		}else if(evt.getSource() == night){
			theframe.setContentPane(plpanel);
			theframe.pack();
			plpanel.theme = "night";
		}else if(evt.getSource() == cave){
			theframe.setContentPane(plpanel);
			theframe.pack();
			plpanel.theme = "cave";
		}else if(evt.getSource() == custom){
			theframe.setContentPane(plpanel);
			theframe.pack();
			plpanel.theme = "custom";
		}
		
	}
	public void stateChanged(ChangeEvent evt){
		
	}
	public void mouseDragged(MouseEvent e){
	
	}
	public void mouseMoved(MouseEvent e){
	
	}
	public void mouseExited(MouseEvent e){
		
	}
	public void mouseEntered(MouseEvent e){
		
	}
	public void mouseReleased(MouseEvent e){
		
	}
	public void mousePressed(MouseEvent e){
		
	}
	public void mouseClicked(MouseEvent e){
		
	}
	
	// Constructor 
	public view(){
		/*Frame & Panel Design*/
		theframe.setPreferredSize(new Dimension(1280,720));
		theframe.setResizable(false);
		theframe.setContentPane(hmpanel);
		theframe.pack();
		theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theframe.setVisible(true);
		
		//hmpanel.setSize(1280, 720);
		//plpanel.setSize(1280, 720);
		
		hmpanel.setLayout(null);
		plpanel.setLayout(null);
		thpanel.setLayout(null);
		
		play.setSize(300, 75);
		play.setHorizontalAlignment(JButton.CENTER);
		play.setLocation(490, 440);
		play.addActionListener(this);
		hmpanel.add(play);
		
		help.setSize(300, 75);
		help.setHorizontalAlignment(JButton.CENTER);
		help.setLocation(490, 540);
		help.addActionListener(this);
		hmpanel.add(help);
		
		day.setSize(320, 320);
		day.setHorizontalAlignment(JButton.CENTER);
		day.setLocation(300, 10);
		day.addActionListener(this);
		thpanel.add(day);
		
		night.setSize(320, 320);
		night.setHorizontalAlignment(JButton.CENTER);
		night.setLocation(640, 10);
		night.addActionListener(this);
		thpanel.add(night);
		
		cave.setSize(320, 320);
		cave.setHorizontalAlignment(JButton.CENTER);
		cave.setLocation(300, 350);
		cave.addActionListener(this);
		thpanel.add(cave);
		
		custom.setSize(320, 320);
		custom.setHorizontalAlignment(JButton.CENTER);
		custom.setLocation(640, 350);
		custom.addActionListener(this);
		thpanel.add(custom);
		
	
	}
	
	public static void main (String args [] ){
		new view();
	}
}
	
