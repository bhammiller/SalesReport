package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControl {
    @RequestMapping("/")
    public String sales_reporter(){
        SalesReport report = new SalesReport();
        String result = report.salesReporting();
        return result;
    }
}
