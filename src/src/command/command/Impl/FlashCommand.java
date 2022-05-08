package command.command.Impl;

import command.command.Command;
import command.model.Bulb;

public class FlashCommand implements Command {
    private final Bulb bulb;

    private volatile boolean neonRun = false;

    public FlashCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        if (!neonRun) {
            neonRun = true;
            System.out.println("霓虹灯闪烁任务启动");
            new Thread(() -> {
                while (neonRun) {
                    try {
                        bulb.on();
                        Thread.sleep(500);
                        bulb.off();
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            ).start();
        }
    }

    @Override
    public void unexe() {
        neonRun = false;
        System.out.println("霓虹灯闪烁任务结束");
    }
}
