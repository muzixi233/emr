package com.slwh.emr.cogfiger;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许全部请求跨域
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET", "POST")
                .allowCredentials(true).maxAge(3600);
    }
}