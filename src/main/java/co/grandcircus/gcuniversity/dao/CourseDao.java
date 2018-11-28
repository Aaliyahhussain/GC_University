package co.grandcircus.gcuniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuniversity.entity.Course;



@Repository
@Transactional
public class CourseDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Course> findAll() {
		return em.createQuery("FROM Course", Course.class).getResultList();
	}
	
	public Course findById(Long id) {
		return em.find(Course.class, id);
	}

}
