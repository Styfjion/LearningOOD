package decorator.model;

public class FoundationMakeup extends Decorator{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("擦粉底【");
        super.show();
        System.out.print("】");
    }
}
