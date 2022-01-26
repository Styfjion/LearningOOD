package abstract_factory.product;

public class Poison extends MidClassUnit{
    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液兵出现在坐标:[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂兵用毒液喷射，攻击力：" + attack);
    }
}
