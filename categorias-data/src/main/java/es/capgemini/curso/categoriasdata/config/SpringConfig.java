package es.capgemini.curso.categoriasdata.config;

import javax.persistence.EntityManagerFactory;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "es.capgemini.curso.categoriasdata.modelo" })
public class SpringConfig {

	/*
	 * Método de factoría para crear el gestor de transacciones locales de la app
	 * mediante Framework ORM (Hiberante)
	 */
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory() {
		LocalEntityManagerFactoryBean entityManagerFactory = new LocalEntityManagerFactoryBean();

		// Especificar ORM para gestionar entidades utilizando la unidad de persistencia
		// (META-INF\persistence.xml)
		entityManagerFactory.setPersistenceUnitName("jpa-mysql");
		return entityManagerFactory;
	}

	/*
	 * Método de factoría para crear el administrador de transacciones de la App asociado al
	 * EntityManagerFactory (bean creado en el metodo de arriba) donde cargamos la persistencia
	 */
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
		JpaTransactionManager txManager = new JpaTransactionManager();

		// Asociar gestor de transacciones locales
		txManager.setEntityManagerFactory(entityManagerFactory);

		return txManager;
	}
}