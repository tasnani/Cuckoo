import java.util.HashMap;

//finishTimeAcc looks at assignment types and history of job completion. Calculates accuracy of estimated completion
//versus actual completion time determined from startTime and finishTime. Defaults to 100% accuracy
public class Job {
	public static HashMap<String, Integer> subject_finishTimeAcc = new HashMap<String, Integer>();
	public int ID;
	public int expectedDuration;
	public String subject;
	public int startTime;
	public int endTime;
	public int weightedImportance = 10; //how important to finish on time. Defaults to max = 10
	
	public Job(int expectedDuration, String subject, int ID){
		this.expectedDuration = expectedDuration;
		this.subject = subject;
		if(!Job.subject_finishTimeAcc.containsKey(subject)) Job.subject_finishTimeAcc.put(subject, 1);
		this.ID = ID;
		
	}
	
	public Job(int expectedDuration, String subject, int ID, int weightedImportance){
		this(expectedDuration, subject, ID);
		this.weightedImportance = weightedImportance;
	}
	//TODO
	//run when a job finishes
	public void updateProbabilities(){}
}
