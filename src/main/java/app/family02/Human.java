package app.family02;

public class Human {
    protected boolean sleep;
    protected boolean walk;
    protected boolean eat;


    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public void setWalk(boolean walk) {
        this.walk = walk;
    }



    public boolean getEat() {
        return eat;
    }

    public boolean getSleep() {
        return sleep;
    }

    public boolean getWalk() {
        return walk;
    }

    @Override
    public String toString() {
        return "walk=" + getWalk() + ",eat=" + getEat() + ",sleep=" + getSleep();
    }
}
