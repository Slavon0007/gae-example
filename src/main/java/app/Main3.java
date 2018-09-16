package app;

import app.family02.Family3;
import app.family02.Member;

public class Main3 {

    public static void main(String args[]){
        Family3 family3 = new Family3();

        Member papa = new Member("papa");
        Member grandmather = new Member("grandmather");
        Member mama = new Member("mama");

        family3.addMemeber(papa);
        family3.addMemeber(grandmather);
        family3.addMemeber(mama);

        family3.walk(true);
        family3.sleep(true);
        family3.eat(false);


        System.out.println(family3.toString());
    }

}
