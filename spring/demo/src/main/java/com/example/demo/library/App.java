package com.example.demo.library;

import com.example.demo.library.singleton.Library;
import com.example.demo.library.factory.*;
import com.example.demo.library.strategy.*;
import com.example.demo.library.observer.*;
import com.example.demo.library.decorator.*;

public class App {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  HE THONG QUAN LY THU VIEN");
        System.out.println("  Su dung 5 Design Patterns");
        System.out.println("========================================");

        // ============================
        // 1. SINGLETON PATTERN
        // ============================
        System.out.println("\n[1] SINGLETON PATTERN - Thu vien duy nhat");
        System.out.println("----------------------------------------");

        Library library1 = Library.getInstance();
        Library library2 = Library.getInstance();
        System.out.println("  library1 == library2 ? " + (library1 == library2));
        System.out.println("  Ten thu vien: " + library1.getName());

        // ============================
        // 2. FACTORY METHOD PATTERN
        // ============================
        System.out.println("\n[2] FACTORY METHOD PATTERN - Tao cac loai sach");
        System.out.println("----------------------------------------");

        // Tao sach bang Factory
        Book book1 = BookFactory.createPaperBook("Doraemon", "Fujiko", "Truyen tranh", 200);
        Book book2 = BookFactory.createEBook("Clean Code", "Robert C. Martin", "Cong nghe", "PDF", 15.5);
        Book book3 = BookFactory.createAudioBook("Harry Potter", "J.K. Rowling", "Phieu luu", 12.5, "Stephen Fry");
        Book book4 = BookFactory.createPaperBook("Dac Nhan Tam", "Dale Carnegie", "Ky nang", 320);
        Book book5 = BookFactory.createBook("ebook", "Design Patterns", "GoF", "Cong nghe");
        Book book6 = BookFactory.createPaperBook("Conan", "Aoyama", "Truyen tranh", 180);

        // Them sach vao thu vien (Singleton)
        Library library = Library.getInstance();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.displayAllBooks();

        // ============================
        // 3. STRATEGY PATTERN
        // ============================
        System.out.println("\n[3] STRATEGY PATTERN - Tim kiem sach");
        System.out.println("----------------------------------------");

        BookSearcher searcher = new BookSearcher(new SearchByName());

        // Tim theo ten
        System.out.println("\n>> Tim theo ten 'Doraemon':");
        searcher.performSearch(library.getBooks(), "Doraemon");

        // Doi strategy - tim theo tac gia
        System.out.println("\n>> Doi strategy - Tim theo tac gia 'Rowling':");
        searcher.setStrategy(new SearchByAuthor());
        searcher.performSearch(library.getBooks(), "Rowling");

        // Doi strategy - tim theo the loai
        System.out.println("\n>> Doi strategy - Tim theo the loai 'Cong nghe':");
        searcher.setStrategy(new SearchByGenre());
        searcher.performSearch(library.getBooks(), "Cong nghe");

        // Tim theo the loai truyen tranh
        System.out.println("\n>> Tim theo the loai 'Truyen tranh':");
        searcher.performSearch(library.getBooks(), "Truyen tranh");

        // ============================
        // 4. OBSERVER PATTERN
        // ============================
        System.out.println("\n[4] OBSERVER PATTERN - Thong bao sach");
        System.out.println("----------------------------------------");

        BookNotifier notifier = new BookNotifier();

        Librarian librarian1 = new Librarian("Nguyen Van A");
        Reader reader1 = new Reader("Tran Thi B");
        Reader reader2 = new Reader("Le Van C");

        // Dang ky nhan thong bao
        notifier.registerObserver(librarian1);
        notifier.registerObserver(reader1);
        notifier.registerObserver(reader2);

        // Thong bao sach moi
        System.out.println();
        notifier.notifyNewBook("Sapiens - Luoc su loai nguoi");

        // Muon sach va thong bao het han
        System.out.println();
        library.borrowBook(book1);
        library.borrowBook(book1); // Muon lai - da duoc muon

        // Tra sach va thong bao
        System.out.println();
        library.returnBook(book1);
        notifier.notifyBookAvailable(book1.getTitle());

        // Huy dang ky
        System.out.println();
        notifier.removeObserver(reader2);
        notifier.notifyNewBook("Thinking Fast and Slow");

        // ============================
        // 5. DECORATOR PATTERN
        // ============================
        System.out.println("\n[5] DECORATOR PATTERN - Mo rong dich vu muon sach");
        System.out.println("----------------------------------------");

        // Muon co ban
        BorrowService basic = new BasicBorrow("Clean Code");
        System.out.println("\n  >> Muon co ban:");
        System.out.println("  Mo ta: " + basic.getDescription());
        System.out.println("  So ngay: " + basic.getBorrowDays() + " ngay");
        System.out.println("  Chi phi: " + basic.getCost() + " VND");

        // Muon + gia han 7 ngay
        BorrowService extended = new ExtendedBorrow(new BasicBorrow("Harry Potter"), 7);
        System.out.println("\n  >> Muon + gia han:");
        System.out.println("  Mo ta: " + extended.getDescription());
        System.out.println("  So ngay: " + extended.getBorrowDays() + " ngay");
        System.out.println("  Chi phi: " + extended.getCost() + " VND");

        // Muon + phien ban dac biet (chu noi Braille)
        BorrowService special = new SpecialEditionBorrow(new BasicBorrow("Dac Nhan Tam"), "Chu noi Braille");
        System.out.println("\n  >> Muon + phien ban dac biet:");
        System.out.println("  Mo ta: " + special.getDescription());
        System.out.println("  So ngay: " + special.getBorrowDays() + " ngay");
        System.out.println("  Chi phi: " + special.getCost() + " VND");

        // Muon + ban dich + gia han + phien ban dac biet (ket hop nhieu decorator)
        BorrowService combo = new ExtendedBorrow(
                                new TranslatedBorrow(
                                    new SpecialEditionBorrow(
                                        new BasicBorrow("Design Patterns"), "In chu lon"),
                                    "Tieng Viet"),
                                14);
        System.out.println("\n  >> Muon ket hop nhieu tinh nang:");
        System.out.println("  Mo ta: " + combo.getDescription());
        System.out.println("  So ngay: " + combo.getBorrowDays() + " ngay");
        System.out.println("  Chi phi: " + combo.getCost() + " VND");

        // ============================
        // TONG KET
        // ============================
        System.out.println("\n========================================");
        System.out.println("  TONG KET - 5 Design Patterns");
        System.out.println("  1. Singleton  - Thu vien duy nhat");
        System.out.println("  2. Factory    - Tao sach giay/dien tu/noi");
        System.out.println("  3. Strategy   - Tim theo ten/tac gia/the loai");
        System.out.println("  4. Observer   - Thong bao sach moi/het han");
        System.out.println("  5. Decorator  - Gia han/ban dich/phien ban dac biet");
        System.out.println("========================================");
    }
}
