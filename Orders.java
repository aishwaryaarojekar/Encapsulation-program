package com.tka.jan2;

public class Orders {
	private int or_id,tot_amt,quantity;
	private String or_name,or_product;
	
	public Orders(int or_id, int tot_amt, int quantity, String or_name, String or_product) {
		super();
		this.or_id = or_id;
		this.tot_amt = tot_amt;
		this.quantity = quantity;
		this.or_name = or_name;
		this.or_product = or_product;
	}
	
	@Override
	public String toString() {
		return "Orders [or_id= " + or_id + ", tot_amt= " + tot_amt + ", quantity= " + quantity + ", or_name= " + or_name
				+ ", or_product= " + or_product + "]";
	}
	
	public Orders() {
		super();
	}
	public int getOr_id() {
		return or_id;
	}
	public void setOr_id(int or_id) {
		this.or_id = or_id;
	}
	public int getTot_amt() {
		return tot_amt;
	}
	public void setTot_amt(int tot_amt) {
		this.tot_amt = tot_amt;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getOr_name() {
		return or_name;
	}
	public void setOr_name(String or_name) {
		this.or_name = or_name;
	}
	public String getOr_product() {
		return or_product;
	}
	public void setOr_product(String or_product) {
		this.or_product = or_product;
	}
	
	
}
