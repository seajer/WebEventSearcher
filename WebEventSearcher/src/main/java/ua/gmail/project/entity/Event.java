package ua.gmail.project.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.OneToOne;
import javax.validation.constraints.Max;

@Entity
@Table
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	
	private Date eventStart;
	
	private Date eventEnd;
	
	private int price;
	
	@Max(2000)
	private	String description;
	
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
	private Location location;
	
	@ManyToOne(cascade={CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY)
	private EventType eventType;

	public Event(){	
	}

	public Event(String name, Date eventStart, Date eventEnd, int price) {
		super();
		this.name = name;
		this.eventStart = eventStart;
		this.eventEnd = eventEnd;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getEventStart() {
		return eventStart;
	}

	public void setEventStart(Date eventStart) {
		this.eventStart = eventStart;
	}

	public Date getEventEnd() {
		return eventEnd;
	}

	public void setEventEnd(Date eventEnd) {
		this.eventEnd = eventEnd;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", eventStart=" + eventStart + ", eventEnd=" + eventEnd + ", price=" + price
				+ "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
