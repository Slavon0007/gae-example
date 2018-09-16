package app.computer;

public class App {
    
    public static void main(String[] args) {
        BlackMonster monster = new BlackMonster();

        System.out.print(monster);

        Computer computer = new Computer("string");

        Monitor monitor = new Monitor("vova", 78, "rout");

        SystemBlock systemBlock = new SystemBlock("vova");
        computer.setSystemBlock(systemBlock);
        computer.setMonitor(monitor);

        print(computer);
        Memory memory = new Memory("vova", 12, 12);
        print(memory);
    }

    public static void print(Device object) {
        System.out.println(object.toString());
    }
}
