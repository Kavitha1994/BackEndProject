package com.niit.EComBack;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.EComBack.model.Category;

@Configuration
@ComponentScan("com.niit.EcomBack")
@EnableTransactionManagement
public class DBConfig
{
	@Bean("datasource")
	DataSource dbConnect()
	{
		DriverManagerDataSource d=new DriverManagerDataSource();
		d.setDriverClassName("org.h2.Driver");
		d.setUrl("jdbc:h2:~/test");
		d.setUsername("sa");
		d.setPassword("pass");
		System.out.println("object is created");
		return d;
	}
	
	@Bean("myprop")
	Properties myDBProperties()
	{
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
		
	}
	
	
	@Bean("sessionfactory")
	LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean lsfb=new LocalSessionFactoryBean();
		lsfb.setDataSource(dbConnect());
		lsfb.setHibernateProperties(myDBProperties());
		lsfb.setPackagesToScan("com.niit.EcomBack.Model");
		//lsfb.addAnnotatedClass(Category.class);
		System.out.println("sessionfactory object is created");
		return lsfb;
	}
	
	@Autowired
	HibernateTransactionManager manager(SessionFactory sessionfactory)
	{
		HibernateTransactionManager htm=new HibernateTransactionManager();
		htm.setSessionFactory(sessionfactory);
		System.out.println("transation manager object is created");
		return htm;
	}

}




