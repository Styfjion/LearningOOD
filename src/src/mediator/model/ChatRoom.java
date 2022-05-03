package mediator.model;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatRoom {

    protected String name;

    protected List<User> users = new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    protected boolean register(User user) {
        users.add(user);
        return true;
    }

    protected void deregister(User user) {
        users.remove(user);
    }

    protected abstract void sendMsg(User from, User to, String msg);

    protected abstract String processMsg(User from, User to, String msg);
}
