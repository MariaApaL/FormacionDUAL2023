package com.accenture.fers.entity;

import java.util.Set;

import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Validator;

/**
 * @Author Coritel
 *
 * @version v1
 *
 *          Entity class for Visitor
 */

public class Visitor extends People {


	private int visitorId;


	private String userName;


	private String password;


	private Set<Event> registeredEvents;

	public Visitor() {

	}

	public Visitor(Visitor visitor) {
		super(visitor);
		this.userName=visitor.userName;
		this.password=visitor.password;
		this.visitorId=visitor.visitorId;
		this.registeredEvents=visitor.registeredEvents;

	}

	public int getVisitorId() {
		return visitorId;
	}

	public void setVisitorId(int visitorId) {
		this.visitorId = visitorId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) throws FERSGenericException{
		
		boolean validate = Validator.lengthValidator(userName, 6, 12);
		
		if((userName!=null)&&!userName.equals("")&&validate) {
			this.userName=userName;
		}else {
			throw new FERSGenericException("Please provide Username");
		}
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password)throws FERSGenericException {
		
		boolean validate = Validator.lengthValidator(password, 6, 15);
		
		if((password!=null)&&!password.equals("")&&validate) {
			this.password=password;
		}else {
			throw new FERSGenericException("Please provide password");
		}
	}

	public Set<Event> getRegisteredEvents() {
		return registeredEvents;
	}

	public void setRegisteredEvents(Set<Event> registeredEvents) {
		this.registeredEvents = registeredEvents;
	}



}
