package com.FeeManagement.entityFile;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "fee_due_table")
public class FeeDue {
	private int sid;
	private int fid;
	private Date lastDateOfSubmission;
	private int FeeDue;
	private int totalAmount;
	private String mop;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

	public Date getLastDateOfSubmission() {
		return lastDateOfSubmission;
	}

	public void setLastDateOfSubmission(Date lastDateOfSubmission) {
		this.lastDateOfSubmission = lastDateOfSubmission;
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
