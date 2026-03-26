package adapter;

// Concrete Target - Dich vu web xu ly JSON
public class JsonServiceImpl implements JsonService {

    @Override
    public String sendJsonRequest(String jsonData) {
        System.out.println("[JsonService] Nhan du lieu JSON: " + jsonData);
        return "JSON request processed successfully";
    }

    @Override
    public String receiveJsonResponse() {
        String response = "{\"status\": \"success\", \"message\": \"Data received\"}";
        System.out.println("[JsonService] Gui phan hoi JSON: " + response);
        return response;
    }
}
