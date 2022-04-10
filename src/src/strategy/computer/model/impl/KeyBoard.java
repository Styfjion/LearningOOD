package strategy.computer.model.impl;

import strategy.computer.model.USB;

public class KeyBoard implements USB {
    @Override
    public void read() {
        System.out.println("键盘指令数据");
    }
}
