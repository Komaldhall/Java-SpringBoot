package com.kd.dojooverflow.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.dojooverflow.models.Tags;


@Repository
public interface TagsRepo extends CrudRepository<Tags, Long>{

	Optional<Tags> findBySubject(String tag);

}
