package com.example.commentservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.commentservice.model.Comments;
import com.example.commentservice.service.CommentsService;

@RestController
@RequestMapping("/comments")
public class CommentsController {
	
	@Autowired
	CommentsService service;
	
	@GetMapping("/all")
	public List<Comments> showAllComments()
	{
		return service.showAllComments();
	}

	@PostMapping("/add")
	public Comments addComment(@RequestBody Comments comment) {
		return service.insertComment(comment);
	}
	@DeleteMapping("/delete/{cid}")
	public String deleteComment(@PathVariable("cid")Integer cid) {
		service.deleteComment(cid);
		return "Comment deleted";
	}
	
	@GetMapping("/findCommentsByPid/{pid}")
	public List<Comments> showAllCommentsByPid(@PathVariable("pid")Integer pid){
		
		return service.findAllCommentsByPid(pid);
	}
	
}
