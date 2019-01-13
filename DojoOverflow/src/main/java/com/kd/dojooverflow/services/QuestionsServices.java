package com.kd.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.dojooverflow.models.Questions;
import com.kd.dojooverflow.repositories.QuestionsRepo;

@Service
public class QuestionsServices {
	private final QuestionsRepo qR;
	
	public QuestionsServices(QuestionsRepo qR) {
		this.qR = qR;
	}
	public Questions createQuestions(Questions q) {
		// TODO Auto-generated method stub
		return qR.save(q);
	}


	public List<Questions> findAllQuestions() {
		// TODO Auto-generated method stub
		return (List<Questions>) qR.findAll();
	}
	public Questions findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Questions> optionalQuestions=qR.findById(id);
		if(optionalQuestions.isPresent()) {
			return optionalQuestions.get();
			
		}
		else {
			return null;
		}
	}
	

}
