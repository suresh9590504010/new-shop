package com.project.shopbackend.dao;

import java.util.List;

import com.project.shopbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();

	Category get(int id);


}
