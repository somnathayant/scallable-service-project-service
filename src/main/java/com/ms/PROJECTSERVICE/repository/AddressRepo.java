package com.ms.PROJECTSERVICE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ms.PROJECTSERVICE.pojo.Address;





@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>{

}
