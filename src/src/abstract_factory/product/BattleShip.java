package abstract_factory.product;

public class BattleShip extends HighClassUnit{
    public BattleShip(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在坐标:[" + x + "," + y + "]");
    }

    @Override
    public void attack() {
        System.out.println("战舰用激光炮打击，攻击力：" + attack);
    }
}
