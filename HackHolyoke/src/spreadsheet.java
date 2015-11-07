import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;


public class spreadsheet {
	public void spreadsheetDisplay(){
		JFrame jFrame2=new JFrame();
		jFrame2.setSize(1600,790);
		jFrame2.setBackground(Color.BLACK);
		jFrame2.setVisible(true);
		jFrame2.setLayout(null);
		
		
		
		ArrayList<JLabel> jLabelArrayList=new ArrayList<>();
		for(int k=0;k<25;k++){
			String s="j"+k;
			JLabel t=new JLabel();
			t.setBackground(Color.BLACK);
			//t.setForeground(Color.WHITE);
			t.setFont(new Font("Seravik", Font.PLAIN, 12));
			t.setLayout(null);
			t.setBounds(0,30*k, 100, 50);
			jLabelArrayList.add(t);
			jFrame2.add(t);
		}
		boolean b=false;
		String minutes="";
		int f=8;
		int count=0;
		for(int u=0;u<25;u++){
			
			if(b!=true){
				 minutes="30";
				 
			}else minutes="00";
			if(count==2){
				f++;
				count=0;
				minutes="00";
				
			}
			if(f==8 && count==0){
				minutes="00";
				
			}
			
			jLabelArrayList.get(u).setText(String.valueOf(f)+":"+String.valueOf(minutes));
			jLabelArrayList.get(u).setBackground(Color.BLACK);
			//jLabelArrayList.get(u).setForeground(Color.WHITE);
			jLabelArrayList.get(u).setLayout(null);
			count++;
			
			
			
		}
		ArrayList<JLabel> jLabelDaysArrayList=new ArrayList<>();
		String[] daysWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int y=0;y<7;y++){
			String stt="j"+(30+y);
			JLabel tempp=new JLabel();
			
			tempp.setBounds(50+150*y,0,150,150);
			
			tempp.setText(daysWeek[y]);
			//tempp.setForeground(Color.WHITE);
			tempp.setBackground(Color.BLACK);
			tempp.setLayout(null);
			tempp.setFont(new Font("Seravik", Font.PLAIN, 12));
			jLabelDaysArrayList.add(tempp);
			jFrame2.add(tempp);
		}
		
		ArrayList<JButton> jButtonArrayList=new ArrayList<>();
		for(int q=0;q<7;q++)
		{
		for(int i=0;i<24;i++){
			
			String st="b"+i;
			JButton temp=new JButton();
			temp.setLayout(null);
			temp.setBackground(Color.BLACK);
			temp.setBounds(200+25*q,75+15*i,100,25);
			jButtonArrayList.add(temp);
			jFrame2.add(temp);
		}
		
		}
		
		
		
	}
	public static void main(String arg[]){
		spreadsheet s=new spreadsheet();
		s.spreadsheetDisplay();
	}

}
