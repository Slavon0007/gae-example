package test;

import app.ListsApp;
import app.computer.Computer;
import app.computer.Keyboard;
import app.computer.Monitor;
import app.computer.Mousse;
import app.computer.SystemBlock;
import app.family02.Family2;
import app.family02.Family3;
import app.family02.Member;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testMonitor() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));

        assertEquals("monitor", computer.toString());
    }

    @Test
    public void testMonitorMouse() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));

        assertEquals("monitor" + "mousse", computer.toString());
    }

    @Test
    public void testMonitorKeyboard() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setKeyboard(new Keyboard("some factory 2", "genius", "33"));

        assertEquals("monitorkeyboard", computer.toString());
    }

    @Test
    public void testMonitorSystemBlock() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setSystemBlock(new SystemBlock("IBM"));

        assertEquals("monitorsystemBlock", computer.toString());
    }

    @Test
    public void testMonitorMouseKeyboard() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));
        computer.setKeyboard(new Keyboard("some factory 2", "genius", "33"));
        assertEquals("monitormoussekeyboard", computer.toString());
    }

    @Test
    public void testMonitorMouseSystemBlock() {
        Computer computer = new Computer("some factory");
        computer.setMonitor(new Monitor("some factory", 17, "lCD"));
        computer.setMousse(new Mousse("some factory", "RAZR", "fast"));

        assertEquals("monitormoussesystemBlock", computer.toString());
    }

    @Test
    public void homeArrey() {
        ListsApp listsApp = new ListsApp();
        int[] arrey = {1, 2, 3, 4, 5, 6, 7,};
        listsApp.homeArrey(arrey);

        assertEquals("error",2,4);
    }
    @Test
    public  void testFamily2(){
        Family2 family2 = new Family2();
        family2.eat(true);
        family2.sleep(false);
        family2.walk(false);

        assertEquals("family ,eat true,sleep false,walk false",family2.toString());
    }
    @Test
    public  void testFamily3(){
        Family3 family3 = new Family3();
        Member papa = new Member("papa");
        Member mama = new Member("mama");

        family3.addMemeber(papa);
        family3.addMemeber(mama);

        family3.eat(true);
        family3.sleep(false);
        family3.walk(false);

        assertEquals("papa = eat:true;sleep:falsa;walk:false mama = eat:true;sleep:falsse;walk:false",family3.toString());
    }
}