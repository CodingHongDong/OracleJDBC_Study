package com.newlecture.app.entity;

import java.util.Date;

public class Notice {
	private int id;
	private String title;
	private String writerID;
	private String content;
	private Date regDate;
	private int hit;
	private String files;
	
	public Notice() {
		
	}
	
	
	


	public Notice(int id, String title, String writerID, String content, Date regDate, int hit, String files) {
		super();
		this.id = id;
		this.title = title;
		this.writerID = writerID;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
		this.files = files;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriterID() {
		return writerID;
	}
	public void setWriterID(String writerID) {
		this.writerID = writerID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}


	public String getFiles() {
		return files;
	}


	public void setFiles(String files) {
		this.files = files;
	}
	
	
}
