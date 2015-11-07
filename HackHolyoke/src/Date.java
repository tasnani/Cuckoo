
public class Date implements Comparable<Date> {
	public int day; //0 to 6
	public int time; //0 to 23
	
	public Date(int day, int time){
		this.day = day;
		this.time = time;
			
	}

	@Override
	public int compareTo(Date o) {
		return this.day*100+this.time-o.day*100-o.time;
	}
}
