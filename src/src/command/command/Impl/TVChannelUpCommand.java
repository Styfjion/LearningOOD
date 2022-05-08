package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVChannelUpCommand implements Command {
    private final TV tv;

    public TVChannelUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.channelUp();
    }

    @Override
    public void unexe() {
    }
}
