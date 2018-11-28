package co.grandcircus.gcuniversity.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private Long id;
	@Column 
	private String name;
	@Column
	private String category;
	@OneToMany(mappedBy="course")
	private List<Enrollment> enrollments;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(Long id, String name, String category, List<Enrollment> enrollments) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.enrollments = enrollments;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	
}
