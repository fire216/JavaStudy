package com.kopo.human.dbconnect;

import java.security.Timestamp;

public class BBSDto {
	private int articleNum;
	private String id;
	private String title;
	private String content;
	private Timestamp writeDate;
	private String Fname;
	public int getArticleNum() {
		return articleNum;
	}
	public void setArticleNum(int articleNum) {
		this.articleNum = articleNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Timestamp writeDate) {
		this.writeDate = writeDate;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	@Override
	public String toString() {
		return "BBSDto [articleNum=" + articleNum + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", writeDate=" + writeDate + ", Fname=" + Fname + "]";
	}
}
