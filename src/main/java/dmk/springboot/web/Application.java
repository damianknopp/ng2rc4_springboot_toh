package dmk.springboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import dmk.springboot.web.conf.EmbeddedTLSTomcat;
import dmk.springboot.web.conf.SwaggerConfig;

@SpringBootApplication
@Import({ SwaggerConfig.class, EmbeddedTLSTomcat.class })
@PropertySource("application-development.properties")
public class Application {

	/**
	 * @param args
	 */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
}