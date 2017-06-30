package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.UserDao;
import entity.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	public void insert(User user){
		Integer id = userDao.queryId();
		id=id+1;
		user.setName(user.getName()+id);
		user.setPassword(user.getPassword()+id);
		userDao.insert(user);
	}
}
 