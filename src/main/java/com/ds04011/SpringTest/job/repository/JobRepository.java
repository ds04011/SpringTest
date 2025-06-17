package com.ds04011.SpringTest.job.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ds04011.SpringTest.job.domain.Job;

public interface JobRepository extends JpaRepository<Job, Integer>{
	
	public List<Job> findByCompanyId(int id);
	
	public List<Job> findByPositionAndType(String position, String type);
	
	public List<Job> findByTypeOrSalaryGreaterThan(String type, int salary);

	public List<Job> findTop3ByTypeOrderBySalaryDesc(String type);
	
	public List<Job> findByRegionAndSalaryBetween(String region, int min, int max);
	
	@Query(value="select * from `job` where `deadline` > :deadline and `salary` >= :salary and `type`=:type order by `salary` desc", nativeQuery=true)
	public List<Job> findBydst(@Param("deadline")String deadline, @Param("salary") int salary, @Param("type") String type);
}
