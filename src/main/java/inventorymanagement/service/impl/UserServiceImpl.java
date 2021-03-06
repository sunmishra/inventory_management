package inventorymanagement.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inventorymanagement.entities.User;
import inventorymanagement.repository.UserRepository;
import inventorymanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Override
	@Transactional
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		if (userRepository.findById(user.getUserId()).isPresent()) {
			User existingUser = userRepository.findById(user.getUserId()).get();
			existingUser.setSalutation(user.getSalutation());
			existingUser.setFirstName(user.getFirstName());
			existingUser.setLastName(user.getLastName());
			existingUser.setGender(user.getGender());
			existingUser.setMobile(user.getMobile());
			existingUser.setEmail(user.getEmail());
			existingUser.setAddress(user.getAddress());
			existingUser.setRole(user.getRole());
			existingUser.setStatus(user.getStatus());
			return userRepository.save(user);
		} else
			return null;

	}
}
