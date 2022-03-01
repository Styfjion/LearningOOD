package proxy.model.impl;

import proxy.model.Internet;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet {
    final private Modem modem;

    final private List<String> blackList = Arrays.asList("电影", "游戏", "音乐", "音乐", "小说");

    public RouterProxy() throws Exception {
        modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        for(var keyword : blackList) {
           if (url.contains(keyword)) {
               System.out.println("禁止访问：" + url);
               return;
           }
        }
        modem.httpAccess(url);
    }
}
