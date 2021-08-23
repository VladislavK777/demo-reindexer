package com.example.demo;

import ru.rt.restream.reindexer.CloseableIterator;
import ru.rt.restream.reindexer.NamespaceOptions;
import ru.rt.restream.reindexer.Reindexer;
import ru.rt.restream.reindexer.ReindexerConfiguration;

import java.time.Duration;

import static ru.rt.restream.reindexer.Query.Condition.EQ;

public class Service2 {
    public static void main(String[] args) {
        Reindexer db = ReindexerConfiguration.builder()
                .url("cproto://127.0.0.1:6534/testdb")
                .connectionPoolSize(1)
                .requestTimeout(Duration.ofSeconds(30L))
                .getReindexer();

        db.openNamespace("users", NamespaceOptions.defaultOptions(), User.class);
        db.openNamespace("task_view_user", NamespaceOptions.defaultOptions(), TaskViewWithJoin.class);

        double r = 39.;
        /*for (int i = 0; i < 40; i++) {
            db.upsert("users", new User(i, listId.get(i), listName.get(i)));
        }*/

        /*for (int i = 0; i < 50000; i++) {
            db.upsert("task_view_user", new TaskViewWithJoin(
                    i,
                    "task_" + i,
                    listId.get((int) (Math.random() * r)),
                    Arrays.asList(
                            listId.get((int) (Math.random() * r)),
                            listId.get((int) (Math.random() * r)),
                            listId.get((int) (Math.random() * r))
                    )
            ));
        }*/

        //db.execSql("SELECT * FROM task_view", TaskView.class); // NPE

        long timeStart = System.currentTimeMillis();
        CloseableIterator<TaskViewWithJoin> iterator = db.query("task_view_user", TaskViewWithJoin.class)
                .join(db.query("users", User.class).on("users", EQ, "uuid"), "joinedUsers")
                .join(db.query("users", User.class).on("executor", EQ, "uuid"), "joinedExecutor")
                .where("executor", EQ, "af0458f4-4a80-41af-b3df-6b91619606c4")
                .execute();
        long timeEnd = System.currentTimeMillis();
        System.out.println((double) (timeEnd - timeStart) / 1000);
        System.out.println(iterator.size());
        /*while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }*/
        iterator.close();

        /*db.query("task_view", TaskView.class)
                .where("users.id", SET, "460624f1-e0e9-4224-b5cf-1a7d5d1582b2", "bf31e326-5fb6-4ad5-81dd-f50d5c28e9ac")
                .set("users.name", "Акимов Аким Акимович")
                .update();*/

        System.exit(0);
    }
}
