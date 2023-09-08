package io.github.komidawi.pccbackend.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleRestApi {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }
}

