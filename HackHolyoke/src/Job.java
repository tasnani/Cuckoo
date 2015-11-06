import java.util.HashMap;

//finishTimeAcc looks at assignment types and history of job completion. Calculates accuracy of estimated completion
//versus actual completion time determined from startTime and finishTime. Defaults to 100% accuracy
public class Job {
	public static HashMap<String, Integer> subject_finishTimeAcc = new HashMap<String, Integer>();
	public int ID;
	public int expectedDuration;
	public String subject;
	public int hardDueDate; //date assignment/event is due
	public int actualStartTime;//user entered when starting
	public int actualEndTime;
	public int startTime; //assigned by scheduler
	public int endTime;
	public int weightedImportance = 10; //how important to finish on time. Defaults to max = 10
	
	public Job(int expectedDuration, String subject, int ID, int hardDueDate){
		this.expectedDuration = expectedDuration;
		this.subject = subject;
		this.hardDueDate = hardDueDate;
		if(!Job.subject_finishTimeAcc.containsKey(subject)) Job.subject_finishTimeAcc.put(subject, 1);
		this.ID = ID;
		
	}
	
	public Job(int expectedDuration, String subject, int ID, int hardDueDate, int weightedImportance){
		this(expectedDuration, subject, ID, hardDueDate);
		this.weightedImportance = weightedImportance;
	}
	//TODO
	//run when a job finishes
	public void updateProbabilities(){}
}
