package com.example.demo.models;

import java.util.List;
import java.util.Objects;

public class Customers {

    private Integer id;
    private String name;

    public Customers(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Equal Customers
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Customers customers = (Customers) o;
        return id == customers.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id= " + id +
                ", name=" + name + '\'' +
                '}';
    }
}
