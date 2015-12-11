package com.demo3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

/**
 * Created by lichangjie on 07/12/2015.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client extends Writeable {
    @JsonIgnore
    public long ids;
    public String message;
    public long time;
    public float price;

    public long getIds() {
        return ids;
    }

    public void setIds(long ids) {
        this.ids = ids;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
