package ua.gmail.project.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import ua.gmail.project.entity.EventType;
import ua.gmail.project.entity.Location;

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
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
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
	
	
}
