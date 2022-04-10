package strategy.computer.model.impl;

import strategy.computer.model.USB;

public class Mouse implements USB {
    @Override
    public void read() {
        System.out.println("鼠标指令数据");
    }
}
