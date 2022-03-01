package proxy.utils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class BlackListFilter implements InvocationHandler {
    final private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "音乐", "小说");

    final private Object origin;

    public BlackListFilter(Object origin) {
        this.origin = origin;
        System.out.println("开启黑名单过滤功能......");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //切入"方法面"之前的过滤器逻辑
        String arg = args[0].toString();
        for (var keyword : blackList) {
            if (arg.contains(keyword)) {
                System.out.println("禁止访问：" + arg);
                return null;
            }
        }
        //转向被代理对象方法
        System.out.println("校验通过，转向实际业务......");
        return method.invoke(origin, arg);
    }
}
