package com.niit.EComBack.test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.EComBack.dao.UserDAO;
import com.niit.EComBack.model.UserDetail;
public class UserDAOTestCase {
	static UserDAO userDAO;
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.EComBack");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
	}@Test
	public void registerUserTestCase() {
		UserDetail u=new UserDetail();
		u.setUserName("vitha");
		u.setPassword("pass");
		u.setEnabled(true);
		u.setAddress("mdu");
		u.setMobilno("880079");
		u.setEmailid("vitha@gmail.com");
		assertTrue("Probem in Adding the userdetails",userDAO.registerUser(u));
		}
	@Test
	public void updateUserTestCase() {
		UserDetail u=userDAO.getUser("vitha");
		u.setAddress("cbe");
		u.setMobilno("794677");
		assertTrue("Problem in Updating the userdetails",userDAO.updateUser(u));
		}}
