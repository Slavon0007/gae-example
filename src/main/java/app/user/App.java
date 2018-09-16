package app.user;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>();
        listString.add("adc");
        listString.add("adssaa");
        listString.add("vova");


        User user  = new User();
        user.printType();
        user.printName();

        SuperUser superUser = new SuperUser();
        superUser.printType();
        user.printName();

        User user2 = new SuperUser();
        user2.printName();
    }
}
