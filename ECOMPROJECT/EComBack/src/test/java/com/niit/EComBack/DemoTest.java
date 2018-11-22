package com.niit.EComBack;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.EComBack");
		context.refresh();
		
		
	}
}
