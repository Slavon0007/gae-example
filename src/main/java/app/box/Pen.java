package app.box;

public class Pen extends SchoolThing {
    private String color;

    public Pen(String producedBy, String color) {
        super(producedBy);

        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color;
    }
}
