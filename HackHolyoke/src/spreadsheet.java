import java.awt.Color; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class spreadsheet implements ActionListener {
	public static ArrayList<String> buttonNo=new ArrayList<>();
	public void spreadsheetDisplay(){
		JFrame jFrame2=new JFrame();
		jFrame2.setSize(1100,810);
		jFrame2.setBackground(Color.BLACK);
		
		
		
		
		
		ArrayList<JLabel> jLabelArrayList=new ArrayList<>();
		for(int k=0;k<24;k++){
			String s="j"+k;
			JLabel t=new JLabel();
			t.setBackground(Color.BLACK);
			//t.setForeground(Color.WHITE);
			t.setFont(new Font("Seravik", Font.PLAIN, 12));
			t.setLayout(null);
			t.setBounds(0,(int)31.5*k, 100, 50);
			
			jLabelArrayList.add(t);
			jFrame2.add(t);
			t.setVisible(true);
		}
		boolean b=false;
		String minutes="";
		int f=8;
		int count=0;
		for(int u=0;u<24;u++){
			
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
			jLabelArrayList.get(u).setVisible(true);
			count++;
			
			
			
		}
		ArrayList<JLabel> jLabelDaysArrayList=new ArrayList<>();
		String[] daysWeek={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int y=0;y<7;y++){
			String stt="j"+(30+y);
			JLabel tempp=new JLabel();
			
			tempp.setBounds(75+150*y,0,150,25);
			
			tempp.setText(daysWeek[y]);
			//tempp.setForeground(Color.WHITE);
			tempp.setBackground(Color.BLACK);
			tempp.setLayout(null);
			tempp.setFont(new Font("Seravik", Font.PLAIN, 12));
			jLabelDaysArrayList.add(tempp);
			jLabelDaysArrayList.get(y).setVisible(true);
			jFrame2.add(tempp);
			
		}
		for(int o=0;o<7;o++){
			jLabelDaysArrayList.get(o).setVisible(true);
		}
		
		ArrayList<JButton> jButtonArrayList=new ArrayList<>();
		
		//blah
		int cnt=0;
		for(int q=0;q<7;q++)
		{
		for(int i=0;i<24;i++){
			
			String st=""+q+" "+i;
			JButton temp=new JButton();
			temp.setLayout(null);
			temp.setBackground(Color.BLACK);
			temp.setBounds(50+150*q,25+31*i,100,25);
			//temp.setBorderPainted(false);
			temp.setOpaque(true);
			temp.setBackground(Color.RED);
			temp.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event){
				temp.setBackground(Color.green);
				System.out.println(st);
				buttonNo.add(st);
				
			}
			});
			
			
			jButtonArrayList.add(temp);
			jFrame2.add(temp);
			temp.setVisible(true);
			cnt++;
		}
		
		}
		for(int g=0;g<168;g++){
			jButtonArrayList.get(g).setVisible(true);
				
			}
		
		
		jFrame2.setLayout(null);
		jFrame2.setVisible(true);
		}
		
		
		
	
	public static void main(String arg[]){
		spreadsheet s=new spreadsheet();
		s.spreadsheetDisplay();
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static int[][] generateAvailableTimes(){
		int[][] scheduleTimes = new int[7][24];
		for(String s : buttonNo){
			String[] nums = s.split(" ");
			scheduleTimes[Integer.parseInt(nums[0])][Integer.parseInt(nums[1])] = 1;
		}
		return scheduleTimes;
		}


	

}
