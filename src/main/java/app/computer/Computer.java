package app.computer;

public class Computer extends Device {
    public Computer(String producedBy) {
        super(producedBy);
    }

    private Monitor monitor;
    protected Mousse mousse;
    protected Keyboard keyboard;
    protected SystemBlock systemBlock;

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mousse getMousse() {
        return mousse;
    }

    public void setMousse(Mousse mousse) {
        this.mousse = mousse;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public SystemBlock getSystemBlock() {
        return systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    @Override
    public String toString() {
        String result = "";

        if (monitor != null) {
            result = result + "monitor";
        }

        if (systemBlock != null) {
            result = result + "systemblock";
        }

        if (keyboard != null) {
            result = result + "keyboard";
        }

        if (mousse != null) {
            result = result + "mouse";
        }

        return result;
    }

}