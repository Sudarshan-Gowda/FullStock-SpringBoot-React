package com.star.sud.restservices.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.sud.restservices.todo.bean.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
