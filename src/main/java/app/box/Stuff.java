package app.box;

public class Stuff extends  box {

  private int size;
  private  int dicemetr;

    public Stuff(String producedBy, int size,int dicemetr) {
            super(producedBy);
            this.size = size;
            this.dicemetr = dicemetr;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getDicemetr() {
            return dicemetr;
       }

        public void setDicemetr(int dicemetr) {
            this.dicemetr = dicemetr;
        }

        @Override
        public String toString() { return   "Stuff{" + "size=" + size + ", dicemetr=" + dicemetr + "producedBby"+ producedBy +'}'; }
    }
