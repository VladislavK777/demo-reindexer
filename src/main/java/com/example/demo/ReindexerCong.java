package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.rt.restream.reindexer.Namespace;
import ru.rt.restream.reindexer.Reindexer;

import static java.time.Duration.ofSeconds;
import static ru.rt.restream.reindexer.NamespaceOptions.defaultOptions;
import static ru.rt.restream.reindexer.ReindexerConfiguration.builder;

@Configuration
public class ReindexerCong {

    @Bean(destroyMethod = "close")
    public Reindexer reindexer() {
        return builder()
                .url("cproto://127.0.0.1:6534/test_db")
                .connectionPoolSize(1)
                .requestTimeout(ofSeconds(5L))
                .getReindexer();
    }

    @Bean
    public Namespace<TaskView> namespace() {
        return reindexer().openNamespace("test_view", defaultOptions(), TaskView.class);
    }
}
