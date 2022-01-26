package abstract_factory.factory;

import abstract_factory.product.*;

public class AlineFactory implements AbstractFactory {

    private final int x;

    private final int y;

    public AlineFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit creatLowClass() {
        LowClassUnit unit = new Roach(x, y);
        System.out.println("制造蟑螂兵成功。");
        return unit;
    }

    @Override
    public MidClassUnit creatMidClass() {
        MidClassUnit unit = new Poison(x, y);
        System.out.println("制造毒液兵成功。");
        return unit;
    }

    @Override
    public HighClassUnit creatHighClass() {
        HighClassUnit unit = new Mammoth(x, y);
        System.out.println("制造猛犸巨兽成功。");
        return unit;
    }
}
