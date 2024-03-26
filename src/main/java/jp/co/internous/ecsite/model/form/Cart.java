package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable{
	
	private int id;
	
	private String goodsName;
	
	private int price;
	
	private int count;
	
	public int getId() {
		return id;
	}

	// Setter method for id
	public void setId(int id) {
		this.id = id;
	}

	// Getter method for goodsName
	public String getGoodsName() {
		return goodsName;
	}

	// Setter method for goodsName
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	// Getter method for price
	public int getPrice() {
		return price;
	}

	// Setter method for price
	public void setPrice(int price) {
		this.price = price;
	}

	// Getter method for count
	public int getCount() {
		return count;
	}

	// Setter method for count
	public void setCount(int count) {
		this.count = count;
	}

}
