package com.company.initiator_and_applications_origin.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "INITIATOR", indexes = {
        @Index(name = "IDX_USER_DEPARTAMENT_ID", columnList = "DEPARTAMENT_ID"),
        @Index(name = "IDX_USER_POSITION_ID", columnList = "POSITION_ID")
})
@Entity
public class Initiator {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "FULL_NAME", nullable = false)
    @NotNull
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}