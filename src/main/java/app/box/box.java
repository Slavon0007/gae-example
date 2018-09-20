package app.box;

public class box extends SchoolThings{

           protected Pencil pencil;
           protected Pen pen;

             public box(String producedBy){super(producedBy);}

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
             public String toString() { return "box{" + "pencil=" + pencil + ", pen=" + pen + "prodycedBy"+producedBy+ '}'; }
}
