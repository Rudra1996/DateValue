package com.find.date.model;

public class Dataprovider{
	
	private String date;
	private int value;
	/*private Title title;
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}*/
	public Dataprovider(String date,int val) {
		this.date=date;
		this.value=val;
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
