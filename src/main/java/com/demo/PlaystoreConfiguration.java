
package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration

public class PlaystoreConfiguration{
//    @Override
//    proteced void configure(HttpSecurity http) throws Exception{
//        http
//        .authorizeRequests()
//        .requestMatchers(CorsUtils::isPreFlightRequest).permitAll()
//        .anyRequest().authentication()
//        .and().httpBasic();
//    }
//    
                  
    @Bean
    public WebMvcConfigurer corsConfigurer(){
    return new WebMvcConfigurerAdapter(){
    @Override
    public void addCorsMappings(CorsRegistry registry){
    registry.addMapping("/**");
    }
   
    };
    }
}
