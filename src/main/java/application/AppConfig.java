package application;

import application.config.WebConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@ComponentScan(basePackages = "application.controller")
@ComponentScan(basePackages = "application")
@EnableWebMvc
public class AppConfig {
    /*@Bean
    public WebConfig getWebConfig() {
        return new WebConfig();
    }*/
}
