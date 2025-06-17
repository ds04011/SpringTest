package com.ds04011.SpringTest.job.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds04011.SpringTest.job.domain.Job;
import com.ds04011.SpringTest.job.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
	private JobRepository jobRepository;
	
	public Job findById(int id) {
		
		Optional<Job> j1 =  jobRepository.findById(id);
		Job j = j1.orElse(null);
		// Job j = j1.get();
		return j;
	}
	
	public List<Job> findByCompanyId(int id){
		
		List<Job> jobList = jobRepository.findByCompanyId(id);
		return jobList;
	}
	
	public List<Job> findByPositionAndType(String position, String type){
		
		List<Job> jobList = jobRepository.findByPositionAndType(position, type);
		return jobList;
	}
	
	public List<Job> findByTypeOrSalary(String type, int salary){
		
		List<Job> jobList = jobRepository.findByTypeOrSalaryGreaterThan(type, salary);
		return jobList;
	}
	
	public List<Job> findByContractAndSalaryDesc(String type){
		
		List<Job> jobList = jobRepository.findTop3ByTypeOrderBySalaryDesc(type);
		return jobList;
		
	}
	
	public List<Job> findByRegionSalary(String region, int min, int max){
		
		List<Job> jobList = jobRepository.findByRegionAndSalaryBetween(region, min, max);
		return jobList;
	}
	
	public List<Job> findByDeadlistSalaryTypeDesc(String deadline, int salary, String type){
		
		List<Job> jobList = jobRepository.findBydst(deadline, salary, type);
		return jobList;
	}

}
