package com.HandyPerson.domain;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private int id;
    private String code;
    private boolean paid;


    private LocalDate date;
    private int user_id;


    private int task_id;


    private com.HandyPerson.domain.User user;
    private List<Booking> task;


    public Booking() {

    }


    public Booking( String code, boolean paid, LocalDate date, int user_id, int task_id) {
        this.code = code;
        this.paid = paid;
        this.date = date;
        this.user_id = user_id;
        this.task_id = task_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public void setUser(com.HandyPerson.domain.User user) {
        this.user = user;
    }

    public void setTask(List<Booking> task) {
        this.task = task;
    }

    public int getTask_id() {
        return task_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public com.HandyPerson.domain.User getUser() {
        return user;
    }

    public List<Booking> getTask() {
        return task;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", paid=" + paid +
                ", date=" + date +
                ", user_id=" + user_id +
                ", task_id=" + task_id +
                '}';
    }
}


