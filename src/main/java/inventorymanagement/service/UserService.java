package inventorymanagement.service;

import inventorymanagement.entities.User;

public interface UserService {

	void saveUser(User user);
	
	User updateUser(User user);

}