package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Task;
import com.example.demo.Repository.review1Repository;
import com.example.demo.Service.review1Service;

@RestController
public class reviewController
{
	@Autowired 
	review1Repository rv1repo;
	@Autowired
	review1Service rv1service;
	@GetMapping("/getall")
	List<Task> getList()
	{
		return rv1repo.findAll();
	}
	@GetMapping("/{id}")
	public Optional <Task> getbyid(@PathVariable int id)
	{
		return rv1service.getfunction(id);
	}
	@PostMapping("/post")
	public Task create(@RequestBody Task taskobj)
	{
		return rv1repo.save(taskobj);
	}
	@DeleteMapping("/delete")
	public String deletetaskbyid(@RequestParam int id)
	{
		return rv1service.deletefunction(id);
	}
	@PutMapping("/put")
	public String update(Task taskobj)
	{
		return rv1service.putfunction(taskobj);
	}
}
