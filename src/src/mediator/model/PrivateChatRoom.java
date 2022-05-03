package mediator.model;

import java.util.concurrent.atomic.AtomicInteger;

public class PrivateChatRoom extends ChatRoom{
    private final AtomicInteger token = new AtomicInteger();
    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    public synchronized boolean register(User user) {
        System.out.println("token is " + token.getAndIncrement());
        if (users.size() == 2) {
            System.out.println("系统消息：聊天室已满");
            return false;
        }
        super.register(user);
        System.out.print("系统消息，欢迎【" + user.getName() + "】");
        System.out.println("加入2人聊天室【" + name + "】");
        return true;
    }

    @Override
    public void deregister(User user) {
        super.deregister(user);
        System.out.print("系统消息：" + user.getName() + "离开聊天室。");
    }

    @Override
    public void sendMsg(User from, User to, String msg) {
        users.forEach(user -> user.listen(from, null, msg));
    }

    @Override
    protected String processMsg(User from, User to, String msg) {
        return from.getName() + "说：" + msg;
    }
}
