package mediator.model;

import java.util.Objects;

public class User {

    private final String name;

    protected ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void login(ChatRoom chatRoom) {
        if(chatRoom.register(this)) {
            this.chatRoom = chatRoom;
        }
    }

    public void logout() {
        if (Objects.isNull(this.chatRoom)) {
            return;
        }
        chatRoom.deregister(this);
        this.chatRoom = null;
    }

    public void talk(User to, String msg) {
        if (Objects.isNull(chatRoom)) {
            System.out.println("【" + name + "的对话框】" + "您还没有登录");
            return;
        }
        chatRoom.sendMsg(this, to, msg);
    }

    public void listen(User from, User to, String msg) {
        System.out.println("【" + this.getName() + "的对话框】");
        System.out.println(chatRoom.processMsg(from, to, msg));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
