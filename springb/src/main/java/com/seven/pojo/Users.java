package com.seven.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "lrh")
public class Users {

	private String name;
	private int age;
	private String sex;
	private int id;
	private String password;
	
	
	public Users() {
		super();
	}
	
	
	
	public Users(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}



	public Users(String name, int age, String sex, int id, String password) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = id;
		this.password = password;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
