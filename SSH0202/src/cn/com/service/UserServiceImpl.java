package cn.com.service;

import java.util.List;

import cn.com.dao.UserDao;
import cn.com.pojo.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		this.userDao.save(user);//服务层代码调用数据访问层
	}
	@Override
	public List<User> findUser() {
		return this.userDao.findall();
	}
	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		
		return this.userDao.findbyuser(user);
	}

}
