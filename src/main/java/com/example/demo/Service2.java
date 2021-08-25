package com.example.demo;

import ru.rt.restream.reindexer.Reindexer;

import static java.time.Duration.ofSeconds;
import static ru.rt.restream.reindexer.NamespaceOptions.defaultOptions;
import static ru.rt.restream.reindexer.ReindexerConfiguration.builder;

public class Service2 {
    public static void main(String[] args) {
        Reindexer db = builder()
                .url("cproto://127.0.0.1:6534/testdb")
                .connectionPoolSize(1)
                .requestTimeout(ofSeconds(5L))
                .getReindexer();

        db.openNamespace("test_view", defaultOptions(), TaskView.class);
        for (int i = 0; i < 100000; i++) {
            db.upsert("test_view", new TaskView(
                    i,
                    "task_" + i
            ));
        }
    }
}
