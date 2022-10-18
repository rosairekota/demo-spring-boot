package com.repository;


import org.springframework.data.repository.CrudRepository;

import com.entity.Todo;

public interface TodoRepository extends CrudRepository<Todo, Integer>{
   
    
}
