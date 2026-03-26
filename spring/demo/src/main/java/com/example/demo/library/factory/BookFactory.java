package library.factory;

// Factory Method - Tao cac loai sach
public class BookFactory {

    public static Book createBook(String type, String title, String author, String genre) {
        switch (type.toLowerCase()) {
            case "paper":
                return new PaperBook(title, author, genre, 300);
            case "ebook":
                return new EBook(title, author, genre, "PDF", 5.0);
            case "audio":
                return new AudioBook(title, author, genre, 8.0, "AI Narrator");
            default:
                throw new IllegalArgumentException("Loai sach khong hop le: " + type);
        }
    }

    public static PaperBook createPaperBook(String title, String author, String genre, int pages) {
        return new PaperBook(title, author, genre, pages);
    }

    public static EBook createEBook(String title, String author, String genre, String format, double sizeMB) {
        return new EBook(title, author, genre, format, sizeMB);
    }

    public static AudioBook createAudioBook(String title, String author, String genre, double hours, String narrator) {
        return new AudioBook(title, author, genre, hours, narrator);
    }
}
