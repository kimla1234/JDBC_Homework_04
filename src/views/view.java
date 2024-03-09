package views;

import controllers.UserController;
import models.User;
import utils.PrintAsTable;
import utils.Validate;

import java.util.List;

public class view {

    public static UserController userController = new UserController();
    public static User user = new User();

    public static void ui() {

        PrintAsTable.menu();
        int option = 0;
        do {
            List<User> userList = userController.userListToList();
            option = Validate.validateInputInt("Please input a number: ", "Please input a number: ", "^[1-7]$", new java.util.Scanner(System.in));
            switch (option) {
                case 1 -> {
                    userController.addUser(user);
                    System.out.println("Do you want to add another user? (yes/no)");
                    String choice = Validate.validateInputString("Please input yes or no: ", "Please input yes or no: ", "yes|no", new java.util.Scanner(System.in));
                    if (choice.equalsIgnoreCase("yes")) {
                        userController.addUser(user);
                    } else {
                        ui();
                    }
                }
                case 2 -> {
                    List<User> users = userController.userList();
                    System.out.println("=".repeat(141));
                    PrintAsTable.printAsTable(users);
                    ui();
                }
                case 3 -> {

                    User user = userController.searchUser();
                    if(user != null){
                        System.out.println("=".repeat(141));
                        PrintAsTable.printAsTableOneUser(user);
                    }else {
                        System.out.println("User not found");
                    }
                    ui();
                }
                case 4 -> {
                    userController.updateUser(userList);
                    ui();
                }
                case 5 -> {
                    userController.setUserVerified(userList);
                    ui();
                }
                case 6 -> {
                    userController.deleteUser(userList);
                    ui();
                }
                case 7 -> {
                    System.exit(0);
                    System.out.println("Good bye See you again!!");
                }
                default -> System.out.println("# Please input base on option above");
            }
        } while (true);
    }
}