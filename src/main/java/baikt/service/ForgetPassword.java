package baikt.service;

import baikt.entities.Login;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForgetPassword {
    String validEmail = "long@gmail.com";

    public void checkEmail(Scanner scanner, Login login){
        do {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();

            if (isValidEmail(email)) {
                System.out.println("Invalid Email, please enter again");
            } else if (!email.equals(validEmail)) {
                System.out.println("Account does not exist, please enter again");
            } else {
                System.out.println("Please change your password");
                String newPass = scanner.nextLine();
                login.setPasswordLogin(newPass);
                break;

            }
        } while (true);

    }
    public boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return !matcher.matches();
    }
}

