package interpreter.model.impl;

import interpreter.model.Expression;

public class Delay implements Expression {
    private final int seconds;

    public Delay(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public void interpreter() {
        System.out.println("系统延迟：" + seconds + "秒");
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
