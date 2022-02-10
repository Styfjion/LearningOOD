package facade;

import facade.item.Chef;
import facade.item.Cleaner;
import facade.item.VegVendor;
import facade.item.Waiter;

public class Facade {

    final private Chef chef;

    final private Cleaner cleaner;

    final private Waiter waiter;

    public Facade() {
        chef = new Chef();
        cleaner = new Cleaner();
        waiter = new Waiter();

        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
    }

    public void order() {
        waiter.order();
        chef.cook();
        waiter.server();
        cleaner.clean();
        cleaner.wash();
    }
}
