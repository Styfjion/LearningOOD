package prototype;

public class EnemyPlane implements Cloneable{
    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public Bullet getBullet() {
        return bullet;
    }

    private Bullet bullet;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    private int x;

    public int getY() {
        return y;
    }

    public void fly() {
        y++;
    }

    private int y = 0;

    public EnemyPlane(int x, Bullet bullet) {
        this.x = x;
        this.bullet = bullet;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane enemyPlane = (EnemyPlane) super.clone();
        enemyPlane.setBullet(this.bullet.clone());
        return enemyPlane;
    }


}
