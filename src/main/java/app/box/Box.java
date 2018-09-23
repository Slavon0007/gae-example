package app.box;

public class Box extends SchoolThing {
    protected Pencil pencil;
    protected Pen pen;

    public Box(String producedBy) {
        super(producedBy);
    }

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    @Override
    public String toString() {
        return super.toString() + ", box{" + "pencil=" + pencil + ", pen=" + pen.toString() + '}';
    }
}