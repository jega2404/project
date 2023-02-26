package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Task;
import com.example.demo.Repository.review1Repository;
@Service
public class review1Service
{
	@Autowired
	review1Repository rv1repo;
	public Optional<Task> getfunction(int id)
	{
		return rv1repo.findById(id);
	}
	public String deletefunction(int id)
	{
		rv1repo.deleteById(id);;
		return "deleted";
	}
	public String putfunction(Task taskobj)
	{
		rv1repo.save(taskobj);
		return "Updated";
	}
    
}
