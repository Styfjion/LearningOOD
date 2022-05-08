package command.command.Impl;

import command.command.Command;
import command.model.Bulb;

public class SwitchCommand implements Command {

    private final Bulb bulb;

    public SwitchCommand(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unexe() {
        bulb.off();
    }
}
