package com.bridgelabz.fooddeliverysystem.controller;

import java.util.Scanner;

import com.bridgelabz.fooddeliverysystem.model.BananaShake;
import com.bridgelabz.fooddeliverysystem.model.ChickenBiryani;
import com.bridgelabz.fooddeliverysystem.model.FoodStore;
import com.bridgelabz.fooddeliverysystem.model.HakkaNoodles;
import com.bridgelabz.fooddeliverysystem.model.PaneerDosa;
import com.bridgelabz.fooddeliverysystem.model.VegMomos;
import com.bridgelabz.fooddeliverysystem.view.UserInterface;

//controller layer
public class Application 
{
	ChickenBiryani chickenBiryani = new ChickenBiryani();
	VegMomos vegMomos = new VegMomos();
	PaneerDosa paneerDosa = new PaneerDosa();
	BananaShake bananaShake = new BananaShake();
	HakkaNoodles hakkaNoodles = new HakkaNoodles();
	FoodStore foodStore = new FoodStore();
	UserInterface userInterface = new UserInterface();
    public static void main( String[] args )
    {
        /*BananaShake bananaShake = new BananaShake();
        bananaShake.setPrice(60);
        HakkaNoodles hakkaNoodles = new HakkaNoodles();
        hakkaNoodles.setPrice(100);
        ChickenBiryani chickenBiryani = new ChickenBiryani();
        chickenBiryani.setPrice(160);
        VegMomos vegMomos = new VegMomos();
        vegMomos.setPrice(40);
        PaneerDosa paneerDosa = new PaneerDosa();
        paneerDosa.setPrice(90);
        
        FoodStore foodStore = new FoodStore();
        foodStore.add(bananaShake);
        foodStore.add(chickenBiryani);
        foodStore.add(hakkaNoodles);
        foodStore.add(vegMomos);
        foodStore.add(paneerDosa);
        
        UserInterface userInterface = new UserInterface();
        userInterface.print(foodStore.getFoodlist());
        
        foodStore.remove(bananaShake);
        foodStore.remove(hakkaNoodles);
        foodStore.remove(vegMomos);
        
        System.out.println("After removing items:");
        userInterface.print(foodStore.getFoodlist());*/
    	
    	UserInterface userInterface = new UserInterface();
        userInterface.showUserMenu();
    }
    
    public void handleUserSelection(int n) {
    	switch(n) {
    	case 1:
    		System.out.println();
    		System.out.println("Enter choice of food you want to add: \n1.	Chicken Biryani. \n2.	Hakka Noodle \n3.	Veg Momos \n4.	Banana Shake \n5.	Paneer Dosa");
			System.out.println();
			int choice = new Scanner(System.in).nextInt();
			switch(choice) {
				case 1:
					foodStore.add(chickenBiryani);
					chickenBiryani.setPrice(300);
					break;
				case 2:
					foodStore.add(hakkaNoodles);
					hakkaNoodles.setPrice(200);
					break;
				case 3:
					foodStore.add(vegMomos);
					vegMomos.setPrice(200);
					break;
				case 4:
					foodStore.add(paneerDosa);
					paneerDosa.setPrice(200);
					break;
				case 5:
					foodStore.add(bananaShake);
					bananaShake.setPrice(200);
					break;				
			}
			userInterface.print(foodStore.getFoodList());
					break;
    	case 2:
			System.out.println("Enter item name which you want to remove: \n1. To remove Chicken Biryani \n2. To remove Hakka Noodles \n3. To remove Paneer Dosa \n4. To remove Veg Momos \n5. To remove Banana Shake");
			int remove = new Scanner(System.in).nextInt();
			switch(remove) {
				case 1:
					foodStore.remove(chickenBiryani);
					break;
				case 2:
					foodStore.remove(hakkaNoodles);
					break;
				case 3:
					foodStore.remove(paneerDosa);
					break;
				case 4:
					foodStore.remove(vegMomos);
					break;
				case 5:
					foodStore.remove(bananaShake);
					break;
			}
	        userInterface.print(foodStore.getFoodList());
			
			break;
		case 3:
			userInterface.print(foodStore.getFoodList());
			break;
		case 4:
			break;
	}
    }
    
}
