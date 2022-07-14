package observer.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private String product;

    private final List<Buyer> buyers;

    public Shop() {
        product = "无选择";
        buyers = new ArrayList<>();
    }

    public void register(Buyer buyer) {
        buyers.add(buyer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        notifyBuyers();
    }

    private void notifyBuyers() {
        buyers.forEach(buyer -> buyer.inform(product));
    }
}
