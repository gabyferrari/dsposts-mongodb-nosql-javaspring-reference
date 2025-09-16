package com.gabyferrari.dsposts.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabyferrari.dsposts.models.dto.PostDTO;
import com.gabyferrari.dsposts.models.entities.Post;
import com.gabyferrari.dsposts.repositories.PostRepository;
import com.gabyferrari.dsposts.services.exceptions.ResourceNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public PostDTO findById(String id) {
		Post entity = getEntityById(id);
		return new PostDTO(entity);
	}
	
	private Post getEntityById(String id) {
		Optional<Post> result = repository.findById(id);
		return result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
	}
	
}