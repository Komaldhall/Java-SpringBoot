package com.kd.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.dojooverflow.models.TagQuestions;


@Repository
public interface TagsQuestionRepo extends CrudRepository<TagQuestions, Long> {

}
