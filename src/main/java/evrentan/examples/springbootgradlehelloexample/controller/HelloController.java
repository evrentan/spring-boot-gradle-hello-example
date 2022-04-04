package evrentan.examples.springbootgradlehelloexample.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class HelloController {

  @GetMapping
  public ResponseEntity<String> helloWithGradle() {
    return ResponseEntity.ok("Hello from Spring Boot Java Project with Gradle");
  }
}
