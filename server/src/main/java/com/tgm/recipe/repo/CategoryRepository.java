package com.tgm.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tgm.recipe.data.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
