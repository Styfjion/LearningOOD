package prototype;

enum BulletType {
    BOMB,
    MISSILE,
    FIRE_BOMB
}

public class Bullet implements Cloneable{

    public BulletType getBulletType() {
        return bulletType;
    }

    public int getPower() {
        return power;
    }

    public void setBulletType(BulletType bulletType) {
        this.bulletType = bulletType;
    }

    public void setPower(int power) {
        this.power = power;
    }

    private BulletType bulletType;

    private int power;

    public Bullet(int power, BulletType bulletType) {
        this.bulletType = bulletType;
        this.power = power;
    }
    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet)super.clone();
    }
}
