import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class scheduling {
	public Date systemTime; //updates when a user enters a start time or an end time to that new date
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
	
	//does the job scheduling
	public void scheduleJobs(){
		System.out.println("hi");
		for(int i = 0; i<7; i++)
			for(int k = 0; k<24; k++)
				this.jobSchedule[i][k] = -1;
		int currentJob = 0; //index of job
		
		Collections.sort(this.jobs);
		int timeLeft = 0;
		int count = 0; //fencepost
		for(int i = 0; i<7; i++)
			for(int j = 0; j<24; j++){
				if(currentJob == this.jobs.size()) {jobSchedule[i][j]=-1; continue;}//ran out of jobs
				if(selectedTimes[i][j]==1){
					if(timeLeft==0 && currentJob==0 && count == 0){ 
						jobs.get(0).startTime = new Date(i, j); 
						timeLeft = jobs.get(currentJob).timeLeft;
						count++;
					}
					if(timeLeft == 0){
						jobs.get(0).endTime = new Date(i, j); 
						currentJob++;
						if(currentJob == jobs.size()){jobSchedule[i][j]=-1; continue;} //ran out of jobs!
						timeLeft = jobs.get(currentJob).timeLeft;
						jobs.get(currentJob).startTime = new Date(i, j);
					}
					timeLeft--;
					jobSchedule[i][j]=jobs.get(currentJob).ID;
				}
			}
	}
	
	//updates selected times and reschedules
	public void offtrackNewSched(){
		for(int i = 0; i<=systemTime.day; i++)
			for(int j= 0; j<=systemTime.time; j++){
				this.selectedTimes[i][j] = 0;
			}
		scheduleJobs();
	}
	
	
	//run when a job finishes
	public void updateProbabilities(){
		for(int i = 0; i<this.jobs.size(); i++){
			if(this.jobs.get(i).actualEndTime.day == -1) continue; //job isnt finished
			int overTime = this.jobs.get(i).length(this.jobs.get(i).endTime, this.jobs.get(i).actualEndTime); 
			
			
			//averages the previous accuracy and the accuracy for current job
			double percentOver = (double)overTime/this.jobs.get(i).estimatedJobLength() + 1;
			Job.subject_finishTimeAcc.put(this.jobs.get(i).subject, (percentOver+Job.subject_finishTimeAcc.get(this.jobs.get(i).subject))/2.0);
			this.jobs.remove(i);
			i--;
			
		}	
	}
	
	
	
	
	
	
	

}
