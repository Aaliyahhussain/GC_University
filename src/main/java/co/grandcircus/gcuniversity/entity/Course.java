package co.grandcircus.gcuniversity.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(Long id, String name, String category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		
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

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", category=" + category + "]";
	}
	
}
