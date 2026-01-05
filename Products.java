package com.tka.jan2;

public class Products {
	
	private int pid,pno,price;
	private String pname,ptype;
	public Products(int pid, int pno, int price, String pname, String ptype) {
		super();
		this.pid = pid;
		this.pno = pno;
		this.price = price;
		this.pname = pname;
		this.ptype = ptype;
	}
	
	@Override
	public String toString() {
		return "Products [pid=" + pid + ", pno=" + pno + ", price=" + price + ", pname=" + pname + ", ptype=" + ptype
				+ "]";
	}
	
	public Products() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	
}
