package com.HandyPerson.domain;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class Task extends ArrayList<Task> {

    private String title;
    private int id;
    private String description;
    private String location;

    public Task(String title, String description, String location) {
        this.title = title;
        this.description = description;
        this.location = location;
    }

    public Task() {}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return super.toArray(generator);
    }
}
