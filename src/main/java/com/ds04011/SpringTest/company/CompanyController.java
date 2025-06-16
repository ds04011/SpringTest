package com.ds04011.SpringTest.company;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.company.domain.Company;
import com.ds04011.SpringTest.company.service.CompanyService;

@Controller
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	
	@GetMapping("/company/insert")
	@ResponseBody
	public List<Company> addCompany(){ 
		
		Company c1 = companyService.addCompany("넥슨", "컨텐츠 게임", "대기업", 3585);
		Company c2 = companyService.addCompany("버블팡", "여신 금융업", "대기업", 6834);
		
		List<Company> l1 = new ArrayList<>();
		l1.add(c1);
		l1.add(c2);
		
		return l1;
		
	}
	
	@GetMapping("/company/update")
	@ResponseBody
	public Company updateCompany() {
		
		Company c1 = companyService.updateCompany(8, "중소기업", 34);
		
		return c1;
		
		
	}
	
	
	@GetMapping("/company/delete")
	@ResponseBody
	public String deleteCompany() {
		
		companyService.deleteCompanyById(8);
		
		
		return "수행완료";
	}
	
	

}
