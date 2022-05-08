package command.command.Impl;

import command.command.Command;
import command.model.TV;

public class TVVolumeUpCommand implements Command {
    private final TV tv;

    public TVVolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void exe() {
        tv.volumeUp();
    }

    @Override
    public void unexe() {
    }
}
