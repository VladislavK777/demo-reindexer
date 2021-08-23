package com.example.demo;

import ru.rt.restream.reindexer.IndexType;
import ru.rt.restream.reindexer.annotations.Reindex;

public class SimpleObject {
    @Reindex(name = "id", type = IndexType.TEXT)
    private String id;

    // add index by 'name' field
    @Reindex(name = "name", type = IndexType.TEXT)
    private String name;

    @Override
    public String toString() {
        return "SimpleObject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleObject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public SimpleObject() {
    }
}
