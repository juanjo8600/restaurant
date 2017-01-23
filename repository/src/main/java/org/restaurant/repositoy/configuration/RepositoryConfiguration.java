package org.restaurant.repositoy.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by jj.jimenez on 23/01/2017.
 */
@Configuration @ComponentScan(basePackages = "org.restaurant.repository") @EnableJpaRepositories @EnableTransactionManagement public class RepositoryConfiguration {
}
