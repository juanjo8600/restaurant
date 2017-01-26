package org.restaurant.webservice.configuration;

import org.restaurant.service.configuration.SharedServiceConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by juanjose on 22/1/17.
 */
@Configuration
@ComponentScan(basePackages = "org.restaurant.webservice")
@Import(value = SharedServiceConfiguration.class)
public class WebServiceConfiguration {
}
