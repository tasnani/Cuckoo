import java.util.HashMap;
import java.util.ArrayList;

//finishTimeAcc looks at assignment types and history of job completion. Calculates accuracy of estimated completion
//versus actual completion time determined from startTime and finishTime. Defaults to 100% accuracy
public class Job {
	public static HashMap<String, Double> subject_finishTimeAcc = new HashMap<String, Double>();
	public int ID; //unique ID for schedule array as identifier
	public int expectedDuration; //used for the schedule calculation. Based of user entered data + probability
	public String subject;
	public Date hardDueDate; //date assignment/event is due
	public Date actualStartTime;//user entered when starting
	public Date actualEndTime = new Date(-1, -1); 
	public Date startTime; //assigned by scheduler
	public Date endTime;
	public int weightedImportance = 10; //how important to finish on time. Defaults to max = 10
	
	public Job(int expectedDuration, String subject, int ID, Date hardDueDate){
		this.expectedDuration = expectedDuration;
		this.subject = subject;
		this.hardDueDate = hardDueDate;
		if(!Job.subject_finishTimeAcc.containsKey(subject)) Job.subject_finishTimeAcc.put(subject, 1.0);
		this.ID = ID;
		
	}
	//takes into account probability
	public void updateExpectedDuration(){
		this.expectedDuration = (int) (this.expectedDuration*Job.subject_finishTimeAcc.get(this.subject));
	}
	
	public Job(int expectedDuration, String subject, int ID, Date hardDueDate, int weightedImportance){
		this(expectedDuration, subject, ID, hardDueDate);
		this.weightedImportance = weightedImportance;
	}
	
	public int estimatedJobLength(){
		return length(this.startTime, this.endTime);
	}
	
	public int length(Date start, Date end){
		return (end.day-start.day)*24 + end.time - start.time; 
	}
	
}
