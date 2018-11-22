package com.niit.EComBack.test;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.EComBack.dao.CategoryDAO;
import com.niit.EComBack.model.Category;
public class CategoryDAOTestCase {
	static CategoryDAO categoryDAO;

	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.EComBack");
		context.refresh();
		
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
	}

	@Test
	@Ignore
		public void addCategoryTest()
		{
			Category category=new Category();
			category.setCategoryName("Home Decoration");
			category.setCategoryDesc("Various Home Decoration ");
			
			assertTrue("Probem in Adding the Category",categoryDAO.add(category));
		}
	@Ignore
	@Test
	public void updateCategoryTest()
	{	
		Category category=categoryDAO.getCategory(2);
		category.setCategoryDesc("Wash Basin and Front Glasses");	
		assertTrue("Problem in Updating the Category",categoryDAO.update(category));
	}
	@Ignore
	@Test
	public void deleteCategoryTest()
	{
		Category category=categoryDAO.getCategory(2);
		assertTrue("Problem in Updating the Category",categoryDAO.delete(category));
	}
	
	@Test
	public void listCategoriesTest()
	{
		List<Category> listCategories=categoryDAO.listCategories();
		
		assertTrue("Problem in Listing the Categories",listCategories.size()>0);
		
		for(Category category:listCategories)
		{
			System.out.print("Category ID:"+category.getCategoryId());
			System.out.print("Category Name:"+category.getCategoryName());
			System.out.println("Category Desc:"+category.getCategoryDesc());
		}
	}

	}


