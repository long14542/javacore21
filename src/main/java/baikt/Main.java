package baikt;

import baikt.entities.Login;
import baikt.service.ForgetPassword;
import baikt.service.LoginService;
import baikt.service.SignupService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginService service = new LoginService();
        //Login login = new Login();
        //service.loginToAccount(scanner, login);
        SignupService service1 = new SignupService();
        ForgetPassword forgetPassword = new ForgetPassword();
        System.out.println(service);
        System.out.println(service1);
    }
}
