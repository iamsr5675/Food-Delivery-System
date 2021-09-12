package com.bridgelabz.fooddeliverysystem.model;

public class PaneerDosa extends FoodItem {
	public PaneerDosa()
	{
		taste = Taste.SWEET_SOUR;
		category = Category.MAIN_COURSE;
		vegType = VegType.VEGETARIAN;
		itemName = "Paneer Dosa";
	}
}
