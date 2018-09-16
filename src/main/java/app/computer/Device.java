package app.computer;

public abstract class Device {
    protected boolean state;
    protected String producedBy;

    public Device(String producedBy) {
        if (producedBy == null) {
            this.producedBy = "Not define";
        } else {
            this.producedBy = producedBy;
        }
    }

    public String toString() {
        return "State: " + state + ". Produced by " + producedBy;
    }
}