package com.nt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="Stock_Info")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class StockInfo {

public StockInfo(String name, String exchange, String company, Double price, Double quantity) {
		super();
		this.name = name;
		this.exchange = exchange;
		this.company = company;
		this.price = price;
		Quantity = quantity;
	}
@Id
@Column(name="Stock_Id")
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
@Column(name="Stock_Name")
private String name;
@Column(name="Stock_Exchange")
private String exchange;
@Column(name="Company_Name")
private String company;
@Column(name="Stock_Price")
private Double price;
@Column(name="Stock_Quantity")
private Double Quantity; 



}
