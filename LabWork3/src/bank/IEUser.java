package bank;

public class IEUser {
    String userName;
    String password;


    IEUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    boolean isCorrectLoginAndPassword(String login, String password) {
        if (this.password == password && this.userName == login) {
            return true;
        }
        else return false;
    }
}
