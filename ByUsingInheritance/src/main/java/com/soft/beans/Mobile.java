package com.soft.beans;

public class Mobile {

	private int mobileNo;
	private String mobModel;
	private float mobPrice;
	private String color;
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getMobModel() {
		return mobModel;
	}
	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}
	public float getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(float mobPrice) {
		this.mobPrice = mobPrice;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mobile [mobileNo=" + mobileNo + ", mobModel=" + mobModel + ", mobPrice=" + mobPrice + ", color=" + color
				+ ", getMobileNo()=" + getMobileNo() + ", getMobModel()=" + getMobModel() + ", getMobPrice()="
				+ getMobPrice() + ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
