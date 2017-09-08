package com.zp.springmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.zp.springmvc.model.User;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月30日
 */
@Component
public class UserDefaultRepository implements UserRepository {
	private List<User> users = new ArrayList<User>();
	{
		users.add(new User("zp", 25, "haha"));
		users.add(new User("zt", 25, "heheh"));
		users.add(new User("zx", 25, "oooo"));
	}

	public List<User> findUsers() {
		return users;
	}

	public User findOne(String name) {
		List<User> findUsers = findUsers();
		if (findUsers != null) {
			for (User user : findUsers) {
				if (user.getName().equals(name)) {
					return user;
				}
			}
		}
		return null;
	}

	public boolean save(User user) {
		return users.add(user);
	}
}
