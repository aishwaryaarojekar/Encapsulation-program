package com.tka.jan2;

public class TestProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Products p1=new Products(10,152,1900,"Dress","Clothes");
		Products p2=new Products(11,153,2030,"Formal Dress","Clothes");
		Products p3=new Products(12,154,1000,"Heels","Footwears");
		Products p4=new Products(13,155,5000,"Mobile","Electronic");
		Products p5=new Products(14,156,160,"Ice Cream","Food");
		Products p6=new Products(15,157,4500,"Watch","Fashion products");
		Products p7=new Products();
		Products p8=new Products();
		Products p9=new Products();
		Products p10=new Products();
		Products p11=new Products();
		
		System.out.println("Before Updating product id: "+p1.getPid());
		p1.setPid(01);
		System.out.println("After Updating: "+p1.getPid());
		
		System.out.println("Before Updating product no: "+p2.getPno());
		p2.setPid(102);
		System.out.println("After Updating: "+p2.getPno());
		
		System.out.println("Before Updating Price: "+p3.getPrice());
		p3.setPrice(1200);
		System.out.println("After Updating: "+p3.getPrice());
		
		System.out.println("Before Updating product name: "+p4.getPname());
		p4.setPname("Head Phones");
		System.out.println("After  Updating: "+p4.getPname());
		
		System.out.println("Before Updating product type: "+p5.getPtype());
		p5.setPtype("Dairy Products");
		System.out.println("After Updating: "+p5.getPtype());
		
		System.out.println(p6.toString());
	}
	

}
