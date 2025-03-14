package com.hakancivelek.java.reflectionAttributes;

import java.lang.reflect.*;
import java.util.*;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

class Solution {
    public static void main(String[] args) {
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodNames = new ArrayList();
        for (Method method : methods) {
            methodNames.add(method.getName());
        }

        Collections.sort(methodNames);
        for (String name: methodNames) {
            System.out.println(name);
        }
    }
}




