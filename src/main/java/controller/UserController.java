package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.User;
import service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insert(){
		User user = new User();
		user.setName("test00");
		user.setPassword("test00");
		userService.insert(user);
		return "success";
	}
}
