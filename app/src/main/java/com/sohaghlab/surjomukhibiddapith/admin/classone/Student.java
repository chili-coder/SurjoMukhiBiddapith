package com.sohaghlab.surjomukhibiddapith.admin.classone;

public class Student {

    private String name,roll,section,call,username,password;

    public Student() {
    }

    public Student(String name, String roll, String section, String call, String username, String password) {
        this.name = name;
        this.roll = roll;
        this.section = section;
        this.call = call;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
