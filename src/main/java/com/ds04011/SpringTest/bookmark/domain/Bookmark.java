package com.ds04011.SpringTest.bookmark.domain;

import java.time.LocalDateTime;

public class Bookmark {
	
	private int id;
	private String name;
	private String url;
	private LocalDateTime craetedAt;
	private LocalDateTime updatedAt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public LocalDateTime getCraetedAt() {
		return craetedAt;
	}
	public void setCraetedAt(LocalDateTime craetedAt) {
		this.craetedAt = craetedAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	
}
