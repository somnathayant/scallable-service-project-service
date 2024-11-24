package com.ms.PROJECTSERVICE.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.PROJECTSERVICE.dto.Data;
import com.ms.PROJECTSERVICE.pojo.Acct;
import com.ms.PROJECTSERVICE.pojo.Address;
import com.ms.PROJECTSERVICE.pojo.Emp;
import com.ms.PROJECTSERVICE.pojo.Project;
import com.ms.PROJECTSERVICE.repository.AddressRepo;
import com.ms.PROJECTSERVICE.repository.EmpRepo;
import com.ms.PROJECTSERVICE.repository.ProjectRepo;
import com.ms.PROJECTSERVICE.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepo projectRepo;
	
	@Override
	public List<Data> getAll(Data ob) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data getEmpById(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public Data saveProject(Data ob) {
		// TODO Auto-generated method stub
	
		Project p=new Project();
		p.setProjectId(ob.getProjectId());
		p.setPDuration(ob.getpDuration());
		p.setPName(ob.getpName());
		projectRepo.save(p);
		ob.setProjectId(p.getProjectId());
		 return ob;
	}

}
