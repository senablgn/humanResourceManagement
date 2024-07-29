package kodlamaio.hrms2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms2.business.abstracts.UserService;
import kodlamaio.hrms2.core.utilities.results.DataResult;
import kodlamaio.hrms2.core.utilities.results.Result;
import kodlamaio.hrms2.entities.concretes.User;

@RestController
@RequestMapping("api/users")
public class Users {
	
	private UserService userService;
	
	
	@Autowired
	public Users(UserService userService) {
		super();
		this.userService = userService;
	}


	@GetMapping("/getUsers")
	public DataResult<List<User>> getUsers(){
		return this.userService.getUsers();
		
	}
	@PostMapping("/addUser")
	public Result addUser(@RequestBody User user) {
		return this.userService.add(user);
	}

}
