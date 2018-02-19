package code.exampleliquibase.configuration;

import liquibase.integration.spring.SpringLiquibase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class LiquibaseConfiguration {
    @Qualifier("db1DataSource")
    @Autowired
    private DataSource db1DataSource;

    @Qualifier("db2DataSource")
    @Autowired
    private DataSource db2DataSource;

    /*
    //why names like db1Liquibase and db2Liquibase don't work?
    first(or one) bean must be named 'liquibase'
    see https://stackoverflow.com/questions/43346062/multiple-liquibase-configurations-in-spring-boot
     */
    /*@Bean
    public SpringLiquibase liquibase() {
        return new SpringLiquibase();
    }*/

    @Bean
    public SpringLiquibase liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db1_changeset.xml");
        liquibase.setDataSource(db1DataSource);
        return liquibase;
    }

    @Bean
    public SpringLiquibase db2Liquibase() {
        SpringLiquibase liquibase = new SpringLiquibase();
        liquibase.setChangeLog("classpath:db2_changeset.xml");
        liquibase.setDataSource(db2DataSource);
        return liquibase;
    }
}
