package observer;

// ConcreteObserver - Nha dau tu
public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String subjectName, String message) {
        System.out.println("  [Investor] " + name + " nhan thong bao: " + message);
    }
}
