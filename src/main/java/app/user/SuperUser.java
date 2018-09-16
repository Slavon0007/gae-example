package app.user;

public class SuperUser extends User {
    @Override
    public void printType() {
        System.out.print("super user");
        super.printType();
    }
}
