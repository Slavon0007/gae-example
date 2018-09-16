package app.family;

public class Family extends Human {

    public String mama(){
        return "mamam";
    }
    @Override
    public void setEat(boolean eat) {
        super.setEat(eat);
    }

    @Override
    public void setSpeak(java.lang.String speak) {
        this.setSpeak(speak);
    }

    @Override
    public void setWalk(boolean walk) {
        this.setWalk(walk);
    }

    @Override
    public void setRankInTheFamily(String rankInTheFamily) {
        this.setRankInTheFamily("Buba");
    }


    @Override
    public String toString() {
        return ""+mama();
    }

}
