package com.tgm.recipe.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.tgm.recipe.data.Category;
@RepositoryRestResource
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
