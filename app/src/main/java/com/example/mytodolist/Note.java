package com.example.mytodolist;

import java.util.Date;

public class Note {
    public final long id;
    private Date date;
    private State state;
    private String content;
    private Priority priority;

    public Note(long id){
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public long getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    public State getState() {
        return state;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
