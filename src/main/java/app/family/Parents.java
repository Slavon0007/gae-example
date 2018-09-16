package app.family;

public  class  Parents extends Human {
    @Override
    public void setEat(boolean eat) {
        this.setEat(true);
    }

    @Override
    public void setSpeak(String speak) {
        this.setSpeak(" speak");
    }

    @Override
    public void setWalk(boolean walk) {
        this.setWalk(false);
    }

    @Override
    public void setRankInTheFamily(String rankInTheFamily) {
        this.setRankInTheFamily("Parents");
    }

    @Override
    public void setSleep(boolean sleep) {
        this.setSleep(false);
    }

    @Override
    public String toString() {

        return getRankInTheFamily()+","+getSpeak()+","+getWeight();
    }
    public void work(String Work){
        Work = "i am a work";

    }
}