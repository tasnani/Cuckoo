import java.util.ArrayList;
import java.util.HashMap;

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
	//updates schedule if user is off track
	public void offtrackNewSched(){
		
		
	}
	
	//TODO need to update int to Date
	//run when a job finishes
	public void updateProbabilities(){
		for(Job j: jobs){
			if(j.actualEndTime.day == -1) continue; //job isnt finished
			int overTime = j.length(j.endTime, j.actualEndTime); 
			
			
			//averages the previous accuracy and the accuracy for current job
			double percentOver = (double)overTime/j.estimatedJobLength() + 1;
			Job.subject_finishTimeAcc.put(j.subject, (percentOver+Job.subject_finishTimeAcc.get(j.subject))/2.0);
			
		}	
	}
	
	
	
	
	
	
	

}
