package baikt.service;

import baikt.entities.Login;

import java.util.Scanner;

public class ChangeEmail {
    public void newEmail(Scanner scanner, ForgetPassword forgetPassword, Login login){
        do {
            System.out.println("Change email: ");
            String email = scanner.nextLine();
            if (forgetPassword.isValidEmail(email)){
                System.out.println("Invalid, try again");
            } else {
                String newEmail = scanner.nextLine();
                login.setRecentEmail(newEmail);
                break;
            }
        } while (true);
    }
}
