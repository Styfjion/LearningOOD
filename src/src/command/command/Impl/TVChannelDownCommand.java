package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVChannelDownCommand implements Command {
    private final TV tv;

    public TVChannelDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.channelDown();
    }

    @Override
    public void unexe() {
    }
}
