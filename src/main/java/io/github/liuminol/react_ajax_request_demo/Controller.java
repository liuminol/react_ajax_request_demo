package io.github.liuminol.react_ajax_request_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/getNames")
    public static List<String> getNames() {
        return Stream.of("Igor", "Vasya", "Petya").collect(Collectors.toList());
    }
}
