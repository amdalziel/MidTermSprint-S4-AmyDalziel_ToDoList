package com.keyin;


import java.util.LinkedList;

public class User {

    private String username;
    private String firstName;
    private String lastName;
    private TaskList userTaskList;

    public User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userTaskList = new TaskList();
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public TaskList getUserTaskList() {
        return userTaskList;
    }

    public void setUserTaskList(TaskList userTaskList) {
        this.userTaskList = userTaskList;
    }

    @Override
    public String toString() {
        return this.username + ", " + this.firstName + " " + this.lastName;
    }
}
