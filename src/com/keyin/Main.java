package com.keyin;

import java.util.List;
import java.util.ArrayList;

public class Main {

    List <User> userArrayList = new ArrayList<>();

    public static void main(String[] args) {

        TaskList taskList1 = new TaskList();
        Task task1 = new Task("Laundry");
        Task task2 = new Task("Meal prep");
        Task task3 = new Task("Practice");

        taskList1.addTask(task1);
        taskList1.addTask(task2);
        taskList1.addTask(task3);

        taskList1.printAllTasks();

        taskList1.markTaskComplete(task2);

        taskList1.printAllTasks();








    }
}
