package com.zp.springmvc.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author 曾鹏
 * @mail zp@zving.com
 * @date 2017年8月30日
 */
public class User {
	@NotNull(message = "name不能为空")
	@Size(min = 4, max = 10, message = "name的字符长度为4-10")
	public String name;

	@NotNull(message = "age不能为空")
	@Digits(integer = 2, fraction = 0, message = "age必须为0-99的整数")
	public int age;

	@Size(max = 50, message = "desc长度不能超过50")
	public String desc;

	public String headPicture;

	public User() {
	}

	public User(String name, int age, String desc) {
		this.name = name;
		this.age = age;
		this.desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getHeadPicture() {
		return headPicture;
	}

	public void setHeadPicture(String headPicture) {
		this.headPicture = headPicture;
	}

}
