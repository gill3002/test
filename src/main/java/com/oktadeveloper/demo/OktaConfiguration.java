package com.oktadeveloper.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:okta.properties")
public class OktaConfiguration {

}
