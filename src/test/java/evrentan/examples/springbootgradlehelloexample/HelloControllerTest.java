package evrentan.examples.springbootgradlehelloexample;

import evrentan.examples.springbootgradlehelloexample.controller.HelloController;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = HelloController.class)
public class HelloControllerTest {

  private static final String helloMessage = "Hello from Spring Boot Java Project with Gradle";

  @Mock
  private HelloController helloController;

  @BeforeAll
  public static void beforeAll() {
    System.out.println(String.format("%s is started !!!", HelloControllerTest.class.getSimpleName()));
  }

  @AfterAll
  public static void afterAll() {
    System.out.println(String.format("%s is finished !!!", HelloControllerTest.class.getSimpleName()));
  }

  @Test
  void helloWithGradleTest() throws Exception {
    Mockito.when(helloController.helloWithGradle()).thenReturn(ResponseEntity.ok(helloMessage));
    Assertions.assertEquals(helloMessage, helloController.helloWithGradle().getBody());
  }
}
