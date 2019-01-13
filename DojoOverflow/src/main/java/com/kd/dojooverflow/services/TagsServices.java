package com.kd.dojooverflow.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.dojooverflow.models.Tags;
import com.kd.dojooverflow.repositories.TagsRepo;

@Service
public class TagsServices {
	public final TagsRepo tR;
	
	public TagsServices(TagsRepo tR) {
		this.tR = tR;
	}

	public Tags createTags(Tags t) {
		
		// TODO Auto-generated method stub
		return tR.save(t);
	}

	public Tags findTagsBySubject(String tag) {
		// TODO Auto-generated method stub
		Optional<Tags> optionalTag=tR.findBySubject(tag);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		}
		else {
			Tags newTag = new Tags();
			newTag.setSubject(tag);
			return tR.save(newTag);
		}
	}

}
