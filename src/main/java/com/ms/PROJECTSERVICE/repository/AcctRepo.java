package com.ms.PROJECTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.PROJECTSERVICE.pojo.Acct;





@Repository
public interface AcctRepo extends JpaRepository<Acct,Integer>{

}
