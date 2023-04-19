package com.example.datajpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.datajpa.dao.PostDao;
import com.example.datajpa.model.Post;


@Service
public class PostServiceImpl implements PostService {
	
	
	@Autowired
	PostDao dao;

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Post insertPost(Post post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public Optional<Post> findPost(Integer pid) {
		// TODO Auto-generated method stub
		return dao.findById(pid);
	}

	@Override
	public void deletePost(Integer pid) {
		// TODO Auto-generated method stub
		dao.deleteById(pid);
	}

	@Override
	public List<Post> findByAuthor(String author) {
		// TODO Auto-generated method stub
		return dao.findByAuthor(author);
	}

	@Override
	public List<Post> findByTitle(String title) {
		// TODO Auto-generated method stub
		return dao.findByTitle(title);
	}

	@Override
	public List<Post> findByTitleAuthor(String title, String author) {
		// TODO Auto-generated method stub
		return dao.findByTitleAndAuthor(title, author);
	}

}
