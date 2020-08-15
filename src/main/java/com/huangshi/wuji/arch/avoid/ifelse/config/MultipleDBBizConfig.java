//package com.huangshi.wuji.arch.avoid.ifelse.config;
//
//
//import com.huangshi.wuji.messaging.app.biz.entity.BizEntity;
//import com.zaxxer.hikari.HikariDataSource;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableJpaRepositories(basePackages = "com.huangshi.wuji.messaging.app.biz",entityManagerFactoryRef = "bizEntityManagerFactory",
//        transactionManagerRef= "bizTransactionManager")
//@EnableTransactionManagement
//@EnableAutoConfiguration
////@ComponentScan("com.huangshi.wuji.messaging.biz")
//@EntityScan("com.huangshi.wuji.messaging.app.biz.entity")
//public class MultipleDBBizConfig {
//
//    private static final String[] EntityManager_Packages_To_Scan = {"com.huangshi.wuji.messaging.app.biz.entity"};
//
//    /*@Bean
//    @ConfigurationProperties("app.datasource.biz")
//    public DataSourceProperties bizDataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    public DataSource bizDataSource() {
//        return bizDataSourceProperties().initializeDataSourceBuilder()
//                .type(HikariDataSource.class).build();
//    }*/
//
//    @Bean
//    public DataSource bizDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.postgresql.Driver");
//        dataSource.setUrl("jdbc:postgresql://localhost:5432/business");
//        dataSource.setUsername("postgres");
//        dataSource.setPassword("123456");
//        return dataSource;
//    }
//
//    private HibernateJpaVendorAdapter vendorAdaptor() {
//        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setShowSql(true);
//        vendorAdapter.setGenerateDdl(true);
//        return vendorAdapter;
//    }
//
//    private Properties jpaHibernateProperties() {
//
//        Properties properties = new Properties();
//
////        properties.put(Property_Name_Hibernate_Max_Fetch_Depth, env.getProperty(Property_Name_Hibernate_Max_Fetch_Depth));
////        properties.put(Property_Name_Hibernate_JDBC_Fetch_Size, env.getProperty(Property_Name_Hibernate_JDBC_Fetch_Size));
////        properties.put(Property_Name_Hibernate_JDBC_Batch_Size, env.getProperty(Property_Name_Hibernate_JDBC_Batch_Size));
////        properties.put(Property_Name_Hibernate_Show_SQL, env.getProperty(Property_Name_Hibernate_Show_SQL));
////        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.create"));
////        properties.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
//
////        properties.put(AvailableSettings.SCHEMA_GEN_DATABASE_ACTION, "none");
////        properties.put(AvailableSettings.USE_CLASS_ENHANCER, "false");
//        return properties;
//    }
//
//
//    @Bean(name = "bizEntityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean bizEntityManagerFactory() {
//
//        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(bizDataSource());
////        em.setPackagesToScan("com.huangshi.wuji.messaging.app.jpa.repository");
//        em.setJpaVendorAdapter(vendorAdaptor());
////        em.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//        em.setPackagesToScan(EntityManager_Packages_To_Scan);
//        em.setJpaProperties(jpaHibernateProperties());
//        return em;
//
//    }
//
//    @Bean
//    public PlatformTransactionManager bizTransactionManager(
//            final @Qualifier("bizEntityManagerFactory") LocalContainerEntityManagerFactoryBean bizEntityManagerFactory) {
//        return new JpaTransactionManager(bizEntityManagerFactory.getObject());
//    }
//}
//
