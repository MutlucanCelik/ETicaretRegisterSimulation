package eTicaretRegister.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretRegister.dataAccess.abstracts.UserDao;

import eTicaretRegister.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	
	


	List<User> userList = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile kaydedildi : " + user.getName()+ " " + user.getLastName());
		userList.add(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		
		
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return userList;
	}

}
