package com.azqore.db;
import java.time.LocalDate;

//import java.util.Date;

public class Fruit {
    private long id;
    private String name;
    private LocalDate expirationDate;

    public Fruit(long id, String name,LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", expirationDate=" + expirationDate +
                '}';
    }

    public Fruit(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getFruitName() {
        return name;
    }
    public long getFruitId() {
        return id;
    }
    public LocalDate getFruitDate() {
        return expirationDate;
    }

}
