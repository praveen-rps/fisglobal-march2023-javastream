package com.example.datajpa.service;

import java.util.List;

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

}
