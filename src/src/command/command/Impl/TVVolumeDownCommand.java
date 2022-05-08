package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVVolumeDownCommand implements Command {
    private final TV tv;

    public TVVolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.volumeDown();
    }

    @Override
    public void unexe() {
    }
}
