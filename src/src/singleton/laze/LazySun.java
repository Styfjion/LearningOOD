package singleton.laze;

public class LazySun {
    public final String attr;

    private int test = 0;

    private volatile static LazySun lazySun;

    private LazySun() {
        attr = "The Sun has been initialed.";
        test++;
    }

    public static LazySun getInstance() {
        if (lazySun == null) {
            synchronized (LazySun.class) {
                if (lazySun == null) {
                    lazySun = new LazySun();
                }
            }
        }
        System.out.println("Get a Lazy Sun." + " " + lazySun.test);
        return lazySun;
    }
}
