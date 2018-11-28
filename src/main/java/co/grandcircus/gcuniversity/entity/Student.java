package co.grandcircus.gcuniversity.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
public class Student extends User {
	
	private String phoneNumber;
	private String address;
	@OneToMany(mappedBy="student")
	private List<Enrollment> enrollments;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id, String username, String password, String firstName,
			String lastName, String phoneNumber, String address, List<Enrollment> enrollments) {
		super();
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.enrollments = enrollments;
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

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	@Override
	public boolean isAdmin() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
