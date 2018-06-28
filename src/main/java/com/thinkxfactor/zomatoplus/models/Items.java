package com.thinkxfactor.zomatoplus.models;
import java.lang.*;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="tbl_items")
public class Items implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	@Column(name="name")
	private String name;
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name="price")
	private Double price;
	
	@Column(name="description")
	private String description;
	
	public Long getId() {
		return id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}