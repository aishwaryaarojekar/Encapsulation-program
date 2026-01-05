package com.tka.jan2;

public class TesytOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orders o1=new Orders(01,1500,4,"Formal Pants","Pants");
		Orders o2=new Orders(02,2000,2,"Soft Toys","Toys");
		Orders o3=new Orders(03,1600,5,"Shoes and Heels","Footwears");
		Orders o4=new Orders(04,600,1,"Soft Blanket","Blankets");
		Orders o5=new Orders(05,950,2,"Mobile Covers","Mobile Accessories");
		Orders o6=new Orders(06,930,1,"Shoes","Footwear");
		Orders o7=new Orders();
		Orders o8=new Orders();
		Orders o9=new Orders();
		Orders o10=new Orders();
		Orders o11=new Orders();
		
		System.out.println("Before updating id: "+o1.getOr_id());
		o1.setOr_id(28);
		System.out.println("After updating id: "+o1.getOr_id());
		
		System.out.println("Before  updating amt: "+o2.getTot_amt());
		o2.setTot_amt(2050);
		System.out.println("After updating amt: "+o2.getTot_amt());
		
		System.out.println("Before updating Quantity: "+o3.getQuantity());
		o3.setQuantity(4);
		System.out.println("After updating Quantity: "+o3.getQuantity());

		System.out.println("Before updating order name: "+o4.getOr_name());
		o4.setOr_name("Toys");
		System.out.println("After updating order name: "+o4.getOr_name());

		System.out.println("Before Adding order name: "+o7.getOr_name());
		o7.setOr_name("New Products");
		System.out.println("After Adding order name: "+o7.getOr_name());
		
		System.out.println(o5.toString());
	
	}

}
