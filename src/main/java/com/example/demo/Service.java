package com.example.demo;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import ru.rt.restream.reindexer.Namespace;
import ru.rt.restream.reindexer.Query;

import javax.annotation.PostConstruct;
import java.time.ZonedDateTime;

@Component
@EnableScheduling
public class Service {
    private final Namespace<TaskView> namespace;
    private final TaskViewRepository taskViewRepository;
    int restart = 0;

    public Service(Namespace<TaskView> namespace, TaskViewRepository taskViewRepository) {
        this.namespace = namespace;
        this.taskViewRepository = taskViewRepository;
    }

    // @Scheduled(fixedDelayString = "10000")
    public void start() {
        Long create = ZonedDateTime.now().toInstant().getEpochSecond();
        int local = 0;
        try {
            for (int i = restart; i < 10; i++) {
                Thread.sleep(5000);
                namespace.upsert(new TaskView(i, "Task_" + i, ZonedDateTime.now().toInstant().getEpochSecond(), create));
                System.out.println(i);
                local = i + 1;
            }
        } catch (Exception e) {
            System.out.println("exception i = " + local);
            restart = local;
        }
    }

    public void getTask() {
        System.out.println("--------where--------");
        System.out.println(namespace.query().whereBetweenFields("create", Query.Condition.GT, "date").execute().next());
        System.out.println("--------execSql--------");
        System.out.println(namespace.execSql("select * from test_view where create > date").next());

    }

    @PostConstruct
    public void getTaskFromStringData() {
        System.out.println("--------where--------");
        System.out.println(taskViewRepository.findAllByName("Task_2").next());
    }
}
