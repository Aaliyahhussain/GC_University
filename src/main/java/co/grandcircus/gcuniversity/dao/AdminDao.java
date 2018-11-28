package co.grandcircus.gcuniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuniversity.entity.User;

@Repository
@Transactional
public class AdminDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}
	
	public User validateUserExists(String username, String password) {
		return em.createQuery("FROM User WHERE userName = :username AND password = :password", User.class)
				.setParameter("username", username).setParameter("password", password).getSingleResult();
	}
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}


	
	
}
