package mediator.model;

import java.util.Objects;

public class PublicChatRoom extends ChatRoom{
    public PublicChatRoom(String name) {
        super(name);
    }

    @Override
    protected boolean register(User user) {
        super.register(user);
        System.out.print("系统消息，欢迎【" + user.getName() + "】");
        System.out.println("加入公共聊天室【" + name + "】，当前人数：" + users.size());
        return true;
    }

    @Override
    protected void deregister(User user) {
        super.deregister(user);
        System.out.print("系统消息：" + user.getName());
        System.out.println("离开公共聊天室，当前人数：" + users.size());
    }

    @Override
    public void sendMsg(User from, User to, String msg) {
        if (Objects.isNull(to)) {
            users.forEach(user -> user.listen(from, null, msg));
            return;
        }
        users.stream().filter(user -> user.equals(to) || user.equals(from)).forEach(user -> user.listen(from, to, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        String toName = "所有人";
        if (!Objects.isNull(to)) {
            toName = to.getName();
        }
        return from.getName() + "对" + toName + "说：" + msg;
    }
}
