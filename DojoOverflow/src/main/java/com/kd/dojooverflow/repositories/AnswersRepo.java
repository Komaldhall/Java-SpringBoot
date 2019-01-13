package com.kd.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kd.dojooverflow.models.Answers;

@Repository
public interface AnswersRepo extends CrudRepository<Answers, Long> {

	List<Answers> findByQuestionId(long q);

}
