package com.ms.PROJECTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.PROJECTSERVICE.pojo.Project;







@Repository
public interface ProjectRepo extends JpaRepository<Project,Integer>{

}
