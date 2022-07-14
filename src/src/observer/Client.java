package observer;

import observer.model.Buyer;
import observer.model.Shop;
import observer.model.impl.HandChopper;
import observer.model.impl.PhoneFans;

public class Client {

    public static void main(String[] args) {
        Buyer tangSir = new PhoneFans("手机粉");
        Buyer barJee = new HandChopper("剁手族");

        Shop shop = new Shop();

        shop.register(tangSir);
        shop.register(barJee);

        shop.setProduct("猪肉炖粉条");
        shop.setProduct("橘子手机");
    }
}
