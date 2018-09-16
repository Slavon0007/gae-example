package app.computer;

public class InputDevice extends Device {
    public InputDevice(String producedBy, String name, String type) {
        super(producedBy);
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return super.toString() + ". Name" + name + ".Type" + type;
    }

    protected String name;
    protected String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }
}