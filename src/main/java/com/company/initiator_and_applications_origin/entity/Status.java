package com.company.initiator_and_applications_origin.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum Status implements EnumClass<String> {

    OPEN("Open"),
    UNDER_REVIEW("Under review"),
    FOR_AGREEMENT("For agreement"),
    ON_APPROVAL("On approval"),
    CLOSED("Closed");

    private String id;

    Status(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Status fromId(String id) {
        for (Status at : Status.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}