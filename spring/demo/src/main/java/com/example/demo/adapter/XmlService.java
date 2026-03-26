package com.example.demo.adapter;

// Adaptee - He thong cu chi ho tro XML
public class XmlService {

    public String sendXmlRequest(String xmlData) {
        System.out.println("[XmlService] Xu ly du lieu XML: " + xmlData);
        return "XML request processed";
    }

    public String receiveXmlResponse() {
        String response = "<response><status>success</status><message>Data received</message></response>";
        System.out.println("[XmlService] Gui phan hoi XML: " + response);
        return response;
    }

    // Chuyen doi XML sang JSON (don gian)
    public static String convertXmlToJson(String xml) {
        // Parser XML don gian - trich xuat cac the va gia tri
        StringBuilder json = new StringBuilder("{");
        int i = 0;
        boolean first = true;

        while (i < xml.length()) {
            int openStart = xml.indexOf('<', i);
            if (openStart == -1) break;

            int openEnd = xml.indexOf('>', openStart);
            if (openEnd == -1) break;

            String tag = xml.substring(openStart + 1, openEnd);

            // Bo qua the dong va the root
            if (tag.startsWith("/") || tag.equals("response") || tag.equals("request")) {
                i = openEnd + 1;
                continue;
            }

            int closeStart = xml.indexOf("</" + tag + ">", openEnd);
            if (closeStart == -1) {
                i = openEnd + 1;
                continue;
            }

            String value = xml.substring(openEnd + 1, closeStart);

            // Kiem tra co phai the con khong
            if (!value.contains("<")) {
                if (!first) json.append(", ");
                json.append("\"").append(tag).append("\": \"").append(value).append("\"");
                first = false;
            }

            i = closeStart + tag.length() + 3;
        }

        json.append("}");
        return json.toString();
    }

    // Chuyen doi JSON sang XML (don gian)
    public static String convertJsonToXml(String json) {
        StringBuilder xml = new StringBuilder("<request>");

        // Loai bo {} va tach cac cap key-value
        String content = json.trim();
        if (content.startsWith("{")) content = content.substring(1);
        if (content.endsWith("}")) content = content.substring(0, content.length() - 1);

        String[] pairs = content.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split(":");
            if (keyValue.length == 2) {
                String key = keyValue[0].trim().replace("\"", "");
                String value = keyValue[1].trim().replace("\"", "");
                xml.append("<").append(key).append(">")
                   .append(value)
                   .append("</").append(key).append(">");
            }
        }

        xml.append("</request>");
        return xml.toString();
    }
}
