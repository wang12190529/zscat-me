package com.zscat;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author : zscat [951449465]
 * @version : 1.0
 * @created on  : 14/03/2017  4:28 PM
 */
@Controller
@EnableWebMvc
@SpringBootApplication
@ComponentScan(value = {"com.zscat.blog","com.zsCat.common"})
@ServletComponentScan(value = {"com.zsCat.common.filter"})
@ImportResource({"classpath:spring-rpc.xml"})
public class BlogWebApplication extends WebMvcConfigurerAdapter {
    private static final Logger LOG = LoggerFactory.getLogger(BlogWebApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(BlogWebApplication.class, args);
    }
}