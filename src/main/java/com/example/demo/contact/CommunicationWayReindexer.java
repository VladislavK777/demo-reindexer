package com.example.demo.contact;

import ru.rt.restream.reindexer.annotations.Reindex;

import static ru.rt.restream.reindexer.IndexType.HASH;

public class CommunicationWayReindexer {

    @Reindex(name = "id")
    private Long id;

    @Reindex(name = "type")
    private String type;

    @Reindex(name = "value", type = HASH)
    private String value;

    @Reindex(name = "additional")
    private String additional;

    public CommunicationWayReindexer() {
    }

    public CommunicationWayReindexer(Long id, String type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}
