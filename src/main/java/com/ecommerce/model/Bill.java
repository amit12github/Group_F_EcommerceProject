package com.velocity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.introspect.AccessorNamingStrategy.Provider;


/*Task No 62
 * By - Amit waghmare
 */
@Entity
@Table(name="bill")
public class Bill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bid;
	private String billCode;
	private String billName;
	private String billCom;
	private int billNum;
	private double money;
	
	@OneToOne(targetEntity = Provider.class, cascade = CascadeType.ALL)
	@JoinColumn(name="pId")
	private Provider provider;

	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBillCode() {
		return billCode;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public String getBillName() {
		return billName;
	}
	public void setBillName(String billName) {
		this.billName = billName;
	}
	public String getBillCom() {
		return billCom;
	}
	public void setBillCom(String billCom) {
		this.billCom = billCom;
	}
	public int getBillNum() {
		return billNum;
	}
	public void setBillNum(int billNum) {
		this.billNum = billNum;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

}
	
	


