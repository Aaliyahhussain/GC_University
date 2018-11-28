package co.grandcircus.gcuniversity.entity;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Admin extends User {

	@Override
	boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
