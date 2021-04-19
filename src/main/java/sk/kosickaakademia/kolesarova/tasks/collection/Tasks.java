package sk.kosickaakademia.kolesarova.tasks.collection;

import java.util.Date;

public class Tasks {
    private String name;
    private int priority;
    private boolean done;
    private Date date;
    private double price;

    public Tasks(String name, int priority, boolean done, Date date, double price) {
        this.name = name;
        this.priority = priority;
        this.done = done;
        this.date = date;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isDone() {
        return done;
    }

    public Date getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }
}
