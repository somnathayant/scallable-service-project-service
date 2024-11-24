package com.ms.PROJECTSERVICE.service;

import java.util.List;

import com.ms.PROJECTSERVICE.dto.Data;





public interface ProjectService {

	List<Data>getAll(Data ob);
	Data getEmpById(Integer Id);
	Data saveProject(Data ob);
}
