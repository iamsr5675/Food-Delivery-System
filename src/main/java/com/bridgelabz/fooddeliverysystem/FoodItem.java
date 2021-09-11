package com.bridgelabz.fooddeliverysystem;

public class FoodItem {
	enum Taste{SWEET, SOUR, SPICY, SWEET_SOUR};
	enum Category{STARTERS, MAIN_COURSE, SHAKES, DESERTS};
	enum VegType{VEGETARIAN, NON_VEGETARIAN};
	
	protected Taste taste;
	protected Category category;
	protected VegType vegType;
	private int price;
	protected String itemName;
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [taste=" + taste + ", category=" + category + ", vegType=" + vegType + ", price=" + price
				+ ", itemName=" + itemName + "]";
	}

	
}
