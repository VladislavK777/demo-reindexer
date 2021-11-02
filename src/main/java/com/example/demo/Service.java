package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import ru.rt.restream.reindexer.Reindexer;

import static ru.rt.restream.reindexer.NamespaceOptions.defaultOptions;

@Component
@EnableScheduling
public class Service {
    private final Reindexer db;
    int restart = 0;

    @Autowired
    public Service(Reindexer reindexer) {
        this.db = reindexer;
    }

    @Scheduled(fixedDelayString = "60000")
    public void start() {
        db.openNamespace("test_view", defaultOptions(), TaskView.class);
        int local = 0;
        try {
            for (int i = restart; i < 30000; i++) {
                db.upsert("test_view", new TaskView(i, "Task_" + i));
                local = i;
            }
        } catch (Exception e) {
            System.out.println("exception i = " + local);
            restart = local;
        }
    }
}
