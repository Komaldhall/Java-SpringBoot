package com.kd.relationship.services;



import org.springframework.stereotype.Service;

import com.kd.relationship.models.License;
import com.kd.relationship.repositories.LicenseRepo;


@Service
public class LicenseServices {
	private final LicenseRepo lR;
	
	public LicenseServices(LicenseRepo lR) {
		this.lR = lR;
	}
	public License createLicense(License license) {
        return lR.save(license);
    }
	
}
