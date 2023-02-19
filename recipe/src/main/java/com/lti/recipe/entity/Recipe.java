package com.lti.recipe.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Recipe {
	
	@Id
	@Column(name = "recipe_id")
	private int recipeId;
	
	@Column(name = "recipe_name")
	private String recipeName;

	public Recipe(int recipeId, String recipeName) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
	}

	public Recipe() {
		super();
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + "]";
	}
	
	
}
