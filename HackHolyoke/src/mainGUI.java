import javax.swing.*;
import java.awt.Component;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.ImageIcon;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class mainGUI {

	public mainGUI(){
	
	}
	
	public void display(){
	
	JFrame mainFrame=new JFrame();
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	 
	mainFrame.getContentPane().setBackground(Color.BLACK);
	 mainFrame.setLocationRelativeTo(null);
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	BufferedImage image1=null;
	try {                
          image1 = ImageIO.read(new File("/Users/tanasn/Desktop/calendar.png"));
       } catch (IOException ex) {
            // handle exception...
       }
	ImageIcon imageIcon1 = new ImageIcon(image1);
    JLabel jLabel1 = new JLabel();
    jLabel1.setIcon(imageIcon1);
    jLabel1.setLayout(null);
	jLabel1.setBounds(0,0, 250, 141);
	
	
	BufferedImage image2=null;
	try {                
          image2 = ImageIO.read(new File("/Users/tanasn/Desktop/graph.png"));
       } catch (IOException ex) {
            // handle exception...
       }
	ImageIcon imageIcon2 = new ImageIcon(image2);
    JLabel jLabel2 = new JLabel();
    jLabel2.setIcon(imageIcon2);
    jLabel2.setLayout(null);
	jLabel2.setBounds(0,585, 229,141);
	
	BufferedImage image3=null;
	try {                
          image3 = ImageIO.read(new File("/Users/tanasn/Desktop/search.png"));
       } catch (IOException ex) {
            // handle exception...
       }
	ImageIcon imageIcon3 = new ImageIcon(image3);
    JLabel jLabel3 = new JLabel();
    jLabel3.setIcon(imageIcon3);
    jLabel3.setLayout(null);
	jLabel3.setBounds(485,0,308,141);
	
	BufferedImage image4=null;
	try {                
          image4 = ImageIO.read(new File("/Users/tanasn/Desktop/power.png"));
       } catch (IOException ex) {
            // handle exception...
       }
	ImageIcon imageIcon4 = new ImageIcon(image4);
    JLabel jLabel4 = new JLabel();
    jLabel4.setIcon(imageIcon4);
    jLabel4.setLayout(null);
	jLabel4.setBounds(645,585,177,141);
	
	Color color=new Color(0x1E90FF);
	JLabel jLabel5=new JLabel("~Cuckoo~");
	jLabel5.setBackground(Color.BLACK);
	jLabel5.setForeground(color);
	jLabel5.setFont(new Font("Seravik", Font.PLAIN, 22));
	jLabel5.setBounds(305,420, 150, 65);
	
	
	
	
	JButton button1=new JButton();
	JButton button2=new JButton();
	JButton button3=new JButton();
	JButton button4=new JButton();
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();
	tf1.setText("username");
	tf2.setText("password");
	//button1.setIcon(ic1);
	button1.setIcon(imageIcon1);
	button1.setBackground(Color.BLACK);
	button2.setIcon(imageIcon2);
	button3.setIcon(imageIcon3);
	button4.setBackground(Color.BLACK);
	button4.setIcon(imageIcon4);
	
	
	
	mainFrame.setSize(690, 650);
	
	//blah
	button1.setEnabled(true);
	button2.setEnabled(true);
	button3.setEnabled(true);
	button4.setEnabled(true);	
	
	button1.setBounds(0,0, 250, 141);
	button2.setBounds(0,485, 229,141);
	button3.setBounds(375,0,308,141);
	button4.setBounds(495,485,177,141);
	tf1.setBounds(235, 355, 250, 35);
	tf2.setBounds(235,390, 250, 35);
	
	button1.setLayout(null);
	button2.setLayout(null);
	button3.setLayout(null);
	button4.setLayout(null);
	
	tf1.setLayout(null);
	tf2.setLayout(null);
	
	button1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event){
		spreadsheet ss=new spreadsheet();
		ss.spreadsheetDisplay();
		jobdataEntry jde=new jobdataEntry();
		jde.jobdataEntryDisplay();
		
	}});
	
	
	button1.setVisible(true);
	button2.setVisible(true);
	button3.setVisible(true);
	button4.setVisible(true);
	
	tf1.setVisible(true);
	tf2.setVisible(true);
	mainFrame.add(button1);
	mainFrame.add(button2);
	mainFrame.add(button3);
	mainFrame.add(button4);
	mainFrame.add(tf1);
	mainFrame.add(tf2);
	mainFrame.add(jLabel5);
	
	
	//mainFrame.setExtendedState( mainFrame.getExtendedState()|JFrame.NORMAL);
	 
	
	mainFrame.setLayout(null);
	
	
	
	
	
	
	
	

		BufferedImage image=null;
		try {                
	          image = ImageIO.read(new File("/Users/tanasn/Desktop/cuckoo.png"));
	       } catch (IOException ex) {
	            // handle exception...
	       }
		ImageIcon imageIcon = new ImageIcon(image);
	    JLabel jLabel = new JLabel();
	    jLabel.setIcon(imageIcon);
	    jLabel.setLayout(null);
		jLabel.setBounds(305,95,295,300);
        
       jLabel.setVisible(true);
       mainFrame.add(jLabel);
       mainFrame.setVisible(true);
	}
	
	
	public static void main(String args[])
	{
		mainGUI mg=new mainGUI();
		mg.display();
		
				
	}
	
}
