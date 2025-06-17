package com.ds04011.SpringTest.job;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ds04011.SpringTest.job.domain.Job;
import com.ds04011.SpringTest.job.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	private JobService jobService;
	
	
	@GetMapping("/job/find/1")
	@ResponseBody
	public Job findById() {
		
		Job j1 = jobService.findById(8);
		
		return j1;
	}
	
	@GetMapping("/job/find/2")
	@ResponseBody
	public List<Job> findBycompany(){
		
		List<Job> jobList =  jobService.findByCompanyId(1);
		
		return jobList;
		
		
	}
	
	@GetMapping("/job/find/3")
	@ResponseBody
	public List<Job> findBypat(){
		
		List<Job> jobList = jobService.findByPositionAndType("웹 back-end 개발자", "정규직");
		
		return jobList;
	}
	
	@GetMapping("/job/find/4")
	@ResponseBody
	public List<Job> findByCondition(){
		
		List<Job> jobList = jobService.findByTypeOrSalary("정규직", 9000);
		return jobList;

	}
	
	@GetMapping("/job/find/5")
	@ResponseBody
	public List<Job> findContracts(){
		
		List<Job> jobList = jobService.findByContractAndSalaryDesc("계약직");
		return jobList;
		
	}
	
	@GetMapping("/job/find/6")
	@ResponseBody
	public List<Job> findbyregionsalary(){
		
		List<Job> jobList = jobService.findByRegionSalary("성남시 분당구", 7000, 8500);
		return jobList;
		
	}
	
	@GetMapping("/job/find/7")
	@ResponseBody
	public List<Job> findbyDeadlineSalaryType(){
		
		List<Job> jobList = jobService.findByDeadlistSalaryTypeDesc("2026-04-10", 8100, "정규직");
		return jobList;
	}
	

}
