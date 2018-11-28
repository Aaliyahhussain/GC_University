package co.grandcircus.gcuniversity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Student extends User {
	
	@Column 
	private String phoneNumber;
	@Column
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String phoneNumber, String address) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public Student(Long id, String username, String password, String firstName, String lastName) {
		super(id, username, password, firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}

	@Override
	boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

}
