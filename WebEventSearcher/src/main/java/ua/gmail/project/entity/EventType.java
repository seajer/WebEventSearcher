package ua.gmail.project.entity;

import java.util.List;

import javax.persistence.*;



@Entity
@Table
@NamedQueries({
		@NamedQuery(name = "EventType.findByTypeName", query = "select a from EventType a where a.typeName like :typeName")})
public class EventType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String typeName;
	@OneToMany(cascade={CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY /*, mappedBy="write the mapping option "*/)
	private List<Event> events;
	
	
	public EventType() {
		super();
		
	}


	public EventType(String typeName) {
		super();
		this.typeName = typeName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTypeName() {
		return typeName;
	}


	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}


	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}


	@Override
	public String toString() {
		return "EventType [id=" + id + ", typeName=" + typeName + ", events=" + events + "]";
	}

	
	
}
