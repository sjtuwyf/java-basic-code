package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        computer.powerOff();

        Mouse mouse = new Mouse();

        USB usb =mouse;

        computer.useDevice(usb);

        USB usb1 = new KeyBoard();
        computer.useDevice(usb1);

        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(keyBoard);

        computer.powerOff();

    }
}
