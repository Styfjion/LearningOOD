package mediator;

import mediator.model.*;

public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom = new PublicChatRoom("设计模式");
         User user3 = new User("张三");
         User user4 = new User("李四");
         User user5 = new User("王五");
         AdminUser adminUser = new AdminUser("管理员");

         user3.login(chatRoom);
         user4.login(chatRoom);
         user3.talk(user4, "你好，四兄弟，就你一个人啊");
         user4.talk(user3, "是啊，三哥");

         user5.login(chatRoom);
         user3.talk(null, "瞧，王老五来了");
         user5.talk(null, "大家好");

         user3.logout();
         user4.logout();
         user5.logout();
         ChatRoom chatRoom2 = new PrivateChatRoom("私人聊天室");
         Thread t2 = new Thread(() -> user4.login(chatRoom2));
         Thread t3 = new Thread(() -> user5.login(chatRoom2));
         t2.start();
         t3.start();
         user3.login(chatRoom2);
         try {t2.join();
              t3.join();
         } catch (InterruptedException e) {throw new RuntimeException(e);
         }

         user3.talk(null, "谁进来了");
         user4.talk(null, "谁进来了");
         user5.talk(null, "谁进来了");

         adminUser.kick(user3);
         adminUser.kick(user4);
         adminUser.kick(user5);
    }
}
/*
系统消息，欢迎【张三】加入公共聊天室【设计模式】，当前人数：1
系统消息，欢迎【李四】加入公共聊天室【设计模式】，当前人数：2
【张三的对话框】
张三对李四说：你好，四兄弟，就你一个人啊
【李四的对话框】
张三对李四说：你好，四兄弟，就你一个人啊
【张三的对话框】
李四对张三说：是啊，三哥
【李四的对话框】
李四对张三说：是啊，三哥
系统消息，欢迎【王五】加入公共聊天室【设计模式】，当前人数：3
【张三的对话框】
张三对所有人说：瞧，王老五来了
【李四的对话框】
张三对所有人说：瞧，王老五来了
【王五的对话框】
张三对所有人说：瞧，王老五来了
【张三的对话框】
王五对所有人说：大家好
【李四的对话框】
王五对所有人说：大家好
【王五的对话框】
王五对所有人说：大家好
系统消息：张三离开公共聊天室，当前人数：2
系统消息：李四离开公共聊天室，当前人数：1
系统消息：王五离开公共聊天室，当前人数：0
token is 0
系统消息，欢迎【张三】加入2人聊天室【私人聊天室】
token is 1
系统消息，欢迎【王五】加入2人聊天室【私人聊天室】
token is 2
系统消息：聊天室已满
【张三的对话框】
张三说：谁进来了
【王五的对话框】
张三说：谁进来了
【李四的对话框】您还没有登录
【张三的对话框】
王五说：谁进来了
【王五的对话框】
王五说：谁进来了
系统消息：张三离开聊天室。系统消息：王五离开聊天室。

 */
