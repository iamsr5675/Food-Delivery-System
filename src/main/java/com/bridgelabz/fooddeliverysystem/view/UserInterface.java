package com.bridgelabz.fooddeliverysystem.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.bridgelabz.fooddeliverysystem.controller.Application;
import com.bridgelabz.fooddeliverysystem.model.FoodItem;

//View Layer

public class UserInterface {
	List<FoodItem> foodList = new ArrayList<>();
	
	private static final String Taste = null;

	public void print(List<FoodItem> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}
	
	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Application application = new Application();
		while (n != 4) {
			System.out.println("\nEnter your choice: \n1. To add an item. \n2. To remove an item. \n3. Print the menu. \n4. To exit. ");
			n = sc.nextInt();
			application.handleUserSelection(n);
		}
	}

	public FoodItem createItem() {
		FoodItem foodItem = new FoodItem();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter item name:");
		foodItem.itemName = sc.nextLine();
		
		System.out.println("Enter taste you want to prefer: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour");
		int tasteChoice = sc.nextInt();
		switch(tasteChoice) {
			case 1:
				foodItem.setTaste(FoodItem.Taste.SPICY);
				break;
			case 2:
				foodItem.setTaste(FoodItem.Taste.SWEET);
				break;
			case 3:
				foodItem.setTaste(FoodItem.Taste.SOUR);
				break;
			case 4:
				foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
				break;
		}
		
		System.out.println("Enter category type: \n1. Starter. \n2. For Main Course. \n3. For Beverages ");
		int categoryChoice = sc.nextInt();
		switch(categoryChoice) {
			case 1:
				foodItem.setCategory(FoodItem.Category.STARTER);
				break;
			case 2:
				foodItem.setCategory(FoodItem.Category.MAIN_COURSE);
				break;
			case 3:
				foodItem.setCategory(FoodItem.Category.BEVERAGES);
				break;
		}
		
		System.out.println("Enter the type: \n1. For Veg type. \n2. For Non Veg Type.");
		int type = sc.nextInt();
		switch(type) {
			case 1:
				foodItem.setType(FoodItem.VegType.Veg);
				break;
			case 2:
				foodItem.setType(FoodItem.VegType.Non_Veg);
				break;		
		}	
		
		System.out.println("Enter the price of the item:");
		int price = sc.nextInt();
		foodItem.setPrice(price);
		return foodItem;
	}
	
	public void remove(String foodName) {
		for(int i=0; i<foodList.size(); i++) {
			if(Objects.equals(foodName, foodList.get(i).itemName)) {
				foodList.remove(foodList.get(i));
					}
		}
	}
	
}
