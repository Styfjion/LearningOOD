package strategy.computer.model.impl;

import strategy.computer.model.USB;

public class Camera implements USB {
    @Override
    public void read() {
        System.out.println("视频流数据");
    }
}
