package adapter;

// Target Interface - Dich vu web yeu cau JSON
public interface JsonService {
    String sendJsonRequest(String jsonData);
    String receiveJsonResponse();
}
