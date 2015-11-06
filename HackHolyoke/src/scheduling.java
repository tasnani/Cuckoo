import java.util.ArrayList;
import java.util.HashMap;
import java.util.Calendar;
import java.util.Date;
public class scheduling {
	public int[][] selectedTimes = new int[7][24]; //7 days of the week, 30 minute intervals from 8am - 8pm
	public int[][] jobSchedule = new int[7][24]; //job ids fill array during their alloted times
	public ArrayList<Job> jobs;
	public scheduling(int[][] selectedTimes){
		this.selectedTimes = selectedTimes;
	}
	public void addJob(Job j){
		jobs.add(j);
	}
	public void addJobs(ArrayList<Job> js){
		jobs.addAll(js);
		
	}
	//TODO
	//does the job scheduling
	public void scheduleJobs(){}
	
	//TODO
	//updates schedule if offtrack
	public void offtrackNewSched(){
		
	}
	
	
	
	
	
	
	

}
