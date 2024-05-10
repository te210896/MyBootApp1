package jp.te4a.spring.boot.myapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@ComponentScan
@Configuration
public class App {
    public static void main( String[] args ) {
        ApplicationContext ac = SpringApplication.run(App.class, args);
    }
}
