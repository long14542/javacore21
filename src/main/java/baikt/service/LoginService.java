package baikt.service;

import baikt.entities.Login;

import java.util.Scanner;

public class LoginService {
    private final String validUsername = "user123";
    private String validPassword = "pass456";

    public String getValidUsername() {
        return validUsername;
    }

    public void setValidPassword(String validPassword) {
        this.validPassword = validPassword;
    }

    public String getValidPassword() {
        return validPassword;
    }

    public Login loginToAccount(Scanner scanner, Login login){
        ForgetPassword forgetPassword = new ForgetPassword();
        ChangeUsername newUsername = new ChangeUsername();
        ChangeEmail changeEmail = new ChangeEmail();

        do {
            System.out.println("Enter username to login: ");
            String usernameLogin = scanner.nextLine();
            System.out.println("Enter password to login: ");
            String passwordLogin = scanner.nextLine();
            String newEmail = login.getRecentEmail();
            if (usernameLogin.equals(validUsername) && passwordLogin.equals(validPassword)){
                    System.out.println("Chào mừng " + usernameLogin + ", bạn có thể thực hiện các công việc sau: ");
                    System.out.println("1- Thay đổi username");
                    System.out.println("2- Thay đổi email");
                    System.out.println("3- Thay đổi mật khẩu");
                    System.out.println("4- Đăng xuất");
                    System.out.println("please choose");
                    int choose;
                    try {
                        choose = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                        continue;
                    }
                switch (choose) {
                    case 1 -> newUsername.newUsername(scanner, login);
                    case 2 -> changeEmail.newEmail(scanner, forgetPassword, login);
                    case 3 -> forgetPassword.checkEmail(scanner, login);
                    case 4 -> {
                        return loginToAccount(scanner, login);
                    }
                }
                return new Login(usernameLogin, passwordLogin, newEmail);

            } else if (!usernameLogin.equals(validUsername)) {
                System.out.println("Check your username again");
            } else {
                System.out.println("1- Login again");
                System.out.println("2- Forgot password");
                System.out.println("please choose");
                int choose;
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
                    continue;
                }
                switch (choose) {
                    case 1 -> System.out.println("Login again");
                    case 2 -> forgetPassword.checkEmail(scanner, new Login(usernameLogin, passwordLogin, newEmail));
                }
            }
        } while (true);
    }
}
