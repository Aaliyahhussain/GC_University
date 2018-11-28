package co.grandcircus.gcuniversity.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Admin extends User {

	@Override
	boolean isAdmin() {
		// TODO Auto-generated method stub
		return true;
	}
	
}
