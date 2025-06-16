package com.ds04011.SpringTest.company.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.company.domain.Company;
import com.ds04011.SpringTest.company.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	public Company addCompany(String name, String business, String scale, int headcount) {
		
		
		Company c1 = Company.builder()
				.name(name)
				.business(business)
				.scale(scale)
				.headcount(headcount)
				.build();
		
		
		
		Company result = companyRepository.save(c1);
		return result;
		
	}
	
	public Company updateCompany(int id, String scale, int headcount) {
		
		Optional<Company> optionalCompany = companyRepository.findById(id);
		
		
		
		
		/*
		  if(optionalCompany.isPresent()){
		  		Company company = optionalComapny.get();
		  		company = company.toBuilder()~~~~;
		  	Company result =  companyRepository.save(company);
		  		return result;
		  } else {
		  	return null;
		  }
		  
		 * 
		 * */
		
		
		
		
		
		Company c1 = optionalCompany.orElse(null);
		if(c1 != null) {
			 c1 = c1.toBuilder().scale(scale).headcount(headcount).build();
			 companyRepository.save(c1);
		}
		return c1;
		
		
	}
	
	public void deleteCompanyById(int id) {
		
		Optional<Company> optionalc1 = companyRepository.findById(id);
		
		Company c1 = optionalc1.orElse(null);
		
		
		
		
		
		
		
		if(c1 !=null) {
			companyRepository.delete(c1);
		}
		
	}
	

}
