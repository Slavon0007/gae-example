package app.family02;

public class Family2 {

    protected Member dad;
    protected Member mather;
    protected Member daughter;

    public Family2(){
        dad = new Member("dad");
        mather = new Member("mather");
        daughter = new Member("daughter");
    }

    public void eat(boolean eat) {
        dad.setEat(eat);
        mather.setEat(eat);
        daughter.setEat(eat);

    }

    public void walk(boolean walk) {
        dad.setWalk(walk);
        mather.setWalk(walk);
        daughter.setWalk(walk);
    }

    public void sleep(boolean sleep) {
        dad.setSleep(sleep);
        mather.setSleep(sleep);
        daughter.setSleep(sleep);
    }

    @Override
    public String toString() {
        return "" + dad + "," + mather + "," + daughter;
    }
}

