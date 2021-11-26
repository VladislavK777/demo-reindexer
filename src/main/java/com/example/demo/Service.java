package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.rt.restream.reindexer.Namespace;

@Component
//@EnableScheduling
public class Service {
    private final Namespace<TaskView> namespace;
    int restart = 0;

    @Autowired
    public Service(Namespace<TaskView> namespace) {
        this.namespace = namespace;
    }

    @Scheduled(fixedDelayString = "60000")
    public void start() {
        int local = 0;
        try {
            for (int i = restart; i < 30000; i++) {
                Thread.sleep(1000);
                namespace.upsert(new TaskView(i, "Task_" + i));
                System.out.println(i);
                local = i + 1;
            }
        } catch (Exception e) {
            System.out.println("exception i = " + local);
            restart = local;
        }
    }
}
