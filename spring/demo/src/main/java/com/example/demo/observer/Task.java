package com.example.demo.observer;

import java.util.ArrayList;
import java.util.List;

// ConcreteSubject - Cong viec/Task
public class Task implements Subject {
    private String taskName;
    private String status;
    private List<Observer> observers;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
        this.observers = new ArrayList<>();
    }

    public String getTaskName() {
        return taskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String newStatus) {
        String oldStatus = this.status;
        this.status = newStatus;
        System.out.println("\n[Task] " + taskName + ": trang thai thay doi \"" + oldStatus + "\" -> \"" + newStatus + "\"");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message = "Task \"" + taskName + "\" da chuyen sang trang thai: \"" + status + "\"";
        for (Observer observer : observers) {
            observer.update(taskName, message);
        }
    }
}
