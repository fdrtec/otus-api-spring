package org.ccem.otus.api.spring.permission.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Document
public class Permission {

    @Id
    private String id;

    @NotEmpty(message = "ObjectType can not be empty")
    private String objectType;

    @NotNull(message = "Value can not be null")
    private Integer version;

    @NotEmpty(message = "acronym can not be empty")
    private String acronym;

    private List<String> exclusiveDisjunction;

    public Permission() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }


    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public List<String> getExclusiveDisjunction() {
        return exclusiveDisjunction;
    }

    public void setExclusiveDisjunction(List<String> exclusiveDisjunction) {
        this.exclusiveDisjunction = exclusiveDisjunction;
    }
}
