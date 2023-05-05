package com.soft.beans;

import java.util.Date;

public class MassgeGenrator {

	
	private Date date;
	
//	public Date getDate() {
//		return date;
//	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateMessage(String name) {
		int hour=0;
		
		hour = date.getHours();
		if(hour<=12) {
			return "good Morning"+name;
			
		}
		else(hour<=16) {
			return "good Morning"+name;
			
		}
//		else(hour<=20) {
//			return"good Morning"+name;
//			
//		}
		
	}
	
}
