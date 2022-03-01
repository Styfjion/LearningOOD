package proxy;

import proxy.model.Internet;
import proxy.model.Intranet;
import proxy.model.impl.Router;
import proxy.model.impl.RouterProxy;
import proxy.model.impl.Switch;
import proxy.utils.BlackListFilter;

import java.lang.reflect.Proxy;

public class Client {

    private static void showSpecialProxy() throws Exception {
        Internet proxy = new RouterProxy();
        proxy.httpAccess("http://www.电影.com");
        proxy.httpAccess("http://www.游戏.com");
        proxy.httpAccess("http://www.学习.com/java");
        proxy.httpAccess("http://www.工作.com");
    }

    private static void showGeneralProxy() throws Exception {
        Internet internet = (Internet)Proxy.newProxyInstance(Router.class.getClassLoader(), Router.class.getInterfaces(),
                new BlackListFilter(new Router()));
        internet.httpAccess("http://www.电影.com");
        internet.httpAccess("http://www.游戏.com");
        internet.httpAccess("http://www.学习.com/java");
        internet.httpAccess("http://www.工作.com");

        Intranet intranet = (Intranet)Proxy.newProxyInstance(Switch.class.getClassLoader(), Switch.class.getInterfaces(),
                new BlackListFilter(new Switch()));
        intranet.fileAccess("\\\\192.68.1.2\\共享\\电影\\Ironman.mp4");
        intranet.fileAccess("\\\\192.68.1.2\\共享\\游戏\\Hero.exe");
        intranet.fileAccess("\\\\192.68.1.4\\共享\\shared\\Java学习资料");
        intranet.fileAccess("\\\\192.68.1.6\\共享\\Java\\设计模式.doc");
    }

    public static void main(String[] args) throws Exception {
        showSpecialProxy();
        System.out.println("----------------------------------------------------");
        showGeneralProxy();
    }
}
