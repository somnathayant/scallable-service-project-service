package com.ms.PROJECTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.PROJECTSERVICE.pojo.Emp;





@Repository
public interface EmpRepo extends JpaRepository<Emp,Integer>{

}
