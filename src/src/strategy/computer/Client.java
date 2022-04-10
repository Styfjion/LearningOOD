package strategy.computer;

import strategy.computer.model.Computer;
import strategy.computer.model.impl.Camera;
import strategy.computer.model.impl.KeyBoard;
import strategy.computer.model.impl.Mouse;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.setUsb(new KeyBoard());
        computer.computer();

        computer.setUsb(new Mouse());
        computer.computer();

        computer.setUsb(new Camera());
        computer.computer();
    }
}
