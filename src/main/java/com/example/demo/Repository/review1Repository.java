package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Task;

@Repository
public interface review1Repository extends JpaRepository<Task,Integer>
{
	
}
