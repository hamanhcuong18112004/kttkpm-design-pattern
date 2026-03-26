package com.example.demo.composite;

// Component Interface
public interface FileComponent {
    String getName();
    long getSize();
    void display(String indent);
}
