package com.kd.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.dojooverflow.models.Questions;


@Repository
public interface QuestionsRepo extends CrudRepository<Questions, Long>{

}
