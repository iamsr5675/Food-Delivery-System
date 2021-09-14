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
		Boolean b = true;
        while (b) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the field that you want to edit: \n1. for Name\n2. for Taste\n3. for Category\n4. for Type\n5. for Price\n6. for Exit\n ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    System.out.print("\nEnter Correct Item Name: ");
                    String itemName = sc.nextLine();
                    foodItem.itemName = sc.nextLine();
                    foodItem.setItemName(itemName);
                case 2: 
                    System.out.print("Enter Correct Taste: \n1. For Spicy. \n2. For Sweet. \n3. For Sour. \n4. For Sweet-Sour\n ");
                    int tasteChoice = sc.nextInt();
                    switch (tasteChoice) {
                        case 1:
                        	foodItem.setTaste(FoodItem.Taste.SPICY);
                        case 2:
                        	foodItem.setTaste(FoodItem.Taste.SWEET);
                        case 3:
                        	foodItem.setTaste(FoodItem.Taste.SOUR);
                        case 4:
                        	foodItem.setTaste(FoodItem.Taste.SWEET_SOUR);
                        default:
                        	System.out.println("Invalid Choice, Please enter a valid choice");
                    }
                case 3: 
                    System.out.print("Enter Correct Category type: \n1. Starter. \n2. For Main Course. \n3. For Beverages \n ");
                    int categoryChoice = sc.nextInt();
                    switch (categoryChoice) {
                        case 1:
                        	foodItem.setCategory(FoodItem.Category.STARTER);
                        case 2:
                        	foodItem.setCategory(FoodItem.Category.MAIN_COURSE);
                        case 3:
                        	foodItem.setCategory(FoodItem.Category.BEVERAGES);
                        default:
                        	System.out.println("Invalid Choice, Please enter a valid choice");
                    }
                case 4 : 
                    System.out.print("Enter Correct Type: \n1. for Veg type. \n2. for NonVeg Type\n ");
                    int type = sc.nextInt();
                    switch (type) {
                        case 1 :
                        	foodItem.setType(FoodItem.VegType.Veg);
                        case 2 :
                        	foodItem.setType(FoodItem.VegType.Non_Veg);
                        default :
                        	System.out.println("Invalid Choice, Please enter a valid choice");
                    }
                case 5 : 
                    System.out.print("Enter Correct Price: Rs.");
                    int price = sc.nextInt();
                    foodItem.setPrice(price);
                
                case 6 : 
                    b = false;
                
                default : 
                	System.out.println("Invalid Choice, Please enter a valid choice");
            }
        }
        System.out.println("\n Food Item Updated Successfully!!\n");
        return foodItem;
    }
}
