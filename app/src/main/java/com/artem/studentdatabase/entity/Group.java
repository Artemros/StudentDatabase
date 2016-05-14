package com.artem.studentdatabase.entity;

/**
 * Created by denis on 19.03.2016.
 */
public class Group {
    public Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Класс " + name;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Group && ((Group) o).getId() == id);
    }
}
