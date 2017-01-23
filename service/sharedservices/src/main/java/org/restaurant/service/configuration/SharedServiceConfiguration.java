package org.restaurant.service.configuration;

import org.restaurant.repositoy.configuration.RepositoryConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by juanjose on 22/1/17.
 */
@Configuration @ComponentScan(basePackages = "org.restaurant.service") @Import(value = RepositoryConfiguration.class) public class SharedServiceConfiguration {
}
