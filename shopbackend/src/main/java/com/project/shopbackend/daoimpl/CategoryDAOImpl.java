package com.project.shopbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.shopbackend.dao.CategoryDAO;
import com.project.shopbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

public static List<Category> categories=new ArrayList<>();

static {
	
	//1st category
	Category category=new Category();
	
	category.setId(1);
	category.setName("Television");
	category.setDescription("This is the description of Television");
	category.setImageURL("CAT_1.png");
	
	categories.add(category);
	
	//2nd category
		category=new Category();
		
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is the description of Mobile");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		//3rd category
				category=new Category();
				
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is the description of Laptop");
				category.setImageURL("CAT_3.png");
				
				categories.add(category);
				
	


}

	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		//enhanced for loop
		
		for(Category category:categories) {
			if(category.getId() ==id) return category;
		}
		return null;
	}

}
