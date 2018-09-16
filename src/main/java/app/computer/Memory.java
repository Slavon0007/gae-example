package app.computer;

public class Memory extends Device {
    protected int size;
    protected int type;

    public Memory(String producedBy, int size, int type) {
        super(producedBy);

        this.size = size;
        this.type = type;
    }

    public String toString() {
        return super.toString() + ". Size: " + size + ". Type: " + type;
    }

    public int getSize() {
        return size;
    }

    public int getType() {
        return type;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setType(int type) {
        this.type = type;
    }
}