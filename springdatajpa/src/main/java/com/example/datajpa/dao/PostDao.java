package com.example.datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa.model.Post;


@Repository
public interface PostDao extends JpaRepository<Post,Integer>{

}
