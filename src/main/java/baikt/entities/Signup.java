package baikt.entities;

public class Signup {
    private String usernameSignup;
    private String passwordSignup;
    private String emailSignup;

    public Signup(String usernameSignup, String passwordSignup, String emailSignup) {
        this.usernameSignup = usernameSignup;
        this.passwordSignup = passwordSignup;
        this.emailSignup = emailSignup;
    }

    public String getUsernameSignup() {
        return usernameSignup;
    }

    public void setUsernameSignup(String usernameSignup) {
        this.usernameSignup = usernameSignup;
    }

    public String getPasswordSignup() {
        return passwordSignup;
    }

    public void setPasswordSignup(String passwordSignup) {
        this.passwordSignup = passwordSignup;
    }

    public String getEmailSignup() {
        return emailSignup;
    }

    public void setEmailSignup(String emailSignup) {
        this.emailSignup = emailSignup;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "usernameSignup='" + usernameSignup + '\'' +
                ", passwordSignup='" + passwordSignup + '\'' +
                ", emailSignup='" + emailSignup + '\'' +
                '}';
    }
}
