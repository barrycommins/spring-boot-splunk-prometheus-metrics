package com.barrycommins.springbootsplunkprometheusmetrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
class DemoController {

    @GetMapping
    Hello sayHello() {
        return new Hello("Hello, World");
    }
}