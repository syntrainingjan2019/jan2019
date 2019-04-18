package enumsfunctions;

public enum whatistoday {
	Sunday(1),
	Monday(2),
	Tuesday(3),
	Wednesday(4),
	Thursday(5),
	Friday(6),
	Saturday(7);
	
	private int day;
	whatistoday(int day){
		this.day=day;
	}
	public int getday(){
		return day;
	}
}
