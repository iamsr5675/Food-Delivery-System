package com.bridgelabz.fooddeliverysystem.controller;

import java.util.Scanner;

import com.bridgelabz.fooddeliverysystem.model.FoodItem;
import com.bridgelabz.fooddeliverysystem.model.FoodStore;
import com.bridgelabz.fooddeliverysystem.view.UserInterface;

//Controller Layer

public class Application {

	public static void main(String[] args) {
		UserInterface userInterface = new UserInterface();
        userInterface.showUserMenu();
	}
	
	public void handleUserSelection(int n) {
		FoodStore foodStore = FoodStore.getInstance();
		UserInterface userInterface = new UserInterface();
		switch (n) {
			case 1:
				FoodItem foodItem = userInterface.createItem();
				foodStore.add(foodItem);
				break;
			case 2:
				userInterface.print(foodStore.getFoodList());
				System.out.println("Enter the name which you want to remove:");
				String foodName = new Scanner(System.in).nextLine();
				foodStore.remove(foodName);
				break;
			case 3:
				userInterface.print(foodStore.getFoodList());
				break;
			case 4:
				break;
			}
		}

	}
