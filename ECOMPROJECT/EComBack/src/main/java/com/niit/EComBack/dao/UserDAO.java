package com.niit.EComBack.dao;
import com.niit.EComBack.model.UserDetail;
public interface UserDAO {
	public boolean registerUser(UserDetail userDetail);
	public boolean updateUser(UserDetail userDetail);
	
public UserDetail getUser(String UserName);



}
