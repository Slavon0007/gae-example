package app.box;

public class Pencil extends SchoolThing {
    private String type;
    private String color;

    public Pencil(String producedBy, String type, String color) {
        super(producedBy);

        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", color: " + color + ", type: " + type;
    }
}
