package com.ms.PROJECTSERVICE.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.PROJECTSERVICE.dto.Data;
import com.ms.PROJECTSERVICE.service.ProjectService;


@RequestMapping("/PROJECT-SERVICE")
@RestController
public class ProjectController {

	
	@Autowired
	private ProjectService projectService;
	@GetMapping("/")
	public String ping() {
		return "ok";
	}
	
	@GetMapping("/getAllProject")
	public ResponseEntity<List<Data>>getAllProject(){
		List<Data> ob=new ArrayList<Data>();
		
		
		return new ResponseEntity<List<Data>>(ob,HttpStatus.OK);
	}
	
	@PostMapping("/saveProject")
	public ResponseEntity<Data>saveProject(@RequestBody Data ob){
		HttpStatus httpStatus=null;
		try {
			ob=projectService.saveProject(ob);
			httpStatus=HttpStatus.OK;
		}catch(Exception ex) {
			httpStatus=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		System.out.println("data "+ob);
		return new ResponseEntity<Data>(ob,HttpStatus.OK);
	}
}
