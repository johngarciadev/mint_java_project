package mint;

public class Events {
	
	private String startDate;
	private String endDate;
	private String eventType;
	private String description;
	
	public Events(String startDate, String endDate, String eventType, String description) {
		this.startDate = startDate;
		this.endDate = endDate;
		this.eventType = eventType;
		this.description = description;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String newStartDate) {
		startDate = newStartDate;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String newEndDate) {
		endDate = newEndDate;
	}
	
	public String getEventType() {
		return eventType;
	}
	
	public void setEventType(String newEventType) {
		eventType = newEventType;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String newDescription) {
		description = newDescription;
	}

}
