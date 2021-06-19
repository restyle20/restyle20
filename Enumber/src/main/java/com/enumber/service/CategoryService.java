package com.enumber.service;

import java.util.List;
import com.enumber.model.Category;

public interface CategoryService {
	
	List<Category> findAllCategories();

	Category save(Category category);


}
