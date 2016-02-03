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
	private String imageUrl;
	@OneToMany(cascade={CascadeType.MERGE, CascadeType.PERSIST}, fetch = FetchType.LAZY , mappedBy="eventType")
	private List<Event> events;
	
	
	public EventType() {
	}

	public EventType(String typeName, String imageUrl) {
		super();
		this.typeName = typeName;
		this.imageUrl = imageUrl;
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
		return typeName;
		}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
}
