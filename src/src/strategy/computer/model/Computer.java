package strategy.computer.model;

public class Computer {
    private USB usb;

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void computer() {
        usb.read();
    }
}
