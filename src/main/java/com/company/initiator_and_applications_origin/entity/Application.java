package com.company.initiator_and_applications_origin.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "APPLICATION", indexes = {
        @Index(name = "IDX_APPLICATION_INITIATOR_ID", columnList = "INITIATOR_ID"),
        @Index(name = "IDX_APPLICATION_EXECUTOR_ID", columnList = "EXECUTOR_ID")
})
@Entity
public class Application {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "INITIATOR_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Initiator initiator;

    @JoinColumn(name = "EXECUTOR_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User executor;

    @Column(name = "STATUS", nullable = false)
    @NotNull
    private String status;

    @InstanceName
    @Column(name = "DESCRIPTION", nullable = false)
    @NotNull
    private String description;

    @Column(name = "OPEN_DATE", nullable = false)
    @NotNull
    private LocalDateTime openDate;

    @Column(name = "CLOSED_DATE")
    private LocalDateTime closedDate;

    public LocalDateTime getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(LocalDateTime closedDate) {
        this.closedDate = closedDate;
    }

    public LocalDateTime getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDateTime openDate) {
        this.openDate = openDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status == null ? null : Status.fromId(status);
    }

    public void setStatus(Status status) {
        this.status = status == null ? null : status.getId();
    }

    public User getExecutor() {
        return executor;
    }

    public void setExecutor(User executor) {
        this.executor = executor;
    }

    public Initiator getInitiator() {
        return initiator;
    }

    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}