package com.keyin;

public class Task {

    private String taskDescription;
    private Boolean isComplete;


    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
        this.isComplete = false;
    }


    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    @Override
    public String toString() {
        return this.taskDescription + " " + (this.getComplete() ? "COMPLETE" : "INCOMPLETE");
    }
}
