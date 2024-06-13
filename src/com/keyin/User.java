package com.keyin;


import java.util.LinkedList;

public class User {

    private int userId;
    private String firstName;
    private String lastName;
    private TaskList userTaskList;

    public User(String firstName, String lastName) {
//        this.userId = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userTaskList = new TaskList();
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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
        return super.toString();
    }
}
