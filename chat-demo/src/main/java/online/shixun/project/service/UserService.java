package online.shixun.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.shixun.project.dao.UserDao;
import online.shixun.project.model.UserModel;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserDao getMessageDao;
	
	public Long saveMessage(UserModel message) {
		return userDao.save(message);
	}
	
	public List<UserModel> getMessage() {
		return getMessageDao.messages();
	}
}
