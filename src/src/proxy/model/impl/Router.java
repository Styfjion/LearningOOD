package proxy.model.impl;

import proxy.model.Internet;

public class Router implements Internet {
    final private Modem modem;

    public Router() throws Exception {
        modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
