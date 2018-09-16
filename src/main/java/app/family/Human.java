package app.family;

/**
 * Class for describing member of family. Any human can be a member
 */
public class Human {
    protected String speak;
    protected int height;
    private int weight;
    private String rankInTheFamily;
    private boolean sleep;
    private boolean walk;
    private boolean eat;

    public void setWalk(boolean walk) {
        this.walk = walk;
    }

    public void setEat(boolean eat) {
        this.eat = eat;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public void setRankInTheFamily(String rankInTheFamily) {
        this.rankInTheFamily = rankInTheFamily;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setHeight(int height) {
        this.height = height;
        if ( sleep == true ){
            height ++;
        }
    }

    public void setWeight(int weight) {
        this.weight = weight;
        if(eat == true){
            weight ++;
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getRankInTheFamily() {
        return rankInTheFamily;
    }

    public String getSpeak() {
        return speak;
    }

    public boolean getEat() { return eat;}
}
