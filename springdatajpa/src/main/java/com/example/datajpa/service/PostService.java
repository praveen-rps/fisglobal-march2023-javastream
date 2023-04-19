package com.example.datajpa.service;

import java.util.List;
import java.util.Optional;

import com.example.datajpa.model.Post;

public interface PostService {
	
	public List<Post> getAllPosts();
	public Post insertPost(Post post);
	public Optional<Post> findPost(Integer pid);
	public void deletePost(Integer pid);
	public List<Post> findByAuthor(String author);
	public List<Post> findByTitle(String title);
	public List<Post> findByTitleAuthor(String title,String author);

}
