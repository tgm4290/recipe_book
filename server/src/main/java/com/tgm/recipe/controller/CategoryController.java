package com.tgm.recipe.controller;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgm.recipe.data.Category;
import com.tgm.recipe.repo.CategoryRepository;

@RestController
public class CategoryController {
	private CategoryRepository categoryRepository;
	
	@Autowired
	public CategoryController(CategoryRepository categoryRepository){
		this.categoryRepository = categoryRepository;
	}
	
	@GetMapping("/categories")
	public Collection<Category> allCategories() {
		return categoryRepository.findAll();
	}
}
