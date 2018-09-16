package app.family;

public class Child extends Human {
    @Override
    public void setRankInTheFamily(String str) {
        this.setRankInTheFamily(str);
    }
//нужно сделать что когда малыш спит ему прибовляется кило и рост
    @Override
    public void setSleep(boolean sl) {
        this.setSleep(true);
        if(sl == true){
            setHeight(getHeight() + 1);
        }
    }

    @Override
    public void setEat(boolean eat) {
        this.setEat(eat);
    }


    @Override
    public void setHeight(int height) {
        super.setHeight(123);
    }

    @Override
    public void setSpeak(String speak1) {
        super.setSpeak("I sm child");
    }

    @Override
    public void setWeight(int weight) {
        this.setWeight(23);
        if( weight > 50 ){
            System.out.print("Wrong Weight");
        }
    }

    @Override
    public void setWalk(boolean walk) {
        this.setWalk(false);
    }

    public void game(boolean game){
        if( game == true){
            setEat(getEat()==false);
        }
    }

    @Override
    public String toString(){

        return "I am Eat"+getEat();
    }

}
