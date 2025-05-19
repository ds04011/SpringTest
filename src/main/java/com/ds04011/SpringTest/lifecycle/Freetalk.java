package com.ds04011.SpringTest.lifecycle;


public class Freetalk {
	// 우클릭 --> source --> generate getter setter 하면 알아서 생성해줌.
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
	
	@Override
	public String toString() {
		return "제목 : " + title + " 유저 : " + user + " 내용 : " + content;
	}
	

}
