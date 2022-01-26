package abstract_factory.factory;

import abstract_factory.product.*;

public class HumanFactory implements AbstractFactory{

    private final int x;

    private final int y;

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit creatLowClass() {
        LowClassUnit unit = new Marine(x, y);
        System.out.println("制造海军陆战队员成功。");
        return unit;
    }

    @Override
    public MidClassUnit creatMidClass() {
        MidClassUnit unit = new Tank(x, y);
        System.out.println("制造变形坦克成功。");
        return unit;
    }

    @Override
    public HighClassUnit creatHighClass() {
        HighClassUnit unit = new BattleShip(x, y);
        System.out.println("制造巨型战舰成功。");
        return unit;
    }
}
