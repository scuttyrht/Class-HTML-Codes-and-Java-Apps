package Encapsule.src.account;

import java.util.Scanner;
import Encapsule.src.print_shortcut.PrShortcut;

public class App extends PrShortcut{

    private String username;
    private String password;
    
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        App a = new App();
        String retryStayTrue = "Y";

        a.accountCons("user1", "xxx");

        Boolean retry = true;

        while (retry == true) {
            pr("Username: ");
            String inUsername = read.next();
            pr("Password: ");
            String inPassword = read.next();

            if (inUsername == a.getUsername() && inPassword == a.getPassword()) {
                prln("Selamat datang di program Java, user1");
                retry = false;
            } else if (inUsername == a.getUsername() && inPassword != a.getPassword()) {
                prln("Password salah");

                pr("Ulangi? (Y/N): ");
                String retry_prompt = read.next();

                if (retry_prompt != retryStayTrue) {
                    retry = false;
                } else {
                    retry = true;
                }
            } else {
                prln("Username tidak dikenali");

                pr("Ulangi? (Y/N): ");
                String retry_prompt = read.next();

                if (retry_prompt != retryStayTrue) {
                    retry = false;
                } else {
                    retry = true;
                }
            }
        }
        
        read.close();
    }

    //#region Setters and Getters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void accountCons(String username, String password) {
        App a = new App();
        
        a.setUsername(username);
        a.setPassword(password);
    }
    //#endregion
}
