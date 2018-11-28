package co.grandcircus.gcuniversity.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuniversity.entity.User;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAll() {
		return em.createQuery("FROM User", User.class).getResultList();
	}
	
	public List<User> findByUserName(String userName) {
		return em.createQuery("FROM User WHERE userName = :userName", User.class)
				.setParameter("name", userName)
				.getResultList();
	}
	
	public List<User> findByPassword(String password) {
		return em.createQuery("FROM User WHERE password = :password", User.class)
				.setParameter("password", password)
				.getResultList();
	}
	
	public User findById(Long id) {
		return em.find(User.class, id);
	}


	
	
}
