package ua.gmail.project.dto;

public class EventDTO {

	
	private String id;
	
	private String name;
	
	private String eventStart;
	
	private String eventEnd;
	
	private String price;
	
	private	String description;
	
	private String imageUrl;
	
	private String location;
	
	private String eventType;
	
	
	public EventDTO(String id, String name, String eventStart, String eventEnd, String price, String description, String imageUrl,
			String location, String eventType) {
		super();
		this.id = id;
		this.name = name;
		this.eventStart = parseData(eventStart);
		this.eventEnd = parseData(eventEnd);
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.location = location;
		this.eventType = eventType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEventStart() {
		return eventStart;
	}

	public void setEventStart(String eventStart) {
		this.eventStart = eventStart;
	}

	public String getEventEnd() {
		return eventEnd;
	}

	public void setEventEnd(String eventEnd) {
		this.eventEnd = eventEnd;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String parseData(String data){
		String[] dateTime = data.split(" ");
		String[] date = dateTime[0].split("-");
		String newData = null;
		if(date[1].equals("01")){newData = "January";}	if(date[1].equals("02")){newData = "February";}
		if(date[1].equals("03")){newData = "March";}	if(date[1].equals("04")){newData = "April";}
		if(date[1].equals("05")){newData = "May";}		if(date[1].equals("06")){newData = "June";}
		if(date[1].equals("07")){newData = "July";}		if(date[1].equals("08")){newData = "August";}
		if(date[1].equals("09")){newData = "September";}if(date[1].equals("10")){newData = "October";}
		if(date[1].equals("11")){newData = "November";}	if(date[1].equals("12")){newData = "December";}
		newData = newData + " " + date[2].replace("0", "");
		String[] time = dateTime[1].split(":");
		String newTime = time[0] + ":" + time[1];
		String newDataTime = newData + " " + newTime;
//		return newTime;
		return newDataTime;
	}
}
