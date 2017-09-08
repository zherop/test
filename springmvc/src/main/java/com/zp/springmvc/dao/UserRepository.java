package com.zp.springmvc.dao;

import java.util.List;

import com.zp.springmvc.model.User;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月30日
 */
public interface UserRepository {
	public List<User> findUsers();

	public User findOne(String name);

	public boolean save(User user);
}
