package app.family02;

import java.util.ArrayList;

public class Family3 {
    private ArrayList<Member> members;


    public Family3() {
        members = new ArrayList<>();
    }

    public void addMemeber(Member member) {
        members.add(member);
    }

    public void eat(boolean eat) {
        for (Member temp : members) {
            temp.setEat(eat);
        }
    }

    public void walk(boolean walk) {
        for (Member temp : members) {
            temp.setWalk(walk);
        }
    }

    public void sleep(boolean sleep) {
        for (Member temp : members) {
            temp.setSleep(sleep);
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (Member temp : members) {
            result = result + temp;
        }

        return result + ";";
    }

}