package com.kd.dojooverflow.services;

import org.springframework.stereotype.Service;

import com.kd.dojooverflow.models.TagQuestions;
import com.kd.dojooverflow.repositories.TagsQuestionRepo;

@Service
public class TagsQuestionsServices {
	private final TagsQuestionRepo tR;
	

	public TagsQuestionsServices(TagsQuestionRepo tR) {
		this.tR = tR;
	}


	public TagQuestions createTagQuestion(TagQuestions tQ) {
		// TODO Auto-generated method stub
		return tR.save(tQ);
	}

}
