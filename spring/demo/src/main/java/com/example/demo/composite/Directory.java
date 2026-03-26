package composite;

import java.util.ArrayList;
import java.util.List;

// Composite - Đại diện cho một thư mục
public class Directory implements FileComponent {
    private String name;
    private List<FileComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    public void remove(FileComponent component) {
        children.remove(component);
    }

    public List<FileComponent> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        long totalSize = 0;
        for (FileComponent child : children) {
            totalSize += child.getSize();
        }
        return totalSize;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📁 " + name + " (total: " + getSize() + " bytes)");
        for (FileComponent child : children) {
            child.display(indent + "   ");
        }
    }
}
