package proxy.model.impl;

import proxy.model.Internet;

public class Modem implements Internet {
    public Modem(String password) throws Exception{
        if (!password.equals("123456")) {
            throw new Exception("拨号失败，请重试");
        }
        System.out.println("拨号上网......连接成功");
    }

    @Override
    public void httpAccess(String url) {
        System.out.println("正在访问：" + url);
    }
}
