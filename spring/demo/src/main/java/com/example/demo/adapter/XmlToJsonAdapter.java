package com.example.demo.adapter;

// Adapter - Chuyen doi giua XML va JSON
public class XmlToJsonAdapter implements JsonService {
    private XmlService xmlService;

    public XmlToJsonAdapter(XmlService xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public String sendJsonRequest(String jsonData) {
        System.out.println("[Adapter] Nhan du lieu JSON tu client: " + jsonData);

        // Chuyen doi JSON -> XML de gui cho XmlService
        String xmlData = XmlService.convertJsonToXml(jsonData);
        System.out.println("[Adapter] Da chuyen doi sang XML: " + xmlData);

        // Gui XML cho XmlService xu ly
        String result = xmlService.sendXmlRequest(xmlData);
        return result;
    }

    @Override
    public String receiveJsonResponse() {
        // Nhan XML response tu XmlService
        String xmlResponse = xmlService.receiveXmlResponse();

        // Chuyen doi XML -> JSON de tra ve cho client
        String jsonResponse = XmlService.convertXmlToJson(xmlResponse);
        System.out.println("[Adapter] Da chuyen doi sang JSON: " + jsonResponse);

        return jsonResponse;
    }
}
