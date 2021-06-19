package com.enumber.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enumber.model.Category;
import com.enumber.repository.CategoryRepository;
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> findAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

}
