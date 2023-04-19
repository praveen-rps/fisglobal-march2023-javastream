package com.example.commentservice.service;

import java.util.List;

import com.example.commentservice.model.Comments;

public interface CommentsService {
	
	public List<Comments> showAllComments();
	public Comments insertComment(Comments comment);
	public void deleteComment(Integer cid);
	public List<Comments> findAllCommentsByPid(Integer pid);

}
