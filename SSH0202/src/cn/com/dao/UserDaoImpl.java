package cn.com.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.com.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(user);
	}

	@Override
	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(findbyid(id));
	}

	@Override
	public User findbyid(Serializable id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(User.class, id);
	}

	@Override
	public List<User> findall() {
		// TODO Auto-generated method stub
		return (List<User>) this.getHibernateTemplate().find("from User", null);
	}

	@Override
	public User findbyuser(User user) {
		// TODO Auto-generated method stub
	List<User>	ls=(List<User>) this.getHibernateTemplate().find("from User where username=? and password=?",user.getUsername(),user.getPassword());
		return ls.size()>0?ls.get(0):null;
	}

}
