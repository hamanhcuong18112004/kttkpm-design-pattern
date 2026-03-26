package com.example.demo.composite;

// Leaf - Đại diện cho một tập tin
public class FileLeaf implements FileComponent {
    private String name;
    private long size; // bytes

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "📄 " + name + " (" + size + " bytes)");
    }
}
