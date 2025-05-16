package com.ds04011.SpringTest.lifecycle;

public class Freetalk {
	
	private String title;
	private String user;
	private String content;
	
	public Freetalk(String title, String user, String content) {
		this.content=content;
		this.title = title;
		this.user = user;
	}
	
	public String getTitle() {
		return title;
	}
	public String getUser() {
		return user;
	}
	public String getContent() {
		return content;
	}
	

}
