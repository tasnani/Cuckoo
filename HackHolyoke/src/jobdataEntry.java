import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.util.ArrayList;
public class jobdataEntry {
	public ArrayList<Job> createJobs = new ArrayList<Job>();
	int countID = 1;
	public Job createJob(int expectedDuration, String subject, int dayOfTheWeek, int time){
		Date deadline = new Date(dayOfTheWeek, time);
		Job j = new Job(expectedDuration, subject, countID++, deadline);
		j.updateExpectedDuration();
		return j;
		
	}
	public void jobdataEntryDisplay(){
		JFrame jFrame3=new JFrame();
		jFrame3.setSize(500,400);
		
		jFrame3.setLocationRelativeTo(null);
		
		JTextField expectedDuration=new JTextField();
		JTextField subject=new JTextField();
		JButton jbSubmit=new JButton("Submit Job");
		jbSubmit.setBounds(180,230, 100,50);
		String[] daysoftheWeek={"Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		JComboBox day=new JComboBox(daysoftheWeek);
		day.setSelectedIndex(0);
		day.setBounds(180,150,200,200);
		JLabel dayLabel=new JLabel("Day");
		dayLabel.setBounds(125,235,150,35);
		JLabel spinnerLabel=new JLabel("Interval");
		spinnerLabel.setBounds(70,160,150,35);
		
		JLabel spinnerLabel2=new JLabel("Hours");
		spinnerLabel2.setBounds(220,160,150,35);
		
		JSpinner mySpinner = new JSpinner();
		JSpinner mySpinner2=new JSpinner();
		
		
		mySpinner.setModel(new SpinnerNumberModel(0,0,30,30));
		mySpinner2.setModel(new SpinnerNumberModel(8,8,19,1));
		mySpinner.setBounds(150,150,50,50);
		mySpinner2.setBounds(280,150,50,50);
		jbSubmit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event){
			String subjecText=subject.getText();
			String expectedDurationValue=expectedDuration.getText();
			String dayoftheWeek=day.getSelectedItem().toString();
			int intervalValue=(int)mySpinner.getValue();
			int hourValue=(int)mySpinner2.getValue();
			int dayoftheWeekInteger;
			
			switch(dayoftheWeek){
			case "Monday": dayoftheWeekInteger=0;
			case "Tuesday": dayoftheWeekInteger=1;
			case "Wednesday": dayoftheWeekInteger=2;
			case "Thursday": dayoftheWeekInteger=3;
			case "Friday": dayoftheWeekInteger=4;
			case "Saturday": dayoftheWeekInteger=5;
			default: dayoftheWeekInteger=6;
			
			}
			
			int hourIntegerValue;
			if(hourValue==8 & intervalValue==0){
				hourIntegerValue=0;

			}
			if(hourValue==8 & intervalValue==30){
				hourIntegerValue=1;

			}
			if(hourValue==9 & intervalValue==0){
				hourIntegerValue=2;
			}
			if(hourValue==9 & intervalValue==30){
				hourIntegerValue=3;

			}
			if(hourValue==10 & intervalValue==0){
				hourIntegerValue=4;
			
			
			}
			if(hourValue==10 & intervalValue==30){
				hourIntegerValue=5;
			
			
			}
			if(hourValue==11 & intervalValue==0){
				hourIntegerValue=6;
			
			
			}
			if(hourValue==11 & intervalValue==30){
				hourIntegerValue=7;
			
			
			}
			if(hourValue==12 & intervalValue==0){
				hourIntegerValue=8;
			
			
			}
			if(hourValue==12 & intervalValue==30){
				hourIntegerValue=9;
			
			
			}
			if(hourValue==13 & intervalValue==0){
				hourIntegerValue=10;
			
			
			}
			if(hourValue==13 & intervalValue==30){
				hourIntegerValue=11;
			
			
			}
			if(hourValue==14 & intervalValue==0){
				hourIntegerValue=12;
			
			
			}
			if(hourValue==14 & intervalValue==30){
				hourIntegerValue=13;
			
			
			}
			if(hourValue==15 & intervalValue==0){
				hourIntegerValue=14;
			
			
			}
			if(hourValue==15 & intervalValue==30){
				hourIntegerValue=15;
			
			
			}
			if(hourValue==16 & intervalValue==0){
				hourIntegerValue=16;
			
			
			}
			if(hourValue==16 & intervalValue==30){
				hourIntegerValue=17;
			
			
			}
			if(hourValue==17 & intervalValue==0){
				hourIntegerValue=18;
			
			
			}
			if(hourValue==17 & intervalValue==30){
				hourIntegerValue=19;
			
			
			}
			if(hourValue==18 & intervalValue==0){
				hourIntegerValue=20;
			
			
			}
			if(hourValue==18 & intervalValue==30){
				hourIntegerValue=21;
			
			
			}
			if(hourValue==19 & intervalValue==0){
				hourIntegerValue=22;
			
			
			}
			else{
				hourIntegerValue=23;
			
			
			}
			
			int expectedDurationValueTwice=Integer.parseInt(expectedDurationValue)*2;
			createJobs.add(createJob(expectedDurationValueTwice, subjecText, dayoftheWeekInteger, hourIntegerValue ));
			subject.setText("");
			expectedDuration.setText("");
			mySpinner.setValue(0);
			mySpinner2.setValue(8);
			day.setSelectedIndex(0);
			
			
		}});
		
	
		JButton Begin=new JButton("Begin Scheduling");
		Begin.setBounds(180,275, 100,50);
		
		Begin.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent event){
			scheduling s = new scheduling(spreadsheet.generateAvailableTimes());
			s.jobs = createJobs;
			s.scheduleJobs();
			}
		});
		
		//Dimension d=new Dimension(50,50);
		//mySpinner.setPreferredSize(d);
		JLabel expectedDurationLabel=new JLabel("Expected duration(hours): ");
		expectedDurationLabel.setBounds(10,20,180,35);
		
		expectedDuration.setBounds(250, 25, 150, 35);
		
		expectedDurationLabel.setVisible(true);
		expectedDuration.setVisible(true);
		jFrame3.add(expectedDurationLabel);
        jFrame3.add(expectedDuration);
        
        JLabel subjectLabel=new JLabel("Description of job: ");
        subjectLabel.setBounds(10,70, 150, 35);
        
        subject.setBounds(250, 70, 150, 35);
        jFrame3.add(subjectLabel);
        jFrame3.add(subject);
        jFrame3.add(day);
        jFrame3.add(dayLabel);
        jFrame3.add(jbSubmit);
        jFrame3.add(Begin);
        jFrame3.add(spinnerLabel);
        jFrame3.add(spinnerLabel2);
		jFrame3.add(mySpinner);
		jFrame3.add(mySpinner2);
		jFrame3.setLayout(null);
		jFrame3.setVisible(true);
	
		
		
	}
	public static void main(String[] s){
		jobdataEntry jbed=new jobdataEntry();
		jbed.jobdataEntryDisplay();
	}

}
