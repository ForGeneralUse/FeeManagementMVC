package com.FeeManagement.entityFile;

import java.util.Date;

public class FeeDue {
	private int sid;
	private int fid;
	private Date lastDateOfJoin;
	private int FeeDue;
	private int totalAmount;
	private String mop;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public Date getLastDateOfJoin() {
		return lastDateOfJoin;
	}

	public void setLastDateOfJoin(Date lastDateOfJoin) {
		this.lastDateOfJoin = lastDateOfJoin;
	}

	public int getFeeDue() {
		return FeeDue;
	}

	public void setFeeDue(int feeDue) {
		FeeDue = feeDue;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getMop() {
		return mop;
	}

	public void setMop(String mop) {
		this.mop = mop;
	}

}
