package com.example.demo;

import org.springframework.data.reindexer.core.mapping.Namespace;
import ru.rt.restream.reindexer.annotations.Reindex;

@Namespace(name = "test_view")
public class TaskView {
    @Reindex(name = "id", isPrimaryKey = true)
    private Integer id;

    @Reindex(name = "name", isSparse = true)
    private String name;

    @Reindex(name = "date")
    private Long date;

    @Reindex(name = "create")
    private Long create;

    public TaskView() {
    }

    public TaskView(Integer id, String name, Long date, Long create) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.create = create;
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

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getCreate() {
        return create;
    }

    public void setCreate(Long create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "TaskView{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", create=" + create +
                '}';
    }
}
