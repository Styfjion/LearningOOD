package command.model;

import command.command.Command;

public class Switch {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonPush() {
        System.out.println("按下按钮......");
        command.exe();
    }

    public void buttonPop() {
        System.out.println("弹起按钮......");
        command.unexe();
    }
}
