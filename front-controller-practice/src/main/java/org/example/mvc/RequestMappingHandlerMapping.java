package org.example.mvc;

import org.example.mvc.controller.Controller;
import org.example.mvc.controller.HomeController;

import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
    // key: /users [value] UserController
    private Map<String, Controller> mappings = new HashMap<>();

    void init() {
        mappings.put("/",new HomeController());
    }

    public Controller findHandler(String urlPath) {
        return mappings.get(urlPath);
    }
}

