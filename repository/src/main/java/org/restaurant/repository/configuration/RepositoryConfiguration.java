package org.restaurant.repository.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by jj.jimenez on 23/01/2017.
 */
@Configuration @EnableJpaRepositories(basePackages = "org.restaurant.repository") @EnableTransactionManagement
public class RepositoryConfiguration {

   @Bean
   public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
	  LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	  em.setDataSource(dataSource());
	  em.setPackagesToScan("org.restaurant.repository.model");

	  JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	  em.setJpaVendorAdapter(vendorAdapter);
	  em.setJpaProperties(additionalProperties());

	  return em;
   }

   @Bean
   public DataSource dataSource(){
	  DriverManagerDataSource dataSource = new DriverManagerDataSource();
	  dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	  dataSource.setUrl("jdbc:mysql://localhost:3306/restaurant");
	  dataSource.setUsername( "REST_APP" );
	  dataSource.setPassword( "REST_APP" );
	  return dataSource;
   }

   @Bean
   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	  JpaTransactionManager transactionManager = new JpaTransactionManager();
	  transactionManager.setEntityManagerFactory(emf);

	  return transactionManager;
   }

   @Bean
   public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
	  return new PersistenceExceptionTranslationPostProcessor();
   }

   Properties additionalProperties() {
	  Properties properties = new Properties();
	  properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	  properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	  return properties;
   }
}
