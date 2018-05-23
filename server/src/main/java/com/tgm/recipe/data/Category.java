package com.tgm.recipe.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	public Category(){}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
