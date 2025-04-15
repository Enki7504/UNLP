package org.example;


import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class JsonSimple {
    JSONObject json = new JSONObject();
    JSONArray jsonArray = new JSONArray();
    JSONParser jsonParser = new JSONParser();
    jsonParser.parse(json);
    json.put("nombre", "Juan");




}
