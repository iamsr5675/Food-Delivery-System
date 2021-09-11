package com.bridgelabz.fooddeliverysystem;

import java.util.List;
import java.util.Scanner;
//view layer
public class UserInterface {
	public void print(List<FoodItem> foodList) {
		for(int i=0; i < foodList.size(); i++) {
			System.out.println(foodList.get(i));
		}
	}
	
	public void showUserMenu() {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int exit = 4;
		Application application = new Application();
		while(n != exit) {
			System.out.println();
			System.out.println("Enter 1 for Adding the food item");
			System.out.println("Enter 2 for Removing the food item");
			System.out.println("Enter 3 for Printing the food item");
			System.out.println("Enter " +exit+ " for Exit");
			n = sc.nextInt();
			application.handleUserSelection(n);
		}
		
		
	}
}
