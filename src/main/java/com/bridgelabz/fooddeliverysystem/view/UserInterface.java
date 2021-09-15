package com.bridgelabz.fooddeliverysystem.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import com.bridgelabz.fooddeliverysystem.controller.Application;
import com.bridgelabz.fooddeliverysystem.model.FoodItem;
import com.bridgelabz.fooddeliverysystem.model.FoodStore;

//View Layer

public class UserInterface {
	private static UserInterface instance;
	
	//private static final String Taste = null;

	public void print(List<FoodItem> foodList) {
		for (int i = 0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}
	
	private UserInterface() {
		
	}
	
	public static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}
	
	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		Application application = new Application();
		while (n != 5) {
			System.out.println("\nEnter your choice: \n1. To Add an item. \n2. To Remove an item. \n3. Print the Menu. \n4. To Edit an item. \n5. To Exit. ");
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
	
	public FoodItem editItem(FoodItem foodItem) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Select the entity you want to edit: \n1. To change the Item Name. \n2. To change the Taste. \n3. To change the Category. \n4. To change the Type. \n5. To change the Price. \n6. To exit.");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					System.out.println("Give the new item name:");
					String foodName = sc.next();
					foodItem.setItemName(foodName);
					break;
				case 2:
					System.out.println("Given the new Taste:");
					System.out.println("Enter taste: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour");
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
					default:
						System.out.println("Invalid Input!!");
				}
					break;
				case 3:
					System.out.println("Give the new Category: ");
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
						default:
							System.out.println("Invalid Input!!");
					}
					break;
				case 4:
					System.out.println("Enter the type of food:");
					System.out.println("Enter the type: \n1. For Veg type. \n2. For Non Veg Type.");
					int type = sc.nextInt();
					switch(type) {
						case 1:
							foodItem.setType(FoodItem.VegType.Veg);
							break;
						case 2:
							foodItem.setType(FoodItem.VegType.Non_Veg);
							break;		
						default:
							System.out.println("Invalid Input!!");
					}
					break;
				case 5: 
					System.out.println("Give the new price:");
					int price = sc.nextInt();
					foodItem.setPrice(price);
					break;
				default:
					System.out.println("Invalid Input!!");
			}
			System.out.println("Item details edited!");
		return foodItem;
	}
}
