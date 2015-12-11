package com.demo3.model;

import java.io.Serializable;

public class Writeable implements Serializable {
    protected String json;

    @Override
    public String toString() {
        return toJson();
    }

    public final String toJson() {
        if (this instanceof Immutable) {
            if (json == null) {
                json = JSON.safeToJson(this);
            }
            return json;
        }
        return JSON.safeToJson(this);
    }
}