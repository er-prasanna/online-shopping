package com.alisha.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.alisha.shoppingbackend.dao.CategoryDAO;
import com.alisha.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		
		category.setId(1);
		category.setDescription("Televisions");
		category.setName("Televisions");
		category.setImageUrl("cat1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setDescription("Laptops");
		category.setName("Laptops");
		category.setImageUrl("cat1.png");
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setDescription("Mobile");
		category.setName("Mobile");
		category.setImageUrl("cat1.png");
		categories.add(category);
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category : categories) {
			if(category.getId() == id)
				return category;
		}
		return null;
	}

}
