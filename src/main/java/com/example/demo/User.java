package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.rt.restream.reindexer.annotations.Reindex;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Reindex(name = "id", isPrimaryKey = true)
    private int id;

    @Reindex(name = "uuid")
    private String uuid;

    @Reindex(name = "name")
    private String name;
}

