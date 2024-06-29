package com.keyin;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    List<User> userArrayList = new ArrayList<>();

    public Boolean addNewUser(User newUser) {
        Boolean newUserAdded = false;
        try {
            if (!checkUsernameIsUnique(newUser)) {
                System.out.println("Error - " + newUser.getUsername() + " already used. Please select another username.");
                return newUserAdded;
            } else {
                userArrayList.add(newUser);
                newUserAdded = true;
                System.out.println(newUser.getUsername() + " added to the list.");
                return newUserAdded;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return newUserAdded;
    }


    public Boolean checkUsernameIsUnique(User newUser) {
        for (User user : userArrayList) {
            if (user.getUsername().equals(newUser.getUsername())) {
                return false;
            }
        }
        return true;
    }


    public void printUserList() {
        try {
            System.out.println("Users in the ArrayList: ");
            for (User user : userArrayList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
