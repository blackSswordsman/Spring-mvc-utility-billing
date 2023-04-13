package com.ryodan.utilitybills.repository;

import com.ryodan.utilitybills.pojo.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post,Long> {
}
