package main.java.com.codecool.forum;

import java.time.LocalDate;

abstract class Entry {

    private LocalDate creationDate;
    private String message;
    private final int id;
    private static int nextId = 1;

    Entry() {
        this.creationDate = LocalDate.now();
        this.id = nextId;
        nextId++;
    }

    void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Creation date: " + creationDate + " Message: " + message + " ID: " + id;
    }
}
