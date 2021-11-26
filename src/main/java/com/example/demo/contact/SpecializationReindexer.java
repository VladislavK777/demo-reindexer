package com.example.demo.contact;

import ru.rt.restream.reindexer.annotations.Reindex;

import java.util.List;

import static ru.rt.restream.reindexer.IndexType.HASH;

public class SpecializationReindexer {
    @Reindex(name = "id")
    private Long id;

    @Reindex(name = "type", type = HASH)
    private String type;

    @Reindex(name = "cmsType", type = HASH)
    private String cmsType;

    @Reindex(name = "subtypes", type = HASH)
    private List<String> subtypes;

    @Reindex(name = "subtypes", type = HASH)
    private List<String> cmsSubtypes;

    @Reindex(name = "isTypeSelected")
    private Boolean isTypeSelected;

    public SpecializationReindexer() {
    }

    public SpecializationReindexer(Long id, String type, String cmsType, List<String> subtypes, List<String> cmsSubtypes, Boolean isTypeSelected) {
        this.id = id;
        this.type = type;
        this.cmsType = cmsType;
        this.subtypes = subtypes;
        this.cmsSubtypes = cmsSubtypes;
        this.isTypeSelected = isTypeSelected;
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

    public String getCmsType() {
        return cmsType;
    }

    public void setCmsType(String cmsType) {
        this.cmsType = cmsType;
    }

    public List<String> getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(List<String> subtypes) {
        this.subtypes = subtypes;
    }

    public List<String> getCmsSubtypes() {
        return cmsSubtypes;
    }

    public void setCmsSubtypes(List<String> cmsSubtypes) {
        this.cmsSubtypes = cmsSubtypes;
    }

    public Boolean getIsTypeSelected() {
        return isTypeSelected;
    }

    public void setIsTypeSelected(Boolean typeSelected) {
        isTypeSelected = typeSelected;
    }
}
