package inventorymanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventorymanagement.entities.User;
import inventorymanagement.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public ResponseEntity<String> saveUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<String>("User has been Saved successfully", HttpStatus.OK);
	}

	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

}
