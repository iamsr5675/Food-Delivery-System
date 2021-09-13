package com.bridgelabz.fooddeliverysystem.model;


import java.util.ArrayList;
import java.util.List;

//this is data layer or model layer
public class FoodStore {
	private static FoodStore instance;
	List<FoodItem> foodList = new ArrayList<>();

	public void add(FoodItem foodItem) {
		foodList.add(foodItem);
	}
	
	public static synchronized FoodStore getInstance() {
		if(instance == null) {
			instance = new FoodStore();
		}
		return instance;
	}
	
	public void remove(String foodName) {
		foodList.remove(foodName);
	}
	
	public List<FoodItem> getFoodList() {
		return foodList;
	}
	/*public List getList() {
		return foodList;
	}*/
	
	public FoodItem getFoodItem(String foodName) {
		for(FoodItem foodItem : foodList) {
			if(foodName.equals(foodItem.itemName)) {
				return foodItem;
			}
		}
		return null;
	}	
}