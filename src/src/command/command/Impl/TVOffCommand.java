package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVOffCommand implements Command {
    private final TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.off();
    }

    @Override
    public void unexe() {
    }
}
