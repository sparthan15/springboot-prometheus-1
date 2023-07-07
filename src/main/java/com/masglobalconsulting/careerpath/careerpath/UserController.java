package com.masglobalconsulting.careerpath.careerpath;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Timer;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("users")

public class UserController {

    @Autowired
    private Counter exampleOfCount;

    @Autowired
    private Timer exampleOfTimer;

    @GetMapping()
    @SneakyThrows
    public String hellowWorld()  {
        exampleOfCount.increment();
        exampleOfTimer.recordCallable(()-> "asdasd");
        return "Hello world";
    }
}
