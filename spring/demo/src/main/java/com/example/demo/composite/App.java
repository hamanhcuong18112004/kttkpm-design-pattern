package com.example.demo.composite;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Composite Design Pattern - File Manager ===\n");

        // Tạo các tập tin (Leaf)
        FileLeaf file1 = new FileLeaf("file1.txt", 100);
        FileLeaf report = new FileLeaf("report.docx", 2048);
        FileLeaf notes = new FileLeaf("notes.txt", 512);
        FileLeaf photo = new FileLeaf("photo.png", 4096);
        FileLeaf screen1 = new FileLeaf("screen1.png", 1024);

        // Tạo các thư mục (Composite)
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");
        Directory screenshots = new Directory("Screenshots");

        // Xây dựng cấu trúc cây
        root.add(file1);
        root.add(documents);
        root.add(images);

        documents.add(report);
        documents.add(notes);

        images.add(photo);
        images.add(screenshots);

        screenshots.add(screen1);

        // Hiển thị toàn bộ cây thư mục
        System.out.println("--- Cau truc cay thu muc ---");
        root.display("");

        // Hiển thị kích thước từng thư mục
        System.out.println("\n--- Kich thuoc tung thu muc ---");
        System.out.println("Root: " + root.getSize() + " bytes");
        System.out.println("Documents: " + documents.getSize() + " bytes");
        System.out.println("Images: " + images.getSize() + " bytes");
        System.out.println("Screenshots: " + screenshots.getSize() + " bytes");

        // Xóa một tập tin và hiển thị lại
        System.out.println("\n--- Sau khi xoa notes.txt ---");
        documents.remove(notes);
        root.display("");
    }
}
