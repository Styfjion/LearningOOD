package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVOnCommand implements Command {

    private final TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.on();
    }

    @Override
    public void unexe() {
    }
}
