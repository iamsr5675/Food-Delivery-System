package com.bridgelabz.fooddeliverysystem.model;

public class FoodItem {
	
	public enum Taste {
		SOUR, SWEET, SPICY, SWEET_SOUR
	};

	public enum Category {
		STARTER, MAIN_COURSE, BEVERAGES
	};

	public enum VegType {
		Veg, Non_Veg
	};

	public Taste taste;
	public Category category;
	public VegType vegType;
	public int price;
	public String itemName;

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

	public void setTaste(Taste tasteChoice) {
		this.taste = tasteChoice;
	}

	public void setCategory(Category categoryChoice) {
		this.category = categoryChoice;
	}

	public void setType(VegType type) {
		this.vegType = type;
	}
}
