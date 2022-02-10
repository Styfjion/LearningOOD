package facade;

public class Client {

    public void eat() {
        System.out.println("进入餐馆......");
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        Client client = new Client();
        client.eat();
        facade.order();
    }
}
