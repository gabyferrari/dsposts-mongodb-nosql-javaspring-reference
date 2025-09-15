package com.gabyferrari.dsposts.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabyferrari.dsposts.models.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
