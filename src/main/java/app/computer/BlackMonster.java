package app.computer;

public class BlackMonster extends Computer {

    public BlackMonster() {
        super("BlackM");
        setKeyboard(new Keyboard("BlackM", "hhh", "Keyboard"));
        setMonitor(new Monitor("BlackM", 12, "LED"));
        setMousse(new Mousse("BlackM", "Mouse", "Soome"));

        SystemBlock blackMonster = new SystemBlock("Blackm");
        blackMonster.setRam(new RAM("BlackM", 12, 12));
        blackMonster.setHdd(new HDD("BlacM", 12, 12));
        
        setSystemBlock(blackMonster);
    }
}