package singleton.eager;

public class Sun {
    public final String attr;

    private int test = 0;

    private static final Sun sun = new Sun();

    private Sun() {
        attr = "The Sun has been initialed.";
        test++;
    }

    public static Sun getInstance()
    {
        System.out.println("Get a Eager Sun." + " " + sun.test);
        return sun;
    }
}
