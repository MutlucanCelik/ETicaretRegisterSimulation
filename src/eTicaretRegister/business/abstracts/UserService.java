package eTicaretRegister.business.abstracts;



import eTicaretRegister.core.abstracts.GoogleUserInformationService;
import eTicaretRegister.entities.concretes.User;

public interface UserService {
	
	public void add(User user);
	
	public void delete(User user);
	
	public void update(User user);
	
	public void registerWithGoogle(GoogleUserInformationService info);
	
	public void login();
	
	public User getUser(int id);
	
	public void getAll();

	
	

}
