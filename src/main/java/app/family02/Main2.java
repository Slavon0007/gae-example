package app.family02;

public class Main2 {

    public static void main(String args[]){
        Family2 family2 = new Family2();
        family2.walk(true);
        family2.sleep(true);
        family2.eat(false);

        System.out.println(family2.toString());
    }

}
