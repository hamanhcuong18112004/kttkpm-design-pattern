package library.observer;

// Observer Interface - Nguoi theo doi thu vien
public interface LibraryObserver {
    void update(String message);
    String getObserverName();
}
