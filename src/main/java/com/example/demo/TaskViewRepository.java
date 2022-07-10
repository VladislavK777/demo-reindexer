package com.example.demo;

import org.springframework.data.reindexer.core.mapping.Query;
import org.springframework.data.reindexer.repository.ReindexerRepository;
import org.springframework.data.repository.query.Param;
import ru.rt.restream.reindexer.CloseableIterator;

import java.util.Iterator;
import java.util.List;

public interface TaskViewRepository extends ReindexerRepository<TaskView, Integer> {
    @Query(value = "SELECT * FROM test_view where name = '%s'")
    CloseableIterator<TaskView> findAllByName(String name);
}
