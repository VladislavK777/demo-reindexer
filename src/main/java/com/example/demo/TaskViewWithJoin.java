package com.example.demo;

import ru.rt.restream.reindexer.IndexType;
import ru.rt.restream.reindexer.annotations.Reindex;
import ru.rt.restream.reindexer.annotations.Transient;

import java.util.List;

public class TaskViewWithJoin {
    @Reindex(name = "id", isPrimaryKey = true)
    private Integer id;

    @Reindex(name = "name")
    private String name;

    @Reindex(name = "executor")
    private String executor;

    @Reindex(name = "users")
    private List<String> users;

    @Transient
    private User joinedExecutor;
    @Transient
    private List<User> joinedUsers;

    public TaskViewWithJoin(Integer id, String name, String executor, List<String> users) {
        this.id = id;
        this.name = name;
        this.executor = executor;
        this.users = users;
    }

    public TaskViewWithJoin() {
    }

    @Override
    public String toString() {
        return "TaskViewWithJoin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", executor='" + executor + '\'' +
                ", users=" + users +
                ", joinedExecutor=" + joinedExecutor +
                ", joinedUsers=" + joinedUsers +
                '}';
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

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public User getJoinedExecutor() {
        return joinedExecutor;
    }

    public void setJoinedExecutor(User joinedExecutor) {
        this.joinedExecutor = joinedExecutor;
    }

    public List<User> getJoinedUsers() {
        return joinedUsers;
    }

    public void setJoinedUsers(List<User> joinedUsers) {
        this.joinedUsers = joinedUsers;
    }
}
