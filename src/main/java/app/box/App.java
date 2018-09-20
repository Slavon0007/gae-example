package app.box;

public class App {

    public static void main(String[] args){

        box box = new box("bic");

        Pen pen =new Pen("oop",12,2);


        Pencil pencil = new Pencil("bic",12,3);

        Stuff stuff = new Stuff("dic",12,12);

        box.setPencil(pencil);
        box.setPen(pen);

        print(box);

    }
    public static void print(SchoolThings object) {
        System.out.println(object.toString());
    }

}
