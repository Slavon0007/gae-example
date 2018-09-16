package app.family;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.setSpeak("Vova");

        Parents parents = new Parents();
        parents.toString();


        Family family = new Family();
        family.setRankInTheFamily("i am baby");

        family.setSpeak("Vova");
        System.out.println(family.toString());
    }
    public static void print(Child object){System.out.print(object.toString());}

}
