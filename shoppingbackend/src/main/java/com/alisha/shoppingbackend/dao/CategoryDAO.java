package com.alisha.shoppingbackend.dao;

import java.util.List;

import com.alisha.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
