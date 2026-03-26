package observer;

// ConcreteObserver - Thanh vien nhom
public class TeamMember implements Observer {
    private String name;
    private String role;

    public TeamMember(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void update(String subjectName, String message) {
        System.out.println("  [TeamMember] " + name + " (" + role + ") nhan thong bao: " + message);
    }
}
