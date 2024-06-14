package com.keyin;

import java.util.List;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        User user1 = new User("user1", "Amy", "Dalziel");
        User user2 = new User("user2", "Amie", "Dalziel");
        User user3 = new User("user1", "Amyyy", "Dalziel");

        UserList userList = new UserList();

        userList.addNewUser(user1);
        userList.addNewUser(user2);
        userList.addNewUser(user3);

        userList.printUserList();

        Task task1 = new Task("Laundry");
        Task task2 = new Task("Meal prep");
        Task task3 = new Task("Practice");
        Task task4 = new Task("Mock Task");

        user1.getUserTaskList().addTask(task1);
        user1.getUserTaskList().addTask(task2);
        user1.getUserTaskList().addTask(task3);

        user1.getUserTaskList().printAllTasks();


    }
}
