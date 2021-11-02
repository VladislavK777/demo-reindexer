package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.rt.restream.reindexer.Reindexer;

import static java.time.Duration.ofSeconds;
import static ru.rt.restream.reindexer.ReindexerConfiguration.builder;

@Configuration
public class ReindexerCong {

    @Bean(destroyMethod = "close")
    public Reindexer reindexer() {
        return builder()
                .url("cproto://127.0.0.1:6534/task_manager")
                .connectionPoolSize(1)
                .requestTimeout(ofSeconds(5L))
                .getReindexer();
    }
}
