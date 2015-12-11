package com.demo3.model;

/**
 * Created by lichangjie on 03/12/2015.
 */
public class Blog {
    private int id;
    private String title;
    private String content;
    private String owner;
    private int num;

    public Blog() {
    }

    public Blog(String title, String content, String owner) {
        this.title = title;
        this.content = content;
        this.owner = owner;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString(){
        return "id:" + id + ", title:" + title + ", content:" + content + ", owner:" + owner;
    }
}
