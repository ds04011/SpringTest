package com.ds04011.SpringTest.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ds04011.SpringTest.company.domain.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
