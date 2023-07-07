package com.masglobalconsulting.careerpath.careerpath.config;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public Counter exampleOfCount(MeterRegistry meterRegistry) {
        return Counter.builder("my-app.example.test.count")
                .description("Counting number of calls")
                .register(meterRegistry);
    }

    @Bean
    public Timer exampleOfTimer(MeterRegistry meterRegistry) {
        return Timer.builder("my-app.example.test.timer").
                description("Example time consuming a call...")
                .register(meterRegistry);
    }
}
