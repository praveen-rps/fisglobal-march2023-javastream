package com.example.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.datajpa.model.Post;
import com.example.datajpa.service.PostService;

@RestController
public class PostController {
	
	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public List<Post> showAll(){
		return service.getAllPosts();
	}

}
