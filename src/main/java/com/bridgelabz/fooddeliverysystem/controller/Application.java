package com.bridgelabz.fooddeliverysystem.controller;

import java.util.Scanner;

import com.bridgelabz.fooddeliverysystem.model.FoodItem;
import com.bridgelabz.fooddeliverysystem.model.FoodStore;
import com.bridgelabz.fooddeliverysystem.view.UserInterface;

//Controller Layer

public class Application {

	public static void main(String[] args) {
		UserInterface userInterface = UserInterface.getInstance();
        userInterface.showUserMenu();
	}
	
	public void handleUserSelection(int n) {
		FoodStore foodStore = FoodStore.getInstance();
		UserInterface userInterface = UserInterface.getInstance();
		switch (n) {
			case 1:
				FoodItem foodItem = userInterface.createItem();
				foodStore.add(foodItem);
				break;
			case 2:
				userInterface.print(foodStore.getFoodList());
				try {
                    if (foodStore.getFoodList().get(0) != null) {
                    	System.out.println("Enter the name which you want to remove:");
                    	String foodName = new Scanner(System.in).nextLine();
                    	foodStore.remove(foodName);
                    	break;
                    }
                    	} catch (IndexOutOfBoundsException e) {
                    		System.out.println("No item present of that name to remove");
                    		}
			case 3:
				userInterface.print(foodStore.getFoodList());
				break;
			case 4:
				try {
		            if (foodStore.getFoodList().get(0) != null) {
		            	System.out.println("Enter the name which you want to edit: ");
		            	String name = new Scanner(System.in).nextLine();
		            	FoodItem food = foodStore.getFoodItem(name);
		            	userInterface.editItem(food);
		            	break;
		            	}
		            } catch (IndexOutOfBoundsException e) {
		            	System.out.println("No item present of that name to edit");
		            	}
			case 5:
				break;
			}
		}

	}
