package observer.model.impl;

import observer.model.Buyer;

public class HandChopper extends Buyer {
    public HandChopper(String name) {
        super(name);
    }

    @Override
    public void inform(String product) {
        System.out.print(name);
        System.out.println("购买" + product);
    }
}
