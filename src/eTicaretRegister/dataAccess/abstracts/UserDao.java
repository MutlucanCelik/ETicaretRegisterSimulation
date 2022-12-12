package eTicaretRegister.dataAccess.abstracts;

import java.util.List;

import eTicaretRegister.entities.concretes.User;

public interface UserDao {

	public void add(User user);
	
	public void delete(User user);
	
	public void update(User user);
	
	public User get(int id);
	
	public List<User> getAll();
	
	
}
