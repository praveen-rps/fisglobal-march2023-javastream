package com.example.datajpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("/delete/{pid}")
	public String deleteRecord(@PathVariable("pid")Integer pid) {
		service.deletePost(pid);
		return "Record deleted";
	}
	
	@PostMapping("/add")
	public Post createRecord(@RequestBody Post post) {
		return service.insertPost(post);
	}
	
	@GetMapping("/findByPid/{pid}")
	public Optional<Post> getPostId(@PathVariable("pid") Integer pid){
		return service.findPost(pid);
	}
	
	@GetMapping("findByAuthor/{author}")
	public List<Post> findAuthorData(@PathVariable("author") String author){
		return service.findByAuthor(author);
	}
	@GetMapping("findByTitle/{title}")
	public List<Post> findTitleData(@PathVariable("title") String title){
		return service.findByTitle(title);
	}
	@GetMapping("find/{title}/{author}")
	public List<Post> findTitleAuthor(@PathVariable("title") String title,
			@PathVariable("author") String author){
		return service.findByTitleAuthor(title,author);
	}
}
