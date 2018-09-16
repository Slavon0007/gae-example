package app.computer;

public class SystemBlock extends Device {
    public SystemBlock(String producedBy) {
        super(producedBy);
    }

    public String toString() {
        return super.toString() + ". Hdd" + hdd + ". Ram" + ram;
    }

    private HDD hdd;
    private RAM ram;

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD Disc) {
        hdd = Disc;
    }
}