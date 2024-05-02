package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Timestamp;
import java.sql.Date;

// Abstraction: Making Book an abstract class
@Entity
public abstract class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int product_id;
	protected String name;
	protected String category;
	protected float price;
	protected int quantity;
	protected Timestamp updated_at;
	protected Date expiryDate;
	protected Timestamp created_at;

	// Overloading: Adding multiple constructors
	public Book() {
		super();
	}

	public Book(int product_id, String name, String category, float price, int quantity, Timestamp created_at,
			Timestamp updated_at, Date expiryDate) {
		this.product_id = product_id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.quantity = quantity;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.expiryDate = expiryDate;
	}

	// Overriding: Overriding the toString method
	@Override
	public String toString() {
		return "Book{" +
				"product_id=" + product_id +
				", name='" + name + '\'' +
				", category='" + category + '\'' +
				", price=" + price +
				", quantity=" + quantity +
				", updated_at=" + updated_at +
				", expiryDate=" + expiryDate +
				", created_at=" + created_at +
				'}';
	}

	// Abstraction: Declaring abstract methods
	public abstract void displayDetails();

	// Interface: Implementing an interface
	public interface BookInterface {
		void sell();
	}

	// Getters and Setters
	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
}
