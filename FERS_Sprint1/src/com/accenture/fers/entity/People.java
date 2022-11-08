package com.accenture.fers.entity;

import com.accenture.fers.exceptions.FERSGenericException;
import com.accenture.fers.utils.Validator;

/**
 *
 * Accenture Technology Solutions
 *
 *
 * @version v1
 *
 */

public class People {



	private String address;


	private String firstName;


	private String lastName;


	private String email;


	private String phoneNumber;


	private String dni;

	public People() {

	}

	public People(People people) {
		this.address=people.address;
		this.dni=people.dni;
		this.email=people.email;
		this.firstName=people.firstName;
		this.phoneNumber=people.phoneNumber;
		this.lastName=people.lastName;

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) throws FERSGenericException{
		boolean validate = Validator.lengthValidator(address, 1, 30);
		
		if((address!=null)&&!address.equals("")&&validate) {
			this.address=address;
		}else {
			throw new FERSGenericException("Please provide a correct address");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName)throws FERSGenericException {
		boolean validate = Validator.lengthValidator(firstName, 1, 30);
		
		if((firstName!=null)&&!firstName.equals("")&&validate) {
			this.firstName=firstName;
		}else {
			throw new FERSGenericException("Please provide Firstname");
		}
	}
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws FERSGenericException {
		boolean validate = Validator.lengthValidator(lastName, 1, 30);
		
		if((lastName!=null)&&!lastName.equals("")&&validate) {
			this.lastName=lastName;
		}else {
			throw new FERSGenericException("Please provide Lastname");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws FERSGenericException {
		boolean validLength = Validator.lengthValidator(email,3, 200);
		boolean validEmail = Validator.emailValidator(email);
		
		if(validEmail&&validLength) {
			this.email=email;
		}else {
			throw new FERSGenericException("Please provide a valid email");
		}
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) throws FERSGenericException {
		//boolean validLength = Validator.lengthValidator(phoneNumber,10, 20);
		boolean validPhone = Validator.phoneValidator(phoneNumber);
		
		if(validPhone) {
			this.phoneNumber=phoneNumber;
		}else {
			throw new FERSGenericException("Invalid Phone number");
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) throws FERSGenericException {
		//boolean validLength = Validator.lengthValidator(dni,1 , 9);
		boolean validDni = Validator.dniValidator(dni);
		
		if(validDni) {
			this.dni=dni;
		}else {
			throw new FERSGenericException("Please provide a valid dni");
		}
	}


}
