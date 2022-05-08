package command;

import command.command.Command;
import command.command.Impl.*;
import command.model.Bulb;
import command.model.KeyBoard;
import command.model.Switch;
import command.model.TV;

import java.security.Key;
import java.util.Arrays;
import java.util.List;

public class Client {

    private static void testOne() {
        try {
            Switch switcher = new Switch();

            Bulb bulb = new Bulb();
            switcher.setCommand(new SwitchCommand(bulb));
            switcher.buttonPush();
            Thread.sleep(3000);
            switcher.buttonPop();

            switcher.setCommand(new FlashCommand(bulb));
            switcher.buttonPush();
            Thread.sleep(3000);
            switcher.buttonPop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testTwo() {
        KeyBoard keyBoard = new KeyBoard();
        TV tv = new TV();

        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);
        Command tvChannelUpCommand = new TVChannelUpCommand(tv);
        Command tvVolumeUpCommand =  new TVVolumeUpCommand(tv);
        Command tvChannelDownCommand = new TVChannelDownCommand(tv);
        Command tvVolumeDownCommand = new TVVolumeDownCommand(tv);

        keyBoard.bindKeyCommand(KeyBoard.KeyCode.F1, List.of(tvOnCommand));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.LEFT, List.of(tvChannelUpCommand));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.RIGHT, List.of(tvChannelDownCommand));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.UP, List.of(tvVolumeUpCommand));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.DOWN, List.of(tvVolumeDownCommand));
        keyBoard.bindKeyCommand(KeyBoard.KeyCode.ESC, List.of(tvOffCommand));

        keyBoard.onKeyPressed(KeyBoard.KeyCode.F1);
        keyBoard.onKeyPressed(KeyBoard.KeyCode.LEFT);
        keyBoard.onKeyPressed(KeyBoard.KeyCode.RIGHT);
        keyBoard.onKeyPressed(KeyBoard.KeyCode.UP);
        keyBoard.onKeyPressed(KeyBoard.KeyCode.DOWN);
        keyBoard.onKeyPressed(KeyBoard.KeyCode.ESC);
    }

    private static void testThree() {
        KeyBoard keyBoard = new KeyBoard();
        TV tv = new TV();

        Command tvOnCommand = new TVOnCommand(tv);
        Command tvChannelUpCommand = new TVChannelUpCommand(tv);
        Command switchCommand = new SwitchCommand(new Bulb());

        keyBoard.bindKeyCommand(KeyBoard.KeyCode.F2, Arrays.asList(switchCommand, tvOnCommand, tvChannelUpCommand,
                tvChannelUpCommand, tvChannelUpCommand));

        keyBoard.onKeyPressed(KeyBoard.KeyCode.F2);
    }

    public static void main(String[] args) {
        System.out.println("Test One");
        testOne();
        System.out.println("---------------------------------------");
        System.out.println("Test Two");
        testTwo();
        System.out.println("---------------------------------------");
        System.out.println("Test Three");
        testThree();
    }
}
