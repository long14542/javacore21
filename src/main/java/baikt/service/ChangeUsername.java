package baikt.service;

import baikt.entities.Login;

import java.util.Scanner;

public class ChangeUsername {
    public void newUsername(Scanner scanner, Login login){
        System.out.println("Pls change your username: ");
        String newUsername = scanner.nextLine();
        login.setUsernameLogin(newUsername);
        System.out.println("Change success");
    }
}
