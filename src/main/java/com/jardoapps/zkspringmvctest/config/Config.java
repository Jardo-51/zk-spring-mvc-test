package com.jardoapps.zkspringmvctest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan("com.jardoapps.zkspringmvctest.controllers")
public class Config {

}
