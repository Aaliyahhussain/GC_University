package co.grandcircus.gcuniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuniversity.entity.Course;
import co.grandcircus.gcuniversity.entity.User;

@Repository
@Transactional
public class StudentDao {
	
	@PersistenceContext
	private EntityManager em;
	
	// finds a list of all courses for admin menu
	public List<Course> findAll() {
		return em.createQuery("FROM Course", Course.class).getResultList();
	}
	
	// finds all of a user's courses for the home
	public List<Course> findAllUserCourses(User user) {
		return em.createQuery("SELECT e.course FROM Enrollment AS e WHERE e.student.id = :user", Course.class).setParameter
				("user", user.getId()).getResultList();
	}
	
	// search by keyword for student enrollment
	
	// method to add course and student to enrollment
	
	// read students information about a specific course AND all grades from that course

}
