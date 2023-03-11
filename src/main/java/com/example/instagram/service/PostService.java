package com.example.instagram.service;

import com.example.instagram.dao.PostRepository;
import com.example.instagram.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;

    public int savePost(Post post) {
       Post savedPost = postRepository.save(post);
       return savedPost.getPostId();
    }
}
