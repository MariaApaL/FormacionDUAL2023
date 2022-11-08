package com.accenture.fers.entity;

import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Validator;

/**
 * Accenture Technology Solutions
 *
 *
 * @version v1
 *
 *          Entity class for Event
 */

public class Event {




	private int eventId;


	private String name;


	private String description;


	private String place;


	private String duration;


	private String eventType;


	private int seatsAvailable;

	/**
	 * Default constructor
	 *
	 * @param event
	 *
	 */
	public Event() {

	}
	/**
	 * Copy constructor
	 *
	 * @param event
	 */
	public Event(Event event) {
		super();
		this.eventId=event.eventId;
		this.description=event.description;
		this.duration=event.duration;
		this.eventType=event.eventType;
		this.name=event.name;
		this.place=event.place;

	}
	
	

	public Event(int eventId, String name, String eventType, int seatsAvailable) {
		super();
		this.eventId = eventId;
		this.name = name;
		this.eventType = eventType;
		this.seatsAvailable = seatsAvailable;
	}
	
	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws FERSGenericException {

		boolean validate = Validator.lengthValidator(name, 1, 30);
		
		if((name!=null)&&!name.equals("")&&validate) {
			this.name=name;
		}else {
			throw new FERSGenericException("Please provide a name");
		}
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}


}
