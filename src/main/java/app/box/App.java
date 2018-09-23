package app.box;

public class App {

    public static void main(String[] args){
        Box box = new Box("bic");

        Pen pen =new Pen("oop","Black");

        Pencil pencil = new Pencil("bic","HB", "Red");

        box.setPencil(pencil);
        //box.setPen(pen);

        System.out.println(box);
    }
}
