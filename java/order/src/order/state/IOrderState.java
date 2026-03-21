package order.state;

public interface IOrderState {
  void handle(Order order);
  void name();
}
