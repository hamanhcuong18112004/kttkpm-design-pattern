package order.state;

public class StateDemo {
    public static void main(String[] args) {
        Order order = new Order("DH001");
        order.process(); // Moi tao -> Dang xu ly
        order.process(); // Dang xu ly -> Da giao
        order.process(); // Da giao

        Order order2 = new Order("DH002");
        order2.cancel(); // Huy 
    }
}