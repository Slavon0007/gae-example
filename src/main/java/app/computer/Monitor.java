package app.computer;

public class Monitor extends Device {
    private int size;
    private String typeOfMatrix;

    public Monitor(String producedBy, int size, String typeOfMatrix) {
        super(producedBy);
        this.size = size;
        this.typeOfMatrix = typeOfMatrix;
        this.producedBy = producedBy;
        this.state = false;
    }
    public String toString(){
        return super.toString() +". TypeOFMatrix"+typeOfMatrix;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTypeOfMatrix() {
        return typeOfMatrix;
    }

    public void setTypeOfMatrix(String typeOfMatrix) {
        this.typeOfMatrix = typeOfMatrix;
    }
}