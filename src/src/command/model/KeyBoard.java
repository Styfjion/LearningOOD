package command.model;

import command.command.Command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyBoard {
    public enum KeyCode {
        F1, F2, ESC, UP, DOWN, LEFT, RIGHT
    }

    private final Map<KeyCode, List<Command>> keyCommands = new HashMap<>();

    public void bindKeyCommand(KeyCode keyCode, List<Command> commands) {
        keyCommands.put(keyCode, commands);
    }

    public void onKeyPressed(KeyCode keyCode) {
        System.out.println(keyCode + "键按下");
        var commands = keyCommands.get(keyCode);
        if (commands == null) {
            System.out.println("警告，无效命令！");
            return;
        }
        commands.forEach(Command::exe);
    }
}
