package composite;

// Component Interface
public interface FileComponent {
    String getName();
    long getSize();
    void display(String indent);
}
