package vku.boilerplate.rest.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vku.boilerplate.rest.dto.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CustomService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, "Enter your name here"));
    }

    @RequestMapping(value = "/greeting/{name}", method = RequestMethod.GET)
    public Greeting greeting(@PathVariable("name") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
