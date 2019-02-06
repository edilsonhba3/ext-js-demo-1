package com.ws.rest.controller;

import java.util.HashMap;		
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
@RequestMapping("/")
public class FrontController
{
    @GetMapping("")
    public Object index()
    {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("success", "response");
        return map;
    }

}
