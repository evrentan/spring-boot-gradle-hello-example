package evrentan.examples.springbootgradlehelloexample.spring.spring;

import evrentan.examples.springbootgradlehelloexample.spring.config.CommonConfig;
import evrentan.examples.springbootgradlehelloexample.spring.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@Import(value = {CommonConfig.class, WebConfig.class})
public class SpringBootGradleHelloExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootGradleHelloExampleApplication.class, args);
	}

}
