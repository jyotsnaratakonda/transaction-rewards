package com.trans.service.springbootrewards.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Transaction extends Reward {
	@Id
	@GeneratedValue
	private Long id;
	@JsonIgnore
	@ManyToOne
	@JoinColumn
	private Customer customer;
	private Double total;
	private String description;
	@Temporal(TemporalType.TIMESTAMP)
	private Date effectiveDate;
	
	
	public Transaction() {
		super();
	}
	public Transaction(Long id, Customer customer, Double total, String description, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.total = total;
		this.description = description;
		this.effectiveDate = date;
	}

	public Date getSaveDate() {
		return effectiveDate;
	}
	public void setSaveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Long getPoints() {
		this.points = 0l;
		if (this.total > 50 && this.total <= 100) {
			this.points += (this.total.intValue() - 50) * 1;
			
		} 
		
		if (this.total > 100) {
			// 1 point
			this.points += 50;
			//2 points
			this.points += (this.total.intValue() - 100) * 2;
		}
		
		return this.points;
	}
	
	@Override
	public String toString() {
		return String.format("Transaction [id=%s, customer=%s, total=%s, description=%s, effectiveDate=%s]", id, customer,
				total, description, effectiveDate);
	}
	
}
