package flyweight;

import flyweight.factory.TileFactory;

public class Client {
    public static void main(String[] args) {
        TileFactory tileFactory = new TileFactory();

        tileFactory.getDrawable("河流").draw(10, 10);
        tileFactory.getDrawable("河流").draw(10, 20);
        tileFactory.getDrawable("道路").draw(10, 30);
        tileFactory.getDrawable("草地").draw(10, 40);
        tileFactory.getDrawable("草地").draw(10, 50);
        tileFactory.getDrawable("草地").draw(10, 60);
        tileFactory.getDrawable("草地").draw(10, 70);
        tileFactory.getDrawable("草地").draw(10, 80);
        tileFactory.getDrawable("道路").draw(10, 90);
        tileFactory.getDrawable("道路").draw(10, 100);
        tileFactory.getDrawable("房屋").draw(10, 10);
        tileFactory.getDrawable("房屋").draw(10, 50);
    }
}
