package com.tka.jan2;

public class TestPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Players p1=new Players(11,18,1920,159,"Virat Kholi","RCB");
		Players p2=new Players(12,10,828,92,"Shubman Gill","MI");
		Players p3=new Players(13,17,1979,167,"Joas Buttler","KKR");
		Players p4=new Players(14,91,2303,231,"Sai Sudarshan","CSK");
		Players p5=new Players(15,20,3992,20,"MS Dhoni","CSK");
		Players p6=new Players();
		Players p7=new Players();
		Players p8=new Players();
		Players p9=new Players();
		Players p10=new Players();
		Players p11=new Players();
		
		System.out.println("Before updating players id: "+p1.getPid());
		p1.setPid(19);
		System.out.println("After updating players id: "+p1.getPid());
		
		System.out.println("Before updating players Jno: "+p2.getJno());
		p2.setJno(98);
		System.out.println("After updating players Jno: "+p2.getJno());
		
		System.out.println("Before updating players runs: "+p3.getRuns());
		p3.setRuns(2300);
		System.out.println("After updating players runs: "+p3.getRuns());
		
		System.out.println("Before updating players Wickets: "+p4.getWickets());
		p4.setWickets(130);
		System.out.println("After updating players Wickets: "+p4.getWickets());
		
		System.out.println("Before Adding players Jno: "+p8.getJno());
		p8.setJno(98);
		System.out.println("After Adding players Jno: "+p8.getJno());
		
		System.out.println(p5.toString());
	}

}
