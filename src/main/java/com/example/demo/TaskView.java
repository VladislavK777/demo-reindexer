package com.example.demo;

import ru.rt.restream.reindexer.annotations.Reindex;

public class TaskView {
    @Reindex(name = "id", isPrimaryKey = true)
    private Integer id;

    @Reindex(name = "name", isSparse = true)
    private String name;

    public TaskView(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
