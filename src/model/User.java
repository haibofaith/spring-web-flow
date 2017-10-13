package model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class User implements Serializable{
	@NotNull
	@Size(min=2,max=12)
	private String userName;
	@NotNull
	@Size(min=5,max=12)
	private String firstName;
	@NotNull
	@Size(min=5,max=12)
	private String lastName;
	@NotNull
	@Size(min=5,max=12)
	private String password;
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Spitter [userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", password="
				+ password + "]";
	}
	
	
}
