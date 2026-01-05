package com.tka.jan2;

public class Players {
	
	private int pid,jno,runs,wickets;
	private String pname,tname;
	
	@Override
	public String toString() {
		return "Players [pid=" + pid + ", jno=" + jno + ", runs=" + runs + ", wickets=" + wickets + ", pname=" + pname
				+ ", tname=" + tname + "]";
	}
	
	public int getPid() {
		return pid;
	}
	
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Players() {
		super();
	}
	public Players(int pid, int jno, int runs, int wickets, String pname, String tname) {
		super();
		this.pid = pid;
		this.jno = jno;
		this.runs = runs;
		this.wickets = wickets;
		this.pname = pname;
		this.tname = tname;
	}
}
