package com.kd.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kd.languages.models.Languages;
import com.kd.languages.repositories.LanguageRepo;



@Service
public class LanguageService {
	private final LanguageRepo lR;

	public LanguageService(LanguageRepo lR) {
		this.lR = lR;
	}
	public List<Languages> allLanguages() {
        return lR.findAll();
    }
	public Languages createLanguages(Languages l) {
        return lR.save(l);
    }
	public Languages findLanguages(Long id) {
        Optional<Languages> optionallanguage = lR.findById(id);
        if(optionallanguage.isPresent()) {
            return optionallanguage.get();
        } else {
            return null;
        }
    }
	public void deleteLanguages(Long id) {
		Optional<Languages> optionallanguage = lR.findById(id);
        if(optionallanguage.isPresent()) {
        	lR.deleteById(id);
        }
		
		
	}
	public Languages updateLanguages(Long id, String name, String creater, Double currentVersion) {
		Optional<Languages> optionallanguage = lR.findById(id);
		if(optionallanguage.isPresent()) {
			Languages lang= optionallanguage.get();
			lang.setName(name);
			lang.setCreater(creater);
			lang.setCurrentVersion(currentVersion);
			
			return lR.save(lang);
			
        } else {
            return null;
        }
	}

	
	

}
