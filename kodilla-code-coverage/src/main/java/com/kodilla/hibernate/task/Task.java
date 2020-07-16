package com.kodilla.hibernate.task;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TASKS")
public class Task {
    private int id;
    private String description;
    private LocalDate created;
    private int duration;

    public Task(String description, int duration) {
        this.description = description;
        this.created = LocalDate.now();
        this.duration = duration;
    }

    public Task() {
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @Column(name = "CREATED", nullable = false)
    public LocalDate getCreated() {
        return created;
    }

    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
