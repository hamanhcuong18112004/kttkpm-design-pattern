package adapter;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Adapter Design Pattern - XML/JSON Converter ===");

        // ========== CASE 1: Su dung truc tiep JsonService ==========
        System.out.println("\n--- Case 1: Su dung truc tiep JsonService ---");
        JsonService jsonService = new JsonServiceImpl();
        String jsonData = "{\"name\": \"Nguyen Van A\", \"age\": \"25\", \"city\": \"HCM\"}";
        jsonService.sendJsonRequest(jsonData);
        jsonService.receiveJsonResponse();

        // ========== CASE 2: Su dung Adapter de chuyen doi XML <-> JSON ==========
        System.out.println("\n\n--- Case 2: Su dung Adapter (XML Service qua JSON interface) ---");

        // He thong cu chi ho tro XML
        XmlService xmlService = new XmlService();

        // Adapter cho phep su dung XmlService thong qua JsonService interface
        JsonService adapter = new XmlToJsonAdapter(xmlService);

        // Client gui JSON -> Adapter chuyen sang XML -> XmlService xu ly
        System.out.println("\n>> Gui JSON request qua Adapter:");
        String jsonRequest = "{\"product\": \"Laptop\", \"price\": \"1500\", \"quantity\": \"2\"}";
        adapter.sendJsonRequest(jsonRequest);

        // XmlService tra XML -> Adapter chuyen sang JSON -> Client nhan JSON
        System.out.println("\n>> Nhan JSON response qua Adapter:");
        String response = adapter.receiveJsonResponse();
        System.out.println("\n[Client] Nhan duoc JSON response: " + response);

        // ========== CASE 3: Demo chuyen doi truc tiep ==========
        System.out.println("\n\n--- Case 3: Demo chuyen doi truc tiep ---");

        String xml = "<request><name>Tran Thi B</name><email>b@email.com</email></request>";
        System.out.println("XML goc:       " + xml);
        String json = XmlService.convertXmlToJson(xml);
        System.out.println("XML -> JSON:   " + json);

        String json2 = "{\"name\": \"Le Van C\", \"phone\": \"0123456789\"}";
        System.out.println("\nJSON goc:      " + json2);
        String xml2 = XmlService.convertJsonToXml(json2);
        System.out.println("JSON -> XML:   " + xml2);
    }
}
