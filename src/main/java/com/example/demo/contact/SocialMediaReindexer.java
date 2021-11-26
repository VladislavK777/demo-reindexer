package com.example.demo.contact;

import ru.rt.restream.reindexer.annotations.Reindex;

public class SocialMediaReindexer {
    @Reindex(name = "id")
    private Long id;

    @Reindex(name = "type")
    private String type;

    @Reindex(name = "link")
    private String link;

    public SocialMediaReindexer() {
    }

    public SocialMediaReindexer(Long id, String type, String link) {
        this.id = id;
        this.type = type;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
