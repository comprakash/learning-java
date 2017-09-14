package com.comprakash.datastructures;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}

public class JavaReflectionAttributes {
    public static void main(String[] args) {
        Class student = (new Student()).getClass();
        // Class student = Class.forName("Student");
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<String>();
        for (Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
