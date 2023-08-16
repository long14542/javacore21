package baikt.service;

import baikt.entities.Login;
import baikt.entities.Signup;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignupService {
    public Signup signupAccount(Scanner scanner, LoginService loginService, ForgetPassword forgetPassword, Signup signup, Login login) {
        do {
            System.out.println("Enter username to signup: ");
            String usernameSignup = scanner.nextLine();
            System.out.println("Enter password to signup: ");
            String passwordSignup = scanner.nextLine();
            System.out.println("Enter your email to signup: ");
            String emailSignup = scanner.nextLine();
            if (!usernameSignup.equals(loginService.getValidUsername()) && !emailSignup.equals(forgetPassword.validEmail) &&
                    passwordSignup.equals(checkPassword(signup)))
                return new Signup(usernameSignup, passwordSignup, emailSignup);
            else{
                System.out.println("username and email exist, enter again");
            }
        } while (true);
    }

    public String checkPassword(Signup signup) {
        do {
            for (int i = 0; i < signup.getPasswordSignup().length(); i++) {
                char ch = signup.getPasswordSignup().charAt(i);
                if (Character.isUpperCase(ch) && signup.getPasswordSignup().length() >= 7 && isValidPassword(signup.getPasswordSignup()) ) {
                    return signup.getPasswordSignup();
                } else  {
                    System.out.println("Invalid password, pls enter again");
                }
            }
        }while (true);
    }
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[.,-_;])(?=.*[a-zA-Z0-9]).{7,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}
