package code.exampleliquibase.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

import static org.springframework.boot.jdbc.DataSourceBuilder.create;

@Configuration
@EnableTransactionManagement
public class DB2DataSourceConfiguration {
    @Bean(name = "db2DataSource")
    @ConfigurationProperties(prefix = "db2.datasource")
    public DataSource db2DataSource() {
        return create().build();
    }

}
