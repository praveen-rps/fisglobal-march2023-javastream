package com.example.datajpa.model;

import javax.persistence.Id;

public class CommentsDto {
	
	
	int cid;
	
	String commenter;
	
	int pid;
	
	String comment;
	
	public CommentsDto() {
		
	}

	public CommentsDto(int cid, String commenter, int pid, String comment) {
		super();
		this.cid = cid;
		this.commenter = commenter;
		this.pid = pid;
		this.comment = comment;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCommenter() {
		return commenter;
	}

	public void setCommenter(String commenter) {
		this.commenter = commenter;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
