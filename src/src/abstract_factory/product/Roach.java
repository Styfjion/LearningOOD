package abstract_factory.product;

public class Roach extends LowClassUnit{
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂兵出现在坐标:[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂兵用爪子挠，攻击力：" + attack);
    }
}
