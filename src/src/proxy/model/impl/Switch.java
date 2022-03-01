package proxy.model.impl;

import proxy.model.Intranet;

public class Switch implements Intranet {
    @Override
    public void fileAccess(String path) {
        System.out.println("访问内网：" + path);
    }
}
