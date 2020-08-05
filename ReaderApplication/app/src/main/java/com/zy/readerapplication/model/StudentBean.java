package com.zy.readerapplication.model;

/**
 * @author seven
 * @description
 * @date 2020/8/1.
 */
public class StudentBean {
    private String name;

    public StudentBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
