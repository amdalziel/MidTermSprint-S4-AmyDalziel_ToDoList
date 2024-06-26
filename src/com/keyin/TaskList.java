package com.keyin;

import java.util.LinkedList;

public class TaskList {

    private LinkedList<Task> listOfTasks;
    private User user;

    public TaskList(User user) {
        this.user = user;
        listOfTasks = new LinkedList<>();
    }


    public Task addTask(Task newTask) {
        try {
            listOfTasks.add(newTask);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newTask;
    }


    public void deleteTask(Task taskToDelete) {
        try {
            listOfTasks.remove(taskToDelete);
            System.out.println(user.getUsername()  + ": " + taskToDelete.getTaskDescription() + " ---> DELETED");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean markTaskComplete(Task taskToMark) {
        Boolean completeStatusChanged = false;
        try {
            if (!listOfTasks.contains(taskToMark)) {
                System.out.println("Task not in the user's list.");
                completeStatusChanged = false;
            } else {
                for (Task task : listOfTasks) {
                    if (task.equals(taskToMark)) {
                        task.setComplete(true);
                        System.out.println(user.getUsername()  + ": " + task.getTaskDescription() + " ---> COMPLETE");
                        completeStatusChanged = true;
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return completeStatusChanged;
    }


        public void printAllTasks () {
            try {
                System.out.println("Task List for " + user.getUsername() + " - " + user.getFirstName() + " " + user.getLastName() + ": ");
                for (Task task : listOfTasks) {
                    int taskNumber = listOfTasks.indexOf(task) + 1;
                    System.out.println("Task " + taskNumber + ": " + task);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


}
