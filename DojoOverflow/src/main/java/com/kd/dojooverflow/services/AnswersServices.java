package com.kd.dojooverflow.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kd.dojooverflow.models.Answers;
import com.kd.dojooverflow.repositories.AnswersRepo;


@Service
public class AnswersServices {
private final AnswersRepo aR;
	
	
	public AnswersServices(AnswersRepo aR) {
	this.aR = aR;
}


	public Answers createAnswer(Answers a) {
        return aR.save(a);
    }

	public List<Answers> findByQuestionId(Long q) {
		// TODO Auto-generated method stub
		return (List<Answers>) aR.findByQuestionId(q);
	}
	
}
