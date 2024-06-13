package com.keyin;

import java.util.LinkedList;

public class TaskList {

    private LinkedList<Task> listOfTasks;
    private int listSize;

    public TaskList() {
        listOfTasks = new LinkedList<>();
        listSize = 0;
    }


    public Task addTask(Task newTask) {
        listOfTasks.add(newTask);
        return newTask;
    }

    public Boolean markTaskComplete(Task taskToMark) {
        Boolean completeStatusChanged = false;
        if (!listOfTasks.contains(taskToMark)) {
            System.out.println("Task not in the user's list.");
            completeStatusChanged = false;
        } else {
            for (Task task : listOfTasks) {
                if (task.equals(taskToMark)) {
                    task.setComplete(true);
                    System.out.println(task.getTaskDescription() + " ---> COMPLETE");
                    completeStatusChanged = true;
                }
            }
        }
        return completeStatusChanged;
    }


        public void printAllTasks () {
            for (Task task : listOfTasks) {
                int taskNumber = listOfTasks.indexOf(task) + 1;
                System.out.println("Task " + taskNumber + ": " + task);
            }
        }


}
