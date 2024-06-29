package com.keyin;

import java.util.List;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

//        Three user objects created
        User user1 = new User("User1", "Amy", "Dalziel");
        User user2 = new User("User2", "Shania", "Twain");
        User user3 = new User("User1", "Nicole", "Kidman");

//        UserList object created
        UserList userList = new UserList();

//        Three user objects added to userList object - only TWO will be added (third user object has a username that is already taken)
        userList.addNewUser(user1);
        userList.addNewUser(user2);
        userList.addNewUser(user3);

        System.out.println();

//        Prints toString for each user in the userList
        userList.printUserList();

//      Five task objects created
        Task task1 = new Task("Laundry");
        Task task2 = new Task("Meal prep");
        Task task3 = new Task("Practice");
        Task task4 = new Task("Gym");
        Task task5 = new Task("Homework");

//        Tasks added to a user's task list
        user1.getUserTaskList().addTask(task1);
        user1.getUserTaskList().addTask(task2);
        user1.getUserTaskList().addTask(task3);

        user2.getUserTaskList().addTask(task4);
        user2.getUserTaskList().addTask(task5);

        System.out.println();

//        Print the toString method for each task in a user's task list
        user1.getUserTaskList().printAllTasks();

        System.out.println();

        user2.getUserTaskList().printAllTasks();

//        Mark a task as complete

        System.out.println();

        user1.getUserTaskList().markTaskComplete(task1);

        user2.getUserTaskList().markTaskComplete(task5);

//        Re-print the user's task lists (some items will be labelled as COMPLETE)

        System.out.println();

        user1.getUserTaskList().printAllTasks();

        System.out.println();

        user2.getUserTaskList().printAllTasks();

        System.out.println();

//        Delete a task from a task list
        user1.getUserTaskList().deleteTask(task1);

        System.out.println();

//        Re-print the user's task list
        user1.getUserTaskList().printAllTasks();


    }
}
