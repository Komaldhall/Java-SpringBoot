package com.kd.countries.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.kd.countries.Repositories.ApiRepo;
@Service
public class ApiService {
	private final ApiRepo aR;

	public ApiService(ApiRepo aR) {
		this.aR = aR;
	}
	
	public List<Object[]> joincountriesAndcities(){
		return aR.joincountriesAndcities();
	}

	public List<Object[]> joincountriesAndlanguages(String lang) {
		// TODO Auto-generated method stub
		return aR.joincountriesAndlanguages(lang);
	}


	public List<Object[]> joincountriesAndcities(String count) {
		// TODO Auto-generated method stub
		return aR.joincountriesAndcities(count);
	}

	public List<Object[]> joincountriesAndlanguages() {
		// TODO Auto-generated method stub
		return aR.joincountriesAndlanguages();
	}

	public List<Object[]> countriessurface() {
		// TODO Auto-generated method stub
		return aR.countriessurface();
	}

	public List<Object[]> countriesGovForm(String cons) {
		// TODO Auto-generated method stub
		return aR.countriesGovForm(cons);
	}

	public List<Object[]> countriesAndcities(String cons, String dist) {
		// TODO Auto-generated method stub
		return aR.countriesAndcities(cons,dist);
	}

	public List<Object[]> countriesRegion() {
		// TODO Auto-generated method stub
		return aR.countriesRegion();
	}

	
}
