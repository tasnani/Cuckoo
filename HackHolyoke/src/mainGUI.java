import javax.swing.*;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

public class mainGUI {

	public mainGUI(){
	
	}
	
	public void display(){
	
	JFrame mainFrame=new JFrame();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	  int height = screenSize.height;
	  int width = screenSize.width;
	 
	mainFrame.setSize(width,height);
	mainFrame.setBackground(Color.BLACK);
	 mainFrame.setLocationRelativeTo(null);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainFrame.pack();
	mainFrame.setVisible(true);
	
	
	}
	public static void main(String args[])
	{
		mainGUI mg=new mainGUI();
		mg.display();
	}
	
}
