package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ThreadController {
    private AtomicLong counter = new AtomicLong(0);

    @GetMapping("/thread")
    public /*synchronized*/ String increment() {
        System.out.println("currentThread: " + Thread.currentThread().getName());
        for (long i = 0; i < 1_000_000_000l; i++) {
            counter.incrementAndGet();
        }
        System.out.println("counter: " + counter);

        return String.valueOf(counter);
    }
}
