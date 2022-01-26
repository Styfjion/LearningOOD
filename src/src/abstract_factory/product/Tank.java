package abstract_factory.product;

public class Tank extends MidClassUnit{
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("变形坦克出现在坐标:[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("变形坦克用炮轰击，攻击力：" + attack);
    }
}
