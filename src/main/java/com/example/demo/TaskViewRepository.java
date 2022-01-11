package com.example.demo;

import org.springframework.data.reindexer.repository.ReindexerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskViewRepository extends ReindexerRepository<TaskView, Integer> {
    List<TaskView> findAllByName(String name);
}
